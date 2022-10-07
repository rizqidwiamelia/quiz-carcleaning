import java.util.Scanner;

public class quizPBO2
{
 public String nama;
    public String alamatRumah;
    public String notelp;
    public String email;
    public int pilihJasa;
    public int pilihTeam;
    public String keterangan;
    public int biayaJasa;
    public int biayaAlat;
    public int biayaBahan;
    public int biayaTransportasi;
    public String pesananJasa;
    public String pesananTeam;
    public int totalBiaya;

   public void dataPeserta() {
     Scanner input = new Scanner(System.in);

     System.out.println("--------------------*-------------------");
     System.out.println("Masukan Data Pemesanan");
     System.out.print("Masukan Nama: ");
     this.nama = input.nextLine();

     System.out.print("Masukan Alamat: ");  
      this.alamatRumah = input.nextLine();

     System.out.print("Masukan No.Telp:" );
     this.notelp = "+62" + input.nextLine();

     System.out.print("Masukan Email: ");
     this.email = input.nextLine();
   }

   public void jenisJasa() {
       System.out.println("Jenis Jasa");
       System.out.println("1. Cuci Mobil");
       System.out.println("2. Salon Mobil Interior");
       System.out.println("3. Salon Mobil Exterior");
       Scanner input = new Scanner(System.in);

       System.out.print("Pilih Jasa: ");
       this.pilihJasa = input.nextInt();

       if(this.pilihJasa == 1) {
          this.pesananJasa = "Cuci Mobil";
       } else if(this.pilihJasa == 2) {
          this.pesananJasa = "Salon Mobil Interior";
       } else if(this.pilihJasa == 3) {
          this.pesananJasa = "Salon Mobil Exterior";
       } else {
          System.out.print("Jenis Jasa Tidak Tersedia");
       }
   }
   public void teamPenyediaJasa() {
       System.out.println("Team Penyedia Jasa");
       System.out.println("1. Team Sea (2 Orang)");
       System.out.println("2. Team Mountain (4 Orang)");
       System.out.println("3. Team Forest (5 Orang)");

      Scanner input = new Scanner(System.in);

       System.out.print("Pilih Jasa: ");
       this.pilihTeam = input.nextInt();

       if(this.pilihTeam == 1) {
          this.pesananTeam = "Team Sea (2 Orang)";
       } else if(this.pilihTeam == 2) {
          this.pesananTeam = "Team Mountain (4 Orang)";
       } else if(this.pilihTeam == 3) {
          this.pesananTeam = "Team Forest (5 Orang)";
       } else {
          System.out.print("Team Layanan Jasa Tidak Tersedia");
       }
   }

   public void keteranganPemesanan() {
    Scanner input = new Scanner(System.in);

    System.out.print("Berikan Keterangan Pemesanan: ");
    this.keterangan = input.nextLine();
  }

   public void biayaPenyediaJasa() {
     Scanner input = new Scanner(System.in);

     System.out.print("Masukan Biaya Penyedia Jasa Rp. ");
     this.biayaJasa = input.nextInt();

     System.out.print("Masukan Biaya Jasa Alat Rp. ");
     this.biayaAlat = input.nextInt();

     System.out.print("Masukan Biaya Bahan Jasa Rp. " );
     this.biayaBahan = input.nextInt();

     System.out.print("Masukan Biaya Transportasi Rp. ");
     this.biayaTransportasi = input.nextInt();

    System.out.println("--------------------*-------------------");
   }
}
