package com.hcl;

public class PremiumStall implements Stall{
	private String stall_name;
    private int cost;
    private  String own_name;
    private int projector;
    PremiumStall()
    {

    }
    PremiumStall(String stall_name,String own_name,int cost ,int projector)
    {
        this.stall_name=stall_name;
        this.own_name=own_name;
        this.cost=cost;
        this.projector=projector;
    }

    public void setStall_name(String stall_name) {
        this.stall_name = stall_name;
    }

    public String getStall_name() {
        return stall_name;
    }

    public void setOwn_name(String own_name) {
        this.own_name = own_name;
    }

    public String getOwn_name() {
        return own_name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setProjector(int Projector) {
        this.projector = projector;
    }

    public int getProjector() {
        return projector;
    }
    public void display() {
        System.out.println("Stallname: "+stall_name);
        System.out.println("cost: "+cost);
        System.out.println("ownername: "+own_name);
        System.out.println("projector: "+projector);
    }

}


