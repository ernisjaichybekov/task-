package java16.Models.service;

import java16.Models.enumpackage.Catgory;
import java16.Models.enumpackage.Size;
import jdk.jfr.Category;

public interface UserService {

    String registration(User user);

    User [] findAll();

    User signIn(String email,String password);

}
