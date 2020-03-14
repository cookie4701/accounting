package com.jugendbuero.accounting.dto;

import java.util.Date;

public class BankAccountDto extends ResponseSuccessDto {

	private String label;	
	private String code;	
	private Double amountLastReset;	
	private Date dateLastReset;
	
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
	
	
}
