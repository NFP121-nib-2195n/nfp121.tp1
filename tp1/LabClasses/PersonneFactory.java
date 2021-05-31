package LabClasses;
import java.util.ArrayList;


/**
 * Write a description of class PersonneFactory here.
 *
 * @author (Jessica Bassil)
 * @version (a version number or a date)
 */
public class PersonneFactory
{
    
    private static ArrayList<String> listeDesMatriculesEtudiants = new ArrayList<String>();
    private static ArrayList<String> listeDesMatriculesProfs = new ArrayList<String>();
    
    
    public Personne createPersonne(String personneType, String nom, String prenom, String matricule) throws Exception{

        if(personneType.equalsIgnoreCase("ETUDIANT")){
            if(listeDesMatriculesEtudiants.contains(matricule)){
                System.out.println("Erreur: Cette matricule est deja attribuee a un etudiant.");
                return null;
            }
            listeDesMatriculesEtudiants.add(matricule);
            return new Etudiant(nom,prenom,matricule);
        }
        
        if(personneType.equalsIgnoreCase("PROF")){            
            if(listeDesMatriculesProfs.contains(matricule)){
                System.out.println("Erreur: Cette matricule est deja attribuee a un prof.");
                return null;
            }
            listeDesMatriculesProfs.add(matricule);
            return new Prof(nom,prenom,matricule);
        }
        
        System.out.println("Erreur: Choisi \"Etudiant\" ou \"Prof\" ");
        return null;
    }
}
