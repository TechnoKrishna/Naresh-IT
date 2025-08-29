#include <stdio.h>
#include <conio.h>

int main() {

    int n;
    int sum= 0;

    printf("Enter a No : ");
    scanf("%d", &n);

    if (n == 1)
    {
        printf("Not a Prime / Composite No");
    }
    

    for (int i = 1; i <= n; i++)
    {
        if(n % i == 0){
            sum++;
        }
    }
    printf((sum==2)?"Prime No":"Composite No");

    return 0;
}