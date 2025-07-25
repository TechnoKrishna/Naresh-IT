// Increment / Decrement / Modify operators [ ++ / -- ]:

#include<stdio.h>
#include<conio.h>

int main()
{

    int a = 4, b = 9;

    a++;
    b--;

    printf("a=%d, b=%d\n",a, b);

    a = 4 , b = 9;

    ++a;
    --b;

    printf("a=%d, b=%d\n",a, b);

    return 0;
}