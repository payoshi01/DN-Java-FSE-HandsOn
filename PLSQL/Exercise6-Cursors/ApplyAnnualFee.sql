SET SERVEROUTPUT ON;

DECLARE

    CURSOR account_cursor IS
        SELECT AccountID,
               Balance
        FROM Accounts;

    annual_fee NUMBER := 100;

BEGIN

    FOR account_record IN account_cursor LOOP

        UPDATE Accounts
        SET Balance = Balance - annual_fee
        WHERE AccountID = account_record.AccountID;

        DBMS_OUTPUT.PUT_LINE(
            'Annual fee deducted from Account ID: '
            || account_record.AccountID
        );

    END LOOP;

    COMMIT;

END;
/