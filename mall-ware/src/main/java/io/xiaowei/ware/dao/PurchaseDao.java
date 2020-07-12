package io.xiaowei.ware.dao;

import io.xiaowei.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 16:09:46
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
