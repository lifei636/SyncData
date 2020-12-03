package com.sync.data.service.impl;

import com.sync.data.data.request.AddAttrValueRequest;
import com.sync.data.data.request.CategoryAttrRequest;
import com.sync.data.data.request.GoodsRequest;
import com.sync.data.data.response.*;
import com.sync.data.data.vo.AttrVo;
import com.sync.data.data.vo.CategoryVo;
import com.sync.data.service.IWeiMenGoodsService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class WeiMenGoodsServiceImpl implements IWeiMenGoodsService {


    @Override
    public List<CategoryVo> queryCategoryTree() {
        return null;
    }

    @Override
    public List<CategoryVo> queryChildrenCategory(Integer categoryId) {
        return null;
    }

    @Override
    public AttrResponse addAttribute(CategoryAttrRequest categoryAttrRequest) {
        return null;
    }

    @Override
    public List<AttrVo> addAttrValue(AddAttrValueRequest addAttrValueRequest) {
        return null;
    }

    @Override
    public GetCategoryAttrResponse queryCategoryAttrInfo(Long categoryId) {
        return null;
    }

    @Override
    public UploadImgResponse uploadImg(String name, File file) {
        return null;
    }

    @Override
    public UploadVideoResponse uploadVideo(String name, File file) {
        return null;
    }

    @Override
    public void findFreightTemplateList() {

    }

    @Override
    public void queryCityFreightTemplateList() {

    }

    @Override
    public AddGoodsResponse addGoods(GoodsRequest goods) {
        return null;
    }
}
