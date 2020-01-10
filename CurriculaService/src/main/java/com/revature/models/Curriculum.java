package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "curriculum")
@Entity
public class Curriculum {
	
	@Id
	@Column(name = "curriculum_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int curriculumId;
	
	@Column(name = "curriculum_name")
	private String curriculumName;
	
	@ManyToMany
	@JoinTable(name = "curriculum_skill",
			joinColumns = @JoinColumn(name = "curriculum", referencedColumnName = "curriculum_id"),
			inverseJoinColumns = @JoinColumn(name = "skill", referencedColumnName = "skill_id"))
	private Set<Skill> skills;

	public Curriculum() {
		super();
	}

	public Curriculum(int curriculumId, String curriculumName) {
		super();
		this.curriculumId = curriculumId;
		this.curriculumName = curriculumName;
	}

	@Override
	public String toString() {
		return "Curriculum [curriculumId=" + curriculumId + ", curriculumName=" + curriculumName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + curriculumId;
		result = prime * result + ((curriculumName == null) ? 0 : curriculumName.hashCode());
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
		Curriculum other = (Curriculum) obj;
		if (curriculumId != other.curriculumId)
			return false;
		if (curriculumName == null) {
			if (other.curriculumName != null)
				return false;
		} else if (!curriculumName.equals(other.curriculumName))
			return false;
		return true;
	}

	public int getCurriculumId() {
		return curriculumId;
	}

	public void setCurriculumId(int curriculumId) {
		this.curriculumId = curriculumId;
	}

	public String getCurriculumName() {
		return curriculumName;
	}

	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}
}