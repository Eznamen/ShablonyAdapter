public class Main {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(2)
                        .addOperand(10)
                        .calculate(Calculator.Operation.POW)
                        .result()
        );
        Ints intsCalc = new IntsCalculator(calc);
        System.out.println(intsCalc.sum(5, 15));
        System.out.println(intsCalc.mult(3, 7));
        System.out.println(intsCalc.pow(2, 10));
    }
}
