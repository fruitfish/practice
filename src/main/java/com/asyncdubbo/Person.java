package com.asyncdubbo;
import java.io.Serializable;
/**
 * Created by Administrator on 2016/5/12 0012.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8994496944734041861L;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}
