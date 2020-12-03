package com.sync.data.data.response;

import lombok.Data;

/**
 * 修改商品成本价响应类
 */
@Data
public class UpdateCostPriceResponse {

    private  Long skuId;
    /**
     * 失败原因
     */
    private  String failMsg;
}
