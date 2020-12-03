package com.sync.data.data.response;

import com.sync.data.data.vo.AttrVo;
import lombok.Data;

import java.util.List;

/**
 * 获取类目下的规格/参数值
 */
@Data
public class GetCategoryAttrResponse {

    /**
     * 类目的规格列表
     */
    private List<AttrVo> saleAttrList;
    /**
     * 规格/参数值列表
     */
    private List<AttrVo> attrValueList;


}
