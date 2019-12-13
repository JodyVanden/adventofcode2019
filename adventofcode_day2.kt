fun main() {
    val puzzle = arrayOf(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 19, 10, 23, 2, 10, 23, 27, 1, 27, 6, 31, 1, 13, 31, 35, 1, 13, 35, 39, 1, 39, 10, 43, 2, 43, 13, 47, 1, 47, 9, 51, 2, 51, 13, 55, 1, 5, 55, 59, 2, 59, 9, 63, 1, 13, 63, 67, 2, 13, 67, 71, 1, 71, 5, 75, 2, 75, 13, 79, 1, 79, 6, 83, 1, 83, 5, 87, 2, 87, 6, 91, 1, 5, 91, 95, 1, 95, 13, 99, 2, 99, 6, 103, 1, 5, 103, 107, 1, 107, 9, 111, 2, 6, 111, 115, 1, 5, 115, 119, 1, 119, 2, 123, 1, 6, 123, 0, 99, 2, 14, 0, 0)
//    var answer = run(puzzle)
//    println(answer)

    for (noun in 0..99) {
        for (verb in 0..99) {
            puzzle[1] = noun
            puzzle[2] = verb
            val answer = run(puzzle.clone())
            if (answer == 19690720) {
                println("noun: $noun, verb $verb, answer $answer")
                println(100 * noun + verb)
                return
            }
        }
    }
}

fun run(puzzle: Array<Int>): Int {
    var arrayIndex = 0
    while (true) {
        when (puzzle[arrayIndex]) {
            1 -> puzzle[puzzle[arrayIndex + 3]] = (puzzle[puzzle[arrayIndex + 1]] + puzzle[puzzle[arrayIndex + 2]])
            2 -> puzzle[puzzle[arrayIndex + 3]] = puzzle[puzzle[arrayIndex + 1]] * puzzle[puzzle[arrayIndex + 2]]
            99 -> return puzzle[0]
            else -> return -100
        }
        arrayIndex += 4
    }
    return -1
}
//fun add(index2:Int, index3:Int):Int {
//    return (index2 + index3)
//}

// [1, 2, 3] -> "1, 2, 3"

//interface ToStringable {
//        override fun toString(): String
//    }
//
//    class MyList<T : ToStringable> {
//        lateinit var elements: List<T>;
//
//        fun forEach(iter: (elem: T) -> Unit) {
//            println("hey")
//        }
//
//        fun join(delimiter: String) {
//            var output = ""
//            elements.forEach { elemasdasd ->
//                output += elemasdasd.toString() + delimiter
//            }
//        }
//
//}


/*

const cb = (event) => console.log(event)
<MyComponent  onClick={
    cb
} />
 */
