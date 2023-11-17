public class produit {
    String libelle;
    double prix;
     int identifiant;
     String marque ;
    public produit(){}
    public produit(String libelle,double prix,int identifiant,String marque){
        this .libelle=libelle;
        this.prix=prix;
        this.identifiant=identifiant;
        this.marque=marque;
    }
    public void setlibelle(String l){
        this.libelle=l;
    }
    public String getlibelle(){
        return this.libelle;
    }
    public void setprix(double p){
        this.prix=p;
    }
    public double getprix(){
        return this.prix;
    }
    public void setidentifiant(int i){
        this.identifiant=i;
    }
    public int getidentifiant(){
        return this.identifiant;
    }
    public void setmarque(String m){
        this.marque=m;
    }
    public String marque(){
        return this.marque;
    }

    public boolean comparer(produit p1){
        return this.libelle==p1.libelle&&this.prix==p1.prix&&this.identifiant==p1.identifiant&&this.marque==p1.marque;
    }
    public boolean comparer1(produit p1,produit p2){
        return this.libelle==p1.libelle&&this.prix==p1.prix&&this.identifiant==p1.identifiant&&this.marque==p1.marque||this.libelle==p2.libelle&&this.prix==p2.prix&&this.identifiant==p2.identifiant&&this.marque==p2.marque;
    }
}
