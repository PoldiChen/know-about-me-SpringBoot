package com.poldichen.knowaboutme.service.inter;

import com.poldichen.knowaboutme.entity.Project;

import java.util.List;

public interface IProjectService {

    Project getById(int id);

    List<Project> getAll();

    boolean updateById(int id, Project project);

    int createOne(Project project);

}
