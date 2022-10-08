import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class MobilePhone {
    // bütün classlarda kullanabilmek için bu şekilde tanımladık.
    private static Scanner scan = new Scanner(System.in);
    private static CepTelefonu cepTelefonu =new CepTelefonu("555 444 33 11");


    public static void main(String[] args) {

     //   CepTelefonu cepTelefonu =new CepTelefonu("555 444 33 11");
            telefonuBaslat();
            menuGoster();
//            Kisi.olustur("Emre","555");

          boolean cıkıs = false;

          while (!cıkıs){
            System.out.println("SEÇİMİNİZ (Menüyü görmek için 6' yı tuşlayınız.)");
             int seçim = scan.nextInt();

            switch (seçim){
            case 0 :
                System.out.println("Çıkış yapılıyor...");
                cıkıs= true;
                break;

           case 1:
                cepTelefonu.tumRehber();
                   break;

           case 2:
                 yeniKişiEkleMetodu();
                   break;

           case 3:

               kisiSorgulaMethodu();



            case 6 : menuGoster();
                   break;

            default:
                System.out.println("Düzgün bir seçim yapınız.");
          }
    }
     }

    private static void kisiSorgulaMethodu() {

        System.out.println("Aranacak kişi giriniz:");
        String isim = scan.next();

        Kisi bulunankisi= cepTelefonu.kisiSorgula(isim);
     if (bulunankisi==null){

         System.out.println(isim +"isminde bir kayıt bulunamadı");
     return;
       }

        System.out.println("Bulunan kişi :" + bulunankisi.getIsim()+"->"+ bulunankisi.getTelNo() );

    }

    private static void yeniKişiEkleMetodu(){
         System.out.println("Yeni kişinin adı:");
         String isim = scan.next();
         System.out.println("Yeni kişinin cep telefonu:");
         String telefon= scan.next();

        cepTelefonu.ekleYeniKisi(Kisi.olustur(isim,telefon));







     }
        private static void menuGoster(){

           System.out.println("********MENU********");
           System.out.println( "0=>ÇIKIŞ" +
                " \n 1=> Tüm kişileri listele" + "\n 2=> Yeni kişi ekle \n" +
                " 3=>Kişi Sorgula \n 4=> Kişi sil +\n 5=>Kişi güncelle + 6=> Menü göster" );
           System.out.println("Seçiminizi giriniz...");

     }
        private  static void telefonuBaslat() {
           System.out.println("Telefon başlatılıyor");

     }
  }

