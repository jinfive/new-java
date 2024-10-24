package org.example.Day18.디자인패턴;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ObjectFactory {
    public Object creatObject(String objectType){
        if(objectType.equalsIgnoreCase("A")) {
            return new Aclass();
        }
        else if(objectType.equalsIgnoreCase("B")) {
            return new Bclass();
        }
        else{
            return null;
        }
    }
}
