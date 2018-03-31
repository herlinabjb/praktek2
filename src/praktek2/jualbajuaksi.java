package praktek2;
public class jualbajuaksi {
    public static void main(String[] args) {
        JualBaju rl = new JualBaju();
        rl.harga_baju = 80000;
        rl.jumlah_beli = 3;
        
        
        rl.cetakInfo();
        System.out.println("total JualBaju = "+rl.hitungtotal()); 
        rl.cetaktotal();
        
        
        JualBaju r2 = new JualBaju();
        r2.cetakInfo();
    
        
        JualBaju r3 = new JualBaju(200000,5);
        r3.cetakInfo();
        
    
    
    
        
        
   } 
        
    }
    
}
