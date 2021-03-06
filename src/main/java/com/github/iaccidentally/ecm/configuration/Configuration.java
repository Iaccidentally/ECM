/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.iaccidentally.ecm.configuration;

import com.github.iaccidentally.ecm.CommandManager;

/**
 *
 * @author Whisk
 */
public class Configuration {
    private static String stringToReturn;
    
    /**
     * Returns configuration data from the node
     * @param node Configuration node
     * @return String to be returned
     */
    public static String getString(String node) {
        String stringToRetrun = CommandManager.getPlugin().getConfig().getString(node);
        return stringToReturn;
    }
    
    /**
     * Returns configuration data from the node
     * @param node Configuration node
     * @return boolean to be returned
     */
    public static boolean getBoolean(String node) {
        boolean booleanToReturn = CommandManager.getPlugin().getConfig().getBoolean(node);
        return booleanToReturn;
    }
    
    /**
     * Returns configuration data from the node
     * @param node Configuration node
     * @retun int to be returned
     */
    public static int getInt(String node) {
        int intToReturn = CommandManager.getPlugin().getConfig().getInt(node);
        return intToReturn;
    }

}
