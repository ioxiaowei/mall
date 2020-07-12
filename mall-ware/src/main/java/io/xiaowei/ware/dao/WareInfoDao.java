package io.xiaowei.ware.dao;

import io.xiaowei.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 16:09:45
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
