/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author P14A-01-Faneva
 */
public class Genre {
    
    public String fullName(String c)
    {
        String val="";
        if(c.compareTo("h")==0)
        {
            val="homme";
        }
        else{
            val="femme";
        }
        return val;
    }

    
}
