package ru.kata.spring.boot_security.demo.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);
}
