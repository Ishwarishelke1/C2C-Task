# LeetCode 238 - Product of Array Except Self

## Problem
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

### Example
Input:
nums = [1,2,3,4]

Output:
[24,12,8,6]

---

## Approach (Prefix + Suffix Products)

### Step 1: Prefix Products
Store the product of all elements to the left of each index in the answer array.

Example:
nums = [1,2,3,4]

Prefix array:
[1,1,2,6]

### Step 2: Suffix Products
Traverse from right to left while maintaining a suffix product.
Multiply each prefix product with the current suffix product.

Final Answer:
[24,12,8,6]

---

## Algorithm
1. Initialize `answer[0] = 1`.
2. Compute prefix products.
3. Initialize `suffix = 1`.
4. Traverse from right to left:
   - Multiply `answer[i]` by `suffix`.
   - Update `suffix *= nums[i]`.
5. Return the answer array.

---

## Time Complexity
- O(n)

## Space Complexity
- O(1) extra space (excluding the output array)
