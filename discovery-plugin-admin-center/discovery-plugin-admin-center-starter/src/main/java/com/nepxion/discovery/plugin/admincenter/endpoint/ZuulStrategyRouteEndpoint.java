package com.nepxion.discovery.plugin.admincenter.endpoint;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Ning Zhang
 * @version 1.0
 */

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nepxion.discovery.common.entity.ZuulRouteEntity;
import com.nepxion.discovery.plugin.strategy.zuul.route.ZuulStrategyRoute;

@RestController
@RequestMapping(path = "/zuul-route")
@Api(tags = { "网关动态路由接口" })
public class ZuulStrategyRouteEndpoint {
    @Autowired
    private ZuulStrategyRoute zuulStrategyRoute;

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @ApiOperation(value = "推送更新网关当前的路由列表", notes = "", response = ResponseEntity.class, httpMethod = "POST")
    @ResponseBody
    public ResponseEntity<Boolean> update(@RequestBody ArrayList<ZuulRouteEntity> zuulRouteEntityList) {
        zuulStrategyRoute.update(zuulRouteEntityList);

        return ResponseEntity.ok(true);
    }

    @RequestMapping(path = "/view", method = RequestMethod.GET)
    @ApiOperation(value = "查看网关已经生效的路由列表", notes = "", response = ResponseEntity.class, httpMethod = "GET")
    @ResponseBody
    public ResponseEntity<List<String>> view() {
        List<String> zuulStrategyRouteList = zuulStrategyRoute.view();

        return ResponseEntity.ok(zuulStrategyRouteList);
    }
}