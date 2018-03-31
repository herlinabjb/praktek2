package praktek2;
public class JualBaju {
    Integer harga_baju;
    Integer jumlah_beli;
    
   void cetakInfo(){
        System.out.println("harga_baju : "+harga_baju);
        System.out.println("jumlah_beli : "+jumlah_beli);
    }
   
   Integer hitungtotal() {
       Integer total;
       total=harga_baju*jumlah_beli;
       return total;
       
   }
    
   void cetaktotal() {
       System.out.println("totalnya adalah: "+hitungtotal()); 
       rl.cetaktotal();
       
   }
}
