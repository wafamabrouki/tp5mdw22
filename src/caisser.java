public class caisser extends employee {
 int numero;
 public caisser(){}
    public caisser(String nom,String adress,int id,int nbheur,int numero){
     super( nom,adress, id, nbheur);
     this.numero=numero;
    }

}
