public class responsable extends employee{
    int prime;
    public responsable(){}
    public responsable(String nom,String adress,int id,int nbheur,int prime){
        super( nom,adress, id, nbheur);
        this.prime=prime;
    }
}
