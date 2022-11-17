package Zadaca1;
class Covek{
    private String ime;
    private String prezime;
    private String matichen;
    public Covek(){
        ime=" ";
        prezime=" ";
        matichen=" ";
    }
    public String getIme(){
        return ime;
    }
    public String getPrezime(){
        return prezime;
    }
    public String getMatichen(){
        return matichen;
    }
    public void setIme(String ime){
        this.ime=ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }
    public void setMatichen(String matichen){
        this.matichen=matichen;
    }
}
public class Glavna {
    public static void main(String[] args){
        Covek c=new Covek();
        c.setIme("Teona");
        c.setPrezime("Bojoska");
        c.setMatichen("0512002415012");
        System.out.println("Ime: "+c.getIme());
        System.out.println("Prezime:"+c.getPrezime());
        System.out.println("Matichen:"+c.getMatichen());
    }
}
