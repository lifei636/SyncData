package com.sync.data.data.request;

import com.sync.data.data.vo.GoodsAttributeVo;
import com.sync.data.data.vo.GoodsPropertyVo;
import com.sync.data.data.vo.GoodsRightsVo;
import com.sync.data.data.vo.PendingSaveB2CGoodsVo;
import lombok.Data;

import java.util.List;

/**
 * 商品属性
 */
@Data
public class GoodsRequest {
    /**
     * 商品名称（最长120个字符，转化为纯汉字是60个）
     */
    private String title;

    /**
     * 后台叶子节点类目id（从/category/queryChildrenCategory接口获取 二级类目id）
     */
    private Long categoryId;

    /**
     * spu编码（最多100个字符，不允许中文， 空格 和中文符号）
     */
    private String outerGoodsCode;

    /**
     * 是否多规格 0:不是 1：是
     */
    private Integer isMultiSku;

    /**
     * 选择的商品标签id（从/goodsTag/findGoodsTagList接口获取）
     */
    private Long goodsTagId;

    /**
     * b2C商品节点
     */
    private List<PendingSaveB2CGoodsVo> b2cGoods;

    /**
     * 商品文描
     */
    private String goodsDesc;

    /**
     * 商品初始销量(只能输入0到10000)
     */
    private Integer initialSales;

    /**
     * 扣减库存节点：1下单减库存，2支付减库存
     */
    private Integer deductStockType;

    /**
     * 是否上架 0 上架  1下架
     */
    private Integer isPutAway;

    /**
     * 商品选中的规格列表（如果商品是多规格，必传。从ec/category/queryCategoryAttrInfo 接口返回saleAttrList获取）
     */
    private List<GoodsAttributeVo> selectedSaleAttrList;

    /**
     * 商品视频url
     */
    private String goodsVideoUrl;

    /**
     * 商品视频主图url
     */
    private String goodsVideoImageUrl;

    /**
     * 商品销售模式：1.现货销售
     */
    private Integer sellModelType;

    /**
     * 选中的商品属性列表（从ec/goodsProperty/queryPropList 接口propList获取）
     */
    private List<GoodsPropertyVo> selectedGoodsPropList;

    /**
     * 选中的商品内部属性列表（从ec/goodsProperty/queryPropList 接口innerPropList获取
     */
    private List<GoodsPropertyVo> selectedInnerGoodsPropList;

    /**
     * 商品选中的参数（从ec/category/queryCategoryAttrInfoByCategoryId 接口返回 goodsAttrList获取 ）
     */
    private List<GoodsAttributeVo> selectedGoodsAttrList;

    /**
     * 选中的商品服务列表（从ec/goodsRights/queryGoodsRightsList 接口获取）
     */
    private List<GoodsRightsVo> selectedGoodsRightsList;

    /**
     * 商品图片（最多10张，商品图片禁止使用外链，可以调用ec/goodsImage/uploadImg接口上传图片）
     */
    private List<String> goodsImageUrl;

    /**
     * 选择的分组id()
     */
    private List<Long> selectedClassifyIdList;

    /**
     * 是否可售 0禁售 1可售（微商城不可用）
     */
    private Integer isCanSell;

    /**
     * 同城限时达模板id（从/goods/queryCityFreightTemplateList接口获取） (若配送方式包含同城限时达且该字段为空，则取门店下默认的限时达模板)
     */
    private Long cityFreightTemplateId;
}
