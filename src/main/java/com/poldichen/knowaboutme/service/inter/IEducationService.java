package com.poldichen.knowaboutme.service.inter;

import com.poldichen.knowaboutme.entity.Education;

import java.util.List;

public interface IEducationService {

    Education getById(int id);

    List<Education> getAll();

    boolean updateById(int id, Education education);

    int createOne(Education education);
}
