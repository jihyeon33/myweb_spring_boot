package com.example.myweb_springboot.mapper;

import com.example.myweb_springboot.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<TestVo> selectTest();
}
