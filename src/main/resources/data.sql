insert into user (name) values ('Rafaela');
insert into user (name) values ('Maria');

insert into board (title) values ('Trabalho');
insert into board (title) values ('Casa');

insert into sprint (board_id, end_date, start_date) values (1, '2021-09-01', '2021-09-07');
insert into sprint (board_id, end_date, start_date) values (1, '2021-09-08', '2021-09-14');
insert into sprint (board_id, end_date, start_date) values (2, '2021-09-01', '2021-09-07');

insert into task (board_id, color, date, owner_id, sprint_id, status, title) values (1, 'blue', '2021-09-01', 1, 1, 'TODO', 'Apresentação projeto');
insert into task (board_id, color, date, owner_id, sprint_id, status, title) values (1, 'blue', '2021-09-02', 1, 2, 'TODO', 'Apresentação PDP');
insert into task (board_id, color, date, owner_id, sprint_id, status, title) values (2, 'pink', '2021-09-03', 1, 3, 'TODO', 'Mercado');