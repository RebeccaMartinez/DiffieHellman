# DiffieHellman

* Practica de Seguridad
* Lenguaje de programación: Java

En esta Práctica se utliza el algoritmo de exponenciación rápida, que nos permite realizar la operación a^b mod(c) cuando
los números son muy grandes.

Funcionamiento del algoritmo:

Tenemos dos personas: A y B
Se elige  un número primo p y una base alfa.
A escoge un número secreto xA (menor que p), calcula  yA=alfa^xA (mod p) y lo envía
B escoge un número secreto xB (menor que p), calcula calcula yB=alfa^xB (mod p) y lo envía

A genera k = yB^xA (mod p) 
B genera k = yA^xB (mod p) 

Tanto la A calculada por a como por B tiene que dar el mismo valor.
