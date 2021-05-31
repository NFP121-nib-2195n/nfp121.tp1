package LabClasses;

import java.util.*;
/**
 * Write a description of class LabClass here.
 *
 * @author (Jessica Bassil)
 * @version (a version number or a date)
 */
public class LabClass
{
    
    private TreeMap<String,Etudiant> listeDesEtudiants;
    private TreeMap<String,Prof> listeDesProfs;
    private int numMaxEtudiants;
    private int numEtudiants;
    
    private String time;
    private String roomCode;
    
    /**
     * Constructor for objects of class LabClass
     */
    public LabClass(int numMaxEtudiants)
    {
        listeDesEtudiants= new TreeMap<String,Etudiant>();
        listeDesProfs = new TreeMap<String,Prof>();
        this.numMaxEtudiants = numMaxEtudiants;
        numEtudiants = 0;
    }
    
    public boolean InscrireUnEtudiant(Etudiant etudiant){
        if((numEtudiants+1) == numMaxEtudiants){
            return false;
        } else {
            listeDesEtudiants.put(etudiant.afficheMatricule(), etudiant);
            return true;
        }
    }
    
    public void ajouterUnProf(Prof prof){
        listeDesProfs.put(prof.afficheMatricule(),prof);
    }
    
    public int NombreDEtudiants(){
        return this.numMaxEtudiants;
    }
    
    public void printList(){
        System.out.println("Liste Des Profs:");
        printMyList(listeDesProfs);
        System.out.println("\r\nListe Des Etudiants:");
        printMyList(listeDesEtudiants);
    }
    
    private void printMyList(TreeMap map){
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getValue().toString());
        }
    }
    
    public void setTime(String time){
        this.time = time;
    }
    
    public void setRoomCode(String roomCode){
        this.roomCode = roomCode;
    }
}
