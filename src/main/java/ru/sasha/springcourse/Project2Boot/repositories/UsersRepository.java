package ru.sasha.springcourse.Project2Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sasha.springcourse.Project2Boot.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
