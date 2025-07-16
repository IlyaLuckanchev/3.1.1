package Practice311.SpringBoot311.userDaoImpl;

import Practice311.SpringBoot311.repository.User;

import java.util.List;

public interface UserDAO {
    List<User> getUser();
    User addUser(User user);
    void deleteUser(Long id);
    void updateUser(String name, String surName, Long id);
    User getUserById(Long id);
}
