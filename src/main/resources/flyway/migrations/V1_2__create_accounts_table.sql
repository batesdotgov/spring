CREATE TABLE account(
   user_id int PRIMARY KEY,
   username VARCHAR (50) UNIQUE NOT NULL,
   password VARCHAR (50) NOT NULL,
   country VARCHAR (355) UNIQUE NOT NULL
);