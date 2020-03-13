package com.jugendbuero.accounting.transforms;

import com.jugendbuero.accounting.dto.AccountingPlanDto;
import com.jugendbuero.accounting.dto.BankAccountDto;
import com.jugendbuero.accounting.dto.BankAccountIdDto;
import com.jugendbuero.accounting.entities.AccountingPlanEntity;
import com.jugendbuero.accounting.entities.BankAccountEntity;

public class Transformer {
	
	public static AccountingPlanDto getAccountingPlanDtoFromEntity(AccountingPlanEntity ent) {
		
		if (ent == null) return null;
		
		AccountingPlanDto plan = new AccountingPlanDto();
		plan.setCode(ent.getCode());
		plan.setDependsOn(ent.getDependsOn());
		plan.setId(ent.getIdAccPlan());
		plan.setLabel(ent.getLabel());
		return plan;
	}
	
	public static BankAccountDto getBankAccountDto(BankAccountEntity ent) {
		if (ent == null) return null;
		
		BankAccountDto dto = new BankAccountDto();
		dto.setAmountLastReset(ent.getAmountLastReset());
		dto.setCode(ent.getCode());
		dto.setLabel(ent.getLabel());
		dto.setDateLastReset(ent.getDateLastReset());
		
		return dto;
	}
	
	public static BankAccountIdDto getBankAccountIdDto(BankAccountEntity ent) {
		BankAccountIdDto dto = new BankAccountIdDto();
		dto.setAmountLastReset(ent.getAmountLastReset());
		dto.setCode(ent.getCode());
		dto.setLabel(ent.getLabel());
		dto.setDateLastReset(ent.getDateLastReset());
		dto.setId(ent.getId());
		return dto;
	}

}
