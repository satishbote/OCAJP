package org.examlabs.oca1;

class Q25ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line n1
    public void useElectricity(double kWh) {
        addKWh(kWh);
    }
    public void addKWh(double kWh){
        if(kWh>0) {
            this.kWh += kWh;
            this.bill = this.kWh * this.rate;
        }
        System.out.println(this.bill);
    }
}
