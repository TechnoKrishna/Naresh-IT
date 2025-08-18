#include <stdio.h>
#include <conio.h>

int main() {

    int n;
    int temp = 0;

    printf("Enter The Number : ");
    scanf("%d", &n);

    if(n <= 0)
    {
        printf("Invalid");
        return 0;
    }

    s:

    temp = (temp * 10) + n%10;
    n = n / 10;
     
    while(n > 0) goto s;

    printf("%d", temp);

    return 0;
}