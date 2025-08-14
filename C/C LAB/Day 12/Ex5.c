#include<stdio.h>

int main(){
	
	int num;
	scanf("%d",&num);
	
	if(num>=90 && num<=100){
		printf("Grade A");
	}
	else if(num>=80 && num<=89){
		printf("Grade B");
	}
	else if (num>=70 && num<=79){
		printf("Grade C");
	}
	else if(num>=60 && num<=69){
		printf("Grade D");
	}
	else if(num<60){
		printf("Grade F");
	}
	else printf("Invalid marks entered.");
}