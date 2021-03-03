package org.sid.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String password;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_roles",
	joinColumns=@JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Role>roles=new HashSet<>();
	
	public User(String username, String email, String encode) {
		this.username=username;
		this.email=email;
		this.password=encode;
	}
	

}
