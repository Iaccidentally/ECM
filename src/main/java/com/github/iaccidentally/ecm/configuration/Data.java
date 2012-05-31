/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.iaccidentally.ecm.configuration;

import com.github.iaccidentally.ecm.CommandManager;

public class Data {
    
    public static String getString(String node)
    {
        String stringToReturn = CommandManager.getPlugin().getData().getString(node);
        return stringToReturn;
    }
    
    public static boolean getBoolean(String node)
    {
        boolean booleanToReturn = CommandManager.getPlugin().getData().getBoolean(node);
        return booleanToReturn;
    }
    
    public static int getInt (String node)
    {
        int intToReturn = CommandManager.getPlugin().getData().getInt(node);
        return intToReturn; 
    }
    
    public static double getDouble(String node)
    {
        double intToReturn = CommandManager.getPlugin().getData().getDouble(node);
        return intToReturn;
    }
    
    
}
    