package com.zhang.designpatterns.designpatterns.proxy.staticproxy;

import com.zhang.designpatterns.designpatterns.proxy.Person;

/**
 * 静态代理
 */
public class Father implements Person{
    private Person person;

    public Father(Person person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确定关系");
    }
    //父亲只能帮自己儿子找对象，不能够帮别人的儿子找对象，这是静态代理
    //动态代理 媒婆，婚介所，中介
    //对数据库进行分库分表
    //利用threadlocal的特性对数据源进行动态的切换
}
