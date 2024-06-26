class shape {
    void draw() {

        System.out.println("Cant't Say shape Type");
    }

}

class square extends shape {

    @Override
    void draw() {

        super.draw();
        System.out.println("Square shape");
    }
}

class Demo2 {
    public static void main(String[] args) {
        shape ref = new square();
        ref.draw();
    }
}
