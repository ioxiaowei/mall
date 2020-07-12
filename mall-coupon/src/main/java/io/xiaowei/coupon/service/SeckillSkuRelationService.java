package io.xiaowei.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:06
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

