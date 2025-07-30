#include <stdio.h>
#include <conio.h>

/*
Bitwise operators

They work on bits [ 0,1 ]

C comes with 16 bit compiler. Hence in c language the bitwise operators are limited from 20 to 215

We have to take only the 1’s position, not the 0 positions. Because of any number * 0 gives again 0.

C COMES WITH 6 BITWISE OPERATION

& BITWISE AND

| BITWISE OR

^ XOR - EXCLUSIVE OR

~ COMPLIMENT OP

<< LEFT SHIFT

>> RIGHT SHIFT


& - bitwise and: When both bits are 1 then result bit also 1 otherwise result is 0.


*/


int main() {

    printf("%d\n", 25 & 15);

/*

25 & 15
= 0001 1001
& 0000 1111
  ------------
  0000 1001  --> 9

*/

    printf("%d\n", 25 | 15);

/*

25 | 15
= 0001 1001
| 0000 1111
  ------------
  0001 1111  --> 31

*/

    printf("%d\n", 25 ^ 15);

/*

25 ^ 15
= 0001 1001
^ 0000 1111
  ------------
  0001 0110  --> 22

*/

    return 0;
}