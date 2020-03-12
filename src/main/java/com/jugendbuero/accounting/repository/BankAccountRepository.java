package com.jugendbuero.accounting.repository;

import org.springframework.data.repository.CrudRepository;

import com.jugendbuero.accounting.entities.BankAccountEntity;

public interface BankAccountRepository extends CrudRepository<BankAccountEntity, Long> {

}
