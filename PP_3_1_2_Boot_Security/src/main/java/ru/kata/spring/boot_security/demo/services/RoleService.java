package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoles();

    Role findRoleById(Long id);

    void addRole(Role role);

}
