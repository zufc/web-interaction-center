package com.zfc.study.controller;

import com.zfc.study.depend.TestClient;
import com.zfc.study.stock.dto.TestDto;
import com.zfc.study.util.JsonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zufeichao
 * @ProjectName web-interaction-center
 * @Description TODO
 * @Date 2019-06-28 11:15
 **/
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private TestClient testClient;

    @GetMapping("/queryTest")
    public JsonBean queryTest(@RequestParam(name="name") String name){
        log.info("name={}",name);
        return new JsonBean(testClient.questTestList());
    }

    @PostMapping
    public JsonBean saveTest(@RequestBody TestDto testDto){
        testClient.saveTest(testDto);
        return new JsonBean();
    }


}
