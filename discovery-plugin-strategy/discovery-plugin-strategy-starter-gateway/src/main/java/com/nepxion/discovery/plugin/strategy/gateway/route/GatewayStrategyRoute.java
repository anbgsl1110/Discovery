package com.nepxion.discovery.plugin.strategy.gateway.route;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Ning Zhang
 * @version 1.0
 */

import java.util.List;

import com.nepxion.discovery.common.entity.GatewayRouteEntity;

public interface GatewayStrategyRoute {
    void update(List<GatewayRouteEntity> gatewayRouteEntityList);

    List<String> view();
}