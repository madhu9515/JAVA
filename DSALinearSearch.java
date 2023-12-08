import java.util.Arrays; 

import java.util.Scanner; 

public class DSALinearSearch { 

 public static void main(String[] args) { 

 Scanner sc = new Scanner(System.in); 

 System.out.print("Number of persons :"); 

 int n = sc.nextInt(); 

 System.out.println(); 

 String[] city = new String[n]; 

 int[] age = new int[n]; 

 String[] name = new String[n]; 

 for (int i = 0; i < n; i++) { 

 System.out.println("Enter name of "+(i+1)+" person :"); 

 name[i]= sc.next(); 

 System.out.println("Enter city of "+name[i]+" :"); 

 city[i]= sc.next(); 

 System.out.print("Enter age of "+name[i]+" :"); 

 age[i] = sc.nextInt(); 

 } 

 System.out.println("age"+"\t"+"\t"+"city"+"\t"+"name"); 

 for (int i = 0; i < n; i++) { 

 System.out.print(age[i]+"\t"+"\t"+city[i]+"\t"+name[i]); 

 System.out.println(); 

 } 

 System.out.println("Enter target name :"); 

 String target = sc.next(); 

 int ans = linearSearch(name,target); 

 if (ans==-1){ 

 System.out.print("Target "+target+" is not present in input array with index:"+ans ); 

 }else { 

 System.out.print("Target "+target+" is present in input array with index:"+ans); 

 } 

 } 

 static int linearSearch(String[] arr, String target){ 

 if(arr.length ==0){ 

 return -1; 

 } 

 for (int index = 0; index < arr.length; index++) { 

 String element = arr[index]; 

 if(element.equals(target)){ 

 return index ; 

 } 

 } 

 return -1 ; 

 } 

 } 