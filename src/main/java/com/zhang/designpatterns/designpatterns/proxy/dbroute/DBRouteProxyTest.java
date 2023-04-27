package com.zhang.designpatterns.designpatterns.proxy.dbroute;

import com.zhang.designpatterns.designpatterns.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author 往事随风
 * @Data 2023/4/27 22:24
 */

public class DBRouteProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setCreateTime(new Date().getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = format.parse("2024/01/01");
            long time = date.getTime();
            order.setCreateTime(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
