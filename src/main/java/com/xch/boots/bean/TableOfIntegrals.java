package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: TableOfIntegrals 积分表
 * @author: 清欢.
 * @date: 2022/1/19 14:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableOfIntegrals {
    private Integer id;
    private Integer integralNumber;
    private String operationType;
    private Timestamp operationTime;
    private Integer integralBalance;
    private Integer uid;
}
