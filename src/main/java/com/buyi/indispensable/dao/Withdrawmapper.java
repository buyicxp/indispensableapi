package com.buyi.indispensable.dao;

import com.buyi.indispensable.entity.Withdraw;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Withdrawmapper {
    /**
     * 添加提现记录
     * @param withdraw
     * @return
     */
    int withdrawInsert(Withdraw withdraw);

    /**
     * 改变提现记录表改记录状态
     * @param withdraw
     * @return
     */
    int withdrawUpdate(Withdraw withdraw);
}
