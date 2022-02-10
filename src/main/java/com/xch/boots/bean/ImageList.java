package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: ImageList图片表
 * @author: 清欢.
 * @date: 2022/1/19 14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageList {
    private Integer id;
    private String headline;
    private String synopsis;
    private Integer quantity;
    private String theNumber;
    private String completeNumber;
    private Timestamp startTime;
    private String fulfillment;
    private Integer uid;


}
