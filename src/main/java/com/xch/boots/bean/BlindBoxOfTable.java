package com.xch.boots.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: BlindBoxOfTable盲盒表
 * @author: 清欢.
 * @date: 2022/1/19 14:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlindBoxOfTable {
    private Integer id;
    private String author;
    private Integer totalQuantity;
    private Integer remainingQuantity;
    private Integer theIntegral;
    private Integer cid;
}
