#include <stdio.h>
#include <conio.h>

int main() {

// 1 )

// int a = 5, b = 3, c = 1;

// int result = a * (b + c++) / (--b);

// printf("%d\n", result);

// ANSWER : 10

// 2 )

// int x = 5, y = 2, z;

// z = x / y * x % y; 

// printf("%d\n", z);

// ANSWER : 0

// 3 )

// int a = 5, b = 5, c = 5;

// int x, y;

// x = ++a * 2 - 1;
// y = b++ * 2 - 1;
// c *= 2 - 1;

// printf("%d %d %d\n", x, y, c);

// ANSWER : 11, 9, 5

// 4 )

// int a = 8;
// double b = 2.6;
// int c;

// c = a + b;

// printf("%d\n", c);

// ANSWER : 10

// 5 )

// int x = 4, y = 2;

// x /= x / y;

// printf("%d\n", x);

// ANSWER : 2

// 6 )

// int a, b = 2, c;

// a = 2 * (b++);

// c = 2 * (++b);

// printf("a = %d, b = %d, c = %d", a, b, c);

// ANSWER : 4, 4, 8

// 7 ) 

// int x = (20 || 40) && (10);

// printf("%d\n", x);

// ANSWER : 1

// 8 )

// int i = 0, j = 1, k = 2, m;

// m = i++ || j++ || k++;

// printf("%d %d %d %d", m, i, j, k);

// ANSWER 1, 1, 2, 2

// 9 )

// int a = 3, b = 9;
// printf("%d", ++(a*b+1));

// ANSWER : SYNTAX ERROR 

// 10 )

// int a = 5;
// int b = 4;

// a += b % a;

// printf("%d", a);

// ANSWER : 9

// 11 )

// int a = 5; 
// int b = 10;
// int c = 15; 
// int d = 2; 

// int result = a++ * ++b - c-- / d++;

// printf("%d", result);

// // ANSWER : 48

// 12 )

// int x = 3;
// int y = 2;

// int z = x++ * x * --y - y--;

// printf("%d %d %d", x, y, z);

// ANSWER : 4, 0, 11

// 13 ) Which of the following operator takes only integer operands?

// A) +
// B) *
// C) /
// D) %

// ANSWER : %

// 14 ) In an expression involving || operator ,evaluation

// I)   Will be stopped if one of its components evaluates to false
// II)  Will be stopped if one of its components evalutes to true
// III) Takes place from right to left
// IV)  Takes place from left to right

// // ANSWER : Will be stopped if one of its components evalutes to true

// 15) What will be the output of this below program?

// int i =10;
// i=!i>14;
// printf("%d",i);

// ANSWER: 0

// 16 )

// printf("%d",3 * 2--);

// ANSWER : SYNTAX ERROR

// 17 )

// int i = 10;
// i++;
// i * i;
// printf("%d\n",i);

// ANSWER : 11

// 18 )

// int a;
// a = (1, 2, 3);
// printf("%d", a);

// ANSWER : 3

// 19

// int a=4,b,c;
// b = --a;
// c = a--;
// printf("%d %d %d",a,b,c);

// ANSWER : 2, 3, 3

// 20 )

// int x, y, z;
// x = 9 > 8 > 7;
// y = 9 > 8 > 0;
// z = 9 > 8 > 1;
// printf("%d %d %d", x, y, z);

// ANSWER : 0, 1, 0

// 21

// int a=-1, b=1, c, d;
// c = !a && b;
// d = !a || b;
// printf("%d %d %d %d",a,b,c,d);

// ANSWER : -1, 1, 0, 1

// 22

// printf("%d Hello %d");

// ANSWER : Grabage Value Hello Grabage Value

// 23

// int x = 5;
// float y = 3.5;
// int result = x + (int)y;
// printf("Result: %d\n", result);

// ANSWER : 8

// 24  Which of the following is a valid C identifier?

// A) 123name
// B) _name
// C) my-name
// D) %name
// E) None

// ANSWER : B

// 25

// int x = 5; 
// int y = 3;
// x += y++;
// y -= x--;
// printf("x = %d, y = %d\n", x, y);

// ANSWER : 7, -4

    return 0;
}