public class magasin {
    public int id;
    public String adresse;
    public int capacite = 50;
    produit tab[] = new produit[capacite];
    public int num = 0;

    public magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
    }

    public magasin() {
    }

    public void affmagasin() {
        System.out.println(this.id);
        System.out.println(this.adresse);
        System.out.println(this.capacite);
        for (int i = 0; i < num; i++) {
            System.out.println(tab[i].getlibelle());
            System.out.println(tab[i].getprix());
        }
    }

    public void ajouter(produit p) {
        if (num < capacite) {
            tab[num] = p;
            num++;
        } else {
            System.out.println("La quantité a dépassé la quantité maximale de produits.");
        }


    }
}