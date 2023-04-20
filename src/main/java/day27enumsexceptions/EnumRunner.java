package day27enumsexceptions;

public enum EnumRunner {
    ;

    public static void main(String[] args) {

        String capital1 = ILLINOIS.getCapital();
        System.out.println(capital1);

    }

    private static class ILLINOIS {
        public static String getCapital() {
            return null;
        }

    }
}
