import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class latihan3 {

    public static void main(String[] args) {

                System.out.println("Silahkan masukan total dana pinjam Anda: ");
		Scanner scanner = new Scanner(System.in);
		int jumlah = scanner.nextInt();
		
                System.out.println("Masukan durasi dana pinjam Anda: ");
		int durasi = scanner.nextInt();
                
                System.out.println();
                System.out.println("Terimakasih atas ketersediaan Anda! \nAnda akan membayar 10% dari jumlah pinjaman yang tersisa setiap bulan.");
                
		//ketentuan potongan
		int bayarsatubulan = jumlah*1*10/100;
		int bayarjadibulansatu = jumlah-bayarsatubulan;
		
		int bayarbulandua = bayarjadibulansatu*1*10/100;
		int bayarjadibulandua = bayarjadibulansatu-bayarbulandua;
		
		int bayarbulantiga = bayarjadibulandua*10/100;
		int bayarjadibulantiga = bayarjadibulandua-bayarbulantiga;
                
                
		if(durasi == 1){
                    System.out.println("Anda akan membayarkan sebesar Rp. " +bayarjadibulansatu);
                }else if (durasi ==2){
                    System.out.println("Anda akan membayarkan sebesar Rp. " +bayarjadibulandua);
                }else if (durasi ==3){
                    System.out.println("Anda akan membayarkan sebesar Rp. " +bayarjadibulantiga);
                }
                else{
                    System.out.println("Anda melewatkan masa pembayaran!");
                }
	}
}
