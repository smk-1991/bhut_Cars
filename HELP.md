# Getting Started

#Passos para rodar

## 1 - rodar o rabbit no docker com o seguinte comando

sudo docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management

- Irá subir na porta: 15672


- Para acessar:

- http://localhost:15672
- usuario:guest
- senha:guest

a fila será criada automaticamente



## 2- Para testar os endpoints com o swagger

Após compilar e rodar o programa a aplicação irá subir na porta  8080

- Como estamos utilizando o swagger, entao acessar o seguinte endereço:


- http://localhost:8080/swagger-ui.html

## 3 - A fila será consumida e enviará um webhook para a seguinte url

- https://vsibuy2y128jbxidmooi7o.hooks.webhookrelay.com


- Essa url se encontra no site webhookrelay e para acessar seguem as credenciais:
- https://my.webhookrelay.com/
- usuario: samuel
- senha: teste1234


- após logar para visualizar as msgs
- clicar request forwarding
- request logs

## 4 - Banco de dados

- O Banco utilizado é o h2 e será salvo em memória para fins de teste no diretório do projeto.


- URL para acessar:
- http://localhost:8080/h2-console

- Usuario:sa
- Senha:sa

