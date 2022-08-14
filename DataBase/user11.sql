create database user11;
create user max_rem with password '121';
grant all on database data7 to user11;

CREATE TABLE "data7" (
  
  "id" serial PRIMARY KEY,
  "title11" varchar,
  "age" bigint
);
