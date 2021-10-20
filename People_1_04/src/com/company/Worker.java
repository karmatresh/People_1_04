package com.company;

public class Worker extends Human{
    String [] job= new String[2];
    String profession;
    double salary;

    Worker(){
        job[0]="";
        job[1]="";
        profession="";
        salary=0.0;
    }
    Worker(int idValue,String nameValue, String surnameValue, int birthValue,int fatherValue, int motherValue,String jobValue1,String jobValue2,String professionValue, double salaryValue, int ... childrenValue){
        super(idValue,nameValue,surnameValue,birthValue,fatherValue,motherValue,childrenValue);

        job[0]=jobValue1;
        job[1]=jobValue2;
        profession=professionValue;
        salary=salaryValue;
    }
    void print() {
        System.out.println(id+" "+name + " " + surname + " " + birth + " " + profession + " " + Dochid());
    }

    String druk() {
        return  id+" "+name + " " + surname + " " + birth+" "+Dochid();}

   double Dochid(){
        return salary*12;
   }
}
