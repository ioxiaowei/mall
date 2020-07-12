package io.xiaowei.product.dao;

import io.xiaowei.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 03:22:28
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
