package FactoryMethodDesignPattern;

public class PlanFactory {
    public Plan getPlan(String planName){
        if(planName == null){
            return null;
        }
        if(planName.equalsIgnoreCase("domestic")){
            return new DomesticPlan();
        }
        if(planName.equalsIgnoreCase("Commercial")){
            return new CommercialPLan();
        }
        if(planName.equalsIgnoreCase("Institutional")){
            return new InstitutionalPlan();
        }
        return null;
    }
}
