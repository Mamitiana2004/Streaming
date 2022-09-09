/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.util.Date;

/**
 *
 * @author P14A-01-Faneva
 */
public class DateTime {
    
    
    public String getMois(String mois)
    {
        String val="";
        switch(mois)
        {
            case "Jan":
                val="01";
                break;
            case "Fev":
                val="02";
                break;
            case "Mar":
                val="03";
                break;
            case "Apr":
                val="04";
                break;
            case "May":
                val="05";
                break;
            case "Jun":
                val="06";
                break;
            case "Jul":
                val="07";
                break;
            case "Aug":
                val="08";
                break;
            case "Sep":
                val="09";
                break;
            case "Oct":
                val="10";
                break;
            case "Nov":
                val="11";
                break;
            case "Dec":
                val="12";
                break;
            default:
                val="";
                break;
        }
        return val;
    }      
    
    public String convert(Date date)
    {
        String val="";
        String[] dateSplit=date.toString().split(" ");
        val=dateSplit[5]+"-"+getMois(dateSplit[1])+"-"+dateSplit[2];
        return val;
    }
    
    
    
    
}
