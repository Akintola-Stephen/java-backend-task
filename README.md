# MountainArray

This project provides functionality to determine if a given array represents a valid mountain array.

## Description

A mountain array must satisfy the following conditions:
1. It has at least 3 elements.
2. It has exactly one peak element which is neither the first nor the last element.
3. Elements strictly increase before the peak and strictly decrease after the peak.

## Method

### `validMountainArray`

Checks if the given array represents a valid mountain array.

#### Parameters
- `int[] arr`: The input array to be checked.

#### Returns
- `boolean`: `true` if the input array represents a valid mountain array, `false` otherwise.

## Usage

To use the `validMountainArray` method, you can call it with an array of integers. For example:

```java
public static void main(String[] args) {
    System.out.println(validMountainArray(new int[] { 2, 1 })); // Output: false
    System.out.println(validMountainArray(new int[] { 3, 5, 5 })); // Output: false
    System.out.println(validMountainArray(new int[] { 0, 3, 2, 1 })); // Output: true
}
