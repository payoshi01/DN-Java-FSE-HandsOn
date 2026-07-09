# Exercise 5 - Triggers

## Scenario 1
UpdateCustomerLastModified
- Updates the LastModified column whenever a customer record is updated.

## Scenario 2
LogTransaction
- Maintains an audit log whenever a transaction is inserted.

## Scenario 3
CheckTransactionRules
- Ensures deposits are positive.
- Prevents withdrawals exceeding the available account balance.

## Concepts Used
- BEFORE Trigger
- AFTER Trigger
- :NEW keyword
- RAISE_APPLICATION_ERROR