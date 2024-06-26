class PriveteConstructor {

    // Instance Variable
    String Mob;
    int ATMPIN;

    // Privete Constructor
    private PriveteConstructor() {
        Mob = "8103101678";
        ATMPIN = 45851;
        System.out.println("My Mobile Number is: " + Mob + "\n" + "And it is My ATIMPIN: " + ATMPIN);
    }

    public static void main(String[] args) {
        PriveteConstructor P1 = new PriveteConstructor();
    }
}
