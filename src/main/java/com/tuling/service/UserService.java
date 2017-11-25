package com.tuling.service;

public class UserService {

    private static final String CONSTANT = "String";

    private Object o;
    /**
     * Creates a new demo.
     * @param o The object   to demonstrate.
     */
    public UserService(Object o) {
        this.o = o;
        String s = CONSTANT + "Other";
        int i = 123;
    }

    public static void main(String[] args) {

        UserService demo = new UserService("a");
        System.out.println(demo.o);
    }
    
    public void deleteUser() {
    	System.out.println("dsf");
    }
    
    public void getUser() {
    	System.out.println("dev add getUser()");
    	System.out.println("sdf");
    }
    
    public void setUser() {
    	
    }
    
}
