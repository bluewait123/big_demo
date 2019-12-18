package com.spring.boot.demo.mybatis.po;

import com.spring.boot.demo.mybatis.vo.Po;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FileInfoPo implements Po {
    private static final long serialVersionUID = -8830896969688088015L;
    private String id;
    private String parentId;
    private Integer fileType;
    private BigDecimal fileSize;
    private String fileName;
    private String fileSaveName;
    private String filePath;
    private Date createTime;
    private Date updateTime;
    private Integer fileStatus;
}