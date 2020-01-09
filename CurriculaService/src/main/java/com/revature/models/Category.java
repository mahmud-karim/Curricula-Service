package com.revature.models;
<<<<<<< HEAD
=======

import java.io.Serializable;

>>>>>>> 989a83c471a5cbf3b0583c7b14433f0b8ff4728c
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(name = "category", schema = "curricula")public class Category {
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;	@Column(name = "category_name")
	private String categoryName;	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}	public int getCategoryId() {
		return categoryId;
	}	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}	public String getCategoryName() {
		return categoryName;
	}	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}	@Override
=======
@Table(name = "category")
@Entity
public class Category{
	
	@Id
	@Column(name = "category_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	@Column(name = "category_name")
	private String categoryName;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	@Override
>>>>>>> 989a83c471a5cbf3b0583c7b14433f0b8ff4728c
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryId;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
<<<<<<< HEAD
	}	@Override
=======
	}

	@Override
>>>>>>> 989a83c471a5cbf3b0583c7b14433f0b8ff4728c
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryId != other.categoryId)
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		return true;
<<<<<<< HEAD
	}}
=======
	}
	

}
>>>>>>> 989a83c471a5cbf3b0583c7b14433f0b8ff4728c
