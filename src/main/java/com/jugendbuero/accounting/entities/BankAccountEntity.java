package com.jugendbuero.accounting.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccountEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String label;
	
	@Column(unique = true)
	private String code;
	
	private Double amountLastReset;
	
	private Date dateLastReset;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getAmountLastReset() {
		return amountLastReset;
	}

	public void setAmountLastReset(Double amountLastReset) {
		this.amountLastReset = amountLastReset;
	}

	public Date getDateLastReset() {
		return dateLastReset;
	}

	public void setDateLastReset(Date dateLastReset) {
		this.dateLastReset = dateLastReset;
	}

	public BankAccountEntity(String label, String code, Double amountLastReset, Date dateLastReset) {
		super();
		this.label = label;
		this.code = code;
		this.amountLastReset = amountLastReset;
		this.dateLastReset = dateLastReset;
	}
	
	public BankAccountEntity() {
		
	}
	
	
}
