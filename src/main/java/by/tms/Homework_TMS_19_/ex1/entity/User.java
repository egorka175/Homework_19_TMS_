package by.tms.Homework_TMS_19_.ex1.entity;

import java.util.Objects;

public class User {
    String name="Egor";
    String userName="edssjfxa";
    String password="ffgvndfv";


    public User() {
    }

    public User(String name, String userName, String password) {
        this.name = name;
        this.userName=userName;
        this.password=password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
