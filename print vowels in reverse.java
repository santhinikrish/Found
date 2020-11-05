/*
The program must accept a string S and two positions X and Y as the input.
The program must print the vowels from the Xth position to the Yth position (inclusive of X and Y) in reverse order as the output.
Note: At least one vowel is always present between the two positions.

Boundary Condition(s):
2 <= Length of S <= 100
1 <= X < Y <= Length of S

Input Format:
The first line contains S. The second line contains X and Y separated by a space.

Output Format:
The first line contains the vowels from the Xth position to Yth position in reverse order.

Example Input/Output 1:
Input:
Education
3 8
Output:
oiau

Example Input/Output 2:
Input:
BASEBALL
1 4
Output:
EA

Example Input/Output 3:
Input:
GoldCoin
4 6
Output:
o
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char a[]=sc.next().toCharArray();
        int x=sc.nextInt(),y=sc.nextInt();
        for(int i=y-1;i>=x-1;i--){
            char s=a[i];
            a[i]=Character.toLowerCase(a[i]);
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                System.out.print(s);
            }
        }
	 }
}
