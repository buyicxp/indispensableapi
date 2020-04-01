package com.buyi.indispensable.serviceimp;

import com.buyi.indispensable.dao.Usermapper;
import com.buyi.indispensable.entity.User;
import com.buyi.indispensable.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimp implements Userservice {
    @Autowired
    private Usermapper usermapper;

    @Override
    public int userInsert(User user) {
        return usermapper.userInsert(user);
    }

    @Override
    public int updatebank(String bank,String uId) {
        return usermapper.updatebank(bank,uId);
    }

    @Override
    public User userPhone(String uphone) {
        return usermapper.userPhone(uphone);
    }

    @Override
    public int userRepetition(String uphone) {
        return usermapper.userRepetition(uphone);
    }

    @Override
    public int brokerageAdd(long uId, double addBrokerage) {
        return usermapper.brokerageAdd(uId,addBrokerage);
    }

    @Override
    public int brokerageMinus(long uId, double minusBrokerage) {
        return usermapper.brokerageMinus(uId,minusBrokerage);
    }

    @Override
    public int accomplish(long uId) {
        return usermapper.accomplish(uId);
    }
}
