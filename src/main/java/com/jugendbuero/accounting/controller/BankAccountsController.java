package com.jugendbuero.accounting.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jugendbuero.accounting.dto.BankAccountDto;
import com.jugendbuero.accounting.entities.BankAccountEntity;
import com.jugendbuero.accounting.repository.BankAccountRepository;
import com.jugendbuero.accounting.transforms.Transformer;

@RestController
@RequestMapping(value = "/api/bankaccounts")
public class BankAccountsController {
	
	@Autowired
	BankAccountRepository repoBankAccount;

	//@TODO: get - list all bank accounts
	
	@PostMapping
	public ResponseEntity<String> newBankAccountsByList(@RequestBody List<BankAccountDto> dtoList)  {
		for (BankAccountDto d : dtoList) {
			try {
				BankAccountEntity ent = new BankAccountEntity(d.getLabel(), d.getCode(), d.getAmountLastReset(), d.getDateLastReset() );
				repoBankAccount.save(ent);
			} catch (Exception ce ) {
				return new ResponseEntity<String>("Entry in your list already exists and is not processed", HttpStatus.BAD_REQUEST);
			}
		}
		
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<BankAccountDto>> getBankAccountsAsList() {
		List<BankAccountDto> dtoList = new ArrayList<BankAccountDto>();
		Iterable<BankAccountEntity> entList = repoBankAccount.findAll();
		for (BankAccountEntity ent : entList) {
			dtoList.add(Transformer.getBankAccountDto(ent));
		}
		
		return new ResponseEntity<List<BankAccountDto>>(dtoList, HttpStatus.OK);
	}
	
}
