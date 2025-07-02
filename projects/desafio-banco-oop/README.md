# Desafio Banco OOP - Java

## Resumo

Projeto orientado a objetos em Java que simula operações bancárias básicas como depósito, saque, transferência e emissão de extrato. O sistema utiliza abstração, herança e encapsulamento para modelar um banco com contas correntes, contas poupança e clientes.

## Descrição das Classes

- **Banco**  
  Classe principal (`main`) que executa as operações bancárias simuladas, cria clientes e contas e imprime os extratos e a lista de contas criadas.

- **IConta**  
  Interface que define o contrato para todas as contas bancárias, exigindo os métodos `sacar`, `depositar`, `transferir` e `imprimirExtrato`.

- **Conta**  
  Classe abstrata que implementa a interface `IConta` e fornece a lógica comum para contas, como controle de saldo, número da agência, e uma lista estática de todas as contas criadas.

- **ContaCorrente**  
  Subclasse de `Conta` que representa uma conta corrente. Personaliza a impressão do extrato.

- **ContaPoupanca**  
  Subclasse de `Conta` que representa uma conta poupança. Também personaliza a impressão do extrato.

- **Cliente**  
  Classe simples que representa o cliente da conta, armazenando apenas o nome.

## Conclusão

Este projeto demonstra os princípios fundamentais da programação orientada a objetos em Java em um cenário bancário. A estrutura modular permite fácil expansão e reutilização de código, sendo ideal para fins didáticos e exercícios de modelagem OOP.
