# Adventure Game

This repository contains an adventure game running on console. This practice was developed using the four main principles (Encapsulation,Abstraction,Inheritance,Polymorpihsm) of object oriented programming in Java

## Examples of OOP
-  **Encapsulation** is the mechanism of hiding of data implementation by restricting access to public methods. Instance variables are kept private and accessor methods are made public to achieve this.[Example](https://github.com/dogukantorun1/adventure-game-oop/blob/main/src/armor/Armor.java)

-  **Abstraction** is the concept of object-oriented programming that shows only essential attributes and hides unnecessary information. The main purpose of abstraction is hiding the unnecessary details from the users.
[In this example](https://github.com/dogukantorun1/adventure-game-oop/blob/main/src/location/Location.java), The Location class, which is the ancestor of the Battle Location and Normal Location classes, is defined as abstract.Thus, generating objects from the location class and complexity is prevented.

- **Inheritance:** The child class will inherit all the public and protected properties and methods from the parent class. In addition, it can have its own properties and methods.An inherited class is defined by using the extends keyword.[Example](https://github.com/dogukantorun1/adventure-game-oop/blob/main/src/location/ToolStore.java)

- **Polymorphism** means many forms, and it occurs when we have many classes that are related to each other by inheritance. For example:


    ```java
    Character a = new Assasin();
    ```

    ```java
    public Location location;
    .
    .
    .
    location = new SafeHouse(player);
    ```


## CLASSES
- Armor
    - Light
    - Medium
    - Heavy
- Character
    - Assasin
    - Archer
    - Knight
- Game
- Main
- Inventory
- Location
    - NormalLocation
        - SafeHouse
        - ToolStore
    - BattleLocation
        - Cave 
        - Forest
        - River
        - Mine
- Obstacle
    - Bear
    - Snake
    - Vampire
    - Zombie
- Player
- Weapon
    - Gun
    - Rifle
    - Sword


## UML CLASS DİAGRAM

<img width="737" alt="">


## GAME SCENARİO

```sh


```

## Requirements and Technologies

- java19