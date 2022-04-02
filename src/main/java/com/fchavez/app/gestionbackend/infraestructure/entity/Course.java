package com.fchavez.app.gestionbackend.infraestructure.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "COURSE")
@Data
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCourse;

	@Column(length = 75, nullable = false, name = "name")
	private String name;

	@Column(length = 150, nullable = false, name = "description")
	private String description;

	@Column(length = 75, nullable = false, name = "code")
	private String code;
}
