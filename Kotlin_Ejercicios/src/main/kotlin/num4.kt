fun main() {
    val kardex: Map<String, Double> = mapOf(
        "Matematicas" to 100.0, "Geografia" to 91.0, "Español" to 81.0, "Quimica" to 71.0, "Historia" to 61.0
    )
    println(calif(kardex))

}

fun calif(notas: Map<String, Double>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0.0..69.0 -> "Desempeño insuficiente"
            in 70.0..74.0 -> "Suficiente"
            in 75.0..84.0 -> "Bueno"
            in 85.0..94.0 -> "Notable"
            in 95.0..100.0 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}