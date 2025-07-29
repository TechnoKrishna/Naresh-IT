#include <stdio.h>
#include <conio.h>

int main() {

// * - pointer : pointer stores the address of another variable of same type.   

    int a; // normal var declaration
    int *p; // pointer var declaration
    p = &a; // a addr stored in pointer p

    printf("Enter a Value : ");
    scanf("%d", &a);

    printf("A Value %d\n", a);
    printf("A Addres %u\n", &a);
    printf("P Value %u\n", p);
    printf("A Value Through P = %d", *p); // Here * is Called Indirection OP
        
    return 0;
}