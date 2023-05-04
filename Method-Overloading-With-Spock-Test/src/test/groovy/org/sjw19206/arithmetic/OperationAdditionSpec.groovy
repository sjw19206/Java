package org.sjw19206.arithmetic

import spock.lang.Specification
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class OperationAdditionSpec extends Specification{

    static Logger logger = LoggerFactory.getLogger(OperationAdditionSpec.class)

    /**
     * A fixture method - it is invoked once for a specification,
     * and before the first feature method.
     */
    def setupSpec(){
        logger.info("Exec - setupSpec()")
    }

    /**
     * A fixture method - it is invoked before every feature method.
     */
    def setup(){
        logger.info("Exec - setup()")
    }

    /**
     * A fixture method - it is invoked after every feature method.
     */
    def cleanup(){
        logger.info("Exec - cleanup()")
    }

    /**
     * A fixture method - it is invoked once for a specification,
     * and after the final feature method.
     */
    def cleanupSpec(){
        logger.info("Exec - cleanupSpec()")
    }

    /**
     * A feature method - It is invoked first.
     * The purpose of this method is to test addNumbers() with
     * integer values.
     * The 'setup' block is used to create an object and
     * 'expect' block is used for evaluation.
     */
    def 'addIntegerTest_01'() {

        setup:

        def objOperationAddition = new OperationAddition()

        expect:

        objOperationAddition.addNumbers(20, 05) == 25
    }

    /**
     * A feature method - The purpose of this method is to perform
     * negative test while adding integers.
     * Only 'expect' block is used in this feature method.
     */
    def 'addIntegerTest_02'() {

        expect:

        !(new OperationAddition().addNumbers(50, 05) == 60)
    }

    /**
     * A feature method - The purpose of this method is to perform
     * negative test while adding integers, an alternative approach
     * compared to 'addIntegerTest_02'.
     */
    def 'addIntegerTest_03'() {

        expect:

        new OperationAddition().addNumbers(45, 05) != 60
    }

    /**
     * A feature method - The purpose of this method is to evaluate
     * addition of double numbers.
     */
    def 'addDoubleTest_01'() {

        expect:

        new OperationAddition().addNumbers(45.7d, 34.8d) == 80.5d
    }

    /**
     * A feature method - The purpose of this method is to evaluate
     * implicit type cast for an integer value to double, and return
     * the result after addition.
     */
    def 'TypeCastTest'() {
        // typecast : int --> double
        expect:

        new OperationAddition().addNumbers(34, 50.5d) == 84.5d
    }

    /**
     * A feature method - It leverages the 'data pipes' feature
     * for testing the functionality.
     */
    def 'addNumbersTest_01'() {

        expect:

        new OperationAddition().addNumbers(num1, num2) == result

        where:
        // Data Pipes
        num1   << [20, 45.90, 99]
        num2   << [45, 35.75, 45.99]
        result << [65, 81.65, 144.99]
    }

    /**
     * A feature method - It leverages 'data tables' feature of spock
     * to evaluate the operation.
     */
    def 'addNumbersTest_02'() {

        expect:

        new OperationAddition().addNumbers(num1, num2) == result

        where:
        // Data Tables
        num1 | num2 || result
        12.4 | 17.6 || 30
        34   | 45   || 79

    }
}
