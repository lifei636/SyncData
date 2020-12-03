package com.sync.data.data.response;

import lombok.Data;

/**
 * 添加商品响应类
 */
@Data
public class AddGoodsResponse {

    /**
     * 生成的商品id
     */
    private Long goodsId;

    /**
     * 商家编码
     */
    private String outerSkuCode;

    /**
     * skuId
     */
    private Long skuId;
}
