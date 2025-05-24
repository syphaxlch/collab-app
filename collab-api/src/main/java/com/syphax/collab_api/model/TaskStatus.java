package com.syphax.collab_api.model;

// Enumération pour définir les différents statuts possibles d’une tâche
public enum TaskStatus {
    TO_DO,        // La tâche est à faire (non commencée)
    IN_PROGRESS,  // La tâche est en cours de réalisation
    DONE,         // La tâche est terminée
    BLOCKED       // La tâche est bloquée, ne peut pas avancer pour le moment
}
