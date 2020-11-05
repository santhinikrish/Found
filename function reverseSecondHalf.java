/*
You are required to complete the given code. You can click on Run anytime to check the compilation/execution status of the program.
You can use printf to debug your code. The submitted code should be logically/syntactically correct and pass all test cases. Do not write the main() function as it is not required.

Code Approach: For this question, you will need to complete the code as in the given implementation. We do not expect you to modify the approach.

The function/method reverseSecondHalf accepts two arguments - arr and SIZE, arr representing an integer array and SIZE representing the size of the array arr. The function/method reverseSecondHalf must reverse the second half of the given array.

Note: The size of the given array is always even. Your task is to implement the function reverseSecondHalf so that it passes all the test cases.

Example Input/Output 1:
Input:
8
73 55 39 42 17 58 45 86
Output:
73 55 39 42 86 45 58 17

Example Input/Output 2:
Input:
6
72 28 3 40 53 62
Output:
6 72 28 3 62 53 40

Example Input/Output 3:
Input:
4
82 47 69 98
Output:
82 47 98 69
*/

void reverseSecondHalf(int* arr, int SIZE)
{
   int l=SIZE/2,r=SIZE-1;
   while(l<r){
       int t=arr[l];
       arr[l]=arr[r];
       arr[r]=t;
       l++;r--;
   }
}
