package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class GameCondition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int conditionId;
	
	@Column
	private char dustCover;
	
	@Column
	private char innerStyrofoam;
	
	@Column
	private char inlay;
	
	@Column
	private char gameProtector;
	
	@Column
	private char boxProtector;
	
	@OneToOne
	@JoinColumn(name="gameId")
	private Game game;
	
	public GameCondition() {
		
	}

	public int getConditionId() {
		return conditionId;
	}

	public void setConditionId(int conditionId) {
		this.conditionId = conditionId;
	}

	public char getDustCover() {
		return dustCover;
	}

	public void setDustCover(char dustCover) {
		this.dustCover = dustCover;
	}

	public char getInnerStyrofoam() {
		return innerStyrofoam;
	}

	public void setInnerStyrofoam(char innerStyrofoam) {
		this.innerStyrofoam = innerStyrofoam;
	}

	public char getInlay() {
		return inlay;
	}

	public void setInlay(char inlay) {
		this.inlay = inlay;
	}

	public char getGameProtector() {
		return gameProtector;
	}

	public void setGameProtector(char gameProtector) {
		this.gameProtector = gameProtector;
	}

	public char getBoxProtector() {
		return boxProtector;
	}

	public void setBoxProtector(char boxProtector) {
		this.boxProtector = boxProtector;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}