class CalculateCompoundInterest {
    public static void main(String[] args) {

        double principal = 10000;

        double rate = 10.25;

        double time = 5;

        double CompoundInterest = principal * (Math.pow((1+rate/100),time));

        System.out.println("Compound Interest : "+ CompoundInterest);
    }
}