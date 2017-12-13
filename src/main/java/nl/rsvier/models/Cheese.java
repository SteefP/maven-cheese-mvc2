package nl.rsvier.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Cheese {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	public int getId() {
		return id;
	}

	@NotNull
	@Size(min=3, max=15)
	private String name;
	
	@NotNull
	@Size(min=1, message = "Description must not be empty")
	private String description;
	
	@ManyToOne
	public Category category;
	

	
	public Cheese(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Cheese() {}

	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}




	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Cheese [name=" + name + ", description=" + description + "]";
	}
	
	
	
	
	
	

}
