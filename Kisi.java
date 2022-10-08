public class Kisi {


    private String isim;
    private String telNo;

    public String getIsim() {
        return isim;
    }

    public String getTelNo() {
        return telNo;
    }

    public Kisi(String isim, String telNo) {
        this.isim = isim;
        this.telNo = telNo;

    }

    public static Kisi olustur(String isim , String telNo){

        return  new Kisi(isim,telNo);
    }
}