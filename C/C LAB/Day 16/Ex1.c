#include <stdio.h>
#include <conio.h>

int main() {

    int ch;
    int qxt;
    do
    {
        
        printf("\n\n1. Pizza  -  $10");
        printf("\n2. Burger -  $7");
        printf("\n3. Pasta  -  $8");
        printf("\n4. Salad  -  $5");
        printf("\n5. Exit");
        printf("\n\nEnter Your Choice [ ]\b\b");
        scanf("%d", &ch);

        if(ch == 1 || ch == 2 || ch == 3 || ch == 4)
        {
        printf("Enter Quantity : [ ]\b\b");
        scanf("%d", &qxt);
        }

        switch (ch)
        {
        case 1:
            printf("\nYou Selected Pizza. Price : $%d", qxt * 10);
            break;
        case 2:
            printf("\nYou Selected Burger. Price : $%d", qxt * 7);
            break;
        case 3:
            printf("\nYou Selected Pasta. Price : $%d", qxt * 8);
            break;
        case 4:
            printf("\nYou Selected Salad. Price : $%d", qxt * 5);
            break;
        case 5:
            printf("\nExiting the Program. Thank You!");
            return 0;
            break;
        default:
            printf("\nInvalid Choice");
            break;
        }


    } while (ch > 0);
    

    return 0;
}