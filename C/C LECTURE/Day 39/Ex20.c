#include <stdio.h>
#include <conio.h>

int main() {

    int n, i=0;

    printf("Enter No of Time u Want to Print 1 : ");
    scanf("%d", &n);

    a:

    printf("i\n");
    i++;

    while (i < n) goto a;  

    return 0;
}