# Merge Sorted Array (LeetCode 88)

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums2` into `nums1` as one sorted array.

The final sorted array should not be returned by the function but instead be stored inside the array `nums1`.

---

## Example 1

**Input:**

nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

**Output:**

[1,2,2,3,5,6]

---

# Approach (Three Pointers)

Since `nums1` already has enough space to store all elements, we start filling it from the **end**.

We use three pointers:

- `i = m - 1` → Last valid element in `nums1`
- `j = n - 1` → Last element in `nums2`
- `k = m + n - 1` → Last index of `nums1`

### Key Idea

Compare `nums1[i]` and `nums2[j]`:

- If `nums1[i] > nums2[j]`, place `nums1[i]` at `nums1[k]`.
- Otherwise, place `nums2[j]` at `nums1[k]`.

Move the corresponding pointers backward.

Continue until all elements of `nums2` are merged.

---

# Algorithm

1. Initialize:
   - `i = m - 1`
   - `j = n - 1`
   - `k = m + n - 1`
2. While `j >= 0`:
   - If `i >= 0` and `nums1[i] > nums2[j]`
     - `nums1[k] = nums1[i]`
     - `i--`
   - Else
     - `nums1[k] = nums2[j]`
     - `j--`
   - `k--`
3. The merged sorted array is stored in `nums1`.

---

# Dry Run

Input:

```text
nums1 = [1,2,3,0,0,0]
nums2 = [2,5,6]
```

| i | j | k | nums1 |
|---|---|---|--------|
| 2 | 2 | 5 | [1,2,3,0,0,6] |
| 2 | 1 | 4 | [1,2,3,0,5,6] |
| 2 | 0 | 3 | [1,2,3,3,5,6] |
| 1 | 0 | 2 | [1,2,2,3,5,6] |

Final Output:

```text
[1,2,2,3,5,6]
```

---

# Time Complexity

**O(m + n)**

- Each element is processed only once.

---

# Space Complexity

**O(1)**

- No extra array is used.

---

