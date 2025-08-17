package com.example.friend_finder.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="friends")
public class Friend extends BaseEntity
{

	private int idFriend;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User  user;
}
