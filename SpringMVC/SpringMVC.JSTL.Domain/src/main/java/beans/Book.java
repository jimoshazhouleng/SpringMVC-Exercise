package beans;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = -5952468141004315418L;

	private long id;
	private String isdn;
	private String author;
	private Category category;

	public Book() {
	}

	public Book(String isdn, String author, Category category) {
		this.isdn = isdn;
		this.author = author;
		this.category = category;
	}

	public Book(long id, String isdn, String author, Category category) {
		this.id = id;
		this.isdn = isdn;
		this.author = author;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsdn() {
		return isdn;
	}

	public void setIsdn(String isdn) {
		this.isdn = isdn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}