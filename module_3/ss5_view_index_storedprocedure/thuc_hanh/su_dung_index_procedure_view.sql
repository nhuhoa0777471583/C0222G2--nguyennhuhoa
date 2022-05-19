use classicmodels;


-- su dung index
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 
ALTER TABLE customers ADD INDEX idx_customerName(customerName);

SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

ALTER TABLE customers DROP INDEX idx_customerName;


-- su dung stored procedure
-- tao PROCEDURE
DELIMITER //
CREATE PROCEDURE findAllCustomers()
BEGIN
  SELECT * FROM customers;
END //
DELIMITER ;

call findAllCustomers;

-- xoa PROCEDURE
DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//

CREATE PROCEDURE findAllCustomers()
BEGIN
SELECT * FROM customers where customerNumber = 175;
END //

DELIMITER //

-- tao PROCEDURE voi tham so IN
CREATE PROCEDURE getCusById(IN cusNum INT(11))
BEGIN
  SELECT * FROM customers WHERE customerNumber = cusNum;
END //
DELIMITER ;
call getCusById(175);

-- tao PROCEDURE voi tham so loai OUT
DELIMITER //
CREATE PROCEDURE GetCustomersCountByCity(IN  in_city VARCHAR(50),OUT total INT)
BEGIN
    SELECT COUNT(customerNumber)
    INTO total
    FROM customers
    WHERE city = in_city;
END//
DELIMITER ;
CALL GetCustomersCountByCity('Lyon',@total);
SELECT @total;


-- tao PROCEDURE Tham số loại INOUT
DELIMITER //
CREATE PROCEDURE SetCounter( INOUT counter INT,IN inc INT)
BEGIN
    SET counter = counter + inc;
END//
DELIMITER ;

SET @counter = 1;
CALL SetCounter(@counter,1); -- 2
CALL SetCounter(@counter,1); -- 3
CALL SetCounter(@counter,5); -- 8
SELECT @counter;

-- su dung view
CREATE VIEW customer_views AS
SELECT customerNumber, customerName, phone
FROM  customers;
select * from customer_views;
-- cap nhat view 
CREATE OR REPLACE VIEW customer_views AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone
FROM customers
WHERE city = 'NYC';

-- xoa view
DROP VIEW customer_views;



