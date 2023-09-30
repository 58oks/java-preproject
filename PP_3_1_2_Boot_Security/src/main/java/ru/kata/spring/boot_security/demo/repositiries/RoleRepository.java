package ru.kata.spring.boot_security.demo.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
