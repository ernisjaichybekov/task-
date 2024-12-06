package java16.Models.dao;

import java16.Models.database.DataBase;
import java16.Models.service.User;

import java.util.Arrays;

public class UserDaolmp implements UserDao{


    @Override
    public void Registration(User user) {
        DataBase.users = Arrays.copyOf(DataBase.users,DataBase.users.length+1);
    }

    @Override
    public User[] findAll() {
        return new User[0];
    }
}
