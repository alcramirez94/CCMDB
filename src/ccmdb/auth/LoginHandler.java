/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmdb.auth;

import ccmdb.app.App;
import ccmdb.shared.interfaces.AppInterface;

/**
 *
 * @author ALCra
 */
public class LoginHandler implements LoginInterface{
    
    private final User user = new User();
    private AppInterface appListener;
    private LoginUI loginUI;
    
    public LoginHandler(App app){
        appListener = (AppInterface) app;
        loginUI = new LoginUI(this);
        loginUI.setVisible(true);
    }
    
    /**
     *
     * @param user
     * @param pass
     * @return
     */
    @Override
    public boolean verifyLoginCredentials(String user,char[] pass){
        this.user.setUsername(user);
        this.user.setPassword(new String(pass));
        performLogin();
        return this.user.isUserAuthorized();
    }
    
    private void performLogin(){
        if(user.getUsername().equals("username")&& user.getPassword().equals("tesco")){
            user.authorizeUser();
            loginUI.dispose();
            loginUI = null;
            appListener.initAppHandler(1, user.getUsername());
        }
    }
}
