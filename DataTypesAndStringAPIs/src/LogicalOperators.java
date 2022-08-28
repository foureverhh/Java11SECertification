public class LogicalOperators {
    public static void main(String[] args) {
        // & and
        // && short circuit and
        // | or
        // || short circuit or
        // ^ exclusive or
        // ! not operator
        boolean true_1 = true;
        boolean true_2 = true;
        boolean false_1 = false;
        boolean false_2 = false;
        //& Both sides must be true, both sides are tested
        showResult( true_1 & true_2);     //true
        showResult( true_1 & false_1);    //false

        //&& short circuit, Both sides must be true,IF left side = false THEN false
        showResult(true_1 && true_2);     //true
        showResult(true_1 && false_2);    //false
        showResult(false_1 && true_1);    //true

        // | both sides are tested, at least one side is ture
        // || short circuit or, at least one side is true, IF left side = true, Then true

        int xInt = 7;
        boolean yBool = false;
        showResult((xInt++ <=7) || (yBool=true)); // || xInt++ <=7 is true, yBool=true will not executed
        System.out.println("xInt: " + xInt + " , and yBool: " + yBool);
    }

    public static void showResult(boolean result){
        System.out.println("Result -> " + result);
    }

}
