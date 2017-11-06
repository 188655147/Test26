package com.home.service.Impl;

import com.home.dbconn.DatabaseConnection;
import com.home.factory.DAOFactory;
import com.home.service.IUserService;
import com.home.vo.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserServiceImpl implements IUserService {
    //在这个类的对象内部就提供一个数据库连接类的实例化对象
    private DatabaseConnection dbc = new DatabaseConnection();

    @Override
    public boolean insert(User vo) throws Exception {
        try {
            //要增加的用户编号如果不存在，则findById()返回的结果就是null，表示可以进行新用户数据的保存
            if (DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).findById(vo.getAccount()) == null) {
                return DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).doCreate(vo);
            }
            return false;
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean update(User vo) throws Exception {
        try {
            return DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).doUpdate(vo);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public boolean delete(Set<Integer> ids) throws Exception {
        try {
            return DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).doRemoveBatch(ids);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public User get(String userno) throws Exception {
        try {
            return DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).findById(userno);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public List<User> list() throws Exception {
        try {
            return DAOFactory.getIUserDAOInstance(this.dbc.getConnection()).findAll();
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
    }

    @Override
    public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception {
        return null;
    }
}
