package com.sync.data.data.vo;

import lombok.Data;

/**
 * 业务信息
 */
@Data
public class BizBaseInfoVo {
    /**
     * 业务类型 (3-限时折扣,4-砍价,5-拼团,10-特权价，19-社区团购  20-限量抢购  24-定金膨胀   25-阶梯价 32-满赠)
     */
    private  Integer bizType;

    /**
     * 子业务类型 (拼团:1-普通团,2-团内抽奖,3-活动结束抽奖)
     */
    private Integer subBizType;
    /**
     * 业务id
     */
    private Long bizId;
    /**
     * 业务订单id
     */
    private String bizOrderId;
}
