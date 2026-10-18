public class Main {
    static void main() {
        for(int i = 0; i < 5; i++) {
            try {
                Reclutatore.Recluta(75);
            } catch (EroeNonIdoneoException e) {
                continue;
            }
        }
    }
}
