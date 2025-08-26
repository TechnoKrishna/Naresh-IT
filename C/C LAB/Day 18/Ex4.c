#include <stdio.h>
#include <conio.h>

int main() {

    int no;
    int sum = 0;

    do
    {
        printf("\nEnter a Number : ");
        scanf("%d", &no);

        if(no > 0)
        {
            sum = sum + no;
        } 
        else if(no == 0){
            printf("\nSum of Positive Number : %d", sum);
            return 0;
        }
        else{
            printf("\nInvalid Input Only Positive Digit");
        }
    } while (no > 0 || no < 0);
    
    return 0;
}