
/*  String Methods  */

class StringsClasses {
    public static void main(String[] args) {

        String clg1 = "MANDSAUR UNIVIERSITY";
        String clg2 = "Mandsaur university";

        System.out.println(clg2.concat(clg1));

        System.out.println(clg1.equals(clg2));

        System.out.println(clg1.length());
        System.out.println(clg2.substring(8));

        System.out.println(clg1.toLowerCase());
        System.out.println(clg2.charAt(9));

        System.out.println(clg1.indexOf('u'));

        String clg3 = "    UNIVIERSITY   ";
        System.out.println(clg3.trim());

        String clg4 = "moon";
        System.out.println(clg4.isEmpty());

        System.out.println(clg2.toUpperCase());

    }
}