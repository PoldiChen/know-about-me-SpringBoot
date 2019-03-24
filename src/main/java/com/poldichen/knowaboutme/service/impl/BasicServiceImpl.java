package com.poldichen.knowaboutme.service.impl;

import com.poldichen.knowaboutme.dao.IBasicDao;
import com.poldichen.knowaboutme.entity.Basic;
import com.poldichen.knowaboutme.service.inter.IBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author poldi.chen
 * @className BasicServiceImpl
 * @description TODO
 * @date 2019/3/16 16:24
 **/
@Component
public class BasicServiceImpl implements IBasicService {

    @Autowired
    private IBasicDao basicDao;

    @Override
    public Basic getById(int id) {
        return basicDao.getById(id);
    }

    @Override
    public boolean updateById(int id, Basic basic) {
        return basicDao.updateById(id, basic);
    }
}
