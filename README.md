# Design Pattern Criacionais: Factory

Este projeto exemplifica o uso do padrão de design Factory (Fábrica) em Java para criar diferentes tipos de pizzas. O padrão Factory é utilizado para encapsular a criação de objetos e permitir que a subclasse altere o tipo de objetos que serão criados.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **JUnit 5:** Framework de testes para a execução dos testes unitários.

## Como Testar e Executar o Projeto

### Pré-requisitos

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)

### Executando o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

1. markdown

# Design Pattern Criacionais: Factory

Este projeto exemplifica o uso do padrão de design Factory (Fábrica) em Java para criar diferentes tipos de pizzas. O padrão Factory é utilizado para encapsular a criação de objetos e permitir que a subclasse altere o tipo de objetos que serão criados.

## Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **JUnit 5:** Framework de testes para a execução dos testes unitários.

## Como Testar e Executar o Projeto

### Pré-requisitos

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [JUnit 5](https://junit.org/junit5/docs/current/user-guide/)

### Executando o Projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio

 1.  Execute o aplicativo:

./gradlew run

 Ou

 ./gradlew run

## Estrutura do Projeto

### `build.gradle`

O arquivo de configuração do Gradle para gerenciar as dependências do projeto e as tarefas.

### `model/Pizza.java`

Uma interface que define o contrato para as pizzas.

### `model/PizzaDeChocolate.java`

Uma implementação da interface Pizza para pizzas de chocolate.

### `model/PizzaPepperoni.java`

Outra implementação da interface Pizza para pizzas de pepperoni.

### `factory/PizzaFactory.java`

A fábrica de pizzas que implementa o padrão Factory para criar instâncias de pizzas com base no sabor solicitado.

### `main/Main.java`

A classe principal que demonstra como utilizar a fábrica de pizzas para criar diferentes tipos de pizzas.

## Observações

- Este projeto é um exemplo educacional para ilustrar o uso do padrão Factory.
- Certifique-se de ter o Java e o JUnit 5 instalados para executar e testar o projeto.

Agora você pode explorar e compreender como o padrão Factory é aplicado na criação de objetos no contexto de pizzas.
