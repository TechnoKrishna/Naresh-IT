/*
Q1 ) MAKE A SUM OF NO BY USING OPERATOR CONCEPT
 input as 65 
 output as 11
 */

 #include <stdio.h>
 #include <conio.h>
 
 int main() {

    int a = 65;

    int temp;
    
    temp = a % 10;

    temp = temp + (65/10);
    
    printf("a = %d", temp);

     return 0;
 }