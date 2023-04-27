package com.zhang.designpatterns.designpatterns.proxy.dbroute;

/**
 * @Description
 * @Author 往事随风
 * @Data 2023/4/27 21:30
 */

public class Order {
    private Object orderInfo;

    //根据订单创建时间进行分库分表
    private Long createTime;

    private String id;

    public Order() {
    }

    public Order(Object orderInfo, Long createTime, String id) {
        this.orderInfo = orderInfo;
        this.createTime = createTime;
        this.id = id;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderInfo=" + orderInfo +
                ", createTime=" + createTime +
                ", id='" + id + '\'' +
                '}';
    }
}
