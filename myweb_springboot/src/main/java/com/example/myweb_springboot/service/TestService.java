package com.example.myweb_springboot.service;

import com.example.myweb_springboot.mapper.TestMapper;
import com.example.myweb_springboot.vo.TestVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

/*    @Autowired
    public TestMapper mapper;*/
    private static TestMapper testMapper;
    public TestService(TestMapper testMapper){
        this.testMapper = testMapper;
    }

    public List<TestVo> selectTest(){
        return testMapper.selectTest();
    }
}
