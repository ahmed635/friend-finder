package com.example.friend_finder.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Post extends BaseEntity
{

	private Integer likes;

	private String image;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
