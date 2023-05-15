class Solution {
    fun interpret(command: String): String {
    val sb = StringBuilder(command.length)
    var i = 0
    while (i < command.length) {
        when (command[i]) {
            'G' -> sb.append('G')
            '(' -> {
                if (command[i + 1] == ')') {
                    sb.append('o')
                    i++
                } else {
                    sb.append("al")
                    i += 3
                }
            }
        }
        i++
    }
    return sb.toString()
}
}