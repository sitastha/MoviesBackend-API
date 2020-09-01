package fr.sita.datamodel;

public class Movies {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}
	
}
