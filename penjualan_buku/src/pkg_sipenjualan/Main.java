/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_sipenjualan;

import penjualan.view.loginView;

/**
 * 985
 * @author irfan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        loginView login = new loginView();
        login.setVisible(true); //show form FPenjualan when program run
        login.setLocationRelativeTo(null); //make center position when run
        login.setDefaultCloseOperation(FPenjualan.EXIT_ON_CLOSE);
    }
    
}
