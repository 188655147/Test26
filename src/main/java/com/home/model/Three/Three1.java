package com.home.model.Three;

import com.home.model.One.State;
import com.home.model.One.User;

/**
 * 数据表与简单Java类（一对多）
 */
public class Three1 {
    public static void main(String[] args) {
        //1、设置类对象间的关系
        User user = new User(1, "aaaa", "张三");
        State state1 = new State(1, "开", "关", 20.0, 24.0, 0.56, 0.0, 30.1);
        State state2 = new State(2, "开", "关", 59.0, 25.0, 0.59, 0.5, 50.0);
        State state3 = new State(3, "开", "关", 21.0, 26.0, 0.66, 0.0, 60.0);

        state1.setUid(user);
        state2.setUid(user);
        state3.setUid(user);
        user.setSid(new State[]{state1, state2, state3});
        //进行数据的取得
        System.out.println(user.toString());
        for (int x = 0; x < user.getSid().length; x++) {
            System.out.println("\t|-" + user.getSid()[x].toString());
        }
        System.out.println("======================================");
        System.out.println(state1.toString());
        if (state1.getUid() != null) {
            System.out.println("\t|-"+ state1.getUid().toString());
        }
    }
}
