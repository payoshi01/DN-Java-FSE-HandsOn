CREATE OR REPLACE PACKAGE EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_employeeId NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hireDate DATE
    );

    PROCEDURE UpdateEmployee(
        p_employeeId NUMBER,
        p_salary NUMBER
    );

    FUNCTION CalculateAnnualSalary(
        p_employeeId NUMBER
    ) RETURN NUMBER;

END EmployeeManagement;
/

Package body
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

    PROCEDURE HireEmployee(
        p_employeeId NUMBER,
        p_name VARCHAR2,
        p_position VARCHAR2,
        p_salary NUMBER,
        p_department VARCHAR2,
        p_hireDate DATE
    )
    IS
    BEGIN

        INSERT INTO Employees
        VALUES(
            p_employeeId,
            p_name,
            p_position,
            p_salary,
            p_department,
            p_hireDate
        );

        COMMIT;

    END;

    PROCEDURE UpdateEmployee(
        p_employeeId NUMBER,
        p_salary NUMBER
    )
    IS
    BEGIN

        UPDATE Employees
        SET Salary = p_salary
        WHERE EmployeeID = p_employeeId;

        COMMIT;

    END;

    FUNCTION CalculateAnnualSalary(
        p_employeeId NUMBER
    )
    RETURN NUMBER
    IS
        v_salary NUMBER;
    BEGIN

        SELECT Salary
        INTO v_salary
        FROM Employees
        WHERE EmployeeID = p_employeeId;

        RETURN v_salary * 12;

    END;

END EmployeeManagement;
/