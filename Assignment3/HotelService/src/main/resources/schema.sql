CREATE TABLE hotel (
    id BIGINT auto_increment,
    name VARCHAR2(128) NOT NULL,
    description VARCHAR2(200),
    city VARCHAR2(50) NOT NULL,
    rating INTEGER,
    PRIMARY KEY (id)
);