package com.poldichen.knowaboutme.service.inter;

import com.poldichen.knowaboutme.entity.WorkExperience;

import java.util.List;

public interface IWorkExperienceService {

    WorkExperience getById(int id);

    List<WorkExperience> getAll();

    boolean updateById(int id, WorkExperience workExperience);

    int createOne(WorkExperience workExperience);
}
