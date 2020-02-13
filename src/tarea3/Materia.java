/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

/**
 *
 * @author jeesu
 */
public class Materia extends People{
    private String materia_name;
    private double qualification;

    public Materia(String materia_name, double qualification, String name, String last_name, int age) {
        super(name, last_name, age);
        this.materia_name = materia_name;
        this.qualification = qualification;
    }
    public String getMateria_name() {
        return materia_name;
    }

    public void setMateria_name(String materia_name) {
        this.materia_name = materia_name;
    }

    public double getQualification() {
        return qualification;
    }

    public void setQualification(double qualification) {
        this.qualification = qualification;
    }
    
    public void DisplayTeacherInformation(){
        System.out.println("================Materia==============================");
        System.out.printf("Maestro de la materia %s \ncalificación maxima %f\n",this.getMateria_name(),this.getQualification());
        System.out.println("=====================================================");
    }
    
}
