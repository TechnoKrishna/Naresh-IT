#include <stdio.h>
#include <conio.h>

int main() {

    for(int i = 1; i <= 5; i++)
    {
        for(int j = 1; j <= 5; j++)
        {
            if(i == j)
            {
                printf("%4d", i);
            }
            else if(i == 5)
            {
                printf("%4d", j);
            }
            else if(j == 1){
                printf("%4d", j);
            }
            else{
                printf("%4c", ' ');
            }
        }
        printf("\n");
    }

    return 0;
}