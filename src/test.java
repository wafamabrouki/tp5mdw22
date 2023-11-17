public class test {
    public static void main(String[] args) {
            produit p1=new produit("lait",15.2,10,"delice");
            produit p2=new produit("jus",12.45,500,"oh");
            produit p3=new produit("tomate",7.5,12,"sicam");
            magasin MG1=new magasin(5000,"Bouzid",9);
            MG1.ajouter(p1);
            MG1.ajouter(p2);
            MG1.ajouter(p3);
            MG1.affmagasin();
            System.out.println("le nombredu magasin est"+MG1.num);
        System.out.println(p1.comparer(p2));
        System.out.println(p2.comparer1(p2,p2));

        }
    }

