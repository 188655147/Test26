package com.home.service;

import com.home.vo.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 定义user表的业务层的执行标准，此类一定要负责数据库的打开与关闭操作
 * 此类可以通过DAOFactory类取得IUserDAO接口对象
 */
public interface IUserService {
    /**
     * 实现用户的注册操作，本次操作要调用IUserDAO接口的如下方法<br>
     * <li>需要调用IUserDAO.findById()方法，判断要增加数据的id是否已存在</li>
     * <li>如果现在要增加的数据编号不存在则调用IUserDAO.doCreate()方法，返回操作的结果</li>
     *
     * @param vo 包含了要增加数据的VO对象
     * @return 如果增加数据的ID重复或者保存失败返回false，否则返回true
     * @throws Exception SQL执行异常
     */
    public boolean insert(User vo) throws Exception;

    /**
     * 实现修改密码操作，本次要调用IUserDAO.doUpdate()方法
     *
     * @param vo 包含了要修改数据的VO对象
     * @return 修改成功返回true，否则返回false
     * @throws Exception SQL执行异常
     */
    public boolean update(User vo) throws Exception;

    /**
     * 执行用户数据的删除操作，可以删除多个雇员信息，调用IUserDAO.doRemoveBatch()方法
     *
     * @param ids 包含了全部要删除数据的集合，没有重复数据
     * @return 删除成功返回true，否则返回false
     * @throws Exception SQL执行异常
     */
    public boolean delete(Set<Integer> ids) throws Exception;

    /**
     * 根据用户编号查找用的的密码，调用IUserDAO.findAll()方法
     *
     * @param userno 要查找的用户编号
     * @return 如果找到了用户信息以VO对象返回，否则返回null
     * @throws Exception SQL执行异常
     */
    public User get(String userno) throws Exception;

    /**
     * 查询全部用户信息，调用IUserDAO.findAll()方法
     *
     * @return 查询结果以List集合的形式返回，如果没有数据则集合的长度为0
     * @throws Exception SQL执行异常
     */
    public List<User> list() throws Exception;

    /**
     * 实现数据的模糊查询与数据统计，要调用IUserDAO接口的两个方法：<br>
     * <li>调用IUserDAO.findAllSplit()方法，查询所有的表数据，返回List</li>
     * <li>调用IUserDAO.getAllCount()方法，查询所有的数据量，返回Integer</li>
     *
     * @param currentPage 当前所在页
     * @param lineSize    每页显示的记录数
     * @param column      模糊查询的数据列
     * @param keyWord     模糊查询关键字
     * @return 本方法由于需要返回多种数据类型，所以使用Map集合返回，由于类型不统一，所以所有value的类型设置为Object，返回内容如下：<br>
     * <li>key = allUsers, value = IUserDAO.findAllSplit()放回结果，List<User>;</li>
     * <li>key = userCount, value = IUserDAO.getAllCount()返回结果，Integer</li>
     * @throws Exception SQL执行异常
     */
    public Map<String, Object> list(int currentPage, int lineSize, String column, String keyWord) throws Exception;
}
