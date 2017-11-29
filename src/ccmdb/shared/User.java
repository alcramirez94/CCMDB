/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmdb.shared;

/**
 *
 * @author ALCra
 */
public class User {
    private String FirstName;
    private String LastName;
    private String UserName;
    private int AuthLevel;
    
    public User(){
        // Empty
    }
    
    public void setFirstName(String first){
        this.FirstName = first;
    }
    
    public void setLastName(String last){
        this.LastName = last;
    }
    
    public void setUserName(String user){
        this.UserName = user;
    }
    
    public void setAuthLevel(int level){
        this.AuthLevel = level;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public String getUserName(){
        return UserName;
    }
    
    public int getAuthLevel(){
        return AuthLevel;
    }
}
