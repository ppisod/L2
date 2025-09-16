/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME:  Jack Lu
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        // tests:
        if (add(5, 7) == 12 && add(1, 2, 3, 4) == 10) {
            System.out.println("add functions work");
        }
        if (morningGreeting(" d 39csnj;l.cm ;adckm[p\f\f\n\n\n").equals("早上好,  d 39csnj;l.cm ;adckm[p\f\f\n\n\n") &&
                afternoonGreeting("eirfpuowhepfvojwnlefkj").equals("下午好, eirfpuowhepfvojwnlefkj")) {
            System.out.println("greetings work");
        }
        if (triple("Boom").equals("BoomBoomBoom")) {
            System.out.println("triple works");
        }
        if (half(5) == 2.5) {System.out.println("half works");}
        if (round_eff(4.8) == 5) {System.out.println("rounding works");}
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    // 3. morningGreeting
    public static String morningGreeting (String name) {
        return "早上好, " + name;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting (String name) {
        return "下午好, " + name;
    }
    // 5. triple
    public static String triple(String i) {
        String r = "";
        for (int d = 0; d < 3; d++) {
            r += i;
        }

        return r;
    }
    public static int triple (int i) {
        return i * 3;
    }
    // 6. half
    public static double half (double i) {
        return i / 2d;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger (double d) {
        int i = (int) d;
        double decimal = d - i;
        if (decimal >= 0.5) {
            return i + 1;
        } else {
            return i;
        }
    }

    public static int round_eff (double d) {
        return (int) (d+0.5d);
    }

    public static int round_math (double d) {
        return (int) Math.round(d);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double d) {
        int i = (int) d;
        double decimal = d - i;
        if (decimal >= 0.5) {
            return i + 1;
        } else {
            return i;
        }
    }


}
