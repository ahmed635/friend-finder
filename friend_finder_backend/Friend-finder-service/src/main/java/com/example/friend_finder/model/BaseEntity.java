package com.example.friend_finder.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

}
