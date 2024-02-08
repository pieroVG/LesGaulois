package personnages;

public enum Grade {
    SOLDAT("soldat"),
    TESSERARIUS("tesserarius"),
    OPTIO("optio"),
    CENTURION("centurion");

    private String nom;

    private Grade(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}