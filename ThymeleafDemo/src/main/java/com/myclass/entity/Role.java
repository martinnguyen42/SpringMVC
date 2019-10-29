package com.myclass.entity;

import javax.validation.constraints.NotBlank;

public class Role {
	private int id;
	@NotBlank(message = "Tên không được rỗng")
	private String name;

	@NotBlank(message = "Vui lòng nhập mô tả")
	private String description;

	public Role() {

	}

	public Role(int id, String name, String description) {

		this.id = id;
		this.name = name;
		this.description = description;
	}

//getId()
	public int getId() {
		return id;
	}

	public Role getRole() {
		return new Role(id, name, description);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
