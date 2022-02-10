package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: TableShowing 关系总表
 * @author: 清欢.
 * @date: 2022/1/19 14:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableShowing {
    private Integer uid;
    private Integer iid;
    private Integer tid;
    private Timestamp ticketTime;
}
