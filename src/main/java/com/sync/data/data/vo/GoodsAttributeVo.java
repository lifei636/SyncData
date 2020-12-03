package com.sync.data.data.vo;

import lombok.Data;

import java.util.List;

/**
 * 商品选中的规格列表（如果商品是多规格，必传。从ec/category/queryCategoryAttrInfo 接口返回saleAttrList获取）
 */
@Data
public class GoodsAttributeVo {

    /**
     * 规格id
     */
    private Long attributeId;

    /**
     * 规格值列表
     */
    private List<GoodsAttributeValueVo> attrValueList;

}
