package io.xiaowei.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:07
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

