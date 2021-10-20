package com.company;

public class Pensioner extends Human{
    double pension;
    double exemption;

    Pensioner(){
        pension=0.0;
        exemption=0.0;
    }
    Pensioner(int idValue,String nameValue, String surnameValue, int birthValue,int fatherValue, int motherValue, double pensionValue,double exemptionValue, int ... childrenValue){
        super(idValue,nameValue,surnameValue,birthValue,fatherValue,motherValue,childrenValue);
        pension=pensionValue;
        exemption=exemptionValue;
    }
    void print() {
        System.out.println(id+" "+name + " " + surname + " " + birth + " " + exemption + " " + Dochid());
    }

    String druk() {
        return id+" "+name + " " + surname + " " + birth+" "+Dochid();}

    double Dochid(){
        return pension*12;
    }
}
