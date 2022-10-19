package model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Console {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int consoleId;
	
	@Column
	private String name;
	
	@Column
	private String color;
	
	@Column
	private String model;
	
	@Column
	private String edition;
	
	@Column
	private String additionalInfo;
	
	@Column
	private Timestamp addedDate;
	
	@ManyToOne
	@JoinColumn(name = "platformName")
	private Platform platform;
	
	@ManyToOne
	@JoinColumn(name = "regionType")
	private Region region;
	
	@ManyToOne
	@JoinColumn(name = "abbreviation")
	private ConditionType conditionType;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private User user;
	
	@OneToMany(mappedBy="console")
	private Set<Image> images;
	
	public Console() {
		
	}

	public int getConsoleId() {
		return consoleId;
	}

	public void setConsoleId(int consoleId) {
		this.consoleId = consoleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Timestamp getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public ConditionType getConditionType() {
		return conditionType;
	}

	public void setConditionType(ConditionType conditionType) {
		this.conditionType = conditionType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}
}