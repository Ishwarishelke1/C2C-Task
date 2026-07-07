# Maximum Subarray (LeetCode 53)

## Problem Statement

Given an integer array `nums`, find the contiguous subarray (containing at least one number) that has the largest sum and return its sum.

### Example 1

**Input:**
```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

**Output:**
```text
6
```

**Explanation:**
The subarray `[4, -1, 2, 1]` has the largest sum = **6**.

---

### Example 2

**Input:**
```text
nums = [1]
```

**Output:**
```text
1
```

---

## Approach (Kadane's Algorithm)

Kadane's Algorithm finds the maximum sum of a contiguous subarray in a single traversal.

1. Initialize `currSum` and `maxSum` with the first element of the array.
2. Traverse the array from the second element.
3. At each index:
   - Either start a new subarray from the current element.
   - Or extend the previous subarray by adding the current element.
4. Update the maximum sum whenever a larger sum is found.
5. Return `maxSum`.

---

## Algorithm

1. Set:
   - `currSum = nums[0]`
   - `maxSum = nums[0]`
2. Traverse from index `1` to `n-1`.
3. Update:
   - `currSum = max(nums[i], currSum + nums[i])`
   - `maxSum = max(maxSum, currSum)`
4. Return `maxSum`.

---

## Dry Run

**Input:**
```text
nums = [-2,1,-3,4,-1,2,1,-5,4]
```

| Index | Element | Current Sum | Maximum Sum |
|------:|--------:|------------:|------------:|
| 0 | -2 | -2 | -2 |
| 1 | 1 | 1 | 1 |
| 2 | -3 | -2 | 1 |
| 3 | 4 | 4 | 4 |
| 4 | -1 | 3 | 4 |
| 5 | 2 | 5 | 5 |
| 6 | 1 | 6 | 6 |
| 7 | -5 | 1 | 6 |
| 8 | 4 | 5 | 6 |

**Final Answer:** `6`

---

## Time Complexity

**O(n)**

- The array is traversed only once.

---

## Space Complexity

**O(1)**

- Only two variables (`currSum` and `maxSum`) are used.

---

