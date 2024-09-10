package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeInserer extends CommandeDocument{
    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {

        int pos = Integer.parseInt(parameters[1]);
        String texte = parameters[2];
        this.document.inserer(pos, texte);
    }
}
