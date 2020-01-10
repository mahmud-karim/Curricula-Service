package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Table(name = "visualization")
@Entity
public class Visualization {
	@Id
	@Column(name = "visualization_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int visualizationId;
	
	@Column(name = "visualization_name")
	private String visualizationName;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "visualization_curriculum",
				joinColumns = @JoinColumn(name = "visualization", referencedColumnName = "visualization_id"),
				inverseJoinColumns = @JoinColumn(name = "curriculum", referencedColumnName = "curriculum_id"))
	private Set<Curriculum> curricula;

	public Visualization() {
		super();
	}

	public int getVisualizationId() {
		return visualizationId;
	}

	public void setVisualizationId(int visualizationId) {
		this.visualizationId = visualizationId;
	}

	public String getVisualizationName() {
		return visualizationName;
	}

	public void setVisualizationName(String visualizationName) {
		this.visualizationName = visualizationName;
	}

	public Set<Curriculum> getCurricula() {
		return curricula;
	}

	public void setCurricula(Set<Curriculum> curricula) {
		this.curricula = curricula;
	}

	public Visualization(int visualizationId, String visualizationName, Set<Curriculum> curricula) {
		super();
		this.visualizationId = visualizationId;
		this.visualizationName = visualizationName;
		this.curricula = curricula;
	}

	@Override
	public String toString() {
		return "Visualization [visualizationId=" + visualizationId + ", visualizationName=" + visualizationName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + visualizationId;
		result = prime * result + ((visualizationName == null) ? 0 : visualizationName.hashCode());
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
		Visualization other = (Visualization) obj;
		if (visualizationId != other.visualizationId)
			return false;
		if (visualizationName == null) {
			if (other.visualizationName != null)
				return false;
		} else if (!visualizationName.equals(other.visualizationName))
			return false;
		return true;
	}
	
	
}
