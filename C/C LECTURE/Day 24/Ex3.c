/* Finding the next / previous multiple of given no based on last digit. i.e. if last digit is >=5 go for next multiple otherwise go for previous multiple [ rounding of no ]. */

#include<stdio.h>
#include<conio.h>

int main()
{
    int n;

    printf("Enter The No : ");
    scanf("%d", &n);

    n%10>=5 && printf("%d", (n/10+1)*10);
    n%10<=5 && printf("%d", (n/10*10));

    printf("\n SHORT HAND : ");

    n%10>=5 && printf("%d", (n/10+1)*10) || printf("%d", (n/10*10));

    return 0;
}
