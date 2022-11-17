package Zadaca2;
class Restoran{
    private String ime;
    private String lokacija;
    private String telefon;
    private int brojNaSedishta;

    public String getIme(){
        return ime;
    }
    public String getLokacija(){
        return lokacija;
    }
    public String getTelefon(){
        return telefon;
    }
    public int getBrojNaSedishta(){
        return brojNaSedishta;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setLokacija(String lokacija){
        this.lokacija=lokacija;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }
    public void setBrojNaSedishta(int brojNaSedishta){
        this.brojNaSedishta=brojNaSedishta;
    }
}
public class Glavna {
    public static void main(String[] args){
        Restoran r=new Restoran();
        r.setIme("Vino Bar Bure");
        r.setLokacija("Sirok Sokak");
        r.setTelefon("075/897-777");
        r.setBrojNaSedishta(50);
        System.out.println("Restoranot: "+r.getIme()+", se naogja na "+r.getLokacija()+" i ima telefon:"+r.getTelefon()
                +" i broj na sedishta"+r.getBrojNaSedishta()+".");
    }
}
