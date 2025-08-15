#include <stdio.h>
#include <conio.h>

int main() {

    int a, b;

    printf("Enter a, b Values : ");
    scanf("%d %d", &a, &b);

    if(a == b)
    {
        puts("Both are Equal");
    }
    else if(a > b)
    {
      puts("A is Big");  
    }
    else
    {
      puts("B is Big");   
    }

    return 0;
}