/*

RoundOFF the no to its next multiplication of 10
input as 36
output as 40
int as 77
output as 80


*/

#include <stdio.h>
#include <conio.h>

int main() {

    int a = 36;

    int temp = a % 10;

    printf("%d", (a - temp)+10);

    return 0;
}