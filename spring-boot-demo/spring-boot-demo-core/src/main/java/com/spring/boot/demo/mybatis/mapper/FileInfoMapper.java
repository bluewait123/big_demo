package com.spring.boot.demo.mybatis.mapper;

import com.spring.boot.demo.mybatis.po.FileInfoPo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface FileInfoMapper {
    /**
     * 根据ID查询文件信息
     * @param id 文件ID
     * @return
     */
    FileInfoPo selectByPrimaryKey(@Param("id") String id);
}