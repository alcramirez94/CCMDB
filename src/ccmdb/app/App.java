/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccmdb.app;

import ccmdb.asset.AssetHandler;
import ccmdb.asset.AssetPanelUI;
import ccmdb.auth.LoginHandler;
import ccmdb.shared.interfaces.AppInterface;

/**
 *
 * @author ALCRamirez94
 */
public class App implements AppInterface{
    
    AppFrame appFrame;
    LoginHandler loginHandler;
    AssetHandler assetHandler;
    
    
    public App(){
        loginHandler = new LoginHandler(this);
    }
    
    public void initAppHandler(int authLevel,String user){
        loginHandler = null;
        appFrame = new AppFrame();
        switch(authLevel){
            case 0:
                // Customer
                break;
            case 1:
                // Technician
                AssetPanelUI asset = new AssetPanelUI();
                appFrame.getContentPane().add(asset);
                appFrame.setVisible(true);
                break;
            case 2:
                // Manager
                break;
            case 3:
                // Admin
                break;
            default:
                // Nothng
                break;
        }
    }
}
