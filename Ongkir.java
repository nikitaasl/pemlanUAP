public interface Ongkir {
    int PER_KG = 2000;
    default double biaya(double kg) {
        return Math.ceil(kg) * PER_KG;
    }
}
