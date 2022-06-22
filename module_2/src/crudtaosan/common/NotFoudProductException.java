package crudtaosan.common;

public class NotFoudProductException extends Exception{
    public NotFoudProductException(){
        System.out.println("id điện thoại ko tồn tại");
    }
}
