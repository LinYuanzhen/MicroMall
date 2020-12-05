package cn.lyz.micromall.member.feign;

import cn.lyz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: LinYz
 * @create: 2020-11-29 17:17
 **/
@FeignClient("micromall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
