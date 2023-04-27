package com.zhang.designpatterns.designpatterns.proxy.dbroute;

/**
 * @Description
 * @Author 往事随风
 * @Data 2023/4/27 21:41
 */

public class OrderService implements IOrderService {
    private OrderDAO orderDAO;

    public OrderService() {
        //如果使用spring可以自动注入
        //这里为了方便，在构造器方法中将OrderDAO直接初始化
        orderDAO = new OrderDAO();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用OrderDAO创建订单");
        return orderDAO.insert(order);
    }
}
