package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	@JoinColumn(name = "category", referencedColumnName = "category_id")
	private int category;

	/**
	 * 
	 */
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category;
		result = prime * result + curriculum;
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
		if (category != other.category)
			return false;
		if (curriculum != other.curriculum)
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

	/**
	 * @param skillSerial
	 * @param skillName
	 * @param category
	 * @param curriculum
	 */
	public Skill(int skillSerial, String skillName, int category, int curriculum) {
		super();
		this.skillSerial = skillSerial;
		this.skillName = skillName;
		this.category = category;
		this.curriculum = curriculum;
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

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(int curriculum) {
		this.curriculum = curriculum;
	}

	@Override
	public String toString() {
		return "Skill [skillSerial=" + skillSerial + ", skillName=" + skillName + ", category=" + category
				+ ", curriculum=" + curriculum + ", hashCode()=" + hashCode() + ", getSkillSerial()=" + getSkillSerial()
				+ ", getSkillName()=" + getSkillName() + ", getCategory()=" + getCategory() + ", getCurriculum()="
				+ getCurriculum() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
}
