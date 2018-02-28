package pl.codecouple

import spock.lang.Specification
import java.lang.Void as Should

class PrinterSpec extends Specification {

    Should "return reverse string"() {
        given:
            Printer printer = new Printer('abc')
        when:
            def result = printer.reverseString()
        then:
            result == 'cba'
    }

    Should "return indexOf 'a' char from 'abc'"() {

    }

    Should "delete 'a' from 'abc'"() {

    }

    Should "thrown IllegalArgumentException when given String in constructor is null or empty" () {

    }

    Should "return lastIndexOf 'c' char from 'abc'"() {

    }

}
