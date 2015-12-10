class MultiplicationTable {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 20) {
            int y = 1;
            while (y <= 20) {
                System.out.printf("%4d", x*y);
                y = y + 1;
            }
            System.out.println();
            x = x + 1;
        }
    }
}
