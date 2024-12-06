package java16.Models.dao;

import java16.Models.service.User;

public interface UserDao {

 void Registration(User user);


 User[] findAll();
}
