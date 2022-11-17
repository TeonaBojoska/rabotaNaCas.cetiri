package Zadaca4;
class Avtomobil{
    private String marka;
    private String model;
    private int pominatiKM;
    private String boja;
    public Avtomobil(String marka,String model,int pominatiKM,String boja){
        this.marka=marka;
        this.model=model;
        this.pominatiKM=pominatiKM;
        this.boja=boja;
    }
    public String getMarka() {
        return marka;
    }
    public String getModel() {
        return model;
    }
    public int getPominatiKM() {
        return pominatiKM;
    }
    public String getBoja() {
        return boja;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPominatiKM(int pominatiKM) {
        this.pominatiKM = pominatiKM;
    }
    public void setBoja(String boja) {
        this.boja = boja;
    }
    public int prv(int pomnoziKM){
        int vkupnoKM=pominatiKM*pomnoziKM;
        return vkupnoKM;
    }
}
public class Glavna {
    public static void main(String[] args){
        Avtomobil a=new Avtomobil("Ford","Mustang",82,"Black");
        System.out.println("Marka: "+a.getMarka()+" Model:"+a.getModel()+" pominatiKM:"+a.getPominatiKM()
        +" boja:"+a.getBoja());
        System.out.println("Pomnozeni kilometri"+" "+a.prv(5));
    }
}
