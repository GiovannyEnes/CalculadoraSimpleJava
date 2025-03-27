# Calculadora Simples em Java

## 📌 Sobre o Projeto

Este projeto consiste em uma calculadora simples desenvolvida em Java, que possui tanto uma interface gráfica (GUI) quanto uma versão de console. O objetivo é demonstrar conceitos de programação orientada a objetos, manipulação de eventos e criação de interfaces gráficas com Swing.

## 🚀 Funcionalidades

- **Interface gráfica com botões interativos**

- **Operações matemáticas básicas: soma, subtração, multiplicação e divisão**

- **Versão de console para interação via terminal**

- **Tratamento de erros (como divisão por zero)**

## 🛠 Tecnologias Utilizadas

- **Linguagem: Java**

- **Bibliotecas: Swing (para a interface gráfica)**

## 📁 Estrutura do Projeto

CalculadoraJava/
**│── src/**
**│   ├── Main/**
**│   │   ├── App/**
**│   │   │   ├── App.java**
**│   │   │   ├── CalculadoraGUI.java**
**│   │   │   ├── CalculadoraInterface.java**
**│   │   ├── Service/**
**│   │   │   ├── CalculadoraService.java**
**│── README.md**

## 🎮 Como Executar

**Executar a versão gráfica:**

Compile os arquivos Java:
- 1. javac -d bin src/Main/App/*.java src/Main/Service/*.java

Execute a aplicação:
- 2. java -cp bin Main.App.App


**Executar a versão de console:**

Compile os arquivos Java:
- 1. javac -d bin src/Main/App/*.java src/Main/Service/*.java
    
Execute a aplicação:  
- 2. java -cp bin Main.App.CalculadoraInterface

## 📷 Interface Gráfica

- A calculadora possui um layout simples e funcional, com botões para cada operação matemática e um campo de exibição dos números digitados e resultados.

## ✨ Versão Futura 2.0

- **Adicionar suporte a cálculos encadeados**

- **Implementar operações mais avançadas (potenciação, raiz quadrada)**

- **Melhorar a interface gráfica com temas personalizados**

Feito por Giovanny Enes. 