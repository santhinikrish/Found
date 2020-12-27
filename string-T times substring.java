/*
The program must accept a string S and an integer T as the input.
The program must print YES if S is formed by repeatedly concatenating a substring T times.
Else the program must print NO as the output.

Boundary Condition(s):
2 <= Length of S <= 100
1 <= T <= 20

Input Format:
The first line contains S.
The second line contains T.

Output Format:
The first line contains the string value "YES" or "NO" .

Example Input/Output 1:
Input:
GoodGoodGood
3
Output: YES

Example Input/Output 2:
Input:
honeyhoney
5
Output: NO

Example Input/Output 3:
Input:
SkillRack
1
Output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        char s[]=sc.next().toCharArray();
        int n=sc.nextInt();
        if(s.length%n!=0){
            System.out.print("NO");
            return;
        }
        int l=s.length/n;
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(s[j]!=s[i*l+j]){
                    System.out.print("NO");
                    return;
                }
            }
        }
        System.out.print("YES");
	}
}
