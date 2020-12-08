DROP TABLE IF EXISTS accounts;

CREATE TABLE accounts (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    email VARCHAR(250) NOT NULL,
    active BOOLEAN DEFAULT FALSE,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);

INSERT INTO accounts (first_name, last_name, email, active, created_at, updated_at) VALUES
('Aliko', 'Dangote', 'aliko.dangote@rainmore.com', true, '2020-12-08 12:08:00', '2020-12-08 12:08:00'),
('Bill', 'Gates', 'bill.gates@rainmore.com', true, '2020-12-08 12:08:00', '2020-12-08 12:08:00'),
('Folrunsho', 'Alakija', 'folrunsho.alakija@rainmore.com', true, '2020-12-08 12:08:00', '2020-12-08 12:08:00');