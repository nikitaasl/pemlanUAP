public abstract class Bentuk {
    protected String nama;

    public Bentuk() {}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilInfo();
}