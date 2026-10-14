# Maximum Depth of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *its maximum depth*.

A binary tree's  **maximum depth**  is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: 3

```

 **Example 2:** 

```
Input: root = [1,null,2]
Output: 2

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 3.92%)  
**Memory:** 46.5 MB (beats 97.19%)  
**Submitted:** 2026-10-14T18:58:55.085Z  

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
    public int maxDepth(TreeNode root) {
        int level=0;
        Queue<TreeNode> que= new LinkedList<>();
        if(root==null) return 0;
        que.offer(root);
        while(!que.isEmpty()){
            int size= que.size();
            while(size>0){
                TreeNode node=que.poll();
                size--;
                if(node.left!=null){
                    que.offer(node.left);
                }
                if(node.right!=null){
                    que.offer(node.right);
                }
            }
            if(!que.isEmpty()){
                level++;
            }
        }
        return level+1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/)