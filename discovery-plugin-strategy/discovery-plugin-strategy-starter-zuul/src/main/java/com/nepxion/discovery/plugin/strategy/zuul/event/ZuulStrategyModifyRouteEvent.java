package com.nepxion.discovery.plugin.strategy.zuul.event;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.io.Serializable;

import com.nepxion.discovery.plugin.strategy.zuul.entity.ZuulStrategyRouteEntity;

public class ZuulStrategyModifyRouteEvent implements Serializable {
    private static final long serialVersionUID = 3805426536724590753L;
    
    private ZuulStrategyRouteEntity zuulStrategyRouteEntity;

    public ZuulStrategyModifyRouteEvent(ZuulStrategyRouteEntity zuulStrategyRouteEntity) {
        this.zuulStrategyRouteEntity = zuulStrategyRouteEntity;
    }

    public ZuulStrategyRouteEntity getZuulStrategyRouteEntity() {
        return zuulStrategyRouteEntity;
    }
}