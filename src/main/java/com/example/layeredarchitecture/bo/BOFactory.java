package com.example.layeredarchitecture.bo;

public class BOFactory {
   private static  BOFactory boFactory;
   private BOFactory(){

 }
   public static BOFactory getBoFactory(){
       return (boFactory==null)? boFactory = new BOFactory():boFactory;
   }

   public enum BOTypes{
       CustomerBO,ItemBO,PlaceOrderBO,
   }
public SuperBO getBO(BOTypes boTypes){
       switch (boTypes){
           case CustomerBO:
               return new CustomerBOImpl();
           case ItemBO:
               return new ItemBOImpl();
           case PlaceOrderBO:
               return new PlaceOrderBOImpl();
           default:
               return null;
       }

}
}
