
fun main() {

    val symbol: Char = 'a'
    println(Char.SIZE_BYTES) // 2 bytes

    val smile = '☺'
    val theSameSmile = '\u263a'

    println(smile.code.toString(16)) // 263a
}
