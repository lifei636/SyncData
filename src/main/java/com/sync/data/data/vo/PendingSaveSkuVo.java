package com.sync.data.data.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * sku列表
 */
@Data
public class PendingSaveSkuVo {

    /**
     * sku图片地址（商品图片禁止使用外链，可以调用ec/goodsImage/uploadImg接口上传图片）
     */
    private String imageUrl;

    /**
     * 商家编码(最多100个字符，支持中文，不支持中文标点 和空格）
     */
    private  String outerSkuCode;

    /**
     * 销售价（最多小数点后2位的正数）
     */
    private BigDecimal salePrice;

    /**
     * 市场价（最多小数点后2位的正数）
     */
    private BigDecimal originalPrice;

    /**
     * 成本价（最多小数点后2位的正数）
     */
    private BigDecimal costPrice;

    /**
     * 库存数量(最大到 999999)
     */
    private Integer editStockNum;
}
