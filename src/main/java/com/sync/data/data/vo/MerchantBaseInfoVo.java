package com.sync.data.data.vo;

import lombok.Data;

/**
 * 商家信息
 */
@Data
public class MerchantBaseInfoVo {
    /**
     * 商家id
     */
    private Long pid;

    /**
     * 商家名称
     */
    private String merchantTitle;

    /**
     * 下单门店id（微商城无需处理）
     */
    private Long storeId;
    /**
     * 下单门店名称（微商城无需处理）
     */
    private String storeTitle;
    /**
     * 服务门店名称（微商城无需处理）（ps服务门店是实际负责发货和提供自提服务的门店）
     */
    private String processStoreTitle;
    /**
     * 服务门店id（微商城无需处理）
     */
    private Long processStoreId;
    /**
     * 自提点id
     */
    private Long selfPickupSiteId;
}
