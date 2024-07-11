package fluent.typesystem.string
sealed class ALPHABET {
    abstract val value: String
    val A: STRING get() = STRING(value + "A")
    val B: STRING get() = STRING(value + "B")
    val C: STRING get() = STRING(value + "C")
    val D: STRING get() = STRING(value + "D")
    val E: STRING get() = STRING(value + "E")
    val F: STRING get() = STRING(value + "F")
    val G: STRING get() = STRING(value + "G")
    val H: STRING get() = STRING(value + "H")
    val I: STRING get() = STRING(value + "I")
    val J: STRING get() = STRING(value + "J")
    val K: STRING get() = STRING(value + "K")
    val L: STRING get() = STRING(value + "L")
    val M: STRING get() = STRING(value + "M")
    val N: STRING get() = STRING(value + "N")
    val O: STRING get() = STRING(value + "O")
    val P: STRING get() = STRING(value + "P")
    val Q: STRING get() = STRING(value + "Q")
    val R: STRING get() = STRING(value + "R")
    val S: STRING get() = STRING(value + "S")
    val T: STRING get() = STRING(value + "T")
    val U: STRING get() = STRING(value + "U")
    val V: STRING get() = STRING(value + "V")
    val W: STRING get() = STRING(value + "W")
    val X: STRING get() = STRING(value + "X")
    val Y: STRING get() = STRING(value + "Y")
    val Z: STRING get() = STRING(value + "Z")

    val `_`: STRING get() = STRING(value + "_")
    val `__`: STRING get() = STRING(value + " ")

    val `!`: STRING get() = STRING(value + "!")
    val `?`: STRING get() = STRING(value + "?")
    val `'`: STRING get() = STRING(value + "'")


    data object EMPTY : ALPHABET() {
        override val value: String = ""
    }

    data class STRING(override val value: String) : ALPHABET() {
        operator fun plus(other: STRING): STRING {
            return STRING(value + " " + other.value)
        }

        override fun toString(): String {
            return value
        }
    }
}

typealias STRING = ALPHABET.EMPTY