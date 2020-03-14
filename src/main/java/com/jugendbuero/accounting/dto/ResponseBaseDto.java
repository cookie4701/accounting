package com.jugendbuero.accounting.dto;

public class ResponseBaseDto {
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public ResponseBaseDto(String stat) {
		this.status = stat;
	}

}
