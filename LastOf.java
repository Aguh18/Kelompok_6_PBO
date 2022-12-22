public class LastOf {
    
    public static void main(String[] args) {
        //Hampir sama dengan Index of namun mencari dari yang paling akhir
        String kalimat = "Kalimat ini adalah contoh contoh untuk Lastindex";
         //akan mencari index dari char a dengan urutan dari index terbesar
         int cariIndex1 = kalimat.lastIndexOf("a");
         // akan mencari index char u tapi dimulai mencari dari index 40 ke bawah
         int cariIndex2 = kalimat.lastIndexOf("o", 40);
         // mencari index dari kata contoh dari dimulai dari index teratas
         int cariIndex3 = kalimat.lastIndexOf("contoh");
         // mencari index dari kata contoh namun diawali dari index ke 30 ke bawah
         int cariIndex4 = kalimat.lastIndexOf("contoh", 30);
         System.out.println(cariIndex1);
         System.out.println(cariIndex2);
         System.out.println(cariIndex3);
         System.out.println(cariIndex4);
         


        
    }
}
