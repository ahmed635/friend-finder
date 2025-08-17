package com.example.friend_finder.model;

import com.example.friend_finder.enms.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity
{

	private String firstName;

	private String lastName;

	private Integer age;

	private String phone;

	private LocalDate date;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@OneToMany(mappedBy = "user")
	List<Post> posts;

	@OneToMany(mappedBy = "user")
	List<Friend> friends;
}
