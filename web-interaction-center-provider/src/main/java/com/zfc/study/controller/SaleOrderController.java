package com.zfc.study.controller;

import com.zfc.study.depend.SaleOrdeClient;
import com.zfc.study.util.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author zufeichao
 * @ProjectName web-interaction-center
 * @Description TODO
 * @Date 2019-06-28 15:25
 **/
@RestController
@RequestMapping("/saleOrder")
public class SaleOrderController {

    @Autowired
    private SaleOrdeClient saleOrdeClient;

    @GetMapping("/list")
    public JsonBean queryList(){
        List<Map<String,Object>>  list =  saleOrdeClient.queryList();
        return new JsonBean(list);
    }

}
