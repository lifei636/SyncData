package com.sync.data.data.vo;

import lombok.Data;

/**
 * b2C商品节点
 */
@Data
public class PendingSaveB2CGoodsVo {

    /**
     * 商家配送模板id（如果配送方式选择了商家配送，则运费模板必填，从/goods/findFreightTemplateList接口获取）
     */
    private Long freightTemplateId;

    /**
     * 配送方式id列表（从/goods/findDeliveryTypeList接口获取）
     */
    private Long[] deliveryTypeIdList;

    /**
     * b2c商品类型 0:普通商品 1:海淘,2无需配送 （如果商品类型是无需配送，配送方式必须是无需配送，不需要运费模板）
     */
    private Integer b2cGoodsType;
}
