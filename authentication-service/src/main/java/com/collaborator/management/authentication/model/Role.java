package com.collaborator.management.authentication.model;

import java.time.ZonedDateTime;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(builderClassName = "RoleBuilder")
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	private UUID id;
	
	@Column(unique = true, nullable = false, length = 50)
    private String name;

    private String description;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
