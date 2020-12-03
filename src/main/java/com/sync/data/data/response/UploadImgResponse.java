package com.sync.data.data.response;

import lombok.Data;

/**
 * 上传商品图片信息（文件上传）响应类
 */
@Data
public class UploadImgResponse {

    /**
     * 地址信息
     */
    private String urlInfo;
    /**
     * 图片名称
     */
    private String name;
    /**
     *
     * 图片地址
     */
    private String url;

    /**
     * 是否合法   0：合法  2: 不合法
     */
    private Integer legalStatus;

    /**
     * 大小（byte）
     */
    private Long size;
}
