package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Region {
	
	@Id
	private String regionType;
	
	@OneToMany(mappedBy="region")
	private Set<Console> consoles;
	
	@OneToMany(mappedBy="region")
	private Set<Game> games;
	
	public Region() {
		
	}

	public String getRegionType() {
		return regionType;
	}

	public void setRegionType(String regionType) {
		this.regionType = regionType;
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