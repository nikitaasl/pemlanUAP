public class DonatBulat extends Bentuk implements HitungRuang, Phi, Massa, Konversi, Ongkir {
    private final double r;

    public DonatBulat(double r) {
        this.r = r;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    @Override
    public double luas() {
        return 4 * PI * r * r;
    }

    @Override
    public double massa() {
        return DENSITAS * luas() * TEBAL;
    }

    @Override
    public double gramKeKg(double gram) {
        return Konversi.super.gramKeKg(gram);
    }

    public double biaya() {
        return Ongkir.super.biaya(gramKeKg(massa()));
    }

    @Override
    public void tampilInfo() {
        System.out.printf("Volume          : %.2f%n", volume());
        System.out.printf("Luas permukaan  : %.2f%n", luas());
        System.out.printf("Massa           : %.2f%n", massa());
        System.out.printf("Massa dalam kg  : %.2f%n", gramKeKg(massa()));
        System.out.printf("Biaya kirim     : Rp%.0f%n", biaya());
    }
}
