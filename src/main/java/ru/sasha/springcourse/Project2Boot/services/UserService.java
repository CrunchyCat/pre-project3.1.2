package ru.sasha.springcourse.Project2Boot.services;

import ru.sasha.springcourse.Project2Boot.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findOne(int id);
    void save(User user);
    void update(int id, User updateUser);
    void delete(int id);
}
