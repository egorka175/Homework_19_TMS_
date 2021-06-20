package by.tms.Homework_TMS_19_.ex1.servlet;

import by.tms.Homework_TMS_19_.ex1.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryStorage {
    User user=new User();
    List<User> userInformationCollection=new ArrayList<>();
    //Метод , который вносит в базу данных нового пользователя.
    public String userRegistration(String name ,String userName, String password) {
            if (checkingForIdenticalUsers(userName)==false){
                user.setName(name);
                user.setUserName(userName);
                user.setPassword(password);
                userInformationCollection.add(new User(user.getName(), user.getUserName(), user.getPassword()));
                return "Name:" + name + " User name:" + userName + " Password:" + password;
            } else {
                return "Such user exist";
            }

    }
    //Метод, который проверяет есть ли данный пользователь в базе данных.
    private boolean checkingForIdenticalUsers(String userName){
        boolean rez=false;
        for(User item: userInformationCollection) {
            if (item.getUserName().equalsIgnoreCase(userName)) {
                rez=true;
                break;
            }
        }
        return rez;
    }

}
