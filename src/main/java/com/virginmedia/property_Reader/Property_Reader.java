package com.virginmedia.property_Reader;
import java.io.FileInputStream;
import java.util.Properties;

public class Property_Reader {

    /*
    Rules for implementing singleton design pattern
    1. Make the constructor private
    2. Create a static method to get the instance
    3. Create a static member variable
    */

    //Declare the PropertyReader variable
    private static volatile Property_Reader propInstance;

    //Create Private constructor Because of prevent the Instantiation of class
    private Property_Reader() {

    }

    /**
     * This method will return instance of PropertyReader class
     * @return
     */
    public static synchronized Property_Reader getInstance(){
        if (propInstance == null){
            propInstance = new Property_Reader();
        }
        return propInstance;
    }

    /**
     * This method will read property from property file
     * @param propertyName
     * @return
     */
    public String getProperty(String propertyName){

        Properties prop = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/resources/properties_File/config.properties");
            prop.load(inputStream);
            if (prop.getProperty(propertyName) != null){
                return prop.getProperty(propertyName);
            }
        } catch (Exception e) {
            System.out.println("Property not found");
        }
        return null;
    }
}
