package exercise.account.bank.test;

import exercise.account.bank.domain.User;
import exercise.account.bank.repository.UserRepository;
import exercise.account.bank.service.UserService;

public class UserTest {
    public static void main(String[] args) {
        User user = new User(1, "Gabriel", "andersonl@gmail.com", 100);
        UserService userService = new UserService();
        UserRepository userRepository = new UserRepository();

        userService.registerUser(user.getName(), user.getId(), user.getEmail());
        userService.checkedAccount();
        userRepository.save(user);

    }
}
