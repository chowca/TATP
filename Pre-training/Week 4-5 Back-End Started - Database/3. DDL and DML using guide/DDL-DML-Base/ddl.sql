-- **Database level:**
-- Display all the database
show databases;

-- Enter a certain database
use dbname;

-- Create a database
create database dbname;

-- Create the database of the designated character set
create database dbname character set <character_set>;

-- Display the creation information fo the database
show create database dbname;

-- Revise the codes of the database
alter database dbname character set <character_set>;

-- Delete a database
drop databasae dbname;

-- **Table level**
-- Revise table name
rename table table_name to new_table_name;

-- Revise the field's data type
alter table table_name modify field_name <data_type>;

-- Revise field name
alter table table_name change field_name new_field_name <data_type>;

-- Add field
alter table table_name add field_name <data_type>;

-- Delete field
alter table table_name drop field_name;

-- Revise the table's storage engine
alter table table_name engine = storage_engine;

-- Delete the table's foreign key restriant
alter table table_name drop foreign key foreign_key;

-- Delete a table
drop table table_name;