package com.example.Thymeleaf_Project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userid;
	
	@Column
	String userName;
	
	@Column
    Long contact;
	
	
	


}
