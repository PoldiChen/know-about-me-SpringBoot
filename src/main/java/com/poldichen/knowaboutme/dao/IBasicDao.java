package com.poldichen.knowaboutme.dao;

import com.poldichen.knowaboutme.entity.Basic;
import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

//import java.util.List;

//@Repository("basicDao")
public interface IBasicDao {

    Basic getById(@Param("id") int id);

    boolean updateById(@Param("id") int id, @Param("basic") Basic basic);
}
