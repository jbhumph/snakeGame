# Snake Game
Snake game with GUI for CS 240 <br>
John Humphrey<br>
w/ Adam Sabet and Jing Lin Lai

## Contents:
- [Introduction](##Introduction)<br>
- [How To Play](##HowToPlay)<br>
- [About](##About)<br>
- [Screenshots](##Screenshots)

## Introduction:
This is a version of the classic game Snake. It was created for CS240 class at Whatcom Community College.

## How to Play
In order to play the game, one has two options. <br>
Firstly you may download the [snakeGame.jar](snakeGame.jar) file. If you have a current version of Java installed on your computer you should be able to run it directly. <br>
Secondly, downloading the code and then compiling and running the program yourself from within your own IDE.

In the game itself, you will use either the directional arrow keys or a,w,s,d keys to move the snake. Your goal is to eat as many pieces of food as possible. If the snake collides with its own body, you lose the game.

## About:

The original basic logic of the game was written between the three of us. Once we had an outline for the games structure we each branched off into our own version.
I created a solid back end logic and then initially ran the game through the main class with a very basic GUI in the terminal. 
Initially, I had used the included LinkedList class when designing my program. Afterward I created my own more compact linked list called **BasicLinkedList**.
I then decided to implement a GUI using Swing. The primary area of the game moved into the **GameFrame** & **GamePanel** classes where main merely invoked these.
The game itself is somewhat rudimentary, however I plan to do some minor updates such as a start menu and a real "Game Over" screen.

## Screenshots:

![Screenshot 2025-01-28 at 9.19.41 PM.png](documentation%2FScreenshot%202025-01-28%20at%209.19.41%20PM.png)

![Screenshot 2025-01-28 at 9.20.18 PM.png](documentation%2FScreenshot%202025-01-28%20at%209.20.18%20PM.png)