class CarCleaning extends quizPBO2
{
    public CarCleaning() {
       super();
    }

   public String namaPeserta()  {
    return this.nama;
   }

   public String tampilkanJenisJasa() {
    return this.pesananJasa;
   }

   public String tampilkanPenyediaJasa() {
    return this.pesananTeam;
   }

   public String tampilkanKeterangan() {
     return this.keterangan;
   }

   public int jumlahkanBiayaJasa() {
      this.totalBiaya = this.biayaJasa + this.biayaBahan + this.biayaAlat + this.biayaTransportasi;
      return this.totalBiaya;
    }
}


