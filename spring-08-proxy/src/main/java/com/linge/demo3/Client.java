package com.linge.demo3;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色，现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用处理程序来处理要代理的对象
        pih.setRent(host);
        //动态生成对应的代理类！
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
