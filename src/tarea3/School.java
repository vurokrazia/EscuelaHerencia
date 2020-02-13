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
public class School extends People {
    private String school_name, job;
    private int antiquity;

    public School(String school_name, String job, int antiquity, String name, String last_name, int age) {
        super(name, last_name, age);
        this.school_name = school_name;
        this.job = job;
        this.antiquity = antiquity;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public void displayJob(){
        System.out.println("================Trabajo==============================");
        System.out.printf("Trabajo en el instituto: %s como %s\nAntiguedad del instituto: %d\n",this.getSchool_name(),this.getJob(),this.getAntiquity());
        System.out.println("=====================================================");
    }
    public void displayEmployeed(){
        System.out.println("================Perfl Empleado=======================");
        System.out.printf("Nombre del empleado %s %s\n", this.getName(),this.getLast_name());
        System.out.println("=====================================================");
    }
}
