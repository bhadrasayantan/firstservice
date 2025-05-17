package com.sayantan.firstservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="${secondServiceSVCNAME}/secondservice")
public interface SecondServiceClient {
    @GetMapping("/second/calling")
    public String getCalling();
}
