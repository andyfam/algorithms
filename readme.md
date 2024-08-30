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