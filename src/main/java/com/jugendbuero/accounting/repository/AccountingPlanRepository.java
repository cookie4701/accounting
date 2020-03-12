package com.jugendbuero.accounting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jugendbuero.accounting.entities.AccountingPlanEntity;

@Repository
public interface AccountingPlanRepository extends CrudRepository<AccountingPlanEntity, Long> {

}
