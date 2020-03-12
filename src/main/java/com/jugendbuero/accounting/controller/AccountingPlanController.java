package com.jugendbuero.accounting.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jugendbuero.accounting.dto.AccountingPlanDto;
import com.jugendbuero.accounting.entities.AccountingPlanEntity;
import com.jugendbuero.accounting.repository.AccountingPlanRepository;
import com.jugendbuero.accounting.transforms.Transformer;

@RestController
@RequestMapping(value = "/api/accountingplan")
public class AccountingPlanController {
	
	@Autowired
	AccountingPlanRepository repoAccounting;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<AccountingPlanDto> accountingplanAll() {
		List<AccountingPlanDto> returnListDto = new ArrayList<AccountingPlanDto>();
		Iterable<AccountingPlanEntity> entList = repoAccounting.findAll();
		for ( AccountingPlanEntity e : entList) {
			returnListDto.add(Transformer.getAccountingPlanDtoFromEntity(e));
		}
		return returnListDto;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void accountingplanCreate(@RequestBody List<AccountingPlanDto> listNewEntries ) {
		for (AccountingPlanDto dto : listNewEntries) {
			AccountingPlanEntity ent = new AccountingPlanEntity(dto.getCode(), dto.getLabel(), dto.getDependsOn() );
			try {
				repoAccounting.save(ent);
			} catch (org.hibernate.exception.ConstraintViolationException ce) {
				System.out.println("ConstraintViolationException detected...");
			} catch ( Exception ce ) {
				System.out.println("...");
			}
		}
	}
}
