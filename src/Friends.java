public class Friends {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 24; j++) {
                if (i < 10) {
                    if (j < 10) {
                        System.out.println("S0" + i + "E0" + j + "-");
                    } else {
                        System.out.println("S0" + i + "E" + j + "-");
                    }
                } else {
                    if (j < 10) {
                        System.out.println("S" + i + "E0" + j + "-");
                    } else {
                        System.out.println("S" + i + "E" + j + "-");
                    }
                }
            }
        }
    }
}
