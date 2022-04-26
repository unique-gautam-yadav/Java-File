interface In1 {
    void show();
}

interface In2 {
    public void hii();
}

class Pro31_Interface implements In1, In2 {
    public void show() {
        System.out.println("Interface 1");
    }

    public void hii() {
        System.out.println("Interface 2");
    }

    public static void main(String args[]) {
        Pro31_Interface d = new Pro31_Interface();
        d.show();
        d.hii();
    }
}
