# Contador de Números com Tratamento de Exceção

Este é um programa Java que solicita dois números inteiros ao usuário e imprime uma contagem entre eles. Caso o primeiro número seja maior que o segundo, uma exceção personalizada (`ParametrosInvalidosException`) é lançada.

## 🛠 Tecnologias Utilizadas
- Java
- Scanner (para entrada de dados)
- Tratamento de Exceções (`try-catch`)

## 📌 Como Funciona
1. O usuário insere dois números inteiros.
2. Se o primeiro número for **menor** que o segundo, o programa imprime a contagem.
3. Se o primeiro número for **maior**, a exceção `ParametrosInvalidosException` é lançada, exibindo a mensagem:

O segundo parâmetro deve ser maior que o primeiro.

## 🚀 Executando o Programa
1. Compile o código:
```sh
javac Contador.java ParametrosInvalidosException.java
```
2. Execute
```sh
java Contador
```

## 📄 Estrutura do Código
- Contador.java: Contém o main e a lógica de contagem.
- ParametrosInvalidosException.java: Define a exceção personalizada.

## 📢 Exemplo de Uso
✅ Entrada Válida:
```sh
Digite o primeiro parâmetro:
2
Digite o segundo parâmetro:
5
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
```
❌ Entrada Inválida:
```sh
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5
O segundo parâmetro deve ser maior que o primeiro
```

## 👨‍💻 Autor
Desenvolvido por Fillipe Soranso.  
Projeto do Bootcamp **Bradesco - Java Cloud Native** na plataforma da **DIO**.

