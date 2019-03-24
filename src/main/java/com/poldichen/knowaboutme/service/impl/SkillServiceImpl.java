package com.poldichen.knowaboutme.service.impl;

import com.poldichen.knowaboutme.dao.IProjectDao;
import com.poldichen.knowaboutme.dao.ISkillDao;
import com.poldichen.knowaboutme.entity.Project;
import com.poldichen.knowaboutme.entity.Skill;
import com.poldichen.knowaboutme.service.inter.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author poldi.chen
 * @className SkillServiceImpl
 * @description TODO
 * @date 2019/3/24 16:31
 **/
@Component
public class SkillServiceImpl implements ISkillService {

    @Autowired
    private ISkillDao skillDao;

    @Override
    public Skill getById(int id) {
        return skillDao.getById(id);
    }

    @Override
    public List<Skill> getAll() {
        return skillDao.getAll();
    }

    @Override
    public boolean updateById(int id, Skill skill) {
        return skillDao.updateById(id, skill);
    }

    @Override
    public int createOne(Skill skill) {
        return skillDao.createOne(skill);
    }
}
