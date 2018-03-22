Create database Aula2;

CREATE TABLE `Aula2`.`Pais` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `populacao` BIGINT(11) NOT NULL,
  `area` DECIMAL(15,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC));

use Aula2;

insert into Pais (nome, populacao, area) values ("Portugal", 10374, 92256);
insert into Pais (nome, populacao, area) values ("Nigeria", 174507539, 923768);
insert into Pais (nome, populacao, area) values ("Japao", 127433494, 377873);
insert into Pais (nome, populacao, area) values ("Brasil", 207660929, 8515767049);
insert into Pais (nome, populacao, area) values ("Argentina", 43590368, 2780400);
insert into Pais (nome, populacao, area) values ("Bolivia", 10969049, 1098581);
insert into Pais (nome, populacao, area) values ("França", 347237, 607333);
insert into Pais (nome, populacao, area) values ("India", 1281935911, 3287590);
insert into Pais (nome, populacao, area) values ("EUA", 308745538, 9371175); 

select * from Pais;