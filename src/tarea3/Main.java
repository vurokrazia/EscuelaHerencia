/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeesu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        ArrayList<People> peoplesList = new ArrayList<People>();
         
        ArrayList<School> schoolList = new ArrayList<School>();
        schoolList.add(new School("Ducens", "Maestro", 12, "Martín", "Alonso", 35));
        schoolList.add(new School("Ducens", "Director", 12, "Jorge", "Fernandez", 55));
        schoolList.add(new School("Ducens", "Maestro", 12, "Fernanda", "Martinez", 29));
        schoolList.add(new School("Ducens", "Maestro", 12, "Fernando", "Ramírez", 32));
        for (School school1 : schoolList) {
            school1.displayJob();
            school1.displayEmployeed();
            school1.showProfile();
            peoplesList.add(school1);
            System.out.println("");
        }
        
        Address address = new Address("Cancún", "789455", "Quintana Roo", "Marcos", "Cruz", 60);
        address.displayLocation();
        address.showProfile();
        System.out.println("");
        peoplesList.add(address);
        
        ArrayList<Materia> materiaList = new ArrayList<Materia>();
        materiaList.add(new Materia("Base de datos", 100, "Rafael", "Ramirez", 35));
        materiaList.add(new Materia("Fundamentos de Base de datos", 100, "Raul", "Ramirez", 35));
        materiaList.add(new Materia("Programación", 100, "Jorge", "Ramirez", 45));
        for (Materia materia : materiaList) {
            materia.DisplayTeacherInformation();
            materia.showProfile();
            System.out.println("");
            peoplesList.add(materia);
        }
        /*
        for (People people : peoplesList) {
            people.showProfile();
        }
        
        */
    }
}
