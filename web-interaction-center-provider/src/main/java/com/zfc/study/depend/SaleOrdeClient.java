package com.zfc.study.depend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * @Author zufeichao
 * @ProjectName web-interaction-center
 * @Description TODO
 * @Date 2019-06-28 15:26
 **/
@FeignClient("order-service-center")
@RequestMapping("/order-service-center/api/v1/saleOrder")
public interface SaleOrdeClient {

    @GetMapping("/list")
    public List<Map<String,Object>> queryList();
}
