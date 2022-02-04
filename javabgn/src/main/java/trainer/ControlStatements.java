package trainer;

public class ControlStatements {

    public int getNumber(int number) {
        if (number > 3) {
            return number;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        ControlStatements control = new ControlStatements();
//        int result = control.getNumber(35);
//
//        System.out.println(result);

//        int x = 4;
//
////        if (x > 2) {
////            System.out.println("A");
////        }
//
//        for (int i = 0; i < 3; i++) {
//            if (i < 2) {
//                System.out.println(i);
//            } else {
//                System.out.println("x");
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            if (i < 2) {
//                System.out.println(i);
//            } else if (i < 4) {
//                System.out.println("x");
//            } else {
//                System.out.println("y");
//            }
//        }


//        for( ; ; ) {
//
//        }
       //
////        for (int i = x; x > 2; x--) {
////            System.out.println("A");
//        }

//        int count = 1;
//        while (count < 5) {
//            System.out.println("A");
//        }

        switch ("Alma") {
            case "alma" :
                System.out.println("A");
            case "körte" :
                System.out.println("B");
            case "barack" :
                System.out.println("C");
            case "szilva" :
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
