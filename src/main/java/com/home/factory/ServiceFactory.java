package com.home.factory;

import com.home.service.IUserService;
import com.home.service.Impl.UserServiceImpl;

public class ServiceFactory {
    public static IUserService getIUserServiceInstance(){
        return new UserServiceImpl();
    }
}
