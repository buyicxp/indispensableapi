package com.buyi.indispensable.controller;

import com.alibaba.fastjson.JSON;
import com.buyi.indispensable.entity.User;
import com.buyi.indispensable.entity.Withdraw;
import com.buyi.indispensable.service.Userservice;
import com.buyi.indispensable.service.Withdraservice;
import com.buyi.indispensable.util.codeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController()
public class Usercontroller {
    @Autowired
    private Userservice userservice;
    @Autowired
    private Withdraservice withdraservice;
    @PostMapping("userInsert")
    public void userInsert(@RequestParam(value = "u_name")String u_name,
                           @RequestParam(value = "u_phone") String u_phone,
                           @RequestParam(value = "urecommend") long urecommend){
        User user = new User();
        user.setUname(u_name);
        user.setUphone(u_phone);
        user.setUrecommend(urecommend);
        userservice.userInsert(user);

    }
    @PostMapping("userRepetition")
    public int userRepetition(@RequestParam(value = "u_phone") String u_phone){
        int res = userservice.userRepetition(u_phone);
        return res;
    }
    @PostMapping("getUser")
    public Object getUser(@RequestParam(value = "u_phone") String u_phone){
        User user = userservice.userPhone(u_phone);
        System.out.println(JSON.toJSONString(user));
        return JSON.toJSONString(user);
    }

    /**
     * 订单完成方法
     * @param u_id
     * @return
     */
    @PostMapping("accomplish")
    public int accomplish(@RequestParam(value = "u_id") long u_id){
        int res = userservice.accomplish(u_id);
        if(res!=0){
            userservice.brokerageAdd(res,50);
            int restow = userservice.accomplish(res);
            if(restow!=0){
                userservice.brokerageAdd(restow,10);
                int resthree = userservice.accomplish(restow);
                if(restow!=0){
                    userservice.brokerageAdd(resthree,10);
                }
            }
        }
        return res;
    }

    /**
     * 用户提现功能
     * @param u_id 用户id
     * @param minusBrokerage 用户提现金额
     */
    @PostMapping("deposit")
    public void deposit(@RequestParam(value = "u_id") long u_id,
                         @RequestParam(value = "minusBrokerage") double minusBrokerage){
        userservice.brokerageMinus(u_id,minusBrokerage);
        Withdraw withdraw = new Withdraw();
        withdraw.setUId(u_id);
        withdraw.setWMonew(minusBrokerage);
        withdraservice.withdrawInsert(withdraw);
    }

    /**
     * 后台确定已转账
     * @param u_id 用户id
     *
     */
    @PostMapping("withdraw")
    public void withdraw(@RequestParam(value = "u_id") long u_id){
        Withdraw withdraw = new Withdraw();
        withdraw.setUId(u_id);
        withdraservice.withdrawUpdate(withdraw);
    }

    @PostMapping("generalize")
    public void generalize(@RequestParam(value = "u_id") String u_id){
        System.out.println("id:"+u_id);
        String msg = "http://192.168.0.109:8080?u_id="+u_id+"/";
        String path = "E:\\小程序\\不可少集团\\Indispensable\\static\\generalize\\"+u_id+".png";
        codeUtil.getBarCode(msg,path);
    }

    @PostMapping("updatebank")
    public int updatebank(@RequestParam(value = "bank") String bank,
                           @RequestParam(value = "u_id") String u_id){
        int res = userservice.updatebank(bank,u_id);
        return res;
    }
}
