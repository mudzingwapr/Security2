package com.mudzingwa.sec.Services;

import java.util.List;
import java.util.Optional;

import com.mudzingwa.sec.model.User;

public interface IUserServiceInterf {
  Optional<User>findByUsername(String username);
  List<User> findAllUsers();
  void DeleteUser(Integer id);
  User saveUser(User user);
  User UpdateUser(Integer id);
}
