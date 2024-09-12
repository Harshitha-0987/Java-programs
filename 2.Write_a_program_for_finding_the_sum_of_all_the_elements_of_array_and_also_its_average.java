import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int sum=0,average;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n=sc.nextInt();
int array[]=new int[10];
System.out.println("enter the elements of array:");
for(int i=0;i<n;i++)
{
    array[i]=sc.nextInt();
}
System.out.println("the sum is:");
for(int i=0;i<n;i++)
{
    sum=sum+array[i];
}
average=sum/n;
System.out.println(sum);
System.out.println(average);
}
} 
