package library.of.system.small.repository;
import library.of.system.small.model.User;
import java.util.ArrayList;

public class UserRepository {
    ArrayList<User> u;
    private User user;

    public void saveUser(User user){
        this.user = user;
        System.out.println(this.user);
    }

    public int findById(){
        if (user.equals(null))
            throw  new RuntimeException("Error, this user isn't found!");
       return user.getId();
    }

    public ArrayList<User> findAll(){
        return u;
    }
}

