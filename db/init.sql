DROP TABLE IF EXISTS bill;
DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    customerid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    houseNumber VARCHAR(50) NOT NULL,
    unitsConsumed DOUBLE NOT NULL CHECK (unitsConsumed >= 0)
);

CREATE TABLE bill (
    billid INT PRIMARY KEY AUTO_INCREMENT,
    customerid INT NOT NULL,
    billAmount DOUBLE NOT NULL CHECK (billAmount >= 0),
    billingDate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customerid) REFERENCES customer(customerid) ON DELETE CASCADE
);
