#include <stdio.h>
#include <conio.h>

/*
Ternary / conditional operator [ ?: ]

It require three operands. It is going to start with condition. Hence it is also called conditional operator.

Syntax:
Conditional part ? true part : false part ;

*/

int main() {

    int n = 0;

    printf("Enter a NO ");
    scanf("%d", &n);

    puts( n%2 == 0 ? "Even" : "Odd");

    puts( n%2 ? "Odd" : "Even");

    return 0;
}