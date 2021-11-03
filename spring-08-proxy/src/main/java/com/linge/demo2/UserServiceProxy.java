package com.linge.demo2;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log();
        userService.add();
    }

    @Override
    public void delete() {
        userService.delete();
    }

    @Override
    public void modify() {
        userService.modify();
    }

    @Override
    public void query() {
        log();
        userService.query();
    }

    public void log(){
        System.out.println("打印日志");
    }
}
