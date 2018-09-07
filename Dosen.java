public class Dosen {
    private String nama;
    private String mataKuliah;

    public Dosen(String nama, String mataKulString) {
        super();
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param mataKuliah the mataKuliah to set
     */
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the mataKuliah
     */
    public String getMataKuliah() {
        return mataKuliah;
    }

    public String introduce() {
        return "Halo anak-anak, perkenalkan saya  " + this.nama + ", saya mengajar mata kuliah " + this.mataKuliah;
    }
}