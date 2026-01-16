public class box{
    double l;
    double h;
    double w;

    box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }

    box(double a){
        this.l=a; this.h=a; this.w=a;
    }

    //copy constructor
    box(box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }

    // class Employee {
    // int id;
    // Address address;

    // Employee(Employee e) {
    //     this.id = e.id;
    //     this.address = new Address(e.address.city); 
    // // Deep copy


    // if new is not there then -> shallow copy

    // }

    void Disply(){
        System.out.println("length"+this.l+" hi");
    }
}

