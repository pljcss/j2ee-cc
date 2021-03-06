package com.cc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: cs
 * @Date: 2021/2/19 1:53 下午
 * @Desc:
 */
@RestController
public class ParameterController {


    /**
     * 路径变量
     */
    @GetMapping("/car/{id}/hello/{name}")
    public String getCar(@PathVariable("id") Integer id,
                                      @PathVariable("name") String name) {

        System.out.println(id + " ::::: " + name);
        return id + " ::::: " + name;
    }


    @GetMapping("/car2/{id}/hello/{name}")
    public Map<String, Object> getCar2(@PathVariable("id") Integer id,
                                       @PathVariable("name") String name,
                                       @PathVariable Map<String, String> pv) {

        System.out.println(id + " ::::: " + name);

        HashMap<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);

        return map;
    }




}
