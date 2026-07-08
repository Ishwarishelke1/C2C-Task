# Rotate Array (LeetCode 189)

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

---

## Example 1

Input:
nums = [1,2,3,4,5,6,7]
k = 3

Output:
[5,6,7,1,2,3,4]


# Approach (Using Extra Array)

We create a temporary array and place each element at its new rotated position.

### Key Idea

After rotating by `k` positions:

```text
newIndex = (i + k) % n
```

where:

- `i` = current index
- `k` = number of rotations
- `n` = size of the array

The modulo operator `%` is used to wrap around the array.

---

# Algorithm

1. Find the length of the array `n`.
2. Update `k = k % n`.
3. Create a temporary array `temp` of size `n`.
4. Traverse the array:
   - Place `nums[i]` at index `(i + k) % n` in `temp`.
5. Copy all elements from `temp` back to `nums`.
6. Return the rotated array.

---

# Dry Run

Input:

```text
nums = [1,2,3,4,5,6,7]
k = 3
n = 7
```

| i | nums[i] | New Index `(i+k)%n` |
|---|---------|---------------------|
| 0 | 1 | 3 |
| 1 | 2 | 4 |
| 2 | 3 | 5 |
| 3 | 4 | 6 |
| 4 | 5 | 0 |
| 5 | 6 | 1 |
| 6 | 7 | 2 |

Temporary Array:

```text
[5,6,7,1,2,3,4]
```

Final Output:

```text
[5,6,7,1,2,3,4]
```

---

# Time Complexity

**O(n)**

- One traversal to fill the temporary array.
- One traversal to copy elements back.

---

# Space Complexity

**O(n)**

- Extra array `temp[]` of size `n` is used.

---

