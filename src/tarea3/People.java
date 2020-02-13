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
public class People {
    private String name, last_name;
    private int age;

    public People(String name, String last_name, int age) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     
    public void showProfile(){
        System.out.println("================Perfil Personal======================");
        System.out.printf("Nombre: %s Apellido: %s\nEdad: %d\n",this.getName(),this.getLast_name(),this.getAge());
        System.out.println("=====================================================");
    }
    
    public void is_adult(){
        if(this.getAge() > 18){
            System.out.printf("Es mayor de edad (%d)\n",this.getAge());
        }else{
            System.out.printf("Es menor de edad (%d)\n",this.getAge());
        }
    }
}
