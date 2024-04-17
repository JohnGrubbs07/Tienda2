package com.tienda.service;


import com.tienda.domain.Item;
import java.util.ArrayList;
import java.util.List;

public interface ItemService {

   List<Item> listaItems = new ArrayList <> ();
   
   public List<Item> gets();
   
   // Se recupera el registro que tiene el idItem pasado por parametro
   public Item get(Item item);
   
   //se elimina el registro que tiene el idItem pasado por el parametro
   public void delete(Item item);
   
   public void save(Item item);
   
   public void actualiza(Item item);
   
   public void facturar();

}
