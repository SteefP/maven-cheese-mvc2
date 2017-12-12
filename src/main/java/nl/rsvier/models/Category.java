package nl.rsvier.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Size(min=3, max=15)
	private String name;
	
	@OneToMany
	@JoinColumn(name= "category_id")  // deze naam voorkomt volgens mij de dubbele mapping
	private List<Cheese> cheeses = new ArrayList<>();
	
	public Category() {}
	
	public Category(String name) {this.name = name;}
	
	public int getId() {return id;}

	public String getName() {return name;}

	public List<Cheese> getCheeses() {return cheeses;}

	public void setName(String name) {this.name = name;}

	public void setCheeses(List<Cheese> cheeses) {this.cheeses = cheeses;}
	
	
	
	
	
	
	
	
}
