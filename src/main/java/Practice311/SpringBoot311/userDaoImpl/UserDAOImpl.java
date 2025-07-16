package Practice311.SpringBoot311.userDaoImpl;

import Practice311.SpringBoot311.repository.User;
import Practice311.SpringBoot311.repository.UserRepository;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDAOImpl implements UserDAO {
    private final UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new IllegalStateException("Пользователь с Id : " +id + "не найден");
        }
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateUser(String name, String surName, Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new IllegalStateException("Пользователь с Id : " +id + "не найден");
        }
        User user = optionalUser.get();
        if (name != null && surName != null) {
            user.setName(name);
            user.setSurName(surName);
        }
        userRepository.save(user);
    }

    @Override
    @Transactional
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new IllegalStateException("Пользователь с Id : " +id + "не найден");
        }
        return userRepository.getById(id);
    }
}
