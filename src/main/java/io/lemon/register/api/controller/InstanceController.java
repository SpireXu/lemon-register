package io.lemon.register.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: jiaqing.xu@hand-china.com
 * @Date: 2019-09-24 21:27
 */
@RestController
public class InstanceController {


    public InstanceController() {
    }

    @GetMapping({"/service-instances/{applicationName}"})
    public String serviceInstancesByApplicationName(@PathVariable String applicationName) {
        return applicationName;
    }
}
