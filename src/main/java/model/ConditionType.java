package model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ConditionType {

	@Id
	private String abbreviation;
	
	@Column
	private String fullName;
	
	@OneToMany(mappedBy="conditionType")
	private Set<Console> consoles;

	public ConditionType() {
		
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Set<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(Set<Console> consoles) {
		this.consoles = consoles;
	}
}