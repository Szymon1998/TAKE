/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managedbean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Szymon
 */
@Named(value = "formBean")
@RequestScoped
public class FormBean {

    private Integer firstNumber;
    private Integer secondNumber;
    private Integer result;

    /**
     * Creates a new instance of formBean
     */
    public FormBean() {
    }

    public void calculateSum() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
        setResult(getFirstNumber() + getSecondNumber());

        String op = getFirstNumber().toString() + " + " + getSecondNumber().toString() + " = " + getResult().toString();

        FacesMessage msg = new FacesMessage(op);
        context.addMessage("growl", msg);

    }

    public String getCurrentDateTime() {
        return new java.util.Date().toString();
    }

    /**
     * @return the firstNumber
     */
    public Integer getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(Integer firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public Integer getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(Integer secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * @return the result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Integer result) {
        this.result = result;
    }

}
