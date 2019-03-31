package com.poldichen.knowaboutme.dao;

import com.poldichen.knowaboutme.entity.Education;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IEducationDao {

    Education getById(@Param("id") int id);

    List<Education> getAll();

    boolean updateById(@Param("id") int id, @Param("education") Education education);

    int createOne(@Param("education") Education education);
}
