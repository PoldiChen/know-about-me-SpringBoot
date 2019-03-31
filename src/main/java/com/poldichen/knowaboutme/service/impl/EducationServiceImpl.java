package com.poldichen.knowaboutme.service.impl;

import com.poldichen.knowaboutme.dao.IEducationDao;
import com.poldichen.knowaboutme.entity.Education;
import com.poldichen.knowaboutme.service.inter.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EducationServiceImpl implements IEducationService {

    @Autowired
    private IEducationDao educationDao;

    @Override
    public Education getById(int id) {
        return educationDao.getById(id);
    }

    @Override
    public List<Education> getAll() {
        return educationDao.getAll();
    }

    @Override
    public boolean updateById(int id, Education education) {
        return educationDao.updateById(id, education);
    }

    @Override
    public int createOne(Education education) {
        return educationDao.createOne(education);
    }
}
