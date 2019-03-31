package com.poldichen.knowaboutme.dao;

import com.poldichen.knowaboutme.entity.WorkExperience;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IWorkExperienceDao {

    WorkExperience getById(@Param("id") int id);

    List<WorkExperience> getAll();

    boolean updateById(@Param("id") int id, @Param("workExperience") WorkExperience workExperience);

    int createOne(@Param("workExperience") WorkExperience workExperience);
}
