package com.poldichen.knowaboutme.dao;

import com.poldichen.knowaboutme.entity.Skill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkillDao {

    Skill getById(@Param("id") int id);

    List<Skill> getAll();

    boolean updateById(@Param("id") int id, @Param("skill") Skill skill);

    int createOne(@Param("skill") Skill skill);
}
