package com.sync.data.data.response;

import lombok.Data;

/**
 * 上传视频响应类
 */
@Data
public class UploadVideoResponse {

    /**
     * 封面地址（上传视频时返回）
     */
    private String coverPicUrl;
    /**
     * 视频地址信息
     */
    private String urlInfo;
    /**
     * 大小（byte）
     */
    private Long size;
}
