package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }
    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;debut;fin;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte = "";
        try {
           texte = parameters[3];
        } catch (ArrayIndexOutOfBoundsException e) {}
        this.document.remplacer(debut,fin,texte);
        super.executer();
    }
}
