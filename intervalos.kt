fun main () {
    for (i in 0..3) {
        print(i)
    }
    print(" ")
    for (i in 0 until 3) {
        print(i)
    }
    print(" ")
    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")
    for (i in 2 until 10 step 2) {
        print(i)
    }
    print(" ")
    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")
    for (i in 10 downTo 0 step 2) {
        print(i)
    }
    print(" ")
}