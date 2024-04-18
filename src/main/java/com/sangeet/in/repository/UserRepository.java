package com.sangeet.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sangeet.in.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
