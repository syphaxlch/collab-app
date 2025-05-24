package com.syphax.collab_api.service;

import com.syphax.collab_api.model.User;
import com.syphax.collab_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Implémentation concrète de UserService
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Injection du repository dans le service
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Sauvegarde d'un utilisateur en base
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Récupération de tous les utilisateurs
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Récupération d'un utilisateur par ID
    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
