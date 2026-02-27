# Unit 4: Data Collections — Arrays

**AP Exam Weighting: 30-40%** (full unit) | AP Topics covered so far: 4.3-4.5

---

## Conceptual Overview

Unit 4 introduces arrays — fixed-size collections that store multiple values of the same type under a single variable name. Students learn to create arrays, access individual elements by index, and traverse arrays with different loop types. The unit builds to implementing standard algorithms (find max, search, count, filter, sort) on arrays, including arrays of custom objects. This is the highest-weighted unit on the AP exam.

---

## Key Terms

| Term | Definition |
|------|-----------|
| **Array** | An ordered, fixed-size collection of elements of the same type |
| **Element** | A single value stored in an array |
| **Index** | The position of an element (starting at 0) |
| **Length** | The number of elements in an array, accessed via `.length` |
| **Initializer list** | Creating an array with values: `{1, 2, 3}` |
| **Default value** | The value elements get when an array is created with `new` |
| **Traversal** | Visiting each element in an array |
| **Indexed for loop** | `for (int i = 0; i < arr.length; i++)` — accesses elements by index |
| **Enhanced for loop** | `for (int x : arr)` — reads each element without needing the index |
| **Parallel arrays** | Two or more arrays where the same index corresponds to related data |
| **Linear search** | Checking elements one by one to find a target value |
| **ArrayIndexOutOfBoundsException** | Error from accessing an index outside 0 to length-1 |
| **Aliasing** | When two array variables point to the same array in memory |

---

## Syntax Reference

### Creating Arrays

```java
// With an initializer list
int[] nums = {10, 20, 30, 40, 50};
String[] names = {"Alice", "Bob", "Charlie"};

// With new (elements get default values)
int[] scores = new int[5];         // all 0
double[] prices = new double[3];   // all 0.0
boolean[] flags = new boolean[4];  // all false
String[] words = new String[3];    // all null
```

### Default Values

| Type | Default Value |
|------|--------------|
| `int` | `0` |
| `double` | `0.0` |
| `boolean` | `false` |
| Reference types (`String`, objects) | `null` |

### Accessing and Modifying

```java
int first = nums[0];              // access first element
int last = nums[nums.length - 1]; // access last element
nums[2] = 99;                     // modify element at index 2
int len = nums.length;            // number of elements (attribute, NOT a method)
```

### Array Traversals

```java
// Indexed for loop — use when you need the index
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for loop — use for read-only access to all elements
for (int num : arr) {
    System.out.println(num);
}

// While loop — use for early exit (search)
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    i++;
}

// Backwards traversal
for (int i = arr.length - 1; i >= 0; i--) {
    System.out.println(arr[i]);
}

// Every other element
for (int i = 0; i < arr.length; i += 2) {
    System.out.println(arr[i]);
}
```

### When to Use Which Loop

| Situation | Best Loop |
|-----------|-----------|
| Read all elements, no index needed | Enhanced for |
| Need the index (modify, compare, parallel arrays) | Indexed for |
| Backwards or skip elements | Indexed for |
| Stop early when found | While (or indexed for with `break`) |

### Array References

```java
int[] a = {1, 2, 3};
int[] b = a;        // ALIAS — same array!
b[0] = 99;
// a[0] is now 99

// True copy:
int[] copy = new int[a.length];
for (int i = 0; i < a.length; i++) {
    copy[i] = a[i];
}
```

---

## Standard Algorithm Patterns

### Find Maximum

```java
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

### Find Minimum

```java
int min = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] < min) {
        min = arr[i];
    }
}
```

### Sum and Average

```java
int sum = 0;
for (int num : arr) {
    sum += num;
}
double avg = (double) sum / arr.length;
```

### Count Matches

```java
int count = 0;
for (int num : arr) {
    if (num > 0) {
        count++;
    }
}
```

### Check if ANY (Has)

```java
boolean hasNeg = false;
for (int num : arr) {
    if (num < 0) {
        hasNeg = true;
    }
}
```

### Check if ALL

```java
boolean allPass = true;
for (int num : arr) {
    if (num < 60) {
        allPass = false;
    }
}
```

### Linear Search (Return Index)

```java
int index = -1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        index = i;
        break;
    }
}
```

### Reverse In-Place

```java
for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
```

### Shift Left (Circular)

```java
int first = arr[0];
for (int i = 0; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[arr.length - 1] = first;
```

### Build Filtered Array (Two-Pass)

```java
// Pass 1: count how many match
int count = 0;
for (int num : arr) {
    if (num > 0) count++;
}
// Pass 2: create and fill
int[] filtered = new int[count];
int idx = 0;
for (int num : arr) {
    if (num > 0) {
        filtered[idx] = num;
        idx++;
    }
}
```

### Selection Sort (Descending)

```java
for (int i = 0; i < arr.length - 1; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```

### Algorithms on Object Arrays

```java
// Find student with highest grade
Student top = roster[0];
for (int i = 1; i < roster.length; i++) {
    if (roster[i].getGrade() > top.getGrade()) {
        top = roster[i];
    }
}
```

---

## Enhanced For Loop — Key Limitation

```java
// This does NOT modify the array:
for (int num : arr) {
    num = num * 2;  // modifies the COPY, not the array element!
}

// This DOES modify objects in the array (calling methods on references):
for (Student s : roster) {
    s.setGrade(s.getGrade() + 5);  // works — modifying through the reference
}
```

---

## Common Pitfalls

1. **Off-by-one**: Valid indices are `0` to `arr.length - 1`. Using `arr.length` as an index crashes
2. **`.length` not `.length()`**: Arrays use `.length` (attribute). Strings use `.length()` (method)
3. **Enhanced for can't modify primitives**: Assigning to the loop variable only changes the copy
4. **Forgetting to cast for average**: `sum / arr.length` gives integer division — cast to `double`
5. **Find-max initialized to 0**: If all values are negative, 0 would be wrong — use `arr[0]`
6. **Aliasing surprise**: `int[] b = a` does NOT copy — changes to `b` affect `a`
7. **Empty array edge case**: Algorithms that access `arr[0]` will crash on an empty array
8. **Parallel array mismatch**: When using two parallel arrays, always access the same index

---

## AP Exam Tips

- The **Data Analysis with Array** free-response question requires writing methods that traverse and process arrays
- Know all standard algorithm patterns by heart — they appear in almost every exam
- Enhanced for loops are preferred when you don't need the index and aren't modifying the array
- When working with object arrays, use accessor methods (`.getX()`) to access data
- For parallel arrays, you MUST use an indexed for loop (enhanced for can't access two arrays)
- Tracing through array traversals (predicting output) is heavily tested in multiple choice
- Remember: arrays are fixed-size. If you need to add/remove elements, you need `ArrayList` (coming next)
