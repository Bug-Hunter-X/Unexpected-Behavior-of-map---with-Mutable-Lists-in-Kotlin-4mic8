# Kotlin `map()` Function with Mutable Lists

This example demonstrates an often overlooked aspect of the `map()` function in Kotlin when applied to mutable lists.  The `map()` function in Kotlin always returns a *new* list containing the transformed elements, unlike similar functions in some other languages that might modify the original list in place. 

The provided code showcases this behavior: while the `map()` operation transforms the list elements, the original mutable list remains unchanged. 

The solution provides a way to modify the original mutable list using a different approach.

## How to reproduce the bug

1. Run `bug.kt`.
2. Notice that the output shows the original mutable list unchanged, even after applying the `map` function.

## Solution

The solution demonstrates how to correctly modify the original mutable list in place. Instead of using `map`, we utilize the `forEachIndexed` function which allows direct modification of the list's elements.