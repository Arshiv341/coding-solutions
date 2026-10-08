# Find Bottom Left Tree Value

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `root` of a binary tree.

Return the  **leftmost**  value in the  **last**  row of the tree.

 

 **Example 1:** 

```
Input: root = [2,1,3]
Output: 1
Explanation: The last row is [1,3], so the leftmost value is 1.

```

 **Example 2:** 

```
Input: root = [1,2,3,4,null,5,6,null,null,7]
Output: 7
Explanation: The last row contains only the node 7.

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 104].
- -231 <= Node.val <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 83.32%)  
**Memory:** 46.7 MB (beats 27.79%)  
**Submitted:** 2026-10-08T08:00:01.222Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth=-1;
    int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode node, int depth){
        if(node==null) return;
        if(depth > maxDepth){
            maxDepth=depth;
            ans=node.val;
        }
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-bottom-left-tree-value/)