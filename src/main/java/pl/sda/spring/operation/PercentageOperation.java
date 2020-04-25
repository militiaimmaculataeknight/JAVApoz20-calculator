package pl.sda.spring.operation;

public class PercentageOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {

        double percentage = arg2*arg1/100;
        return percentage;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
