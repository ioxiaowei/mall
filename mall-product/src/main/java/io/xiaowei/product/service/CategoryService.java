package io.xiaowei.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 03:22:27
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * @return java.util.List<io.xiaowei.product.entity.CategoryEntity>
     * @Author xiaowei_wang
     * @Description 查出所有分类及子类
     * @Date 6:14 下午 2020/7/25
     * @Param []
     **/
    List<CategoryEntity> listWithTree();

    /**
     * @return void
     * @Author xiaowei_wang
     * @Description 批量删除
     * @Date 10:03 下午 2020/7/26
     * @Param [asList]
     **/
    void removeMenuByIds(List<Long> asList);
}

