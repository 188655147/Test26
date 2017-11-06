package com.home.dao;
enum Deng {
    ON, OFF;
}
public class Kaiguang {
    public static void main(String[] args) {
        switch (Deng.OFF) {
            case ON:
                System.out.println("开");
                break;
            case OFF:
                System.out.println("关");
                break;
        }
    }
}
