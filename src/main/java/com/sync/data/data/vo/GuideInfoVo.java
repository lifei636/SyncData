package com.sync.data.data.vo;

import lombok.Data;

/**
 * 导购信息（微商城无需处理）
 */
@Data
public class GuideInfoVo {

    /**
     * 线下场景销售导购员wid
     */
    private Long guiderWid;
    /**
     * 线下场景销售导购员名称
     */
    private String guiderName;
    /**
     * 线下场景销售导购员编号
     */
    private String guiderNo;
    /**
     * 线上场景销售导购员wid
     */
    private Long privateGuiderWid;

    /**
     * 线上场景销售导购员名称
     */
    private String privateGuiderName;
    /**
     * 线上场景销售导购员编号
     */
    private String privateGuiderNo;
    /**
     * 归属导购员wid
     */
    private Long personalGuiderWid;
    /**
     * 归属导购员名称
     */
    private String personalGuiderName;
    /**
     * 归属导购员编号
     */
    private String personalGuiderNo;


}
