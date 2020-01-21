package com.revature.models;

import java.util.List;

public class VisualizationDTO {
	private int visualizationId;
	private String visualizationName;
	private List<Curriculum> curricula;
	
	public VisualizationDTO() {
		super();
	}
	public VisualizationDTO(int visualizationId, String visualizationName, List<Curriculum> curricula) {
		super();
		this.visualizationId = visualizationId;
		this.visualizationName = visualizationName;
		this.curricula = curricula;
	}
	@Override
	public String toString() {
		return "Visualization_DTO [visualizationId=" + visualizationId + ", visualizationName=" + visualizationName
				+ ", curricula=" + curricula + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curricula == null) ? 0 : curricula.hashCode());
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
		VisualizationDTO other = (VisualizationDTO) obj;
		if (curricula == null) {
			if (other.curricula != null)
				return false;
		} else if (!curricula.equals(other.curricula))
			return false;
		if (visualizationId != other.visualizationId)
			return false;
		if (visualizationName == null) {
			if (other.visualizationName != null)
				return false;
		} else if (!visualizationName.equals(other.visualizationName))
			return false;
		return true;
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
	public List<Curriculum> getCurricula() {
		return curricula;
	}
	public void setCurricula(List<Curriculum> curricula) {
		this.curricula = curricula;
	}
}