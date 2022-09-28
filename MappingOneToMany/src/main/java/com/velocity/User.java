package com.velocity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    
	@Id
	@GeneratedValue(strategy=GenerationType .AUTO)
	private int id;
    private String name;
    private String email;
	
    
    @OneToMany(mappedBy="user")
    private Set<Policy>policy;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Policy> getPolicy() {
		return policy;
	}
	
    public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}
    
}