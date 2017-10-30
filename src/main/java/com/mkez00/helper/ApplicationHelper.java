package com.mkez00.helper;

/**
 * Created by michaelkezele on 2017-10-30.
 */
public class ApplicationHelper {
    public static String getEnvironmentVariable(String variableName, String defaultValue){
        String variableValue = System.getenv(variableName);
        if (variableValue==null || variableValue.isEmpty()){
            return defaultValue;
        } else {
            return variableValue;
        }
    }
}
