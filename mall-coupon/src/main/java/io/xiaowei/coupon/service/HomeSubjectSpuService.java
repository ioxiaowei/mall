package io.xiaowei.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 15:14:09
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

