package com.sync.data.data.vo;

import lombok.Data;

/**
 * 发票信息
 */
@Data
public class InvoiceInfoVo {

    /**
     * 发票类型：1-普通发票  2-普通电子发票  3-增值税专用发票
     */
    private Integer invoiceType;
    /**
     * 发票抬头类型：1-个人    2-公司
     */
    private Integer titleType;
    /**
     * 发票抬头名称
     */
    private  String titleName;

    /**
     * 税号
     */
    private String taxNumber;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 单位电话
     */
    private String companyTel;

    /**
     * 开户行
     */
    private String bankAddressl;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 收票人邮箱
     */
    private String receiverEmail;

    /**
     * 收票人手机号
     */
    private String receiverTel;
}
