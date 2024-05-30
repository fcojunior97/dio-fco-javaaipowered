package dio.fco.domain.service.impl;

import dio.fco.domain.model.User;
import dio.fco.domain.repository.UserRepository;
import dio.fco.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByID(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return userRepository.save(userToCreate);
    }
}
