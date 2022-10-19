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
import javax.persistence.OneToOne;

@Entity
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gameId;
	
	@Column
	private String title;
	
	@Column
	private String edition;
	
	@Column
	private String additionalInfo;
	
	@Column
	private Timestamp addedDate;
	
	@ManyToOne
	@JoinColumn(name = "regionType")
	private Region region;
	
	@ManyToOne
	@JoinColumn(name = "platformName")
	private Platform platform;
	
	@ManyToOne
	@JoinColumn(name = "abbreviation")
	private ConditionType conditionType;

	@ManyToOne
	@JoinColumn(name = "username")
	private User user;
	
	@OneToOne(mappedBy = "game")
	private GameCondition gameCondition;
	
	@OneToMany(mappedBy="game")
	private Set<Image> images;

	public Game() {
		
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
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

	public GameCondition getGameCondition() {
		return gameCondition;
	}

	public void setGameCondition(GameCondition gameCondition) {
		this.gameCondition = gameCondition;
	}

	public Set<Image> getImages() {
		return images;
	}

	public void setImages(Set<Image> images) {
		this.images = images;
	}
}