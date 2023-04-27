package com.zhang.designpatterns.designpatterns.proxy.dbroute;

/**
 * @Description
 * @Author 往事随风
 * @Data 2023/4/27 21:34
 */

public class OrderDAO {

    public int insert(Order order){
        System.out.println("OrderDAO创建order成功");
        return 1;
    }

}
