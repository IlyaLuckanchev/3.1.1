package Practice311.SpringBoot311.service;

import Practice311.SpringBoot311.repository.User;
import java.util.List;

public interface UserService {
    List<User> getUser();
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(String name, String surName, Long id);
    User getUserById(Long id);
}
