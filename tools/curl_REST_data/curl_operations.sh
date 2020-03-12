#!/bin/sh

SERVER=http://localhost:9999


curl -i -X POST -H "Content-Type: application/json" -d @data/accounting_plan.json $SERVER/api/accountingplan

printf "\n----\n"

curl -i $SERVER/api/accountingplan

printf "\n --- \n"

curl -i -X POST -H "Content-Type: application/json" -d @data/bank_accounts.json $SERVER/api/bankaccounts

printf "\n --- \n"

curl -i $SERVER/api/bankaccounts
