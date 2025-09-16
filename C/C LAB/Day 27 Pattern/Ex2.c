#include <stdio.h>
#include <conio.h>

int main() {

    int r, c;

    for(int i = 1; i <= 5; i++) // ROW
    {
        for(int j = 1; j <= 5; j++) // COLUMN
        {
            if(j == 1 || i == 1 || j == 5 || i == 5)
            {
                printf("%4c", '#');
            } else{
                printf("%4c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}