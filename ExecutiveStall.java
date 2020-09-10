package com.hcl;

public class ExecutiveStall implements Stall {
	private String stall_name;
    private String own_name;
    private int cost;
    private int tv_screen;
    ExecutiveStall(){

    }
    ExecutiveStall(String stall_name,String own_name,int cost ,int tv_screen){
        this.stall_name=stall_name;
        this.own_name=own_name;
        this.cost=cost;
        this.tv_screen=tv_screen;
    }

    public void setStall_name(String stall_name) {
        this.stall_name = stall_name;
    }

    public String getStall_name() {
        return stall_name;
    }

    public void setOwnername(String own_name) {
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

    public void setTv_creen(int tv_screen) {
        this.tv_screen = tv_screen;
    }

    public int getv_Screen() {
        return tv_screen;
    }
    public void display() {
        System.out.println("Stallname: "+stall_name);
        System.out.println("ownername: "+own_name);
        System.out.println("cost: "+cost);
        System.out.println("screen: "+tv_screen);
    }
}


