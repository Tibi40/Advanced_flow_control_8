public class AdvancedFlowControl {

    public static final String DAY_OF_WEEK_MONDAY = "Tuesday";
    public static void main(String[] args) {
        boolean isActive = false;

        if(isActive) { //aici se verifica daca variabila are o alta valoare decat cea de false
            //
        } else {
            //
        }

        int dayOfWeek = 5;
        switch (dayOfWeek) { //switch in loc de if
            default:         //daca este adevarat, se printeaza
                System.out.println("Weekday");
                break;
            case 0: //daca dayOfWeek = 0
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break; //opreste executia, daca este adevarata, daca nu, trece la urmatoarea
        }

        /*Acelasi lucru, se poate face cu Lambda,
        doar ca in loc de break, se foloseste -> */


        int dayOfWeek1 = 5;
        switch (dayOfWeek1) {
            //if true
            default -> System.out.println("Weekday");
            //if dayOfWeek == 0
            case 0 -> System.out.println("Sunday");
            //if dayOfWeek == 5
            case 6 -> System.out.println("Saturday");
        }

        String dayOfWeek2 = "Monday";

        if (dayOfWeek2.equals("Monday")) {
            System.out.println("Is Monday");
        } else if (dayOfWeek2.equals("Tuesday")) {
            System.out.println("Is Tuesday");
        } else {
            System.out.println("Is Wednesday");
        }


        /* Stii sa folosesti functia Lambda */

        String namex = getName(); //se poate schimba numele din toata functia, doar prin modificare numelui in interioul clase/comenzii de mai jos
        switch (getName()) {
            //if true
            default -> System.out.println("Weekday");
            //if dayOfWeek == 0
            case 0 -> System.out.println("Sunday");
            //if dayOfWeek == 5
            case 6 -> System.out.println("Saturday");
        }
    }

    public static String getName() { //aceasta este o metoda, care prin intermediul functiei, imi intoarce valoarea din ziua respectiva
        //return Name
        return "Marius";
    }
}
