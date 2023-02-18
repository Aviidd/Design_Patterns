package com.learnjava;

public class PlanFactory {
    public Plan getPlan(String planName){
     if(planName == null){
         return null;
     }
     if(planName.equalsIgnoreCase( "domestic")){
         return new DomesticPlan();
        }
     if(planName.equalsIgnoreCase( "commercial")){
            return new CommercialPlan();
        }
     if(planName.equalsIgnoreCase( "institutional")){
            return new InstitutionalPlan();
        }
     return null;
    }
}
