import java.io.*;
public class ArrayIndex{
public static void main(String[] args){
 Console c=System.console();
 System.out.println("enter Number of element in Array");
 
 int N=Integer.parseInt(c.readLine());
 System.out.println("Enter the Search Element");
 int S=Integer.parseInt(c.readLine());
 int Arr[]=new int[N];
 for(int i=0;i<N;i++)
 Arr[i]=Integer.parseInt(c.readLine());
 int Count=0;
 for(int i=0;i<N;i++){
 if(S==Arr[i]){
 System.out.println("The Searching Element Present in "+i+" Index");
 Count++;
 }
 }
 if(Count==0){
 System.out.println("This Element is Not in the Array");
 }
 
}
}