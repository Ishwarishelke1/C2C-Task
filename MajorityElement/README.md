# Majority Element (LeetCode 169)

## Problem Statement

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

## Example 1

**Input:**
```text
nums = [3,2,3]
```

**Output:**
```text
3
```

---

# Approach (Using HashMap)

We use a `HashMap<Integer, Integer>` to store the frequency of each element.

### Steps

1. Create an empty HashMap.
2. Traverse the array.
3. For each element:
   - Increase its frequency using `getOrDefault()`.
   - Check if its frequency becomes greater than `n / 2`.
   - If yes, return that element immediately.
4. If no majority element is found, return `-1`.

---

# Algorithm

1. Initialize an empty HashMap.
2. Traverse the array `nums`.
3. Update the frequency of `nums[i]`.
4. If `frequency > nums.length / 2`, return `nums[i]`.
5. Return `-1`.

---

# Dry Run

**Input:**
```text
nums = [3,2,3]
```

### Iteration 1

```text
3 → frequency = 1
Map = {3=1}
```

### Iteration 2

```text
2 → frequency = 1
Map = {3=1, 2=1}
```

### Iteration 3

```text
3 → frequency = 2
Map = {3=2, 2=1}
```

Since:

```text
2 > 3/2
2 > 1
```

Return:

```text
3
```

---

# Time Complexity

**O(n)**

- We traverse the array only once.
- HashMap operations (`put()` and `get()`) take O(1) on average.

---

# Space Complexity

**O(n)**

- In the worst case, all elements are distinct and stored in the HashMap.

---

