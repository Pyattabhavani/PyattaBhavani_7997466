SET SERVEROUTPUT ON;

DECLARE

    marks NUMBER := 85;

BEGIN

    IF marks >= 50 THEN

        DBMS_OUTPUT.PUT_LINE('Pass');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Fail');

    END IF;

END;
/