package java16.Models.config;

public class Validation {

    public static Boolean validate (String email){
        return email.matches(emailPattern());
    }

    public static String emailPattern  (){
        return "[A-Za]"
    }


}
