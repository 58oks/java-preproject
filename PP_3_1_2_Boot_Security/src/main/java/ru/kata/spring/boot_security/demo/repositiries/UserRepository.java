package ru.kata.spring.boot_security.demo.repositiries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByNickName(String nickName);
}
