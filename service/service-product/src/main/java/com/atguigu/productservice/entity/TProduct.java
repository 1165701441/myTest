package com.atguigu.productservice.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author testjava
 * @since 2020-09-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TProduct对象", description="商品表")
public class TProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "系统编码")
    private String code;

    @ApiModelProperty(value = "用户编码")
    private String uCode;

    @ApiModelProperty(value = "商品显示短名称")
    private String shortname;

    @ApiModelProperty(value = "商品显示长名称")
    private String longname;

    @ApiModelProperty(value = "商品主图的地址")
    private String mainImg;

    @ApiModelProperty(value = "0:已下架 1:上架中 4:审核中 5:审核失败 6:新商品 2:商品已删除")
    private Integer online;

    @ApiModelProperty(value = "上架时间")
    private Date onlineTime;

    @ApiModelProperty(value = "下架时间")
    private Date offlineTime;

    @ApiModelProperty(value = "商品分类的id")
    @TableField("categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "商品简单描述")
    private String description;

    @ApiModelProperty(value = "商品详情")
    private String detail;

    @ApiModelProperty(value = "商品的基本属性值id串,用逗号隔开")
    private String propVids;

    @ApiModelProperty(value = "原价")
    private Double price;

    @ApiModelProperty(value = "销量")
    private Integer soldNum;

    @ApiModelProperty(value = "现价")
    private BigDecimal newPrice;

    @ApiModelProperty(value = "运费模板id")
    private Long ftId;

    @ApiModelProperty(value = "商品重量")
    private Double weight;

    @ApiModelProperty(value = "商品体积")
    private Double volume;

    @ApiModelProperty(value = "模板名称")
    private String ftName;

    @ApiModelProperty(value = "赠品ids")
    private String giftIds;

    @ApiModelProperty(value = "组合商品")
    private String combinedGoodsIds;

    @ApiModelProperty(value = "审核人")
    private String auditor;

    @ApiModelProperty(value = "审核时间")
    private Date auditorTime;

    @ApiModelProperty(value = "审核备注")
    private String auditorRemark;

    @ApiModelProperty(value = "商品来源,")
    private String shopname;

    @ApiModelProperty(value = "type表示商品来源类型，0代表魏远商场，1代表线下合作商家，2代表礼品券合作商家")
    private String type;

    @ApiModelProperty(value = "商品营销活动开始时间")
    @TableField("marketing_startTime")
    private Date marketingStarttime;

    @ApiModelProperty(value = "商品营销活动结束时间")
    @TableField("marketing_endTime")
    private Date marketingEndtime;

    private Integer buyTotal;

    @ApiModelProperty(value = "商品类型：0：普通商品；1：京东商品")
    private String productType;

    @ApiModelProperty(value = "京东商品编号")
    private String jdProductId;

    private String zshCouponCode;

    @ApiModelProperty(value = "商品提示语句")
    private String finishedmessage;

    @ApiModelProperty(value = "促销卷编号")
    @TableField("fuId")
    private Integer fuId;

    @ApiModelProperty(value = "促销卷名称")
    @TableField("fuName")
    private String fuName;

    @ApiModelProperty(value = "品牌")
    @TableField("brandName")
    private String brandName;

    @ApiModelProperty(value = "利润率")
    private Double profitmargin;


}
