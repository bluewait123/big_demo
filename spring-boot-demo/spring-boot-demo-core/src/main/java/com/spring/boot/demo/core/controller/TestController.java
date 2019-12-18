package com.spring.boot.demo.core.controller;

import com.spring.boot.demo.mybatis.mapper.FileInfoMapper;
import com.spring.boot.demo.mybatis.po.FileInfoPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件管理
 * @author wujianhui
 * @date 2019/12/11
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    private FileInfoMapper fileInfoMapper;

    @RequestMapping(value = "/test", method = { RequestMethod.GET })
    @ResponseBody
    public FileInfoPo test() {
        return fileInfoMapper.selectByPrimaryKey("00586098d00144ae9ced70f3b94c30da");
    }
}
