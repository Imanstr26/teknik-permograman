import java.util.Scanner;

public class week1no1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah angka yang akan anda cek: ");
        int n = input.nextInt();
        input.nextLine(); // ilangin newline setelah next integer
        String[] angka = new String[n];

        for (int i = 0 ; i < n ; i++){
            System.out.print("masukan angka ke " + (i + 1) + ": ");
            angka[i] = input.nextLine();
        }

        for(int i = 0; i < n; i++){
            try{
                long nomor = Long.parseLong(angka[i]);
                if (nomor > Long.MAX_VALUE){
                    throw new Exception("data sudah terlalu besar");
                }
                    System.out.println(angka[i] + " bisa masuk ke dalam: ");
                    if (nomor >= Byte.MIN_VALUE && nomor <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                    }
                    if (nomor >= Short.MIN_VALUE && nomor <= Short.MAX_VALUE){
                    System.out.println("* short");
                    }
                    if (nomor >= Integer.MIN_VALUE && nomor <= Integer.MAX_VALUE){
                    System.out.println("* int");
                    }
                    System.out.println("* long");

            } catch (Exception e){
                System.out.println(angka[i] + " terlalu besar untuk dimasukkan ke dalam tipe data apapun.");
                continue;
            }
            
        }
        
        input.close();
        
    }
}