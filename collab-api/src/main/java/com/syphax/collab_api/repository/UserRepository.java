package com.syphax.collab_api.repository;

import com.syphax.collab_api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

// Interface qui étend MongoRepository pour fournir des opérations CRUD sur la collection "User"
public interface UserRepository extends MongoRepository<User, String> {

    // Méthode personnalisée pour retrouver un utilisateur par son email
    Optional<User> findByEmail(String email);
}
