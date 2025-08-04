#include <stdio.h>
#include <conio.h>

int main() {

    // Bitwise NOT (~)
    // Bitwise NOT flips every bit: 0 becomes 1, and 1 becomes 0.

    printf("%d\n", ~25);

    // FORMULA =  -(N+1)
    // Note: When starting bit is 1 given no is –Ve.
    // ~25 = 
    // 00000000 00011001
    // 11111111 11100110
    // = -26

    printf("%d\n", ~-25);
    
    // ~-25
    // 0001 1001
    // 1110 0110 // 1's Compliment
    // _______+1 // 2's Compliment
    // 1110 0111
    // 0001 1000 // ~
    //    2^4 2^3
    //    16 + 8 
    // = 24

    printf("%d\n", 25 << 1);
    printf("%d\n", 25 << 2);
    printf("%d\n", 25 << 15);
    printf("%d\n", 25 << 16);

    // 25 << 1
    // 0001     1001
    // ^ delete    ^ 0 Added
    // 0011 0010
    // 32 + 16 + 2 
    // 50

    // NOTE : WHEN DTARTING BIT 1 NO IS NEGATIVE

     printf("%d\n", 25 >> 1);
     printf("%d\n", 25 >> 2);
     printf("%d\n", 25 >> 3);
     printf("%d\n", 25 >> 4);

    // 25 << 1
    // 0001     1001
    // ^ 0 Added   ^ delete    
    // 0000 1100
    // 8 + 4
    // 12

    return 0;
}