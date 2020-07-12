package io.xiaowei.member.dao;

import io.xiaowei.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:45:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
