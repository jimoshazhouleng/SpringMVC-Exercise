package bean;

import java.io.Serializable;

public interface Book extends Serializable{

	public long getId();

	public void setId(long id);

	public String getIsdn();

	public void setIsdn(String isdn);

	public String getAuthor();

	public void setAuthor(String author);

	public Category getCategory();

	public void setCategory(Category category);

}