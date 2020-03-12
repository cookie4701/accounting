package com.jugendbuero.accounting.dto;

import com.jugendbuero.accounting.entities.BankAccountEntity;

public class BankAccountIdDto extends BankAccountDto {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public static BankAccountIdDto fromEntity(BankAccountEntity ent) {
		BankAccountIdDto ba = new BankAccountIdDto();
		ba.setId(ent.getId());
		ba.setAmountLastReset(ent.getAmountLastReset());
		ba.setCode(ent.getCode());
		ba.setDateLastReset(ent.getDateLastReset());
		ba.setLabel(ent.getLabel());
		return ba;
	}
}
