/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.modules.oss.cloud;

import io.renren.common.validator.group.AliyunGroup;
import io.renren.common.validator.group.QcloudGroup;
import io.renren.common.validator.group.QiniuGroup;
import io.renren.modules.oss.group.FastDFSGroup;
import io.renren.modules.oss.group.LocalGroup;
import io.renren.modules.oss.group.MinioGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 云存储配置信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "云存储配置信息")
public class CloudStorageConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "类型 1：七牛  2：阿里云  3：腾讯云   4：FastDFS   5：本地上传    6：minio")
    @Range(min=1, max=6, message = "{oss.type.range}")
    private Integer type;

    @ApiModelProperty(value = "七牛绑定的域名")
    @NotBlank(message="{qiniu.domain.require}", groups = QiniuGroup.class)
    @URL(message = "{qiniu.domain.url}", groups = QiniuGroup.class)
    private String qiniuDomain;

    @ApiModelProperty(value = "七牛路径前缀")
    private String qiniuPrefix;

    @ApiModelProperty(value = "七牛ACCESS_KEY")
    @NotBlank(message="{qiniu.accesskey.require}", groups = QiniuGroup.class)
    private String qiniuAccessKey;

    @ApiModelProperty(value = "七牛SECRET_KEY")
    @NotBlank(message="{qiniu.secretkey.require}", groups = QiniuGroup.class)
    private String qiniuSecretKey;

    @ApiModelProperty(value = "七牛存储空间名")
    @NotBlank(message="{qiniu.bucketname.require}", groups = QiniuGroup.class)
    private String qiniuBucketName;

    @ApiModelProperty(value = "阿里云绑定的域名")
    @NotBlank(message="{aliyun.domain.require}", groups = AliyunGroup.class)
    @URL(message = "{aliyun.domain.url}", groups = AliyunGroup.class)
    private String aliyunDomain;

    @ApiModelProperty(value = "阿里云路径前缀")
    private String aliyunPrefix;

    @ApiModelProperty(value = "阿里云EndPoint")
    @NotBlank(message="{aliyun.endPoint.require}", groups = AliyunGroup.class)
    private String aliyunEndPoint;

    @ApiModelProperty(value = "阿里云AccessKeyId")
    @NotBlank(message="{aliyun.accesskeyid.require}", groups = AliyunGroup.class)
    private String aliyunAccessKeyId;

    @ApiModelProperty(value = "阿里云AccessKeySecret")
    @NotBlank(message="{aliyun.accesskeysecret.require}", groups = AliyunGroup.class)
    private String aliyunAccessKeySecret;

    @ApiModelProperty(value = "阿里云BucketName")
    @NotBlank(message="{aliyun.bucketname.require}", groups = AliyunGroup.class)
    private String aliyunBucketName;

    @ApiModelProperty(value = "腾讯云绑定的域名")
    @NotBlank(message="{qcloud.domain.require}", groups = QcloudGroup.class)
    @URL(message = "{qcloud.domain.url}", groups = QcloudGroup.class)
    private String qcloudDomain;

    @ApiModelProperty(value = "腾讯云路径前缀")
    private String qcloudPrefix;

    @ApiModelProperty(value = "腾讯云AppId")
    @NotNull(message="{qcloud.appid.require}", groups = QcloudGroup.class)
    private Integer qcloudAppId;

    @ApiModelProperty(value = "腾讯云SecretId")
    @NotBlank(message="{qcloud.secretId.require}", groups = QcloudGroup.class)
    private String qcloudSecretId;

    @ApiModelProperty(value = "腾讯云SecretKey")
    @NotBlank(message="{qcloud.secretkey.require}", groups = QcloudGroup.class)
    private String qcloudSecretKey;

    @ApiModelProperty(value = "腾讯云BucketName")
    @NotBlank(message="{qcloud.bucketname.require}", groups = QcloudGroup.class)
    private String qcloudBucketName;

    @ApiModelProperty(value = "腾讯云COS所属地区")
    @NotBlank(message="{qcloud.region.require}", groups = QcloudGroup.class)
    private String qcloudRegion;

    @ApiModelProperty(value = "FastDFS绑定的域名")
    @NotBlank(message="{fastdfs.domain.require}", groups = FastDFSGroup.class)
    @URL(message = "{fastdfs.domain.url}", groups = FastDFSGroup.class)
    private String fastdfsDomain;

    @ApiModelProperty(value = "本地上传绑定的域名")
    @NotBlank(message="{local.domain.require}", groups = LocalGroup.class)
    @URL(message = "{local.domain.url}", groups = LocalGroup.class)
    private String localDomain;

    @ApiModelProperty(value = "本地上传路径前缀")
    private String localPrefix;

    @ApiModelProperty(value = "本地上传存储目录")
    @NotBlank(message="{local.path.url}", groups = LocalGroup.class)
    private String localPath;

    @ApiModelProperty(value = "Minio EndPoint")
    @NotBlank(message="{minio.endPoint.require}", groups = MinioGroup.class)
    private String minioEndPoint;

    @ApiModelProperty(value = "accessKey")
    @NotBlank(message="{minio.accesskey.require}", groups = MinioGroup.class)
    private String minioAccessKey;

    @ApiModelProperty(value = "secretKey")
    @NotBlank(message="{minio.secretkey.require}", groups = MinioGroup.class)
    private String minioSecretKey;

    @ApiModelProperty(value = "BucketName")
    @NotBlank(message="{minio.bucketname.require}", groups = MinioGroup.class)
    private String minioBucketName;

    @ApiModelProperty(value = "MinIO上传路径前缀")
    private String minioPrefix;

}