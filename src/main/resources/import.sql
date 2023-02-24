-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');]

insert into jogo (id, nome, estudio, classificacao, valor, lancamento) values(nextval('hibernate_sequence'), 'God of War', 'Sony', 18, 300, '2018-04-20');
insert into jogo (id, nome, estudio, classificacao, valor, lancamento) values(nextval('hibernate_sequence'), 'Sonic Frontiers', 'SEGA', 13, 200, '2022-10-08');
insert into jogo (id, nome, estudio, classificacao, valor, lancamento) values(nextval('hibernate_sequence'), 'Atomic Heart', 'Focus Entertainment', 18, 200, '2023-02-21');
insert into jogo (id, nome, estudio, classificacao, valor, lancamento) values(nextval('hibernate_sequence'), 'Zelda BOTW', 'Nintendo', 12, 300, '2017-03-03');
insert into jogo (id, nome, estudio, classificacao, valor, lancamento) values(nextval('hibernate_sequence'), 'Super Mario Odyssey', 'Nintendo', 12, 300, '2017-09-27');