package com.home.factory;

import com.home.dao.IUserDAO;
import com.home.dao.Impl.UserDAOImpl;

import java.sql.Connection;

public class DAOFactory {
    public static IUserDAO getIUserDAOInstance(Connection conn){
        return new UserDAOImpl(conn);
    }
}
