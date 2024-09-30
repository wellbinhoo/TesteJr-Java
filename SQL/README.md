## TESTE DE BANCO DE DADO;

Teste que é solicitado que sejá realizado interações em um conjunto de tabelas dentro de um banco de dado.

## Stack utilizada
 
**SGBD:** Maria DB.
## Funcionalidade:

Neste documento está declarado os 'inputs' utilizados para ser realizado os seguintes comandos : INSERT , UPDATE,  INNER JOIN.


### Descrição dos comandos:

- INSERT  :  Comando que insere dados dentro dos campos de uma tabela.

- UPDATE : Este comando realiza alterações/atualizações em campos dentro de uma tabela ja preenchida.

- INNER JOIN: Comando ultilizado no interesse de encontrar dados onde sua relação está em tabelas distintas, possiblitando acessar mais de 2 tabelas para essa realização.


### TABELAS ULTILIZADAS PARA REALIZAÇÃO DO EXERCICIO : 
 
 - Tabela pessoa : Id, Nome , DataNascimento
 - Tabela Pessoa_x_Endereço : IdPessoa,CEP,Numero,Complemento
 - Tabela Endereço: CEP,Logradouro,Cidade,UF,Bairro

 ### LINHA DE CODIGO UTILIZADA.

- INSERT : INSERT INTO Pessoa (Id,Nome,DataNascimento)
VALUES (0,'Naruto','1994-11-20')

 exemplo que é inserido dados em uma tabela.

- UPDATE :  UPDATE Pessoa
SET Nome = 'Seya'
WHERE Id = 1

exemplo que é atualizado dados em tabela.

- INNER JOIN : SELECT pessoa.Nome, endereco.CEP, endereco.Logradouro, endereco.UF, endereco.Cidade, endereco.Bairro, pxe.Numero, pxe.Complemento
FROM pessoa_x_endereco pxe
INNER JOIN pessoa ON pessoa.Id = pxe.IdPessoa
INNER JOIN endereco ON endereco.CEP = pxe.CEP

exemplo de busca de dados em tabelas distintas onde esses dados se completam.