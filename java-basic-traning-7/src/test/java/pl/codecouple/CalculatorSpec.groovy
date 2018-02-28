package pl.codecouple

import spock.lang.Specification
import spock.lang.Unroll

import java.lang.Void as Should

class CalculatorSpec extends Specification {

    Calculator calculator = new Calculator()

    Should "add two numbers"() {
        when:
            def result = calculator.add(10, 10)
        then:
            result == 20
    }

    @Unroll
    Should "subtract #number to #numberToSub and result is #expectedResult"() {
        when:
            def result = calculator.substract(number, numberToSub)
        then:
            result == expectedResult
        where:
            number | numberToSub || expectedResult
            10     | 10          || 0
            20     | 10          || 10
            //ctrl + alt + l - code reformat
    }

    Should "thrown DividingByZero exception when divide by zero"() {
        when:
            calculator.dividing(10, 0)
        then:
            thrown(DividingByZero)
    }

    Should "multiply two numbers"() {
        when:
            def result = calculator.multiply(number, numberToMul)
        then:
            result == expectedResult
        where:
            number | numberToMul || expectedResult
            10     | 10          || 100
            20     | 10          || 200
    }


}