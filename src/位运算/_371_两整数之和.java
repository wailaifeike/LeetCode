package 位运算;

/*
 *不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。

示例 1:

输入: a = 1, b = 2
输出: 3
示例 2:

输入: a = -2, b = 3
输出: 1

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sum-of-two-integers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。 
 * */
public class _371_两整数之和 {
	public static int getSum(int a, int b) {
	
		int A = a^b;
		int B = a&b;
		while (B!=0) {
		int tmpA = A;
		int tmpB = B<<1;	
		A = tmpA^tmpB;
		B = tmpA & tmpB;			
		}
		
		return A;
    }
	
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println(getSum(a, b));
				
	}
}
