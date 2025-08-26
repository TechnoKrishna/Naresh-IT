#include <stdio.h>
#include <conio.h>

int main() {

    int ch;

    do
    {
        printf("\nEnter a Positive Integer : ");
        scanf("%d", &ch);

        if(ch <= 0)
        {
            printf("Invalid!");
        } 
        else
        {
            printf("Valid Input : %d", ch);
        }

    } while (ch <= 0 || ch > 0);
    


    return 0;
}