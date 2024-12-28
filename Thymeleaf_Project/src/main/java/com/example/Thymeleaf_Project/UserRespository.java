package com.example.Thymeleaf_Project;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository  extends JpaRepository<UserEntity, Long>{

}
