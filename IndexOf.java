/**
 * IndexOf berfungsi untuk  menunjukan charakter atau kata yang ada dalam sebuah kalimat index ke berapa
 */
public class IndexOf {
    public static void main(String[] args) {

        //inisialsiasi String Variable
        String kalimat = "Temukan huruf huruf a di urutan ke berapa";
        //akan mencari index dari char a
        int cariIndex1 = kalimat.indexOf("a");
        // akan mencari index char u tapi dimulai mencari dari index 5
        int cariIndex2 = kalimat.indexOf("u", 5);
        // mencari index dari kata huruf
        int cariIndex3 = kalimat.indexOf("huruf");
        // mencari index dari kata huruf namun diawali dari index ke 9
        int cariIndex4 = kalimat.indexOf("huruf", 9);
        System.out.println(cariIndex1);
        System.out.println(cariIndex2);
        System.out.println(cariIndex3);
        System.out.println(cariIndex4);
        

    }

    
}