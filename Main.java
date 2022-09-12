import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Burger h1 =new Burger("Sade Burger","Beyaz ekmek","Kırmızı et", 7.90);
        h1.ekleİlaveÜrün1("Patetes Kızartması", 3.30);
        h1.ekleİlaveürün2("Kola ", 3.50);
        h1.ekleİlaveürün3("sos",1.20);
        h1.ekleİlaveürün4("sogan",0.20);

        System.out.println("TOPLAM TUTAR : "+ h1.hamburgerBilgileri());


        SaglıklıBurger sg = new SaglıklıBurger("BEYAZ",4.40);

       sg.ekleSaplıklıÜrün1("domates",1.25);
       sg.ekleSaplıklıÜrün2("marul",2.40);

        System.out.println("TOPLAM ==>"+ sg.hamburgerBilgileri());


        BabaBurger b1=new BabaBurger();
        b1.ekleİlaveürün2("SOS",3.40);
        System.out.println(b1.hamburgerBilgileri());


    }


    public static class Burger{


        private String adı ;
        private String ekmekTürü;
        private String etCesidi;
        private double ücret;


        private String ilaveEkÜrünAdı1;
        private  double iLaveEkÜrünÜcreti1;


        private String ilaveEkÜrünAdı2;
        private  double iLaveEkÜrünÜcreti2;

        private String ilaveEkÜrünAdı3;
        private  double iLaveEkÜrünÜcreti3;


        private String ilaveEkÜrünAdı4;
        private  double iLaveEkÜrünÜcreti4;

        public void ekleİlaveÜrün1(String ad ,double ücret){

            this.ilaveEkÜrünAdı1=ad;
            this.iLaveEkÜrünÜcreti1=ücret;

        }

        public void ekleİlaveürün2(String ad,double ücret){

            this.ilaveEkÜrünAdı2=ad;
            this.iLaveEkÜrünÜcreti2=ücret;
        }


        public void ekleİlaveürün3(String ad,double ücret){

            this.ilaveEkÜrünAdı3=ad;
            this.iLaveEkÜrünÜcreti3=ücret;
        }

        public void ekleİlaveürün4(String ad,double ücret){

            this.ilaveEkÜrünAdı4=ad;
            this.iLaveEkÜrünÜcreti4=ücret;
        }

        public String getEkmekTürü() {
            return ekmekTürü;
        }

        public void setEkmekTürü(String ekmekTürü) {
            this.ekmekTürü = ekmekTürü;
        }

        public String getEtCesidi() {
            return etCesidi;
        }

        public void setEtCesidi(String etCesidi) {
            this.etCesidi = etCesidi;
        }

        public String getAdı() {
            return adı;
        }

        public void setAdı(String adı) {
            this.adı = adı;
        }

        public double getÜcret() {
            return ücret;
        }

        public void setÜcret(double ücret) {
            this.ücret = ücret;
        }

        public Burger(String adı,String ekmekTürü, String etCesidi, double ücret) {

            this.adı=adı;
            this.ekmekTürü=ekmekTürü;
            this.etCesidi=etCesidi;
            this.ücret=ücret;

        }
        public  double  hamburgerBilgileri(){

            double toplamÜcret= this.ücret;
            System.out.println("Hamburger Bilgileri : \nHamburger Adı: " +this.adı +
                            "\nEkmek Türü: "+ this.ekmekTürü +
                            "\nEt çeşidi: "+ this.etCesidi+
                    "\nFiyat: " + this.ücret);

             if (this.ilaveEkÜrünAdı1 != null){
                 toplamÜcret+= iLaveEkÜrünÜcreti1;
                 System.out.println("İlave ek ürün: "+ilaveEkÜrünAdı1+ "  İlave ek ürün ücreti:"+ this.iLaveEkÜrünÜcreti1);
             }

            if (this.ilaveEkÜrünAdı2!= null){
                 toplamÜcret+= iLaveEkÜrünÜcreti2;
                 System.out.println("İlave ek ürün: " +ilaveEkÜrünAdı2+ "  İlave ek ürün ücreti: "+ this.iLaveEkÜrünÜcreti2);

            }  if (this.ilaveEkÜrünAdı3 != null){
                toplamÜcret+= iLaveEkÜrünÜcreti3;
                System.out.println("İlave ek ürün: "+ ilaveEkÜrünAdı3+ "  ilave ek ürün ücreti: "+ this.iLaveEkÜrünÜcreti3);

            }  if (this.ilaveEkÜrünAdı4 != null){
                toplamÜcret+= iLaveEkÜrünÜcreti4;
                System.out.println("İlave ek ürün: "+ ilaveEkÜrünAdı4+ "  ilave ek ürün ücreti: "+ this.iLaveEkÜrünÜcreti4);

            }
                return toplamÜcret;
        }


    }

    public static class SaglıklıBurger extends  Burger{

        private String ilaveSağlıklıÜrünAdı1;
        private double ilaveSağlıklıÜrünÜcreti1;


        private String ilaveSağlıklıÜrünAdı2;
        private double ilaveSağlıklıÜrünÜcreti2;


        public SaglıklıBurger( String etCesidi, double ücret) {
            super("Sağlıklı Burger", "Kepekli Ekmek", etCesidi, ücret);

        }

        public void ekleSaplıklıÜrün1(String ad, double fiyat){

            this.ilaveSağlıklıÜrünAdı1= ad;
            this.ilaveSağlıklıÜrünÜcreti1=fiyat;

        }

        public void ekleSaplıklıÜrün2(String ad, double fiyat){

            this.ilaveSağlıklıÜrünAdı2= ad;
            this.ilaveSağlıklıÜrünÜcreti2=fiyat;

        }


        @Override
        public double hamburgerBilgileri() {

            double toplamÜcret=super.hamburgerBilgileri();

            if (this.ilaveSağlıklıÜrünAdı1!= null){

                toplamÜcret+= ilaveSağlıklıÜrünÜcreti1;
                System.out.println("İlave sağlıklı ürün:"+ ilaveSağlıklıÜrünAdı1+ "   ilave sağlıklı ürün ücreti:"+ ilaveSağlıklıÜrünÜcreti1);


            }
            if (this.ilaveSağlıklıÜrünAdı2!= null){

                toplamÜcret+= ilaveSağlıklıÜrünÜcreti2;
                System.out.println("İlave sağlıklı ürün:"+ ilaveSağlıklıÜrünAdı2+ "   ilave sağlıklı ürün ücreti:"+ ilaveSağlıklıÜrünÜcreti2);

            }

           return toplamÜcret;

        }
    }


    public static class BabaBurger extends Burger{


        public BabaBurger( ) {
            super("Baba Burger","Beyaz ekmek ", "Kırmızı et ", 14.90);

            super.ekleİlaveÜrün1("Patates Kızartması", 2.5);
            super.ekleİlaveürün2("Kola ",3.5);

        }

        @Override
        public void ekleİlaveÜrün1(String ad, double ücret) {
            System.out.println("İLAVE ÜRÜN EKLEYEMEZSİNİZ.");
        }

        @Override
        public void ekleİlaveürün2(String ad, double ücret) {
            System.out.println("İLAVE ÜRÜN EKLEYEMEZSİNİZ.");
        }


        @Override
        public void ekleİlaveürün3(String ad, double ücret) {
            System.out.println("İLAVE ÜRÜN EKLEYEMEZSİNİZ.");
        }

        @Override
        public void ekleİlaveürün4(String ad, double ücret) {
            System.out.println("İLAVE ÜRÜN EKLEYEMEZSİNİZ.");
        }
    }








}

