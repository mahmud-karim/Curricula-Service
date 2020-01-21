package com.revature.models;

public class Skill_DTO {
	private int skillId;
	private String skillName;
	private Category category;
	
	public Skill_DTO() {
		super();
	}
	public Skill_DTO(int skillId, String skillName, Category category) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
		this.category = category;
	}
	@Override
	public String toString() {
		return "Skill_DTO [skillId=" + skillId + ", skillName=" + skillName + ", category=" + category + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + skillId;
		result = prime * result + ((skillName == null) ? 0 : skillName.hashCode());
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
		Skill_DTO other = (Skill_DTO) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (skillId != other.skillId)
			return false;
		if (skillName == null) {
			if (other.skillName != null)
				return false;
		} else if (!skillName.equals(other.skillName))
			return false;
		return true;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
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
}
