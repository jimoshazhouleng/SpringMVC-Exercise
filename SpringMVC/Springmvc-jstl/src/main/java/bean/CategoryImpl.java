package bean;

public class CategoryImpl implements Category {

	private static final long serialVersionUID = -1282512972032164086L;

	private long id;
	private String name;

	public CategoryImpl() {
		super();
	}

	public CategoryImpl(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
