package com.mkez00.helper;

import java.util.Map;

/**
 * Created by michaelkezele on 2017-10-30.
 */
public class ApplicationHelper {
    public static String getEnvironmentVariable(String variableName, String defaultValue){
        String variableValue = System.getenv(variableName);
        if (variableValue!=null && !variableValue.isEmpty()){
            return variableValue;
        }
        variableValue = System.getProperty(variableName);
        if (variableValue!=null && !variableValue.isEmpty()){
            return variableValue;
        }
        return defaultValue;
    }
}
