package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="skill", schema="curricula")

public class Skill {
	
	@Id
	@Column(name="skill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillSerial;
	
	@Column(name="skill_name")
	private String skillName;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "category", referencedColumnName ="category_id")
	private Category category; 
	
	@ManyToMany
	@JoinTable(name = "curriculum_skill", 
	joinColumns = @JoinColumn(name = "skill", referencedColumnName = "skill_id"),
	inverseJoinColumns = @JoinColumn(name = "curriculum_id", referencedColumnName = "curriculum"))
	private Set<Curriculum> curriculum;

	/**
	 * 
	 */
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSkillSerial() {
		return skillSerial;
	}

	public void setSkillSerial(int skillSerial) {
		this.skillSerial = skillSerial;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<Curriculum> getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Set<Curriculum> curriculum) {
		this.curriculum = curriculum;
	}

	/**
	 * @param skillSerial
	 * @param skillName
	 * @param category
	 * @param curriculum
	 */
	public Skill(int skillSerial, String skillName, Category category, Set<Curriculum> curriculum) {
		super();
		this.skillSerial = skillSerial;
		this.skillName = skillName;
		this.category = category;
		this.curriculum = curriculum;
	}

	@Override
	public String toString() {
		return "Skill [skillSerial=" + skillSerial + ", skillName=" + skillName + ", category=" + category
				+ ", curriculum=" + curriculum + ", getSkillSerial()=" + getSkillSerial() + ", getSkillName()="
				+ getSkillName() + ", getCategory()=" + getCategory() + ", getCurriculum()=" + getCurriculum()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((curriculum == null) ? 0 : curriculum.hashCode());
		result = prime * result + ((skillName == null) ? 0 : skillName.hashCode());
		result = prime * result + skillSerial;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skill other = (Skill) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (curriculum == null) {
			if (other.curriculum != null)
				return false;
		} else if (!curriculum.equals(other.curriculum))
			return false;
		if (skillName == null) {
			if (other.skillName != null)
				return false;
		} else if (!skillName.equals(other.skillName))
			return false;
		if (skillSerial != other.skillSerial)
			return false;
		return true;
	}

	 
}
