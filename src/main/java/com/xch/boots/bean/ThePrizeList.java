package com.xch.boots.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.tmh.winterproject.bean
 * @ClassName: ThePrizeList 奖品表
 * @author: 清欢.
 * @date: 2022/1/19 14:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThePrizeList {
    private Integer id;
    private String namePrize;
    private Integer prizeAmount;
    private Integer imgid;
}
