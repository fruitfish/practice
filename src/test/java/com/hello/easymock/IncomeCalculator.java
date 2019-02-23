package com.hello.easymock;

/**
 * Created by Administrator on 2016/5/24 0024.
 */
public class IncomeCalculator {
    private ICalcMethod calcMethod;
    private Position position;

    public void setCalcMethod(ICalcMethod calcMethod) {
        this.calcMethod = calcMethod;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double calc() {
        if (calcMethod == null) {
            throw new RuntimeException("CalcMethod not yet maintained");
        }
        if (position == null) {
            throw new RuntimeException("Position not yet maintained");
        }
        return calcMethod.calc(position);
    }
}
