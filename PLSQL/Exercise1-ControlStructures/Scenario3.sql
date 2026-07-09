DECLARE
BEGIN

    FOR loan_record IN (
        SELECT LoanID,
               CustomerID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_record.LoanID
            || ' for Customer '
            || loan_record.CustomerID
            || ' is due on '
            || TO_CHAR(loan_record.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/