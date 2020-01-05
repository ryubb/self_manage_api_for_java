# --- !Ups
create table people (
    id int auto_increment primary key,
    name varchar(255) not null,
    mail varchar(255) not null,
    tel varchar(255)
);

insert into people values (default, "taro", "taro@example.com", "999-999");
insert into people values (default, "hinako", "hinako@example.com", "999-999");
insert into people values (default, "takeshi", "takeshi@example.com", "999-999");