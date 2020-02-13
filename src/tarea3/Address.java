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
public class Address extends People{
    private String city, cp, country;

    public Address(String city, String cp, String country, String name, String last_name, int age) {
        super(name, last_name, age);
        this.city = city;
        this.cp = cp;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void displayLocation(){
        System.out.println("================Ubicación============================");
        System.out.printf("Ciudad %s Estado %s CP: %s\n",this.getCity(),this.getCountry(),this.getCp());
        System.out.println("=====================================================");
    }
}
