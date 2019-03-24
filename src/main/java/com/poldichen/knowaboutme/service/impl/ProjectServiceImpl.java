package com.poldichen.knowaboutme.service.impl;

import com.poldichen.knowaboutme.dao.IProjectDao;
import com.poldichen.knowaboutme.entity.Project;
import com.poldichen.knowaboutme.service.inter.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author poldi.chen
 * @className ProjectServiceImpl
 * @description TODO
 * @date 2019/3/24 15:43
 **/
@Component
public class ProjectServiceImpl implements IProjectService {

    @Autowired
    private IProjectDao projectDao;

    @Override
    public Project getById(int id) {
        return projectDao.getById(id);
    }

    @Override
    public List<Project> getAll() {
        return projectDao.getAll();
    }

    @Override
    public boolean updateById(int id, Project project) {
        return projectDao.updateById(id, project);
    }

    @Override
    public int createOne(Project project) {
        return projectDao.createOne(project);
    }

}
