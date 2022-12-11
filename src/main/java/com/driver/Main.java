package com.driver;

public class Main {
  public static void main(String []args)
  {
      RWOnly obj = new RWOnly();
      /*
      obj.name = "Harshal";
      System.out.println(obj.name);
      error
      java: name has private access in com.driver.RWOnly
      * */
      obj.setName("Harshal Tambat");
      System.out.println(obj.getName());
  }
}