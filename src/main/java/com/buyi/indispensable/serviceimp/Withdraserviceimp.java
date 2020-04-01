package com.buyi.indispensable.serviceimp;

import com.buyi.indispensable.dao.Withdrawmapper;
import com.buyi.indispensable.entity.Withdraw;
import com.buyi.indispensable.service.Withdraservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Withdraserviceimp implements Withdraservice {
    @Autowired
    private Withdrawmapper withdrawmapper;
    @Override
    public int withdrawInsert(Withdraw withdraw) {
        return withdrawmapper.withdrawInsert(withdraw);
    }

    @Override
    public int withdrawUpdate(Withdraw withdraw) {
        return withdrawmapper.withdrawUpdate(withdraw);
    }
}
