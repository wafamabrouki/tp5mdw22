public class vendeur extends employee {
    int tauxdevente;
    public vendeur(){}
    public vendeur(String nom,String adress,int id,int nbheur,int tauxdevente){
        super(nom,adress, id, nbheur);
        this.tauxdevente=tauxdevente;
    }

}
