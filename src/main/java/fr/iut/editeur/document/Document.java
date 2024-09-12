package fr.iut.editeur.document;
/*
   * Voici ma super classe document
 */
public class Document {
    /*
    c'est le texte de mon document !
     */
    private String texte;

    /*

     */
    public Document() {
        this.texte = "";
    }
	/*
	ca permet de recuperer le texte!
	 */
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
    /*
    alors celle la vraiment énorme, je peux ajouter du texte :o
    @param var1 la c'est le super texte que je vais écrire !
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        String portion = texte.substring(debut, fin + 1);
        String majuscule = portion.toUpperCase();
        remplacer(debut, fin, majuscule);
    }

    public void effacer(int debut, int fin){
        remplacer(debut,fin,"");
    }

    public void clear(){
        this.texte="";
    }

    public void inserer(int pos,String txt){
        String partiedroite = texte.substring(pos);
        texte = texte.substring(0,pos);
        ajouter(txt);
        texte = texte + partiedroite;
    }


    @Override
    public String toString() {
        return this.texte;
    }
}
