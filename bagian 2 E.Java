Public class Lagu {
    Private String band;
    Private String judul;
    Public void IsiParm (String judul,String band) {
        this.judul=judul;
        this.band=band;
    }
    Public void cetakKelayar(){
            if(judul==null&&band==null)return;
System.out.println("judul:"+judul+"\nBand:"+pencipta);
    }
}
Public class DemoLagu {
    Public static void main (String[]args) {
        Lagu song= new Lagu ();
        song.IsiParam("Dnace Beside","All American Reject");
        song.cetakKelayar();
    }
}