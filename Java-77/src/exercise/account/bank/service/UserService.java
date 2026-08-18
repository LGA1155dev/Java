package exercise.account.bank.service;

import exercise.account.bank.domain.User;
import exercise.account.bank.repository.UserRepository;

public class UserService {
    UserRepository user = new UserRepository();
    User usually = new User();


    public void registerUser(String name, int id, String email){
        user.save(name, id, email);
    }

    public void checkedAccount(){
        if (usually.getMoney() < 0)
            throw  new RuntimeException("You account can't negative value!");
        System.out.println("You have: $ " + usually.getMoney());
    }
}
