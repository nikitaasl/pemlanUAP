public interface Konversi {
    int PEMBAGI = 1000;
    default double gramKeKg(double gram) {
        return gram / PEMBAGI;
    }
}
