package com.example.test;

public class Labrador extends Dog {

    public Labrador(String name) {
        super(name);
    }

    //@Override
    //public boolean equals(Object obj) {
    //    if(this==obj){ // it checks if current instance is the same reference as parameter (obj)
    //        return true;
    //    }
    //    if(obj instanceof Labrador){
    //        String objName = ((Labrador) obj).getName();
    //        return this.getName().equals(objName);
    //    }
    //    return false;
    // }
}
