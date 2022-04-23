/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managedbean;

/**
 *
 * @author Szymon
 */
public class Student {

    private String firstName;
    private String lastName;
    private Double avg;

    public Student(String firstName, String lastName, Double avg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avg = avg;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the avg
     */
    public Double getAvg() {
        return avg;
    }

    /**
     * @param avg the avg to set
     */
    public void setAvg(Double avg) {
        this.avg = avg;
    }

}
