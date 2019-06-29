package com.zfc.study.depend;

import com.zfc.study.stock.dto.TestDto;
import com.zfc.study.stock.vo.TestVo;
import com.zfc.study.util.JsonBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("stock-service-center")
@RequestMapping("/stock-service-center/api/v1/test")
public interface TestClient {

    @GetMapping
    public List<TestVo> questTestList();

    @PostMapping
    public int saveTest(@RequestBody TestDto testDto);
}
