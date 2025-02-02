```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3)
    mutableList.forEachIndexed { index, value -> mutableList[index] = value * 2 }
    println(mutableList) // Output: [2, 4, 6]
}
```