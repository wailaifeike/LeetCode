package DFS_BFS;

/*
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。

给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。

完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。

 

示例 1：

输入：n = 12
输出：3 
解释：12 = 4 + 4 + 4
示例 2：

输入：n = 13
输出：2
解释：13 = 4 + 9

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/perfect-squares
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 
 * */
public class _279_完全平方数 {
	 public int numSquares(int n) {
		 int[] dp = new int[n + 1]; // 默认初始化值都为0
	        for (int i = 1; i <= n; i++) {
	          dp[i] = i; // 最坏的情况就是每次+1
	            for (int j = 1; i - j * j >= 0; j++) { 
	                dp[i] = Math.min(dp[i], dp[i - j * j] + 1); // 动态转移方程
	            }
	        }
	        return dp[n];
	  }
}
