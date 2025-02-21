# Sistema Java Terminal

Este projeto contém duas implementações em Java que exibem informações sobre o usuário (nome, sobrenome, idade e peso) através de dois métodos distintos de entrada de dados:

1. **Entrada via linha de comando** (`AboutMe.java`)
2. **Entrada interativa via `Scanner`** (`AboutMeScanner.java`)

Além disso, o arquivo `launch.json` está configurado para facilitar a execução dessas classes diretamente no Visual Studio Code, com exemplos de parametrização para execução da classe `AboutMe`.

## Funcionalidades

- **`AboutMe.java`**: Exibe informações de um usuário a partir de parâmetros passados via linha de comando.
- **`AboutMeScanner.java`**: Solicita ao usuário nome, sobrenome, idade e peso de forma interativa e exibe essas informações.

## Estrutura do Projeto

- **`AboutMe.java`**: A classe recebe parâmetros via linha de comando e exibe as informações do usuário.

- **`AboutMeScanner.java`**: A classe usa a classe `Scanner` para solicitar entradas interativas do usuário (nome, sobrenome, idade e peso) via terminal e exibe essas informações de forma dinâmica.

- **`launch.json`**: Configuração de execução para o Visual Studio Code que permite rodar os dois programas (`AboutMe.java` e `AboutMeScanner.java`) facilmente.

## Configuração do `launch.json`

O arquivo `launch.json` contém três configurações para executar as classes de maneira conveniente no Visual Studio Code:

1. **`AboutMeScanner`**: Executa a classe `AboutMeScanner` e solicita entradas interativas.
2. **`Current File`**: Executa qualquer arquivo Java aberto.
3. **`AboutMe`**: Executa a classe `AboutMe` passando parâmetros fixos para o programa.

## Como Executar

1. **Via linha de comando**:
   - Para rodar o programa `AboutMe` com parâmetros específicos:
     ```bash
     java AboutMe Fillipe Soranso 31 75.5
     ```

2. **Via Visual Studio Code**:
   - Abra o projeto.
   - Selecione uma das configurações no menu de execução (`F5`).
     - **AboutMeScanner**: Executa a classe com entrada interativa.
     - **AboutMe**: Executa a classe passando os parâmetros predefinidos.

## Dependências

- Java 11 ou superior.
- Visual Studio Code com a extensão "Java Extension Pack".