package com.vhicool.dubbo.model;

public class BussinessException extends RuntimeException{
    public BussinessException(){
        super();
    }
    public BussinessException(String messsage){
        super(messsage);
    }
}
