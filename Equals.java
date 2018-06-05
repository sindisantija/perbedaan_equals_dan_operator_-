
package equals;

public class Equals {

    public static void main(String[] args) {
        String kt1="saya suka makan bakso";
        String kt2="saya suka makan bakso";
        String kt3="saya suka ";
        String kt4="makan ";
        String kt5="bakso";
        String kt6=kt3+kt4+kt5;
        
        System.out.println("keterangan1 : " + kt1);
        System.out.println("keterangan2 : " + kt2);
        System.out.println("keterangan3 : " + kt3);
        System.out.println("keterangan4 : " + kt4);
        System.out.println("keterangan5 : " + kt5);
        System.out.println("keterangan6 : " + kt6);
        System.out.println("");
        System.out.println("Membuktikan bahwa penggunaan operator == dan equals tidak selamanya nilainya sama");
        System.out.println("");
        
        System.out.println("menggunakan operator '==' : ");
        System.out.println("keterangan6==keterangan1 : " + (kt6==kt1));
        System.out.println("keterangan1==keterangan2 : " + (kt1==kt2));
        System.out.println("keterangan6==keterangan2 : " + (kt6==kt2));
        System.out.println("");
        
        System.out.println("menggunakan method equals : ");
        System.out.println("keterangan6.equals(keterangan1) : " + (kt6.equals(kt1)));
        System.out.println("keterangan1.equals(keterangan2) : " + (kt1.equals(kt2)));
        System.out.println("keterangan6.equals(keterangan2) : " + (kt6.equals(kt2)));
    }
    
}
