# Ransom Note (LeetCode 383)

## Problem Statement

Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` can be constructed by using the letters from `magazine`, and `false` otherwise.

Each letter in `magazine` can only be used once in `ransomNote`.

---

## Example 1

**Input:**
```text
ransomNote = "a"
magazine = "b"
```

**Output:**
```text
false
```

---

## Example 2

**Input:**
```text
ransomNote = "aa"
magazine = "aab"
```

**Output:**
```text
true
```

---

# Approach (Using HashMap)

We use a `HashMap<Character, Integer>` to store the frequency of each character in the `magazine` string.

### Steps

1. Traverse the `magazine` string and store the frequency of each character in the HashMap.
2. Traverse the `ransomNote` string.
3. For each character:
   - Check if the character exists in the HashMap.
   - Check if its frequency is greater than 0.
   - If not, return `false`.
   - Otherwise, decrease its frequency by 1.
4. If all characters are successfully matched, return `true`.

---

# Algorithm

1. Create an empty HashMap.
2. Count the frequency of every character in `magazine`.
3. Traverse `ransomNote`.
4. If a character is unavailable or its count becomes zero, return `false`.
5. Otherwise, decrement its frequency.
6. Return `true` after the traversal is complete.

---

# Dry Run

**Input:**
```text
ransomNote = "aa"
magazine = "aab"
```

### Step 1: Build Frequency Map

```text
a → 2
b → 1
```

### Step 2: Process Ransom Note

First 'a':
```text
a → 1
b → 1
```

Second 'a':
```text
a → 0
b → 1
```

All characters are available.

**Output:**
```text
true
```

---

# Time Complexity

**O(m + n)**

- `m` = length of `magazine`
- `n` = length of `ransomNote`

We traverse both strings only once.

---

# Space Complexity

**O(k)**

- `k` = number of distinct characters stored in the HashMap.

---

