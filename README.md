O projeto se refere a uma API para cadastro de partidos e associados.
Devido a questões de tempo, não consegui finalizar o projeto, portanto o arquivo consiste do que desenvolvi até o momento.
O valor de id é gerado pelo programa. O campo ideologia é um enum que pode ter apenas os valores de "direita", "centro" ou "esquerda". O campo associados é uma associação com a classe Associado do tipo one to many.
Em relação à calsse Associado, o id segue o mesmo padrão. Cargo Político é um enum que pode ter apenas um valor entre "nenhum", "vereador", "prefeito", "deputado_estadual", "deputado_federal", "senador", "governador" e "presidente". O atributo sexo segue o mesmo padrão, sendo um enum que pode possuir o valor de "feminino" ou "masculino". O atributo partido é uma associação com a classe Partido do tipo many to one.
O arquivo data.sql com as informações a serem inseridas no banco de dados tem o seguinte código:
insert into partido(nome, sigla, ideologia) values('Ao Brasil Consciente','ABC','CENTRO');

insert into associado(nome,cargo, sexo) values('Ana', 'NENHUM', 'FEMININO');

O teste do PartidoRepositorio foi montado, mas não concluído. Se refere ao teste de tentar encontrar um partido pelo nome.