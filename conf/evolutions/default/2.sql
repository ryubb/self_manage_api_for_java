# --- !Ups
create table messages (
    id int auto_increment primary key,
    person_id int,
    message varchar(255) not null,
    created timestamp not null default current_timestamp
);
