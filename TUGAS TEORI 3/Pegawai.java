class Pegawai{
   String nama;
   int gaji;
   Pegawai(String nama,int gaji)
   {
      this.nama=nama;
      this.gaji=gaji; 
   }
   int hitungSalary(){
       return gaji;
   }
   void tampilGaji(){
      System.out.println("Nama :"+nama);
      System.out.println("Gaji :"+hitungSalary());
   }
}

class Manager extends Pegawai{
     int bonus;
     Manager(String nama,int gaji,int bonus){
       super(nama,gaji);
       this.bonus=bonus;
     }
     int hitungSalary(){
          return gaji+bonus;
     }
}

class Staff extends Pegawai{
     int lembur;
     int jmllembur;
     Staff(String nama,int gaji,int lembur,int jmllembur){
       super(nama,gaji);
       this.lembur=lembur;
       this.jmllembur=jmllembur;
     }
     int hitungSalary(){
          return gaji+(jmllembur*lembur);
     }
}