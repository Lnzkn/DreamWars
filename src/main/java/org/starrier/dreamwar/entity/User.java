package org.starrier.dreamwar.entity;

/**
 * @Author Starrier
 * @Time 2018/2/1.
 */
public class User {
    public String Name;
    public int Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
