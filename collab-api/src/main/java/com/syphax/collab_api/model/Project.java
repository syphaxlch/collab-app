package com.syphax.collab_api.model;  
// Déclaration du package où se trouve la classe Project

import org.springframework.data.annotation.Id;  
// Import pour l'annotation @Id utilisée pour la clé primaire dans MongoDB

import org.springframework.data.mongodb.core.mapping.Document;  
// Import pour l'annotation @Document qui indique que cette classe sera une collection MongoDB

import java.util.List;  
// Import de List pour stocker une liste d'objets Task

import java.util.Set;  
// Import de Set pour stocker un ensemble d'objets User (membres)

@Document(collection = "projects")  
// Annotation indiquant que cette classe correspond à la collection "projects" dans MongoDB

public class Project {  
// Début de la définition de la classe Project

    @Id  
    // Annotation qui indique que ce champ est la clé primaire dans la base de données

    private String id;  
    // Identifiant unique du projet

    private String name;  
    // Nom du projet

    private String description;  
    // Description textuelle du projet

    private User owner;  
    // Le propriétaire du projet (un seul utilisateur)

    private Set<User> members;  
    // Ensemble des membres (utilisateurs) associés au projet

    private List<Task> tasks;  
    // Liste des tâches liées au projet

    // Constructeur par défaut (sans paramètres)
    public Project() {
    }

    // Constructeur avec tous les champs pour initialiser un objet Project complet
    public Project(String name, String description, User owner, Set<User> members, List<Task> tasks) {
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.members = members;
        this.tasks = tasks;
    }

    // Getter de l'identifiant
    public String getId() {
        return id;
    }

    // Setter de l'identifiant
    public void setId(String id) {
        this.id = id;
    }

    // Getter du nom du projet
    public String getName() {
        return name;
    }

    // Setter du nom du projet
    public void setName(String name) {
        this.name = name;
    }

    // Getter de la description
    public String getDescription() {
        return description;
    }

    // Setter de la description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter du propriétaire (owner)
    public User getOwner() {
        return owner;
    }

    // Setter du propriétaire
    public void setOwner(User owner) {
        this.owner = owner;
    }

    // Getter des membres du projet
    public Set<User> getMembers() {
        return members;
    }

    // Setter des membres
    public void setMembers(Set<User> members) {
        this.members = members;
    }

    // Getter des tâches du projet
    public List<Task> getTasks() {
        return tasks;
    }

    // Setter des tâches
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
