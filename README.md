# A Student System full stack application
 - In this project, I use Spring Boot, React and mySQL to build a full-stack student system application.
## 1. Back-end folder structures
- `model` package:
   - class `Student` (entities), getters, setters, and constructors, etc.
- `repository` package:
   - use for JPA specification. (JPA = Java Persistence API)
   - is a set of rules to set interfaces for implementing object-relational mapping
   - interface `StudentRepository`
- `controller` package:
   - `@Controller` is used to mark a class as a **web request handler**, which map all https methods (get, post, etc)
   - class `StudentController`
