package model;

import java.util.Objects;

public class cat_model {

	private String name;
	private String color;
	private Integer age;

	public cat_model(String name, String color, Integer age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cat_model other = (cat_model) obj;
		return Objects.equals(age, other.age) && Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "cat_model [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	/*
	 * public cat_model(String name, String color, Integer age) { this.name = name;
	 * this.color = color; this.age = age; }
	 */

}