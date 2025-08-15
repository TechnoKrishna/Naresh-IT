#include <stdio.h>
#include <conio.h>

int main() {

    int age;

    printf("Enter Person Age : ");
    scanf("%d", &age);

    if(age >= 18)
    {
        puts("Eligible");
    }
    else
    {
       puts("Not Eligible"); 
    }

    return 0;
}