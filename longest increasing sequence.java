/*
The program must accept N integers as the input.
The program must print the longest contiguous increasing sequence in the given N integers as the output.
If there are two or more longest contiguous increasing sequences, the program must print the first occurring longest contiguous increasing sequence as the output.

Boundary Condition(s):
2 <= N <= 100
1 <= Each integer value <= 1000

Input Format:
The first line contains N.
The second line contains N integers separated by a space.

Output Format:
The first line contains the longest contiguous increasing sequence separated by a space.

Example Input/Output 1:
Input:
8
3 4 6 7 8 9 1 2
Output:
6 7 8 9

Example Input/Output 2:
Input:
7
8 9 10 2 4 5 6
Output:
8 9 10

Example Input/Output 3:
Input:
5
9 10 11 12 13
Output:
9 10 11 12 13
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=0,s=0,e=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j,c=0;
            for(j=i;j<n-1;j++){
                if(a[j]==a[j+1]-1)  c++;
                else  break;
            }
            if(c>m){
                m=c;
                s=i;e=j;
            }
        }
        for(int i=s;i<=e;i++){
            System.out.print(a[i]+" ");
        }
	}
}
