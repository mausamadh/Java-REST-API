package com.mausam.app.rest.Repo;

import com.mausam.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User ,Long> {

}
