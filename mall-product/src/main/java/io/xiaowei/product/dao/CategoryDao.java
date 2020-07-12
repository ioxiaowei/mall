package io.xiaowei.product.dao;

import io.xiaowei.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 03:22:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
