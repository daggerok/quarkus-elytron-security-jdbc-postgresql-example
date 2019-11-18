DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
  id SERIAL NOT NULL PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  role VARCHAR(255) NOT NULL
);

INSERT INTO users (id, username, password, role) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'user' , 'user' , 'user'),
(3, 'max'  , 'max'  , 'user');
