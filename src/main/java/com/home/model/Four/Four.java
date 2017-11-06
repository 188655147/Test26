package com.home.model.Four;

/**
 * 异常处理
 */
public class Four {
    public static void main(String[] args) {
        try{
            System.out.println(new com.home.model.One.Four().div(10,1));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
