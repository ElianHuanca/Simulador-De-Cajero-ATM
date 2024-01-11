# ATM Simulator With Design Patterns
[English](./README.md) | [Español](./README.es.md)

<p align="center">
  <img loading="lazy" src="data:image/jpeg;base64,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" alt="Logo" />
</p>

This is an ATM Simulator that incorporates three design patterns: Chain of Responsibility, Strategy, and Observer.

## Key Features

- You can withdraw money with restrictions based on your account balance and the denominations available in the ATM.
- You can deposit money into your account; however, it does not separate the deposited amount by denominations.
- Fractions can be added to any denomination.

## System Requirements

- Netbeans v8.2
- JDK 8

## Installation

1. Clone this repository on your local machine:

    ```bash
    git clone https://github.com/ElianHuanca/Simulador-De-Cajero-ATM.git
    ```
2. Open the project in Netbeans and run it.

## User Interfaces

Take a look at some user interfaces of the platform below.

*ATM*
<p align="center">
    <img loading="lazy" width="90%" src="./InterfacesDeUsuario/Cajero.png" alt="ATM" />
    <br>
    Here, you can see the fraction of each denomination available in the ATM.
</p>

*Withdrawal*
<p align="center">
    <img loading="lazy" width="90%" src="./InterfacesDeUsuario/Retiro.png" alt="Withdrawal" />
    <br>
    You can perform withdrawal or deposit operations here.
</p>

## Dynamic Class Diagram

<p align="center">
    <img loading="lazy" width="90%" src="./InterfacesDeUsuario/DiagramaDeClasesDinamico.png" alt="DynamicClassDiagram" />
</p>
