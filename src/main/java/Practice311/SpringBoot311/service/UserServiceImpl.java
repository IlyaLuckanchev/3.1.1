package Practice311.SpringBoot311.service;

import Practice311.SpringBoot311.repository.User;
import Practice311.SpringBoot311.userDaoImpl.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }
    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public void updateUser(String name, String surName, Long id) {
        userDao.updateUser(name, surName, id);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
