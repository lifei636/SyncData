package com.sync.data.model;

import com.sync.data.data.vo.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单详情
 */
@Data
public class Order {

    /**
     * 订单编号
     */
    private Long orderNo;

    /**
     * 是否可发货（0-不可发货，1-可发货）*周期购/预售/拼团订单需留意
     */
    private Integer enableDelivery;

    /**
     * 订单状态 (0-待支付,1-待发货,2-已发货/已备货,3-已完成/已核销,4-已取消，5-已评论)
     */
    private Integer orderStatus;

    /**
     * 订单状态名称：【0-等待买家付款, 0-等待买家付定金,
     * 0-等待买家付尾款】【1-已付款，待成团(普通团,抽奖团团内抽,抽奖团活动结束抽未成团),1-已成团，待抽奖(抽奖团活动结束抽成团), 1-未付款，待发货(线下支付), 1-已付款，待发货(线上支付)】
     * 【2-已发货，待收货, 3-已完成, 4-已取消)】
     */
    private String orderStatusName;

    /**
     * （微商城无需判断）转单类型：0,不允许转单,1,手动转单,2,按库存自动转单,3,按距离自动转单
     */
    private Integer transferType;

    /**
     * （微商城无需判断）转单状态：0,未转单,1,已转单,2,转单失败,3,不允许转单
     */
    private Integer transferStatus;

    /**
     * （微商城无需判断）真实的转单类型：：0,不允许转单,1,手动转单,2,按库存自动转单,3,按距离自动转单
     */
    private Integer transferTypeReality;

    /**
     * 订单创建时间（毫秒级时间戳）
     */
    private Date createTime;

    /**
     * 用户确认收货时间
     */
    private Date confirmReceivedTime;

    /**
     * 自动取消时间
     */
    private Date autoCancelTime;

    /**
     * 自动确认收货时间（实际无意义）
     */
    private Date autoConfirmReceivedTime;

    /**
     * 商品总金额
     */
    private BigDecimal goodsAmount;

    /**
     * 订单总金额 (商品总金额+运费总金额+发票税费总金额)
     */
    private BigDecimal totalAmount;
    /**
     * 运费总金额
     */
    private BigDecimal deliveryAmount;
    /**
     * 运费实付金额
     */
    private BigDecimal deliveryPaymentAmount;
    /**
     * 运费减免金额
     */
    private BigDecimal deliveryDiscountAmount;
    /**
     * 订单应付金额(该字段商家无需关注）
     */
    private BigDecimal shouldPaymentAmount;
    /**
     * 订单实付金额
     */
    private BigDecimal paymentAmount;

    /**
     * 订单渠道类型名称
     */
    private String channelTypeName;

    /**
     * 买家备注
     */
    private String buyerRemark;

    /**
     * 买家信息
     */
    private MerchantOrderDetailBuyerInfoVo buyerInfo;

    /**
     * 发票信息
     */
    private InvoiceInfoVo invoiceInfo;

    /**
     * 发票税费总金额
     */
    private BigDecimal invoiceTexAmount;
    /**
     * 发票税费实付金额
     */
    private BigDecimal invoiceTexPaymentAmount;

    /**
     * 发票税费减免金额
     */
    private BigDecimal invoiceTexDiscountAmount;

    /**
     * 导购信息（微商城无需处理）
     */
    private GuideInfoVo guideInfo;
    /**
     * 商家信息
     */
    private MerchantBaseInfoVo merchantInfo;

    private List<OrderItemFullInfoVo> itemList;

}
