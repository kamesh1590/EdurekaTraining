CREATE TABLE bank_customer (
    id BIGINT auto_increment,
    name VARCHAR2(128) NOT NULL,
    age INTEGER,
    address VARCHAR2(200),
    account_type VARCHAR2(10),
    PRIMARY KEY (id)
);