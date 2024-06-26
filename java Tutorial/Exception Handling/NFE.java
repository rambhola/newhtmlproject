class NFE {
    public static void main(String[] args) {

        String name = "Java";
        try {
            int num1 = Integer.parseInt(name);
            System.out.println(name);

        } catch (NumberFormatException e) {
            System.out.println("String " + name + " can't be converting to interger ");
        }
        System.out.println("main methods is ended");

    }
}