package com.cdna;
import com.sun.org.apache.xpath.internal.SourceTree;
import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Person [name=" + name + ",age=" + age + "]\n";
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

/**
 * 排序还是在Arrays里面，只不过是换了个方法
 */
class PersonConparator implements Comparator<Person>{
    public int compare(Person o1, Person o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() < o2.getAge()){
            return -1;
        }
        return 0;
    }
}
public class TestDemo {
    public static void main(String[] args) throws Exception{
        Person per [] = new Person []{
                new Person("张三",20),
                new Person("李四",19),
                new Person("王五",21)
        };  //对象数组
        Arrays.sort(per,new PersonConparator());   //要进行对象数组的排序处理
        System.out.println(Arrays.toString(per));
    }
}
