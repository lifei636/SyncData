package com.sync.data.data.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 修改商品成本价请求类
 */
@Data
public class UpdateCostPriceRequest {

    private Long skuId;

    /**
     * 成本价
     */
    private BigDecimal costPrice;
}
