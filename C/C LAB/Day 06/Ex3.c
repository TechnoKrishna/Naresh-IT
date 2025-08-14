#include <stdio.h>
#include <conio.h>

int main()
{
    int Marks, Grace;

    scanf("%d %d", &Marks, &Grace);

    (Marks >= 35) ? printf("Pass") : (Marks >= 30) ? printf("Pass", ++Grace) : printf("Fail"); 

    return 0;
}