package com.home.dao.Impl;

import com.home.dao.IUserDAO;
import com.home.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UserDAOImpl implements IUserDAO {
    private Connection conn;//需要利用Connection对象操作
    private PreparedStatement pstmt;

    /**
     * 如果想要使用数据层进行原子性的功能操作实现，必须要提供有Connection接口对象<br>
     *     另外，由于开发中业务层要调用数据层，所以数据库的打开与关闭交由业务层处理
     * @param conn 表示数据库连接对象
     */
    public UserDAOImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public boolean doCreate(User vo) throws Exception {
        String sql = "INSERT INTO user(account,password,name) VALUES (?,?,?)";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1,vo.getAccount());
        this.pstmt.setString(2,vo.getPassword());
        this.pstmt.setString(3,vo.getName());
        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    /**
     * 修改密码
     */
    public boolean doUpdate(User vo) throws Exception {
        String sql = "UPDATE user SET password=? WHERE account=?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1,vo.getPassword());
        this.pstmt.setString(2,vo.getAccount());
        return this.pstmt.executeUpdate() > 0;
    }

    @Override
    public boolean doRemoveBatch(Set<Integer> ids) throws Exception {
        if(ids == null || ids.size() == 0){
            return false;
        }
        StringBuffer sql = new StringBuffer();
        sql.append("DELETE FROM user WHERE account IN(");
        Iterator<Integer> iter = ids.iterator();
        while(iter.hasNext()){
            sql.append(iter.next()).append(",");
        }
        sql.delete(sql.length()-1,sql.length()).append(")");
        this.pstmt = this.conn.prepareStatement(sql.toString());
        return this.pstmt.executeUpdate() == ids.size();
    }

    @Override
    /**
     * 根据用户编号查询密码
     */
    public User findById(String userno) throws Exception {
        User vo = null;
        String sql = "SELECT password FROM user WHERE accound=?";
        this.pstmt = this.conn.prepareStatement(sql);
        this.pstmt.setString(1,userno);
        ResultSet rs = this.pstmt.executeQuery();
        if(rs.next()){
            vo = new User();
            vo.setPassword(rs.getString(1));
        }
        return vo;
    }

    @Override
    public List<User> findAll() throws Exception {
        return null;
    }

    @Override
    public List<User> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount(String column, String keyWord) throws Exception {
        return null;
    }
}
