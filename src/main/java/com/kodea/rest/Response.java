package com.kodea.rest;
 
public class Response {
    private final long id;
    private final double result;
   
    public Response(long id, double result) {
        this.id = id;
        this.result = result;
    }
    public long getId() {
        return id;
    }
    public double getResult() {
        return result;
    }
}
