#include <stdio.h>

int main()
{
	char String[25],reverseString[25]={'\0'};
	int i,length=0,flage=0;
	printf("enter a string");
	gets(String);
	for(i=0;String[i]!='\0';i++)
		{
	length++
	}
	printf("the given string length and String %s =%d",String,length);
    for (i=length-1;i>=0 ;i-- )
	{
		reverse[length-i-1]=String[i];
}
for(flage=1,i=0;i<length;i++)
	{
	if(reverseString[i]!=0)
		flage=0;
	}
	if (flage==1)
	{
		printf("the given %s is pelindrome\n",String);
	}
	else
		{
		printf("the given %s is not pelindrome\n",String);
	
	}
}

	}
