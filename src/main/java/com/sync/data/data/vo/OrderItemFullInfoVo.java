package com.sync.data.data.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品列表
 */
@Data
public class OrderItemFullInfoVo {

    /**
     * 维权状态名称
     */
    private String rightsStatusName;

    /**
     * 维权状态 (1-维权中,2-已退款)
     */
    private Integer rightsStatus;

    /**
     * 维权单id
     */
    private Long rightsOrderId;
    /**
     * 评论状态
     */
    private Integer commentStatus;

    /**
     * 订单项应付金额
     */
    private BigDecimal shouldPaymentAmount;
    /**
     * sku金额（skuAmount=price*skuNum）
     */
    private BigDecimal skuAmount;
    /**
     * sku总金额（totalAmount=skuAmount+其他费用）
     */
    private BigDecimal totalAmount;
    /**
     * 实付金额
     */
    private BigDecimal paymentAmount;
    /**
     * 订单项id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long goodsId;
    /**
     * 规格id
     */
    private Long skuId;
    /**
    *规格图片
     */
    private String imageUrl;
    /**
     * 规格名称
     */
    private String skuName;
    /**
     * 购买数量
     */
    private Integer skuNum;
    /**
     * 商品售价
     */
    private BigDecimal price;
    /**
     * 商品编码
     */
    private String goodsCode;
    /**
     * 规格编码
     */
    private String skuCode;

    /**
     * 已经发货的数量
     */
    private Integer hadDeliveryItemNum;
    /**
     * 原始价
     */
    private BigDecimal originalPrice;
    /**
     * 商品总积分（point*skuNum)积分订单用）
     */
    private Long totalPoint;
    /**
     * 商品积分（积分订单用）
     */
    private Long point;

    /**
     * 商品类型(0-普通商品,1-海淘商品)
     */
    private Integer goodsType;

    /**
     * 业务
     */
    private BizBaseInfoVo bizInfo;

    /**
     * 商品标题
     */
    private String customFieldList;

    /**
     * 仓库id
     */
    private Long warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 仓库类型:1,商家仓 2,门店仓 3,外部仓
     */
    private Integer warehouseType;
}
