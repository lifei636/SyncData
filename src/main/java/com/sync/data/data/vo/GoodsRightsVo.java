package com.sync.data.data.vo;

import lombok.Data;

import java.util.List;

/**
 * 选中的商品服务列表（从ec/goodsRights/queryGoodsRightsList 接口获取）
 */
@Data
public class GoodsRightsVo {

    /**
     * 商品服务id
     */
    private Long id;

    /**
     * 商品服务值列表
     */
    private List<GoodsRightsValueVo> goodsRightsValueList;
}
