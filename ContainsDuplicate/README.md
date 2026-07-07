# Contains Duplicate (LeetCode 217)

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Example 1

**Input:**
```text
nums = [1,2,3,1]
```

**Output:**
```text
true
```
# Approach (Using HashSet)

A `HashSet` stores only unique elements.

1. Create an empty `HashSet`.
2. Traverse each element in the array.
3. If the current element already exists in the HashSet, it means a duplicate is found.
4. Return `true`.
5. Otherwise, add the element to the HashSet.
6. If the loop finishes without finding duplicates, return `false`.

---

# Algorithm

1. Initialize an empty `HashSet`.
2. Iterate through every element in the array.
3. Check if the element is already present in the HashSet.
   - If yes, return `true`.
   - Otherwise, add the element to the HashSet.
4. Return `false` after completing the traversal.

---

# Dry Run

**Input:**
```text
nums = [1,2,3,1]
```

| Current Element | HashSet | Duplicate Found? |
|-----------------|---------|------------------|
| 1 | {1} | No |
| 2 | {1,2} | No |
| 3 | {1,2,3} | No |
| 1 | {1,2,3} | Yes → Return true |

---

# Time Complexity

**O(n)**

- We traverse the array only once.
- HashSet operations (`contains()` and `add()`) take **O(1)** on average.

---

# Space Complexity

**O(n)**

- In the worst case, all elements are unique and stored in the HashSet.

---
