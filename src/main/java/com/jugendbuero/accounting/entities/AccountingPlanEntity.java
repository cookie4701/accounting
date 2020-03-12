package com.jugendbuero.accounting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountingPlanEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idAccPlan;
	
	@Column(unique=true)
	private String code;
	
	private String label;
	
	private String dependsOn;

	public Long getIdAccPlan() {
		return idAccPlan;
	}

	public void setIdAccPlan(Long idAccPlan) {
		this.idAccPlan = idAccPlan;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}

	public AccountingPlanEntity(String code, String label, String dependsOn) {
		super();
		this.code = code;
		this.label = label;
		this.dependsOn = dependsOn;
	}
	
	public AccountingPlanEntity() {
		
	}
	
	
}
