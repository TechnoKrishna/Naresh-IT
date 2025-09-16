#include <stdio.h>

int main() {
    int i, j;

    for (i = 5; i >= 1; i--) {     // rows (5 to 1)
        for (j = 1; j <= 5; j++) { // columns (1 to 5)
            printf("%3d ", (j * 5) - (5 - i)); 
        }
        printf("\n");
    }

    return 0;
}