#include <stdio.h>
#include <conio.h>

int main()
{

    for (int i = 1; i <= 5; i++)
    {

        int t = 5;

        for (int j = 1; j <= 9; j++)
        {

            if ((j < 6 - i))
            {

                printf("%2c", ' ');
            }
            else if (j < ) // code here
            {
                printf("%2d", t);
            }
            else
            {

                printf("%2d", t);
            }
            if (t > 0)
            {
                t--;
            }
            else
            {
                t++;
            }
        }
        printf("\n");
    }

    return 0;
}