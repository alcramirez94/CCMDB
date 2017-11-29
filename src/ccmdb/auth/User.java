/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmdb.auth;

/**
 *
 * @author ALCRamirez94
 */
class User {
    private String username;
    private String password;
    private boolean authorized = false;
    
    User(){
    }
    
    void setUsername(String user){
        this.username = user;
    }
    
    void setPassword(String pass){
        this.password = pass;
    }
    
    String getUsername(){
        return this.username;
    }
    
    String getPassword(){
        return this.password;
    }
    
    boolean isUserAuthorized(){
        return authorized;
    }
    
    void authorizeUser(){
        this.password = null;
        this.authorized = true;
    }
}
