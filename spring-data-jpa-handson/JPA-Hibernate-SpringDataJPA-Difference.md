# Difference between JPA, Hibernate and Spring Data JPA

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Developed By | Oracle/Jakarta EE | Hibernate Team | Spring |
| Implementation | No | Yes | Uses JPA |
| SQL Generation | No | Yes | Yes |
| Boilerplate Code | High | Medium | Very Low |
| CRUD Operations | EntityManager | Session | JpaRepository |
| Database Support | Through Provider | Direct | Through JPA Provider |

## Relationship

Spring Data JPA
↓
Hibernate
↓
JPA
↓
Database

## Conclusion

- JPA is a specification.
- Hibernate is an implementation of JPA.
- Spring Data JPA simplifies database operations by using Hibernate internally and providing JpaRepository for CRUD operations.