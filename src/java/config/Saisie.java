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
public class Saisie {
 
    
    ///crypter un texte
    public String crypter(String texte)
    {
        String val="";
        for(int i=0;i<texte.length();i++)
        {
            int c=texte.codePointAt(i)+1372;
            val=val+(char)c;
        }
        return val;
    }
    
    //decrypter
    public String decrypter(String texte)
    {
        String val="";
        for(int i=0;i<texte.length();i++)
        {
            int c=texte.codePointAt(i)-1372;
            val=val+(char)c;
        }
        return val;
    }
   
   
}
