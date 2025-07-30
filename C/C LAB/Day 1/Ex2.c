/*Q2 )  
Swap Two No by Using 3rd Variable
input as it a = 10, b = 20,
output as a = 20 , b = 
*/

#include <stdio.h>
#include <conio.h>

int main() {

    int a = 10, b = 20, c = 0;

    c = a;
    a = b;
    b = c;

    printf("a=%d , b=%d", a, b);

    return 0;
}

// Admin@123