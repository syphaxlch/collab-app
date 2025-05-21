# Architecture de l'API `collab-api`

## Vue d’ensemble

L’API `collab-api` est le backend de la plateforme `collab-app`. Elle est construite avec **Java + Spring Boot** et expose une interface **GraphQL** via `Spring for GraphQL`.  
Elle gère l’authentification, les opérations métier (projets, tâches, utilisateurs...), et communique avec une base **MongoDB** et un cache **Redis**.

---

## Stack technique

- **Langage** : Java 17+
- **Framework principal** : Spring Boot
- **API** : GraphQL (Spring for GraphQL)
- **ORM / DB** : MongoDB (Spring Data MongoDB)
- **Cache** : Redis (Spring Data Redis)
- **Sécurité** :
  - OAuth2 (Google, GitHub, Outlook)
  - Auth locale + 2FA (TOTP via Google Authenticator)
- **Architecture** : MVC + séparation en couches (Controller/Resolver, Service, Repository)

 



