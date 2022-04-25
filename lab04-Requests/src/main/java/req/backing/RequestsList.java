/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package req.backing;

import java.time.LocalDate;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.inject.Inject;
import javax.validation.constraints.Size;
import req.entities.Request;
import req.facade.RequestFacadeLocal;

/**
 *
 * @author Szymon
 */
@Named(value = "requestsList")
@RequestScoped
public class RequestsList {

    /**
     * Creates a new instance of RequestsList
     */
    @Inject
    private RequestFacadeLocal requestFacade;
    
    @Size (min = 3, max = 60, message = "{request.size}")
    private String newRequest;

    private HtmlDataTable requestsDataTable;

    public RequestsList() {
    }

    public String addRequest() {
        Request request = new Request();
        request.setRequestDate(LocalDate.now());
        request.setRequestText(this.newRequest);
        this.requestFacade.create(request);
        setNewRequest("");
        return null;
    }

    public String deleteRequest() {
        Request req = (Request) getRequestsDataTable().getRowData();
        this.requestFacade.remove(req);
 return null;
    }

    /**
     * Get the value of requestsDataTable
     *
     * @return the value of requestsDataTable
     */
    public HtmlDataTable getRequestsDataTable() {
        return requestsDataTable;
    }

    /**
     * Set the value of requestsDataTable
     *
     * @param requestsDataTable new value of requestsDataTable
     */
    public void setRequestsDataTable(HtmlDataTable requestsDataTable) {
        this.requestsDataTable = requestsDataTable;
    }

    /**
     * Get the value of newRequest
     *
     * @return the value of newRequest
     */
    public String getNewRequest() {
        return newRequest;
    }

    /**
     * Set the value of newRequest
     *
     * @param newRequest new value of newRequest
     */
    public void setNewRequest(String newRequest) {
        this.newRequest = newRequest;
    }

    public List<Request> getAllRequests() {
        return requestFacade.findAll();
    }

}
