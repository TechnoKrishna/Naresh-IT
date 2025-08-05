#include <stdio.h>
#include <conio.h>

int a = 10;

void show()
{
    printf("a = %d\n", ++a);
}

int main() {

    show();
    show();
    show();
    show();
    
    return 0;
}