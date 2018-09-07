public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        super();
        this.nama = nama;
        this.umur = umur;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    public String introduce() {
        return "Hai! Nama saya " + this.nama + ", umur saya " + this.umur;
    }
}