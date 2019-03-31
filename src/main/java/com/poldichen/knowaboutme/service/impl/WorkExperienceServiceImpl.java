package com.poldichen.knowaboutme.service.impl;

import com.poldichen.knowaboutme.dao.IWorkExperienceDao;
import com.poldichen.knowaboutme.entity.WorkExperience;
import com.poldichen.knowaboutme.service.inter.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkExperienceServiceImpl implements IWorkExperienceService {

    @Autowired
    private IWorkExperienceDao workExperienceDao;

    @Override
    public WorkExperience getById(int id) {
        return workExperienceDao.getById(id);
    }

    @Override
    public List<WorkExperience> getAll() {
        return workExperienceDao.getAll();
    }

    @Override
    public boolean updateById(int id, WorkExperience workExperience) {
        return workExperienceDao.updateById(id, workExperience);
    }

    @Override
    public int createOne(WorkExperience workExperience) {
        return workExperienceDao.createOne(workExperience);
    }
}
