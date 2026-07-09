SET SERVEROUTPUT ON;

DECLARE

    CURSOR transaction_cursor IS
        SELECT TransactionID,
               AccountID,
               TransactionDate,
               Amount,
               TransactionType
        FROM Transactions
        WHERE TO_CHAR(TransactionDate,'MMYYYY') =
              TO_CHAR(SYSDATE,'MMYYYY');

BEGIN

    FOR transaction_record IN transaction_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Transaction ID: ' || transaction_record.TransactionID ||
            ', Account ID: ' || transaction_record.AccountID ||
            ', Date: ' || TO_CHAR(transaction_record.TransactionDate,'DD-MON-YYYY') ||
            ', Amount: ' || transaction_record.Amount ||
            ', Type: ' || transaction_record.TransactionType
        );

    END LOOP;

END;
/