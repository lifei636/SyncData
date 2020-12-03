package com.sync.data.data.request;

import com.sync.data.data.vo.AttrVo;

import java.util.List;

/**
 * 添加规格值/参数值
 */
public class AddAttrValueRequest {

    /**
     * 类目id
     */
    private Long categoryId;

    /**
     * 规格/参数id
     */
    private Long attrId;

    /**
     * 规格/参数值列表
     */
    private List<AttrVo> attrValueList;

}
