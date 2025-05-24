package com.syphax.collab_api.service;

import com.syphax.collab_api.model.User;
import java.util.List;

// Interface définissant les opérations de service liées aux utilisateurs
public interface UserService {

    // Enregistrer un nouvel utilisateur
    User saveUser(User user);

    // Récupérer tous les utilisateurs
    List<User> getAllUsers();

    // Récupérer un utilisateur par son ID
    User getUserById(String id);
}
