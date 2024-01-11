# ATM Simulator With Design Patterns
[English](./README.md) | [Español](./README.es.md)

<p align="center">
  <img loading="lazy" src="" alt="Logo" />
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
    Here, you can see the fraction of each denomination available in the ATM.
</p>

*Withdrawal*
<p align="center">
    <img loading="lazy" width="90%" src="./InterfacesDeUsuario/Retiro.png" alt="Withdrawal" />
    You can perform withdrawal or deposit operations here.
</p>

## Dynamic Class Diagram

<p align="center">
    <img loading="lazy" width="90%" src="./InterfacesDeUsuario/DiagramaDeClasesDinamico.png" alt="DynamicClassDiagram" />
</p>
