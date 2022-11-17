package Zadaca3;
class Proizvod{
    private String imeNaProizvodot;
    private int cena;
    private String proizvoditel;
    private int tezina;
    public Proizvod(){
        imeNaProizvodot="Good Nature";
        cena=105;
        proizvoditel="Alkaloid";
        tezina=70;
    }
    public String getImeNaProizvodot() {
        return imeNaProizvodot;
    }
    public int getCena() {
        return cena;
    }
    public String getProizvoditel() {
        return proizvoditel;
    }
    public int getTezina() {
        return tezina;
    }
    public void setImeNaProizvodot(String imeNaProizvodot) {
        this.imeNaProizvodot = imeNaProizvodot;
    }
    public void setCena(int cena) {
        this.cena = cena;
    }
    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }
    public void setTezina(int tezina) {
        this.tezina = tezina;
    }
}
public class Glavna {
    public static void main(String[] args){
        Proizvod p=new Proizvod();
        System.out.println("Proizvod:"+" "+p.getImeNaProizvodot());
        System.out.println("Cena:"+" "+p.getCena()+" denari");
        System.out.println("Proizvoditel:"+" "+p.getProizvoditel());
        System.out.println("Tezina:"+" "+p.getTezina()+"gr");
    }
}
