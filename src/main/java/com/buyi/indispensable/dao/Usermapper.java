package com.buyi.indispensable.dao;

import com.buyi.indispensable.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Usermapper {
    /**
     * 新增用户方法
     *
     * @param user 用户实体类
     * @return 是否插入成功0/1
     */
    int userInsert(User user);

    int updatebank(@Param("bank") String bank,@Param("uId") String uId);

    /**
     * 根据电弧号码查询用户信息
     *
     * @param uphone
     * @return
     */
    User userPhone(String uphone);

    /**
     * 查询用户是否存在
     *
     * @param uphone
     * @return
     */
    int userRepetition(String uphone);

    /**
     * 佣金增加
     *
     * @param uId          用户id
     * @param addBrokerage 增加的金额
     * @return
     */
    int brokerageAdd(@Param("uId") long uId, @Param("addBrokerage") double addBrokerage);

    /**
     * 佣金提现减少
     *
     * @param uId            用户id
     * @param minusBrokerage 提现减少的金额
     * @return
     */
    int brokerageMinus(@Param("uId") long uId, @Param("minusBrokerage") double minusBrokerage);

    /**
     * 根据用户id查询出上级
     * @param uId
     * @return
     */
    int accomplish(@Param("uId") long uId);
}