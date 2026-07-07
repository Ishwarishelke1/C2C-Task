# Two Sum (LeetCode 1)

## Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

### Example
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

---

## Approach (HashMap)

We use a HashMap to store each number and its index while traversing the array.

1. Create an empty HashMap.
2. Traverse the array.
3. For each element, calculate:
   rem = target - nums[i]
4. Check if `rem` already exists in the HashMap.
   - If yes, return the index stored in the map and the current index.
5. Otherwise, store the current element and its index in the HashMap.
6. If no pair is found, return an empty array.

---

## Algorithm

1. Initialize an empty HashMap.
2. Traverse the array once.
3. Find the complement (`target - nums[i]`).
4. If the complement exists in the map, return both indices.
5. Otherwise, insert the current element into the map.
6. Return an empty array if no solution exists.

---

## Time Complexity

O(n)

- We traverse the array only once.
- HashMap operations (`put()` and `containsKey()`) take O(1) on average.

## Space Complexity

O(n)

- In the worst case, the HashMap stores all elements.

---
