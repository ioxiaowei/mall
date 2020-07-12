package io.xiaowei.coupon.dao;

import io.xiaowei.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:08
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
