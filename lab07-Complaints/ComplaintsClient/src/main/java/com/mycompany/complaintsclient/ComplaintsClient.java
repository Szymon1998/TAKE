/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.complaintsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author Szymon
 */
public class ComplaintsClient {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String count
                = client.target("http://localhost:8080/Complaints/"
                        + "resources/complaints/count")
                        .request(MediaType.TEXT_PLAIN)
                        .get(String.class);

        System.out.println("Count: " + count);

        String allComplaints = client.target("http://localhost:8080/Complaints/"
                + "resources/complaints").
                request(MediaType.APPLICATION_JSON).
                get(String.class);

        System.out.println("All complaints: " + allComplaints);

        String openedComplaint = client.target("http://localhost:8080/Complaints/"
                + "resources/complaints/352").
                request(MediaType.APPLICATION_JSON).
                get(String.class);

        System.out.println("Opened complaint no 352: " + openedComplaint);

        JSONObject openedComplaintJson = new JSONObject(openedComplaint);
        openedComplaintJson.put("status", "closed");

        client.target("http://localhost:8080/Complaints/"
                + "resources/complaints/352").
                request().
                put(Entity.json(openedComplaintJson.toString()));

        System.out.println("Close complaint no 352: ");

        String openedComplaints = client.target("http://localhost:8080/Complaints/"
                + "resources/complaints").
                queryParam("status", "open").
                request(MediaType.APPLICATION_JSON).
                get(String.class);

        System.out.println("All opened complaints:: " + openedComplaints);

        client.close();
    }

}
