package model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private String username;
	
	@Column
	private String password;
	
	@Column
	private Timestamp registerDate;
	
	@OneToMany(mappedBy="user")
	private Set<Console> consoles;
	
	@OneToMany(mappedBy="user")
	private Set<Game> games;
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Timestamp registerDate) {
		this.registerDate = registerDate;
	}

	public Set<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(Set<Console> consoles) {
		this.consoles = consoles;
	}

	public Set<Game> getGames() {
		return games;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}
}