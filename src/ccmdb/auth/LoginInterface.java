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
interface LoginInterface {
    
    boolean verifyLoginCredentials(String user,char[] pass);
}
