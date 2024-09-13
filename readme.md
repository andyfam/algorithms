# Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**

> **Input**: nums = [2,7,11,15], target = 9  
**Output**: [0,1]  
**Explanation**: Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**

> **Input**: nums = [3,2,4], target = 6  
**Output**: [1,2]

**Example 3:**

> **Input**: nums = [3,3], target = 6  
**Output**: [0,1]

**Constraints:**

- 2 <= nums.length <= 104
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.

**Solutions**
1. One brute force approach is to consider every pair of elements and check if their sum equals the target. This can be done using nested loops, where the outer loop iterates from the first element to the second-to-last element, and the inner loop iterates from the next element to the last element. However, this approach has a time complexity of O(n^2).
2. A more efficient approach is to use a hash table (unordered_map in C++). We can iterate through the array once, and for each element, check if the target minus the current element exists in the hash table. If it does, we have found a valid pair of numbers. If not, we add the current element to the hash table.

# Linked List Cycle

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the `next` pointer. Internally, `pos` is used to denote the index of the node that tail's `next` pointer is connected to. **Note that pos is not passed as a parameter**.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

**Example 1:**

![](/images/circularlinkedlist.png)

> **Input**: head = [3,2,0,-4], pos = 1  
**Output**: true  
**Explanation**: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

**Example 2:**

![](/images/circularlinkedlist_test2.png)

> **Input**: head = [1,2], pos = 0  
**Output**: true  
**Explanation**: There is a cycle in the linked list, where the tail connects to the 0th node.

**Example 3:**

![](/images/circularlinkedlist_test3.png)

> **Input**: head = [1], pos = -1  
**Output**: false  
**Explanation**: There is no cycle in the linked list.

**Constraints:**

- The number of the nodes in the list is in the range [0, 10^4].
- -10^5 <= Node.val <= 10^5
- pos is -1 or a valid index in the linked-list.

**Solutions**

1. The main idea to solve the question of detecting a cycle in a singly-linked list is to use the concept of two pointers: a "slow" pointer that moves one step at a time and a "fast" pointer that moves two steps at a time. By having these two pointers traverse the list simultaneously, if there is a cycle, the fast pointer will eventually catch up to the slow pointer. If there is no cycle, the fast pointer will reach the end of the list.
2. Another less efficient idea is use HashTable, go through the list and put the node into HashTable, if the list has cycle, then you can find a certain node exists in the HashTable.

# Missing Number

Given an array `nums` containing n distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

**Example 1:**

> **Input**: nums = [3,0,1]
**Output**: 2  
**Explanation**: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

**Example 2:**

> **Input**: nums = [0,1]
**Output**: 2  
**Explanation**: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

**Example 3:**

> **Input**: nums = [9,6,4,2,3,5,7,0,1]
**Output**: 8  
**Explanation**: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

**Constraints**

1. n == nums.length
2. 1 <= n <= 10^4
3. 0 <= nums[i] <= n
4. All the numbers of nums are unique.

**Solutions**

1. The easiest method is using a loop, from 0 to n, to check if the number  is in the array or not.
2. The second method is using another array `v` with the size of n+1, initial its elements all with -1, then add the elements in `nums` to the `v` according to value, put n in the index n, then find the index of the element which still remains -1.   ![](/images/missingnumber.png)
3. The third method is to use XOR, because the result of every number XOR itself is 0, so we can add a new array [0,1, ..., n], then XOR it with nums, the result will be the missing num.
4. The fourth method to sum 1 to n, then subtracted by the sum of all elements in `nums`.
5. The fifth method is to sort `nums` first, then if the missing number is `n`, `nums[n-1]` will not equal `n`, otherwise the missing num is the first element which does not match its index.

# Valid Parentheses

Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

**Example 1:**

> **Input**: s = "()"  
**Output**: true  

**Example 2:**

> **Input**: "()[]{}"  
**Output**: true  

**Example 3:**

> **Input**: "(]"  
**Output**: false

**Example 4:**

> **Input**: "([])"  
**Output**: true

**Constraints**

1. 1 <= s.length <= 10^4
2. s consists of parentheses only '()[]{}'.

**Solutions**

1. Whenever encountering an open parentheses, push its close parentheses into a stack, then if there is a close parentheses, pop the element out of the stack, if they are not equal, return false, the stack must be empty at last, or return false.

# Merge Two Sorted List

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

**Example 1:**

> **Input**: list1 = [1,2,4], list2 = [1,3,4]  
**Output**: [1,1,2,3,4,4]

**Example 2:**

> **Input**: list1 = [], list2 = []  
**Output**: []

**Example 3:**

> **Input**: list1 = [], list2 = [0]  
**Output**: [0]

**Constraints**

1. The number of nodes in both lists is in the range [0, 50].
2. -100 <= Node.val <= 100
3. Both list1 and list2 are sorted in non-decreasing order.

**Solutions**

1. Create a new list, go through `list1` and `list2`, compare the value, put the one with less value behind the new list, then move the pointer of the list with less value to the next, continuously compare until whichever of `list1` or `list2` reach `null`, attach the remaining of the other list to the end. 
2. We can also use a recursion method which returns the node with the less `val`, and the node is followed by the result of the method with the rest list nodes as its parameters. 

# Subtree Of Another Tree

Given the roots of two binary trees `root` and `subRoot`, return `true` if there is a subtree of `root` with the same structure and node values of `subRoot` and `false` otherwise.

A subtree of a binary tree `tree` is a tree that consists of a node in `tree` and all of this node's descendants. The tree `tree` could also be considered as a subtree of itself.

**Example 1:**

![](/images/subtree1-tree.jpg)

> **Input**: root = [3,4,5,1,2], subRoot = [4,1,2]  
**Output**: true

**Example 2:**

![](/images/subtree2-tree.jpg)

> **Input**: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]  
**Output**: false

**Constraints**

- The number of nodes in the `root` tree is in the range `[1, 2000]`.
- The number of nodes in the subRoot tree is in the range `[1, 1000]`.
- -10^4 <= root.val <= 10^4
- -10^4 <= subRoot.val <= 10^4

**Solutions**

1. Write a function to identify if two Binary Trees are identical which means their root, left and right nodes are all identical, then traverse the `tree` to identify if there's a subtree in it which matches the `subTree`.
2. Another method is using iterative to traverse the `tree` with the same function to act as the function which is used to identify the match of two trees.

# Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

**Note:**

- Note that in some languages, such as Java, there is no unsigned integer type. In this case, both input and output will be given as a signed integer type. They should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
- In Java, the compiler represents the signed integers using `2's complement notation`. Therefore, in Example 2 above, the input represents the signed integer `-3` and the output represents the signed integer `-1073741825`.

**Example 1:**

> **Input**: n = 00000010100101000001111010011100  
**Output**: 964176192 (00111001011110000010100101000000)

**Example 2:**

> **Input**: n = 11111111111111111111111111111101  
**Output**: 3221225471 (10111111111111111111111111111111)

**Constraints**

- The input must be a binary string of length 32

**Solutions**

1. Use a stack to push all the bits into it, then pop out.
2. Use mask and shift to revert.

# Number of 1 Bits

Write a function that takes the binary representation of a positive integer and returns the number of
`set bits`, it has (also known as the `Hamming weight`).

**Example 1:**

> **Input**:  n = 11  
**Output**: 3  
**Explanation:** The input binary string 1011 has a total of three set bits.

**Example 2:**

> **Input**: n = 128  
**Output**: 1  
**Explanation:** The input binary string 10000000 has a total of one set bit.

**Example 3:**

> **Input**: n = 2147483645  
**Output**: 30  
**Explanation:** The input binary string 1111111111111111111111111111101 has a total of thirty set bits.

**Constraints**

- 1 <= n <= 2^31 - 1

**Solutions**

1. convert the int into binary string, then count the number of `1`. 
2. because n & (n-1) will reduce the number of `1` by 1, so loop execute it until n=0 will get the number of `1`.
3. unsigned right shift the integer and check if the last right bit is `0` or not until the integer become 0.

# Climbing Stairs

You are climbing a staircase. It takes `n` steps to reach the top.

Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

**Example 1:**

> **Input**:  n = 2  
**Output**: 2  
**Explanation:** There are two ways to climb to the top.  
    1. 1 step + 1 step  
    2. 2 steps

**Example 2:**

> **Input**: n = 3  
**Output**: 3  
**Explanation:** There are three ways to climb to the top.  
    1. 1 step + 1 step + 1 step  
    2. 1 step + 2 steps
    3. 2 steps + 1 step

**Constraints**

- 1 <= n <= 45

**Solutions**

1. use recursion, sum the ways for reaching `(n-1)` and `(n-2)`. However, this solution has exponential time complexity (O(2^n)) due to redundant calculations, in order to avoid redundancy, we need a map to store the processed `n`.
2. note that the ways for reaching `n` is the sum of ways for reaching `(n-1)` and `(n-2)`, so we could iterate from `2` to `n` to get the final nums for `n`, in order to store these data, we could use an array or just two nums;

# Reverse Linked List

Given the `head` of a singly linked list, reverse the list, and return the reversed list.

**Example 1:**

> **Input**:  head = [1,2,3,4,5]   
**Output**: [5,4,3,2,1]

**Example 2:**

> **Input**:  head = [1,2]   
**Output**: [2,1]

**Example 3:**

> **Input**:  head = []   
**Output**: []

**Constraints**

- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

**Solutions**

1. use stack
2. iterate the listnodes, reverse every node
   ![](/images/reverselinkedlist.png)

# Counting Bits

Given an integer `n`, return an array `ans` of length `n + 1` such that for each i (0 <= i <= n), `ans[i]` is the number of `1's` in the binary representation of `i`.

**Example 1:**

> **Input**:  n = 2  
**Output**: [0,1,1]  
**Explanation:**  
0 --> 0  
1 --> 1  
2 --> 10

**Example 2:**

> **Input**:  n = 5  
**Output**: [0,1,1,2,1,2]  
**Explanation:**  
0 --> 0  
1 --> 1  
2 --> 10  
3 --> 11  
4 --> 100  
5 --> 101

**Constraints**

- 0 <= n <= 10^5  

**Solutions**

1. create a function to calculate the number of 1's for an int
2. as even number, the last unit is 0, so when you right shift, the number of 1 will not change, which means ans[i] = ans[i/2], as an odd number, because the last bit is 1, so when you right shift 1, the number of 1 will decrease 1, which means ans[i] = ans[i/2] + 1, as a result, ans[i] = ans[i/2] + i%2

# Contains Duplicate

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

**Example 1:**

> **Input**:  [1,2,3,1]  
**Output**: true  
**Explanation:**  The element 1 occurs at the indices 0 and 3.

> **Input**:  [1,2,3,4]  
**Output**: false  
**Explanation:**  All elements are distinct.

> **Input**:  [1,1,1,3,3,4,3,2,4,2]  
**Output**: true  

**Constraints**

- 1 <= nums.length <= 10^5
- -10^9 <= nums[i] <= 10^9

**Solutions**

1. use Hashset
2. sort first, then check the adjacent elements

# Invert Binary Tree

Given the `root` of a binary tree, invert the tree, and return its root.

**Example 1:**

![](/images/invert1-tree.jpg)

> **Input**:  root = [4,2,7,1,3,6,9]  
**Output**: [4,7,2,9,6,3,1]  

**Example 2:**

![](/images/invert2-tree.jpg)

> **Input**:  root = [2,1,3]  
**Output**: [2,3,1]  

**Example 3:**

> **Input**:  root = []  
**Output**: []  

**Constraints**

- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

**Solutions**

1. just invert the left and right node of the root, because left and right node are also trees so use recursive

# Same Tree

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

**Example 1:**

![](/images/ex1.jpg)

> **Input**:  p = [1,2,3], q = [1,2,3]  
**Output**: true

**Example 2:**

![](/images/ex2.jpg)

> **Input**:  p = [1,2], q = [1,null,2]  
**Output**: false

**Example 3:**

![](/images/ex3.jpg)

> **Input**:  p = [1,2,1], q = [1,1,2]  
**Output**: false

**Constraints**

- The number of nodes in both trees is in the range [0, 100].
- -10^4 <= Node.val <= 10^4

**Solutions**

1. check the value, left node and right node,  because left and right node are also tree, so use recursive.

# Maximum Depth of Binary Tree

Given the `root` of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

**Example 1:**

![](/images/tmp-tree.jpg)

> **Input**:  root = [3,9,20,null,null,15,7]  
**Output**: 3

**Example 2:**

> **Input**:  root = [1,null,2]  
**Output**: 2

**Constraints**

- The number of nodes in the tree is in the range [0, 104].
- -100 <= Node.val <= 100

**Solutions**

1. if the node has left or right, then the depth plus one, use recursion