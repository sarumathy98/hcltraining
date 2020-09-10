package com.hcl;

public class GoldStall implements Stall{
    private String stall_name;
    private int cost;
    private String own_name;
    private int num_screen;
    GoldStall(){

   }
   GoldStall(String stall_name,String own_name,int cost,int num_screen)
   {
       this.stall_name=stall_name;
       this.own_name=own_name;
       this.cost=cost;
       this.num_screen=num_screen;
   }

    public void setStall_name(String stall_name) {
        this.stall_name = stall_name;
    }

    public String getStall_name() {
        return stall_name;
    }

    public void setOwner_name(String own_name) {
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

    public void setNum_screen(int num_screen) {
        this.num_screen = num_screen;
    }

    public int getNum_screen() {
        return num_screen;
    } 
    public void display() {
        System.out.println("Stallname:"+stall_name);
        System.out.println("ownername:"+own_name);
        System.out.println("cost:"+cost);
        System.out.println("number of screen:"+num_screen);
    }

}



