Shapes
Write a Java program that takes input from the command line arguments and outputs a shape of the specified size. There are 4 shapes that can be chosen from: Square, Triangle, Circle and Rhombus.

Command usage: java Shapes <shape> <size>

If the shape is not valid, output Invalid shape, must be either square, triangle, circle or rhombus. . If the size is not a positive integer, output Invalid size - it must be a positive integer. . If not enough command line arguments are given, output the usage message: Usage: java Shapes <shape> <size> .

Examples

$ java Shapes square 1
 __
|__|
$ java Shapes square 2
 ____
|    |
|____|
$ java Shapes square 5
 __________
|          |
|          |
|          |
|          |
|__________|

$ java Shapes triangle 1
 /\
/__\
$ java Shapes triangle 2
  /\
 /  \
/____\
$ java Shapes triangle 4
    /\
   /  \
  /    \
 /      \
/________\

$ java Shapes circle 2
  XXXXX
XXX   XXX
XX     XX
XXX   XXX
  XXXXX

$ java Shapes circle 3
   XXXXXXX
 XXX     XXX
XX         XX
XX         XX
XX         XX
 XXX     XXX
   XXXXXXX

$ java Shapes circle 7
         XXXXXXXXXXX
      XXXX         XXXX
   XXX                 XXX
  XX                     XX
 XX                       XX
XX                         XX
XX                         XX
XX                         XX
XX                         XX
XX                         XX
 XX                       XX
  XX                     XX
   XXX                 XXX
      XXXX         XXXX
         XXXXXXXXXXX

$ java Shapes rhombus 1
  _____
 /    /
/____/
$ java Shapes rhombus 2
   ________
  /       /
 /       /
/_______/
$ java Shapes rhombus 6
       _________________
      /                /
     /                /
    /                /
   /                /
  /                /
 /                /
/________________/
