package com.syphax.collab_api.controller;

import com.syphax.collab_api.model.User;
import com.syphax.collab_api.service.UserService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

import java.util.List;

// Contrôleur GraphQL qui expose les opérations User sous forme de requêtes ou mutations
@Controller
public class UserController {

    private final UserService userService;

    // Injection du service utilisateur
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Requête GraphQL : retourne la liste des utilisateurs
    @QueryMapping
    public List<User> users() {
        return userService.getAllUsers();
    }

    // Requête GraphQL : retourne un utilisateur selon l'ID fourni
    @QueryMapping
    public User userById(@Argument String id) {
        return userService.getUserById(id);
    }

    // Mutation GraphQL : crée un utilisateur
    @MutationMapping
    public User createUser(@Argument User user) {
        return userService.saveUser(user);
    }
}
