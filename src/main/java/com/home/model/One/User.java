package com.home.model.One;

public class User {
    private int id;
    private String password;
    private String name;
    private State [] sid;

    public User(int id, String password, String name) {
        setId(id);
        setName(name);
        setPassword(password);
    }

    public State [] getSid() {
        return sid;
    }

    public void setSid(State [] sid) {
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
