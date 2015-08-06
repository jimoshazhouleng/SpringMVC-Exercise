package bean;

import java.io.Serializable;

public interface Category extends Serializable{

	public long getId();

	public void setId(long id);

	public String getName();

	public void setName(String name);

}