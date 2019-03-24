package com.poldichen.knowaboutme.dao;

import com.poldichen.knowaboutme.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IProjectDao {

    Project getById(@Param("id") int id);

    List<Project> getAll();

    boolean updateById(@Param("id") int id, @Param("project") Project project);

    int createOne(@Param("project") Project project);



}
