package com.linge.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
//        userService.add();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);
        userServiceProxy.add();
    }
}
