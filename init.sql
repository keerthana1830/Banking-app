CREATE TABLE Bank (
    bankId INT AUTO_INCREMENT PRIMARY KEY,
    ifscCode VARCHAR(20) UNIQUE NOT NULL,
    branch VARCHAR(50),
    name VARCHAR(100) NOT NULL,
    startShift TIMESTAMP,
    endShift TIMESTAMP,
    bankType VARCHAR(20),
    password VARCHAR(100) DEFAULT 'SBI@123',
    username VARCHAR(100)
);

CREATE TABLE Customer (
    aadhaarNumber VARCHAR(12) PRIMARY KEY,
    bankId INT NOT NULL,
    firstName VARCHAR(50) NOT NULL,
    lastName VARCHAR(50),
    panCard VARCHAR(10),
    phoneNumber VARCHAR(15),
    email VARCHAR(100),
    totalCashback BIGINT DEFAULT 0,
    address VARCHAR(255),
    guardianName VARCHAR(50),
    guardianPhoneNumber VARCHAR(15),
    password VARCHAR(100),
    FOREIGN KEY (bankId) REFERENCES Bank(bankId)
);

CREATE TABLE Account (
    accountId SERIAL PRIMARY KEY,
    aadhaarNumber VARCHAR(12),
    accountNumber VARCHAR(50) UNIQUE NOT NULL,
    accountType VARCHAR(20),
    balance BIGINT DEFAULT 0,
    FOREIGN KEY (aadhaarNumber) REFERENCES Customer(aadhaarNumber)
);

CREATE TABLE Transaction (
    transactionId VARCHAR(50) PRIMARY KEY,
    transferredAmount NUMERIC(15, 2) NOT NULL,
    transactionDoneAt TIMESTAMP NOT NULL,
    transferredFromAccountId INT NOT NULL,
    transferredToAccountId INT NOT NULL,
    FOREIGN KEY (transferredFromAccountId) REFERENCES Account(accountId),
    FOREIGN KEY (transferredToAccountId) REFERENCES Account(accountId)
);
