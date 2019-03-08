package com.mayab.calidad.doubles;

public class Dependency {
    private final SubDependency subDependency;
    public Dependency (SubDependency subDependency){
        super();
        this.subDependency = subDependency;
    } 

    public String getClassName(){
        return this.getClass().getSimpleName();
    }

    public String getSubdependecyClassName(){
        return subDependency.getClassName();
    }

    public int addTwoo(int i){
        return i + 2;
    }
    public String getClassNameUpperCase(){
        return getClassName().toUpperCase();
    }

    public String throwsException() throws Exception{
        throw new IllegalArgumentException("exception");
    }
}