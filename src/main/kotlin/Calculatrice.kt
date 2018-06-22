val symbols = "IVXLCDM"

fun getSymbolWeight(char: Char): Int {
    return symbols.indexOf(char)
}

fun sum(string1: String, string2: String) {

}

fun unpack(string: String): String {
    val stringWeight = string.map(::getSymbolWeight)

    val resultList = mutableListOf<String>()

    stringWeight
            .subList(0, stringWeight.size - 1)
            .forEachIndexed({pos, weight ->
                val nextWeight = stringWeight[pos+1]
                println(nextWeight)
                if(weight < nextWeight){
                } else {

                }
            })

//    for (i in 0 until stringWeight.size - 1) {
//        println(stringWeight[i])
//    }
    return ""
}

fun main(args: Array<String>) {
    unpack("IVXLCDM")
}