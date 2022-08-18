public class Underscores {
    public static void main(String[] args) {
        long worldPopulation = 7674000000L;
        long worldPopulationUnderscore = 7_674_000_000L;
        System.out.println(worldPopulationUnderscore == worldPopulation);

        long phoneNumber = 739_655_215L;
        System.out.println("_ cannot use before or after f, L, neither . or 负数-");
    }
}
