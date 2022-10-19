package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Platform {

	@Id
	private String platformName;
	
	@OneToMany(mappedBy="platform")
	private Set<Console> consoles;
	
	@OneToMany(mappedBy="platform")
	private Set<Game> games;
	
	public Platform() {
		
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
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