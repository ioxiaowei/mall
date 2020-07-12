package io.xiaowei.coupon.dao;

import io.xiaowei.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
