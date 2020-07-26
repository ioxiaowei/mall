package io.xiaowei.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.xiaowei.common.utils.PageUtils;
import io.xiaowei.common.utils.Query;

import io.xiaowei.product.dao.CategoryDao;
import io.xiaowei.product.entity.CategoryEntity;
import io.xiaowei.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        /**所有分类查询*/
        List<CategoryEntity> entities = baseMapper.selectList(null);
        /**树形组装*/
        List<CategoryEntity> treeMenu = entities.stream().filter(category -> category.getParentCid() == 0).map((menu) -> {
                    menu.setChildren(getChildrens(menu, entities));
                    return menu;
                }
        ).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return treeMenu;
    }

    /**
     * @return void
     * @Author xiaowei_wang
     * @Description 批量删除
     * @Date 10:03 下午 2020/7/26
     * @Param [asList]
     **/
    @Override
    public void removeMenuByIds(List<Long> catIdList) {
        //TODO 菜单引用查询
        baseMapper.deleteBatchIds(catIdList);
    }

    /**
     * @return java.util.List<io.xiaowei.product.entity.CategoryEntity>
     * @Author xiaowei_wang
     * @Description 递归查询
     * @Date 6:31 下午 2020/7/25
     * @Param [categoryEntity, all]
     **/
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> collect = all.stream().filter(category -> {
            return category.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            /**子菜单查询*/
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

}