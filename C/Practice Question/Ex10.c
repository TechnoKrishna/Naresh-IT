#include <stdio.h>
#include <conio.h>

int main()
{

    int t = 1;
    int flag = 1;
    int v;

    for (int i = 1; i <= 9; i++)
    {
        v = 1;
        flag = 1;
        for (int j = 1; j <= 9; j++)
        {
            if (i <= 5 && (j < 6 - i || j > 4 + i))
            {
                printf("%2c", ' ');
            }
            else if (i > 5 && (j > 9 - t || j < t + 1))
            {
                printf("%2c", ' ');
            }
            else
            {
                if(j == 5)
                {
                    flag = 0;
                }

                if(flag == 1)
                {
                    printf("%2d", v++);
                }
                else
                {
                    printf("%2d", v--);
                }
            }
        }
        if (i > 5)
        {
            t += 1;
        }
        printf("\n");
    }

    return 0;
}