package fluent.typesystem.string

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class ALPHABETTest {

    @Test
    fun `test ALPHABET`() {
        val alphabet = STRING.T.E.S.T.`__`.A.L.P.H.A.B.E.T
        println(alphabet)
        assertEquals("TEST ALPHABET", alphabet.value)
    }

    @Test
    fun `test ALPHABET with plus operator`() {
        val alphabet = STRING.T + STRING.E + STRING.S + STRING.T + STRING.`__` + STRING.A + STRING.L + STRING.P + STRING.H + STRING.A + STRING.B + STRING.E + STRING.T
        println(alphabet)
        assertEquals("T E S T   A L P H A B E T", alphabet.value)
    }

}