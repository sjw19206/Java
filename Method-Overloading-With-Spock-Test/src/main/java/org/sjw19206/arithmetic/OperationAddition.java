package org.sjw19206.arithmetic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sjw19206.arithmetic.interfaces.ArithmeticAddition;

public class OperationAddition implements ArithmeticAddition {

    private static final Logger logger = LoggerFactory.getLogger(OperationAddition.class);
    public OperationAddition(){
        logger.info("Exec - Constructor : OperationAddition() :: ");
    }

    @Override
    public int addNumbers(int iNum1, int iNum2) {
        logger.debug("Adding int variables :: {} & {}", iNum1, iNum2);
        return iNum1 + iNum2;
    }

    @Override
    public double addNumbers(double dNum1, double dNum2) {
        logger.debug("Adding double variables :: {} & {}", dNum1, dNum2);
        return dNum1 + dNum2;
    }
}
