/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.Iaccidentally.ECM.configuration;

import com.github.Iaccidentally.ECM.CommandManager;

/**
 *
 * @author Whisk
 */
public class Configuration {
    
    /**
     * Returns configuration data from the node
     * @param node Configuration node
     * @return String to be returned
     */
    public static String getString(String node) {
        String stringToRetrun = CommandManager.getPlugin().getConfig().getString(node);
        return stringToReturn;
    }

}
