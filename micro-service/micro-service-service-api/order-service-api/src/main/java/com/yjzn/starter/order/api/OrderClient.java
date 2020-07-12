package com.yjzn.starter.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;



@FeignClient(value = "")
public interface OrderClient {

    String API_PREFIX = "/goods";

    @PostMapping(value = API_PREFIX + "/querybygoodcode")
    String queryListByGoodCode();
}
