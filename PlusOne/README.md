# Plus One (LeetCode 66)

## Problem Statement

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the ith digit of the integer.

The digits are ordered from most significant to least significant.

Increment the large integer by one and return the resulting array of digits.

---

## Example 1

Input:
digits = [1,2,3]

Output:
[1,2,4]

Explanation:
123 + 1 = 124

---

## Example 2

Input:
digits = [9,9,9]

Output:
[1,0,0,0]

---

# Approach

We start from the last digit because adding one affects the rightmost digit first.

1. Traverse the array from right to left.
2. If the current digit is less than 9:
   - Increment it by 1.
   - Return the array immediately.
3. If the current digit is 9:
   - Change it to 0 and continue.
4. If all digits are 9, create a new array of size `n+1`.
5. Set the first element to 1 and return it.

---

# Algorithm

1. Iterate from `n-1` to `0`.
2. If `digits[i] < 9`:
   - `digits[i]++`
   - Return `digits`.
3. Otherwise:
   - `digits[i] = 0`
4. Create a new array of size `n+1`.
5. Set `result[0] = 1`.
6. Return `result`.

---

# Dry Run

Input:

digits = [9,9,9]

| Index | Digit | After Operation |
|-------|--------|-----------------|
| 2 | 9 | 0 |
| 1 | 9 | 0 |
| 0 | 9 | 0 |

All digits became 0, so create:

result = [1,0,0,0]

Output:

[1,0,0,0]

---

# Time Complexity

O(n)

- In the worst case, we traverse the entire array once.

---

# Space Complexity

O(1)

- No extra space is used except when all digits are 9.

