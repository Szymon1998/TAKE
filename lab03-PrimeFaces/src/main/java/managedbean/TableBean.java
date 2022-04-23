/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Szymon
 */
@Named(value = "tableBean")
@SessionScoped
public class TableBean implements Serializable {

    private String firstName;
    private String lastName;
    private Double avg;

    private List<Student> students = new ArrayList<>();

    /**
     * Creates a new instance of tableBean
     */
    public TableBean() {
    }

    public void addStudent() {
        getStudents().add(new Student(getFirstName(), getLastName(), getAvg()));
    }

    /**
     * @return the students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(List<Student> students) {
        this.students = students;
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
