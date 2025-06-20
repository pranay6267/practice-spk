
package pranay_prac;

class spk3 {
    int a;
    int b;

    void spk1(int x, int y) {
        a = x;
        b = y;
    }

    void spk2() {
        System.out.println("The values are: " + a + " " + b);
    }
}

class spk4 extends spk3 {
    void fin() {
        int u = a;  // 'a' is inherited from spk3
        int v = b;  // 'b' is inherited from spk3
        System.out.println("The values of u and v are: " + u + " " + v);
    }
}

