package io.xiaowei.member.feign;

import io.xiaowei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "mall-coupon")
public interface CouponFeignService {

    /**
     * @return io.xiaowei.common.utils.R
     * @Author xiaowei_wang
     * @Description 测试方法 会员所有优惠券
     * @Date 11:56 下午 2020/7/12
     * @Param []
     **/
    @GetMapping("coupon/coupon/member/list")
    public R memberCoupons();
}
