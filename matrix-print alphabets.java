/*
The program must accept an integer matrix of size RxC as the input.
For each integer X in the matrix, the program must print the corresponding Xth lower case alphabet as the output.

Boundary Condition(s):
2 <= R, C <= 50
1 <= Matrix element value <= 26

Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.

Output Format:
The first R lines, each containing C alphabets separated by a space

Example Input/Output 1:
Input:
4 5
10 16 12 14 2
5 11 9 4 6
21 26 20 26 26
12 21 20 2 8
Output:
j p l n b
e k i d f
u z t z z
l u t b h

Example Input/Output 2:
Input:
3 6
22 8 3 15 4 13
9 4 13 23 8 21
23 10 7 1 3 25
Output:
v h c o d m
i d m w h u
w j g a c y

Example Input/Output 3:
Input:
2 5
4 21 20 3 5
21 3 25 11 13
Output:
d u t c e
u c y k m
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                System.out.print((char)(a[i][j]+96)+" ");
            }
            System.out.println();
        }
	  }
}
