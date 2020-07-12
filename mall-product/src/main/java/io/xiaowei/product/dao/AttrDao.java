package io.xiaowei.product.dao;

import io.xiaowei.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 03:22:30
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
