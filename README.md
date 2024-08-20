# Atividade 4 Solutis

## Descrição

O projeto "Mundo Animal" é uma simulação que modela diferentes tipos de animais e suas interações em um zoológico. Ele utiliza conceitos de programação orientada a objetos em Java, incluindo interfaces, classes abstratas e herança. O objetivo é demonstrar a criação e manipulação de objetos para representar comportamentos e características de animais reais. essa atividade foi desenvolvida como parte do processo Solutis Dev Trail 2024, com fins de avaliação de capacidade.

## Estrutura do Projeto

- **`AnimalIF`**: Interface que define os métodos básicos para comportamentos de animais.
- **`AnimalAB`**: Classe abstrata que implementa a interface `AnimalIF` e define atributos comuns a todos os animais.
- **`AnimalTerrestreAB`**: Classe abstrata que estende `AnimalAB` e adiciona atributos específicos para animais terrestres, como quantidade de patas.
- **`AnimalVoadorAB`**: Classe abstrata que estende `AnimalAB` e adiciona atributos específicos para animais que voam, como quantidade de asas e envergadura das asas.
- **`AnimalMarinhoAB`**: Classe abstrata que estende `AnimalAB` e define atributos específicos para animais marinhos.
- **Classes Concretas**: Incluem `Cachorro`, `Gato`, `Leao`, `Peixe`, e `Pombo`, que são instâncias específicas de diferentes tipos de animais e implementam os métodos definidos nas classes abstratas.
  
## Instalação

Para rodar o projeto, siga estas etapas:

1. **Clone o repositório:**

  
```bash
git clone https://github.com/seu-usuario/mundo-animal.git
```

2. **Navegue até o diretório do projeto:**

```bash
   cd mundo-animal
````

3. **Compile o projeto:**

Utilize um ambiente de desenvolvimento Java, como o IntelliJ IDEA ou Eclipse, para compilar o projeto. Se preferir, você também pode usar o javac diretamente no terminal:

```bash
javac -d bin src/mundo/animal/*.java
```
4. **Execute o projeto:**

Navegue até o diretório onde os arquivos .class estão localizados e execute o programa:

```bash
java mundoAnimal.Zoologico
```

## Uso

O programa cria uma instância de cada tipo de animal e realiza as seguintes ações:

Cada animal come, se move e dorme, e essas ações são exibidas no console.

Em seguida, o programa exibe as informações detalhadas de cada animal, incluindo atributos como nome, idade, habitat, altura e peso. Para animais que voam ou são terrestres, são exibidos atributos específicos.

## Estrutura do Arquivo

```
|-- src                       <- Contém o código fonte das soluções implementadas em Java.
|    |
|    |-- mundo.animal          <- Subdiretório que contém as classes e interfaces do projeto.
|      |
|      |-- AnimalIF.java      <- Interface para métodos básicos de comportamento dos animais.
|      |
|      |-- AnimalAB.java      <- Classe abstrata com atributos comuns a todos os animais.
|      |
|      |-- AnimalTerrestreAB.java <- Classe abstrata para animais terrestres.
|      |
|      |-- AnimalVoadorAB.java    <- Classe abstrata para animais que voam.
|      |
|      |-- AnimalMarinhoAB.java    <- Classe abstrata para animais marinhos.
|      |
|      |-- Cachorro.java      <- Classe concreta que representa um cachorro.
|      |
|      |-- Gato.java          <- Classe concreta que representa um gato.
|      |
|      |-- Leao.java          <- Classe concreta que representa um leão.
|      |
|      |-- Peixe.java         <- Classe concreta que representa um peixe.
|      |
|      |-- Pombo.java         <- Classe concreta que representa um pombo.
|      |
|      |-- Zoologico.java     <- Classe principal que executa o programa e exibe informações no console.
|
|- README.md                  <- Arquivo de documentação do projeto.
```
