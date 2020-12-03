package com.sync.data.data.vo;

import lombok.Data;

import java.util.List;

/**
 * 选中的商品属性列表（从ec/goodsProperty/queryPropList 接口propList获取）
 */
@Data
public class GoodsPropertyVo {

    /**
     * 属性id
     */
    private Long id;

    /**
     * 属性值列表
     */
    private List<GoodsPropertyValueVo> propValList;
}
