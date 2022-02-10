package com.gomez.category_service.consumers;

import java.util.List;

import com.gomez.category_service.models.Business;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "BUSINESS-SERVICE")
public interface BusinessConsumer {

    @GetMapping("/businesses")
    public List<Business> getBusinesses();
}
