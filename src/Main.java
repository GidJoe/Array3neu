public class Main {
    public static void main(String[] args) {
        String[] firmen = {"Opel","VW","Mercedes","Citroen","Audi"};
        double[] umsatz = {2522057.87,622097.22,1709103.01,145089.97,1004472.77};

        double max = 0;
        int maxIndex = 0;
        for (int i=0; i<umsatz.length; i++) {
            if (umsatz[i] > max) {
                max = umsatz[i];
                maxIndex = i;
            }
        }
        System.out.println(firmen[maxIndex]);
    }
}