package com.syphax.collab_api.model;  
// Déclare que cette classe appartient au package com.syphax.collab_api.model

import org.springframework.data.annotation.Id;  
// Import pour l’annotation @Id qui marque la clé primaire MongoDB

import org.springframework.data.mongodb.core.mapping.Document;  
// Import pour l’annotation @Document qui lie la classe à une collection MongoDB

import java.time.LocalDateTime;  
// Import pour manipuler des dates/horaires

@Document(collection = "tasks")  
// Indique que cette classe est mappée à la collection "tasks" dans MongoDB

public class Task {  
// Définition de la classe Task

    @Id  
    // Champ qui représente l'identifiant unique (clé primaire) dans la collection MongoDB

    private String id;  
    // Identifiant unique de la tâche

    private String title;  
    // Titre ou nom de la tâche

    private String description;  
    // Description détaillée de la tâche

    private User assignee;  
    // Utilisateur à qui la tâche est assignée

    private TaskStatus status;  
    // Statut actuel de la tâche (ex: TO_DO, IN_PROGRESS, DONE)

    private LocalDateTime dueDate;  
    // Date et heure limite pour la réalisation de la tâche

    // Constructeur vide (par défaut)
    public Task() {
    }

    // Constructeur complet pour initialiser toutes les propriétés
    public Task(String title, String description, User assignee, TaskStatus status, LocalDateTime dueDate) {
        this.title = title;
        this.description = description;
        this.assignee = assignee;
        this.status = status;
        this.dueDate = dueDate;
    }

    // Getter de l'id
    public String getId() {
        return id;
    }

    // Setter de l'id
    public void setId(String id) {
        this.id = id;
    }

    // Getter du titre
    public String getTitle() {
        return title;
    }

    // Setter du titre
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter de la description
    public String getDescription() {
        return description;
    }

    // Setter de la description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter de l'assignee (utilisateur assigné)
    public User getAssignee() {
        return assignee;
    }

    // Setter de l'assignee
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    // Getter du statut
    public TaskStatus getStatus() {
        return status;
    }

    // Setter du statut
    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    // Getter de la date limite
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    // Setter de la date limite
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
}
