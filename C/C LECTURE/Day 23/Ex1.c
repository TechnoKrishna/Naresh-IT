// LOGICAL OPERATORS 

// In || operation when left expression is true, then right expression not checked.

// In && operation when left expression is false, then right expression not checked.

// && operator got the first priority.

#include<stdio.h>
#include<conio.h>

int main()
{

    printf("1st : %d\n", 5==5);
    printf("2nd : %d\n", 5==5 && 7!=7);
    printf("3rd : %d\n", 5==5 || 7!=7);
    printf("4th : %d\n", 5!=5 || 7!=7);
    printf("5th : %d\n", 5!=5 && 7==7);
    printf("6th : %d\n", 5>=5 && 7<=7);
    printf("7th : %d\n", !(5>=5));
    printf("8th : %d\n", !(5!=5));

    printf("\n\n");

    printf("1st : %d\n", !('a' > 'b'));
    printf("2nd : %d\n", 2==2 && 3>=3 && 4!=4);
    printf("3rd : %d\n", 2==2 || 3>=3 && 4!=4);
    printf("4th : %d\n", (2==2 || 3>=3) && 4!=4);

    printf("\n\n");

    printf("1st : %d\n", 4 && -4);
    printf("2nd : %d\n", 'a' || 'b');
    printf("3rd : %d\n", 0 || '0');
    printf("4th : %d\n", 5.5 && 9);
    printf("5th : %d\n", !5.5 && 9);

    return 0;
}