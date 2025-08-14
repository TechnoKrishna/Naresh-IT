#include <stdio.h>

int main() {
    float a, b, c;

    scanf("%f %f %f", &a, &b, &c);

    // Check for validity of the triangle
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        
        // Classify triangle type
        if (a == b && b == c) {
            printf("The triangle is an equilateral triangle.");
        } 
        else if (a == b || b == c || a == c) {
            printf("The triangle is an isosceles triangle.");
        } 
        else {
            printf("The triangle is a scalene triangle.");
        }

    } else {
        printf("The lengths do not form a valid triangle.");
    }

    return 0;
}
