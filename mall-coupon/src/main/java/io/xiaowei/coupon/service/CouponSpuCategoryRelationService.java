package io.xiaowei.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:11
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

