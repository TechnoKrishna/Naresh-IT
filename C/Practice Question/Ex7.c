#include <stdio.h>
#include <conio.h>

int main()
{

    int flag = 1;
    int t;

    for (int i = 1; i <= 5; i++)
    {
        t = 1;
        flag = 1;

        for (int j = 1; j <= 9; j++)
        {
            if (j < 6 - i || j > 4 + i)
            {
                printf("%1c", ' ');
            }
            else
            {
                if(j == 5)
                { 
                    flag = 0;
                }

                if (flag == 1)
                {
                    printf("%1d", t++);
                }
                else{
                    printf("%1d", t--);
                }
            }
        }
        printf("\n");
    }

    return 0;
}