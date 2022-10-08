import java.util.ArrayList;

  public class CepTelefonu {

     private ArrayList <Kisi> rehber;
     private String kendiNumaram;


     public CepTelefonu(String kendiNumaram){

        this.kendiNumaram=kendiNumaram;
        this.rehber=new ArrayList<>();

   }

     public boolean ekleYeniKisi(Kisi yenikisi){


         if(kisiBul(yenikisi.getIsim())>=0){

             System.out.println(yenikisi.getIsim()+"degeri rehberde zaten var");
             return false;

         }

         this.rehber.add(yenikisi);
         return true;




    }
     public int kisiBul(Kisi aranacakKisi){

       return  this.rehber.indexOf(aranacakKisi);

   }
     public int kisiBul(String isim ){

         for (int i=0; i< rehber.size(); i++){
          Kisi oankiKisiNesnesi=this.rehber.get(i);
          if (oankiKisiNesnesi.getIsim().equals(isim)){
              return i;
          }

         }
           return -1;
     }


     public Kisi kisiSorgula(String isim){
         int position = kisiBul(isim);
         if(position >= 0){

             return rehber.get(position);
         }
         return  null;
     }




        public void tumRehber(){

         System.out.println("\nREHBER");
         if (rehber.size()==0){
             System.out.println("Kayıtlı kişi yok!");
         }
           for(int i=0; i< rehber.size();i++){
               System.out.println((i+1)+"-"+rehber.get(i).getIsim()+"-->"+rehber.get(i).getTelNo());


    }

 }



}
