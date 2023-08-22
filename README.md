# Projeto Loja de Games

<h2>1. Descrição</h2> 
O projeto Loja de Games é uma aplicação Java que utiliza o framework Spring Boot, o banco de dados MySQL e o Insomnia para testes CRUD. 
O objetivo do projeto é fornecer uma API para gerenciar produtos e categorias de uma loja de games, permitindo a realização de operações de criação, 
leitura, atualização e exclusão de registros.

<h2>2. Funcionalidades</h2>
- CRUD completo para o recurso Produto, com 6 métodos: criar, ler, atualizar e excluir produtos.
- CRUD completo para o recurso Categoria, com 6 métodos: criar, ler, atualizar e excluir categorias.
- Relacionamento do tipo One-to-Many entre as classes Categoria e Produto.
- Utilização do padrão MVC (Model-View-Controller) no Spring: Model, Repository e Controller.
- Testes de toda a API no Insomnia.

<h2>3. Como executar o Projeto Loja de Games</h2>

### Pré-requisitos

Certifique-se de que você tenha o seguinte instalado em seu sistema:

       [Java Development Kit (JDK) instalado na versão 17.0.7 ou superior], 
       [MySQL instalado e configurado], 
       [Insomnia (ou outro software de teste de API) instalado]
***
## Passo 1: Clonar o Repositório

Abra um terminal ou prompt de comando. <br/>
Navegue até o diretório onde você deseja clonar o repositório. <br/>
Execute o seguinte comando para clonar o repositório:

```
git clone https://github.com/RitaAlmeidah/LojaDeGames.git
```

## Passo 2: Instalação e Configuração

Siga os passos abaixo para instalar e configurar o ambiente do projeto:

1. Faça o clone deste repositório.
2. Importe o projeto na sua IDE de preferência.
3. Configure as informações de conexão com o banco de dados MySQL no arquivo `application.properties` (localizado em `src/main/resources`).
4. Execute o script SQL fornecido para criar o banco de dados e as tabelas necessárias.
5. Inicie a aplicação.

## Passo 3: Utilização
Para utilizar a API, siga as instruções abaixo:

1. Abra o Insomnia (ou outro software de teste de API).
2. Importe a coleção de requisições disponível no arquivo `insomnia_collection.json`.
3. Execute as requisições disponíveis para interagir com os recursos de produtos e categorias.
4. Testes Endpoints no Insomnia:

   - PRODUTOS
     - GET - Consultar todos os produtos (`http://localhost:8080/produtos`)
     - GET - Consultar produtos por ID (`http://localhost:8080/produtos/2`)
     - GET - Consultar produtos por nome (`http://localhost:8080/produtos/nome/jogo`)
     - POST - Cadastrar produto (`http://localhost:8080/produtos`)
     - PUT - Atualizar produto (`http://localhost:8080/produtos`) - JSON file
     - DELETE - Deletar produto (`http://localhost:8080/produtos/3`)

   - CATEGORIAS
     - GET - Consultar todos as categorias (`http://localhost:8080/categorias`)
     - GET - Consultar categorias por ID (`http://localhost:8080/categorias/2`)
     - GET - Consultar categorias por tipo (`http://localhost:8080/categorias/tipo/jogo`)
     - POST - Cadastrar categoria (`http://localhost:8080/categorias`)
     - PUT - Atualizar categoria (`http://localhost:8080/categorias`) - JSON file
     - DELETE - Deletar a categoria (`http://localhost:8080/categorias/1`)

## Autora

- Rita Almeida(https://github.com/RitaAlmeidah))
