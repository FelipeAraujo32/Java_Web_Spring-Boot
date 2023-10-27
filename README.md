# Projeto Spring Boot com Java Web

Este é um projeto de exemplo que demonstra como criar um aplicativo web usando Spring Boot com Java. O projeto inclui a manipulação de controllers, entidades, repositórios e recursos, que são componentes essenciais de um aplicativo Spring Boot.

## Descrição do Projeto
O projeto é um sistema de gerenciamento de usuário simples, onde os podem criar, listar e excluir usuários.

## Tecnologias Usadas
- Spring Boot: Estrutura principal para desenvolvimento.
- Java: Linguagem de programação.
- Spring Data JPA: Para interagir com o banco de dados.
- H2 Database: Banco de dados em memória para fins de demonstração.
- Maven: Gerenciamento de dependências.
- Spring Web: Para criar os controladores e recursos da web.

## Configuração do Projeto
1- Clone o repositório para a sua máquina local:

```git clone https://github.com/seu-usuario/projeto-spring-boot.git```

2- Importe o projeto em sua IDE de escolha (por exemplo, Eclipse, IntelliJ, etc.).

3- Certifique-se de que as dependências Maven sejam baixadas e configuradas automaticamente.

4- Inicie o aplicativo Spring Boot a partir da classe principal `JavawebApplication.java`.

## Estrutura do Projeto
A estrutura do projeto segue uma organização comum de um aplicativo Spring Boot:

- `src/main/java/com/javaweb/` : Contém os pacotes Java.
- `controllers/` : Contém classe controladora que lidam com solicitações HTTP.
- `entities/` : Contém classes que representam as entidades do aplicativo.
- `repository/` : Contém interfaces JPA para manipulação de dados no banco de dados.
- `JavawebApplication.java` : Classe principal que inicia o aplicativo Spring Boot.
- `src/main/resources/` : Contém os recursos do aplicativo.

### Uso do Aplicativo
Após iniciar o aplicativo, você pode acessá-lo em http://localhost:8080.

### Banco de Dados
O aplicativo utiliza um banco de dados H2 em memória para armazenar as tarefas. Você pode acessar o console do banco de dados em http://localhost:8080/h2-console (as configurações de acesso estão no arquivo application.properties).
