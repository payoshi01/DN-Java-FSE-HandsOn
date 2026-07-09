SET SERVEROUTPUT ON;

DECLARE

    CURSOR loan_cursor IS
        SELECT LoanID,
               InterestRate
        FROM Loans;

BEGIN

    FOR loan_record IN loan_cursor LOOP

        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = loan_record.LoanID;

        DBMS_OUTPUT.PUT_LINE(
            'Updated Loan ID: '
            || loan_record.LoanID
        );

    END LOOP;

    COMMIT;

END;
/