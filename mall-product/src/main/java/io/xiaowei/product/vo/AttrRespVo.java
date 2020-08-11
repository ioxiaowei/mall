package io.xiaowei.product.vo;

import lombok.Data;

/**
 * @ClassName AttrRespVo
 * @Description TODO
 * @Author xiaowei
 * @Date 2020/8/11 11:30 下午
 * @Version 1.0
 **/
@Data
public class AttrRespVo extends AttrVO {

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;

}
