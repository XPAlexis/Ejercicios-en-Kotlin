fun main() {
    val frase = "EJEMPLO DE KOTLIN PARA SEPARAR PORQUE LA VIDA ES UNA LENTEJA"
    println(diccionario(frase))

}

fun diccionario(frase: String): Map<String, Int> {
    val dic: MutableMap<String, Int> = mutableMapOf()
    val partes = listOf(*frase.split(" ".toRegex()).toTypedArray())
    for (i in partes.indices) {
        dic[partes[i]] = partes[i].length
    }
    return dic
}