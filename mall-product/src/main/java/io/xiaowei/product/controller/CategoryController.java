package io.xiaowei.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.xiaowei.product.entity.CategoryEntity;
import io.xiaowei.product.service.CategoryService;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.common.utils.R;


/**
 * 商品三级分类
 *
 * @author xiaowei
 * @email xiaowei_wang@aliyun.com
 * @date 2020-07-12 03:22:27
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * @return io.xiaowei.common.utils.R
     * @Author xiaowei_wang
     * @Description 查出所有分类及子类
     * @Date 6:12 下午 2020/7/25
     * @Param [params]
     **/
    @GetMapping("/list/tree")
    public R list() {
        List<CategoryEntity> categoryEntityList = categoryService.listWithTree();
        return R.ok().put("data", categoryEntityList);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateCascade(category);

        return R.ok();
    }


    /**
     * @return io.xiaowei.common.utils.R
     * @Author xiaowei_wang
     * @Description 批量修改
     * @Date 11:40 下午 2020/8/3
     * @Param [category]
     **/
    @RequestMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] category) {
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }


    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
