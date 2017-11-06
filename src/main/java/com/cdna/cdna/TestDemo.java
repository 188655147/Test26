package com.cdna.cdna;

import java.lang.reflect.Method;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Person.class;
        Method met[] = cls.getMethods();
        for (int x = 0; x < met.length; x++) {
            System.out.println(met[x]);
        }
    }
}
