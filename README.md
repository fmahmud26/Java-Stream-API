# 🚀 Java Stream API – With Coding Examples

## 🔹 1. What is the Java Stream API?

### Explanation
The **Java Stream API** (introduced in Java 8) provides a **functional, declarative way** to process sequences of elements from a data source such as collections, arrays, or I/O channels.

Streams **do not store data**; they operate on data **on demand** using a pipeline of operations.

### Key Points
- Introduced in Java 8
- Supports functional programming (lambda, method references)
- Lazy execution
- Enables easy parallelism

### Example
```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

numbers.stream()
       .filter(n -> n % 2 == 0)
       .map(n -> n * 2)
       .forEach(System.out::println);
```

---

## 🔹 2. Difference Between Collection and Stream

### Explanation
A **Collection** is an in‑memory data structure, while a **Stream** is a **data processing pipeline**.

### Comparison Table
| Collection | Stream |
|---------|-------|
| Stores data | Processes data |
| Can be iterated multiple times | Can be consumed once |
| Eager evaluation | Lazy evaluation |
| Mutable | Immutable |

### Example
```java
List<String> list = new ArrayList<>(); // stores data
list.stream();                         // processes data
```

---

## 🔹 3. Intermediate vs Terminal Operations

### Explanation
- **Intermediate operations** build the pipeline
- **Terminal operations** trigger execution

### Examples
```java
Stream<Integer> stream = list.stream()
    .filter(n -> n > 10)   // intermediate
    .map(n -> n * 2);      // intermediate

List<Integer> result = stream.collect(Collectors.toList()); // terminal
```

### Key Points
- Intermediate → return Stream
- Terminal → return result or void
- No execution until terminal operation

---

## 🔹 4. Lazy Evaluation in Streams

### Explanation
Streams evaluate elements **only when required**, minimizing unnecessary computation.

### Example
```java
list.stream()
    .filter(n -> {
        System.out.println("filter: " + n);
        return n > 3;
    })
    .map(n -> {
        System.out.println("map: " + n);
        return n * 2;
    })
    .findFirst();
```

### Insight
- Stops processing after first match
- Improves performance

---

## 🔹 5. map() vs flatMap()

### Explanation
- `map()` → one‑to‑one transformation
- `flatMap()` → flattens nested structures

### map Example
```java
List<String> names = List.of("java", "spring");

names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

### flatMap Example
```java
List<List<String>> list = List.of(
    List.of("A", "B"),
    List.of("C", "D")
);

list.stream()
    .flatMap(List::stream)
    .forEach(System.out::println);
```

---

## 🔹 6. findFirst() vs findAny()

### Explanation
- `findFirst()` respects encounter order
- `findAny()` may return any element (better for parallel streams)

### Example
```java
Optional<Integer> first = list.stream().findFirst();
Optional<Integer> any = list.parallelStream().findAny();
```

---

## 🔹 7. limit() vs skip()

```java
list.stream().limit(3).forEach(System.out::println);
list.stream().skip(3).forEach(System.out::println);
```

---

## 🔹 8. map() vs peek()

### Explanation
- `map()` transforms elements
- `peek()` is for debugging

```java
list.stream()
    .peek(n -> System.out.println("Before: " + n))
    .map(n -> n * 2)
    .forEach(System.out::println);
```

---

## 🔹 9. Collectors.groupingBy()

```java
Map<String, List<Employee>> byDept = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment));
```

---

## 🔹 10. Short‑Circuiting Operations

### Examples
```java
list.stream().anyMatch(n -> n > 10);
list.stream().limit(5).forEach(System.out::println);
```

---

## 🔹 11. reduce() vs collect()

### reduce Example
```java
int sum = list.stream().reduce(0, Integer::sum);
```

### collect Example
```java
List<Integer> even = list.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
```

---

## 🔹 12. Parallel Streams

### When to Use
- Large datasets
- CPU‑bound tasks

### When to Avoid
- I/O operations
- Shared mutable state

```java
list.parallelStream().forEach(System.out::println);
```

---

## 🔹 13. Spliterator

### Explanation
Spliterator is an internal mechanism used by streams to **split data for parallel processing**.

```java
Spliterator<Integer> spliterator = list.spliterator();
```

---

## 🔹 14. Can Streams Modify Source?

❌ **No. Streams are immutable.**

```java
list.stream().forEach(list::add); // BAD PRACTICE
```

---

## 🔹 15. Coding Problems

### ✔ Second Highest Number
```java
int secondMax = list.stream()
    .distinct()
    .sorted(Comparator.reverseOrder())
    .skip(1)
    .findFirst()
    .orElseThrow();
```

### ✔ Character Frequency
```java
Map<Character, Long> freq = str.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
```

### ✔ Find Duplicates
```java
Set<Integer> seen = new HashSet<>();
Set<Integer> duplicates = list.stream()
    .filter(n -> !seen.add(n))
    .collect(Collectors.toSet());
```

### ✔ Partition Even & Odd
```java
Map<Boolean, List<Integer>> result = list.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
```

---

## 📌 Final Tip

> "Streams improve readability, enable functional programming, and allow safe parallelism — but they should be used wisely, not everywhere."

---
