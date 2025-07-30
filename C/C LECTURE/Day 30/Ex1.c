#include <stdio.h>
#include <conio.h>

int main() {

    int a = 999;

    printf("%d, %d\n", a, sizeof(++a));
    printf("%d, %d\n", a, sizeof(a=555));
    printf("%d, %d\n", sizeof("Kishore"), printf("Kishore"));
    printf("%d, %d\n", sizeof("Kishore\0"), printf("Kishore\0"));
    printf("Kishore addr %u\n", "Kishore");
    printf("%d, %d\n", sizeof("Kishore"+1), sizeof("Kishore")+1);
    printf("%d, %d\n", sizeof("1.23"), sizeof(sizeof("Kishore")));
    printf("%d, %d\n", sizeof(""), sizeof(" "));
    
    return 0;
}