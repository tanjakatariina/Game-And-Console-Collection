package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	
	@Lob
	@Column(columnDefinition="BLOB")
	private byte[] image;
	
	@Column
	private char thumbnail;
	
	@ManyToOne
	@JoinColumn(name = "consoleId")
	private Console console;
	
	@ManyToOne
	@JoinColumn(name = "gameId")
	private Game game;
	
	public Image() {
		
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(char thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}