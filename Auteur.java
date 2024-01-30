public class Auteur{
    private String nom;
    private int performance_trag;
    private String citation_trag;
    private int performance_come;
    private String citation_come;
    private int performance_drame;
    private String citation_drame;


    public Auteur(String nom, int performance_trag, String citation_trag, int performance_come, String citation_come, int performance_drame, String citation_drame){
        this.nom= nom;
        this.performance_trag= performance_trag;
        this.citation_trag= citation_trag;
        this.performance_come= performance_come;
        this.citation_come= citation_come;
        this.performance_drame= performance_drame;
        this.citation_drame= citation_drame;
    }

    public int getQualitéTragédie(){
        return this.performance_trag;
    }
    
    @Override
    public String toString(){
        return this.nom + "L'honorable";

    }


}