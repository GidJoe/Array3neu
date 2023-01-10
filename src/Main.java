public class Main {
    public static void main(String[] args) {
        String[] firmen = {"Opel","VW","Mercedes","Citroen","Audi"};
        double[] umsatz = {522_057.87,922_097.22,1_709_103.01,145_089.97,1_004_472.77};

        double max = 0;
        int maxIndex = 0;
        for (int i=0; i<umsatz.length; i++) {
            if (umsatz[i] > max) {
                max = umsatz[i];
                maxIndex = i;
            }
        }
        System.out.println(firmen[maxIndex]);
        System.out.println(umsatz[maxIndex]+" €");
    }
}