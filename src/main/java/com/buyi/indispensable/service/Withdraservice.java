package com.buyi.indispensable.service;

import com.buyi.indispensable.entity.Withdraw;

public interface Withdraservice {
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
