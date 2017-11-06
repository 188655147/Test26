package com.home.model.One;

/**
 * 简单Java类
 */
public class OneA {
    private int id;
    private String name;
    private double money;
    private String job;
    private char sex;
    public OneA(){}
    public OneA(int id, String name, double money, String job, char sex){
        setId(id);
        setName(name);
        setMoney(money);
        setJob(job);
        setSex(sex);
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getMoney(){
        return this.money;
    }
    public String getJob(){
        return this.job;
    }
    public char getSex(){
        return this.sex;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public void setJob(String job){
        this.job = job;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public String getInfo(){
        return "id = " + this.id + "\n" +
                "name = " + this.name + "\n" +
                "money = " + this.money + "\n" +
                "job = " + this.job + "\n" +
                "sex = " +this.sex ;
    }

    public static void main(String[] args) {
        System.out.println(new OneA(11,"沉重",20.1,"工程师",'男').getInfo());
    }
}
