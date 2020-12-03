package com.sync.data.data.request;

import com.sync.data.data.vo.AttrVo;

import java.util.List;

/**
 * 添加规格request
 */
public class CategoryAttrRequest {

    /**
     * 类目id
     */
    private Long categoryId;

    /**
     * 参数/规格类型：1、参数 2、规格
     */
    private Integer attrType;

    /**
     * 参数/规格名称
     */
    private String attrName;

    /**
     * 参数/规格值列表，最大100
     */
    private List<AttrVo> attrValueList;


}
