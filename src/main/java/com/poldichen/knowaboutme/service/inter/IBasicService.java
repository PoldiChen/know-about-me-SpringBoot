package com.poldichen.knowaboutme.service.inter;

import java.util.List;
import com.poldichen.knowaboutme.entity.Basic;

public interface IBasicService {

    Basic getById(int id);

    List<Basic> getAll();

    boolean updateById(int id, Basic basic);
}
