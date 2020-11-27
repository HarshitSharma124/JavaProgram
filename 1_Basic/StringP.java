import java.util.Scanner;
public class StringP
{
	public static void main(Stirng args[])
	{
		Scanner sc=new Scanner(System.in);
	    String word=sc.next();
		char[] name=word.charAt(0);
	    int i,length=0,flage=0;
	    System.out.println("enter a string");
	
	 for(i=0;word[i]!='\0';i++)
		{
	     length++;
	    }
	  System.out.println(String+"the given string length and String "+length);
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
		printf("the given  is pelindrome\n"+String);
	  }
	else
		{
		printf("the given is not pelindrome\n"+String);
        }
}
}

