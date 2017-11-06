package com.home.model.One;

/**
 * 存在异常类
 */
public class Four {
    public static int div(int x,int y) throws Exception {
        int result = 0;
        System.out.println("【开始】进行除法运算");
        try{
            result = x/y;
        }catch(Exception e){
            throw e;
        }finally{
            System.out.println("【结束】除法计算完毕");
        }
        return result;
    }
}
