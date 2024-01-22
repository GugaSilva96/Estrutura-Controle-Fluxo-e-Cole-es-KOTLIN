fun main () {
    for (i in 'a'..'z') {
        print(i)
    }
    print(" ")
    for (i in 'a' until 'z') {
        print(i)
    }
    print(" ")
    for (i in 'a'..'z' step 5) {
        print(i)
    }
    print(" ")
    for (i in 'a' until 'z' step 5) {
        print(i)
    }
    print(" ")
    for (i in 'z' downTo 'a') {
        print(i)
    }
    print(" ")
    for (i in 'z' downTo 'a' step 5) {
        print(i)
    }
    print(" ")
}