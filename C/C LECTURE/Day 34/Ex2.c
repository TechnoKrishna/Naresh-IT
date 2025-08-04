#include <stdio.h>
#include <conio.h>

int main() {

    printf("%d\n", 012); // Octal too Decimal
    printf("%o\n", 45); // Decimal too Octal
    printf("%d\n", 0x35); // Hex to Decimal
    printf("%x\n", 35); // Decimal to Hexa
    printf("%x\n", 45);
    printf("%X\n", 95);
    printf("%x\n", 025); // Octal too Hexa
    printf("%o\n", 0x44); // Hexa to Octal
    printf("%x\n", -2<<2); // fff8

    return 0;
}