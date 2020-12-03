package com.sync.data.service;

import com.sync.data.data.request.UpdateCostPriceRequest;
import com.sync.data.data.vo.AttrVo;
import com.sync.data.data.request.AddAttrValueRequest;
import com.sync.data.data.request.CategoryAttrRequest;
import com.sync.data.data.vo.CategoryVo;
import com.sync.data.data.response.*;
import com.sync.data.data.request.GoodsRequest;

import java.io.File;
import java.util.List;

public interface IWeiMenGoodsService {

    /**
     * 获取一级目录
     * @return
     */
    List<CategoryVo> queryCategoryTree();

    /**
     * 获取二级类目
     * @param categoryId 一级目录id
     * @return
     */
    List<CategoryVo> queryChildrenCategory(Integer categoryId);

    /**
     * 添加规格/参数
     * @param categoryAttrRequest
     * @return
     */
    AttrResponse addAttribute(CategoryAttrRequest categoryAttrRequest);

    /**
     *
     * 添加规格值/参数值
     * @param addAttrValueRequest
     * @return
     */
    List<AttrVo> addAttrValue(AddAttrValueRequest addAttrValueRequest);

    /**
     * 获取类目下的规格/参数值
     * @param categoryId 类目id
     */
    GetCategoryAttrResponse queryCategoryAttrInfo(Long categoryId);

    /**
     * 上传商品图片
     * @param name 图片名称，长度不能大于50个字符
     * @param file 图片文件（支持的文件类型：gif,jpg,jpeg,png）
     * @return
     */
    UploadImgResponse uploadImg(String name, File file);

    /**
     * 上传商品视频
     * @param name 图片名称，长度不能大于50个字符
     * @param file 图片文件（支持的文件类型：gif,jpg,jpeg,png）
     */
    UploadVideoResponse uploadVideo(String name, File file);

    /**
     * 获取运费列表（商家配送）
     */
    void  findFreightTemplateList();

    /**
     * 查询同城限时达模板列表
     */
    void queryCityFreightTemplateList();

    /**
     * 添加商品
     * @param goods
     * @return
     */
    AddGoodsResponse addGoods(GoodsRequest goods);

    /**
     * 更新商品
     * @param goods
     */
    void updateGoods(GoodsRequest goods);

    /**
     * 更新商品名称
     * @param goodsId
     * @param title
     */
    void updateGoodsTitle(Long goodsId, String title);

    /**
     * 更新商品文描
     * @param goodsId
     * @param goodsDesc
     *
     */
    void updateGoodsDesc(Long goodsId,String goodsDesc);

    /**
     * 更新商品图片
     * @param goodsId
     * @param imageList 商品图片列表url地址
     */
    void updateGoodsImage(Long goodsId,List<String> imageList);

    /**
     * 更新sku编码
     */
    void updateOuterSkuCode();

    /**
     * 修改商品的成本价
     * @param storeId 门店id（智慧零售必填）
     * @param updateGoodsCostPriceVoList skuId和成本价的集合
     * @return
     */
    UpdateCostPriceResponse updateCostPrice(Long storeId,List<UpdateCostPriceRequest> updateGoodsCostPriceVoList);

    /**
     * 批量上下架
     * @param goodsIdList 商品id，限制50个
     * @param isPutAway 商品上、下架0：上架 1:下架
     * @param storeId 门店id（微商城不需要传入；新零售如果不传以主门店处理，传入以入参门店id处理）
     */
    void updateGoodsShelfStatus(List<Long> goodsIdList, Integer isPutAway,Long storeId);

}
