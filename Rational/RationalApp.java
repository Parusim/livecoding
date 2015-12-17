class RationalApp {
    public static void main(String[] args) {

        Rational r = new Rational();
        r.numer = 7;
        r.denom = 3;

        Rational s = new Rational();
        s.numer = 7;
        s.denom = 3;

        Rational t = s;

        System.out.printf("r = %d / %d%n", r.numer, r.denom);
        System.out.printf("s = %d / %d%n", s.numer, s.denom);
        System.out.printf("t = %d / %d%n", t.numer, t.denom);

        System.out.printf("r und s sind%s gleich!%n",
                (r == s)? "": " nicht"  );

        System.out.printf("s und t sind%s gleich!%n",
                (s == t)? "": " nicht"  );

        int i = 5;
        int j = 5;

        System.out.printf("i und j sind%s gleich!%n",
                (i == j)? "": " nicht"  );

        String a = new String("Hallo");
        String b = new String("Hallo");

        System.out.printf("a und b sind%s gleich!%n",
                (a == b)? "": " nicht"  );



    }
}
