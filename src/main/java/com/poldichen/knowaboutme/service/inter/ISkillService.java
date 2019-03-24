package com.poldichen.knowaboutme.service.inter;

import com.poldichen.knowaboutme.entity.Skill;

import java.util.List;

public interface ISkillService {

    Skill getById(int id);

    List<Skill> getAll();

    boolean updateById(int id, Skill skill);

    int createOne(Skill skill);
}
