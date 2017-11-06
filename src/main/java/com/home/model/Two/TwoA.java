package com.home.model.Two;

import com.home.model.One.OneA;

/**
 * 对象比较
 */
public class TwoA {
    public static void main(String[] args) {
        OneA oneAA = new OneA(1,"张三",20.1,"攻城狮",'男');
        OneA oneAB = new OneA(1,"张三",20.1,"攻城狮",'男');
        System.out.println(oneAA == oneAB);
        if(oneAA.getInfo().equals(oneAB.getInfo())){
            System.out.println("两个对象相等！");
        }else{
            System.out.println("两个对象不等！");
        }
    }


}
