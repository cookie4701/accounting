package com.jugendbuero.accounting.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jugendbuero.accounting.dto.BankAccountIdDto;
import com.jugendbuero.accounting.entities.BankAccountEntity;
import com.jugendbuero.accounting.repository.BankAccountRepository;
import com.jugendbuero.accounting.transforms.Transformer;

import ch.qos.logback.core.helpers.Transform;

@RestController
@RequestMapping(value = "/api/bankaccount")
public class BankAccountController {
	
	@Autowired
	BankAccountRepository repoBankAccount;
	
	//@TODO: GET bankaccount /{id}
	@GetMapping("/{id}")
	public BankAccountIdDto getBankAccountById(@RequestParam Long id) {
		Optional<BankAccountEntity> ent = repoBankAccount.findById(id);
		if (ent.isPresent()) {
			BankAccountIdDto dto = Transformer.getBankAccountIdDto(ent.get());
			return dto;
		} else {
			return null;
		}
	}
	
	//@TODO: POST new bankaccount
	
	//@TODO: PUT update bankaccount {id}
	
	//@TODO: DELETE bankaccount /{id}

}
