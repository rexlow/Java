layout options in java
  -Border, Flow, Grid, GridBag

by default JPanel belongs to Flow Layout

database
ij version 10.11
ij> connect 'jdbc:derby://localhost/dbStudentRegistrationSystem;create=true;user=admin;password=admin123';
ij> create table student
> (
> studentid int primary key generated always as identity,
> name varchar(100) not null,
> dateofbirth date not null,
> gender varchar(1) not null,
> course varchar(10) not null
> )
> ;
