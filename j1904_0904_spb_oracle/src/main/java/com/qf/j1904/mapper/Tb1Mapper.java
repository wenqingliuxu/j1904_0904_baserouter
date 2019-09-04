package com.qf.j1904.mapper;

import com.qf.j1904.pojo.Tb1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Tb1Mapper {
    public List<Tb1> findAll();
}
