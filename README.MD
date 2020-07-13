# Banking API Challange!

Esta API é responsável pelas operações das contas de um banco.
Infelizmente temos um sério problema que está aborrecendo bastante nossos futuros clientes e precisamos da sua ajuda 
para resolver, pois o futuro do negócio depende disso.


# O problema...

Nossa API começou a ser desenvolvida mas o desenvolvedor que começou por algum motivo sumiu sem deixar rastros e não 
deixou nenhum tipo de documentação.

## The challenge...

Sua tarefa é analisar o atual estados da implementação e esperamos consiga concluir mediante os requisitos especificados abaixo.


## Requirements

A nossa API precisa atender aos seguintes requisitos:

|Entidade        |Operação           |Descrição                                               |
|----------------|-------------------|--------------------------------------------------------|
|Conta			 |Criar conta        |Recurso criará a conta                                  |
|Conta			 |Inativar conta     |Recurso irá modificar o status da conta para inativa    |
|Conta			 |Reativar conta     |Recurso irá modificar o status da conta para ativa      |
|Conta			 |Transferir saldo   |Recurso deve transferir o saldo de uma conta para outra |

### Entites

Agencia
``Numero, Digito`` 

Conta
``Numero, Digito, Saldo, Status, Agencia, Pessoa``

Pessoa
``Nome, CPF``

## Development

Para rodar o projeto você pode executa-lo em sua IDE de preferência ou executando o comando `mvn spring-boot:run` 
em seu terminal.