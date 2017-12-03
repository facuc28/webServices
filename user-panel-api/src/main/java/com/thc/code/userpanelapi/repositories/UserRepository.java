package com.thc.code.userpanelapi.repositories;

import com.thc.code.userpanelapi.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

  private List<User> usersList = new ArrayList<>();

  public UserRepository(){
      usersList.add(new User("Facundo", "", "Crusta", "3571-457371", "Obispo Trejo 1119", "Facuc"));
      usersList.add(new User("Usuario1", "", "Apellido1", "3571-457371", "Obispo Trejo 1119", "user1"));
      usersList.add(new User("Usuario2", "", "Apellido2", "3571-457371", "Obispo Trejo 1119", "user2"));
      usersList.add(new User("Usuario3", "", "Apellido3", "3571-457371", "Obispo Trejo 1119", "user3"));
      usersList.add(new User("Usuario4", "", "Apellido4", "3571-457371", "Obispo Trejo 1119", "user4"));
      usersList.add(new User("Usuario5", "", "Apellido5", "3571-457371", "Obispo Trejo 1119", "user5"));
      usersList.add(new User("Usuario6", "", "Apellido6", "3571-457371", "Obispo Trejo 1119", "user6"));
  }

  public User getUserByName(String name) {
      for (User user : usersList) {
          if (user.getName().equalsIgnoreCase(name)) {
              return user;
          }
      }

      return null;
  }

    public List<User> getAllUsers() {
        return usersList;
    }

}
