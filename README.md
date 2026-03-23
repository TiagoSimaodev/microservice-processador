# 🧩 Microservice Processador de Pedidos

Este projeto é um **microserviço backend desenvolvido com Java e Spring Boot**, responsável por processar pedidos de forma assíncrona utilizando mensageria com RabbitMQ.

A aplicação consome mensagens de uma fila, processa os dados do pedido e persiste as informações no banco de dados, seguindo boas práticas de arquitetura e desacoplamento.

---

## 🚀 Tecnologias utilizadas

- Java 21  
- Spring Boot 3  
- Spring Data JPA  
- RabbitMQ (AMQP)  
- PostgreSQL  
- Lombok  
- Maven  

---

## 🧠 Arquitetura

O sistema segue uma abordagem baseada em **microserviços e processamento assíncrono**, utilizando mensageria para desacoplar responsabilidades.

### 🔄 Fluxo do processamento

1. Um pedido é enviado para uma fila no RabbitMQ  
2. O microserviço **escuta (listener)** essa fila  
3. Ao receber a mensagem, os dados são processados  
4. O pedido é persistido no banco de dados  
5. O status do pedido é atualizado  

---

## 📦 Estrutura do projeto

- `config` → Configuração do RabbitMQ  
- `listener` → Consumidor das mensagens da fila  
- `service` → Regras de negócio e processamento dos pedidos  
- `repository` → Acesso ao banco de dados (JPA)  
- `entity` → Entidades do sistema  
- `enums` → Enum de status do pedido  

---

## 🔐 Boas práticas aplicadas

- Separação de responsabilidades (camadas bem definidas)  
- Arquitetura orientada a eventos (Event-Driven)  
- Processamento assíncrono com mensageria  
- Uso de DTOs e entidades organizadas  
- Código limpo e organizado  

---

## ⚙️ Como executar o projeto

### Pré-requisitos
- Java 21  
- Maven  
- PostgreSQL  
- RabbitMQ rodando localmente ou em container  

### Passos

```bash
# Clonar o repositório
git clone https://github.com/TiagoSimaodev/microservice-processador.git

# Entrar na pasta
cd microservice-processador

# Rodar o projeto
mvn spring-boot:run

``` 
---

📨 Exemplo de uso:

O sistema espera receber mensagens no RabbitMQ contendo dados de pedidos.

Exemplo de payload:

{
  "cliente": "Tiago",
  "produto": "Notebook",
  "quantidade": 1,
  "valor": 3500.00
}


Este projeto foi desenvolvido com o objetivo de:

Praticar arquitetura de microserviços
Implementar comunicação assíncrona com RabbitMQ
Simular processamento de pedidos em sistemas distribuídos
Aplicar boas práticas de desenvolvimento backend



📌 Possíveis melhorias:

Implementar autenticação e autorização (JWT)
Adicionar testes automatizados (JUnit/Mockito)
Integração com outros microserviços (ex: notificação)
Monitoramento e observabilidade (logs, métricas)


👨‍💻 Autor

Tiago Simao
📧 tiagosimao.dev@gmail.com

🔗 https://github.com/TiagoSimaodev
