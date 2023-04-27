package com.zhang.designpatterns.designpatterns.proxy.dbroute.proxy;

import com.zhang.designpatterns.designpatterns.proxy.dbroute.DynamicDataSourceUtil;
import com.zhang.designpatterns.designpatterns.proxy.dbroute.IOrderService;
import com.zhang.designpatterns.designpatterns.proxy.dbroute.Order;

import java.text.SimpleDateFormat;

/**
 * @Description 静态代理配置数据源
 * @Author 往事随风
 * @Data 2023/4/27 22:11
 */

public class OrderServiceStaticProxy implements IOrderService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        Long createTime = order.getCreateTime();
        Integer year = Integer.valueOf(yearFormat.format(createTime));
        System.out.println("静态代理类自动分配到【DB_"+year+"】数据源");
        DynamicDataSourceUtil.set(year);
        this.orderService.createOrder(order);
        DynamicDataSourceUtil.restore();
        return 0;
    }
}
