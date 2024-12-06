package java16.Models.service;

import java16.Models.dao.UserDao;

public class UserServicelmpl implements UserService{
    private final UserDao userDao;

    public UserServicelmpl(UserDao userDao){this.userDao= userDao;}


    @Override
    public String registration(User user) {
        return "";
    }

    @Override
    public User[] findAll() {
        return new User[0];
    }

    @Override
    public User signIn(String email, String password) {
        return null;
    }
}
