val systemUsers: mutableList<Int> = MutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers 

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSystemaSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)
    println("Total sudoers: ${getSystemSudoers().size}")
    getSystemSudoers().forEach {
        1 -> println("Some useful info on user $1")

    }
}