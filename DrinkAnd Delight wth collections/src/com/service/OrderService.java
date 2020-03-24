package com.service;

import java.util.Map;
import java.util.Set;

import com.Entities.RawMaterialOrder;
import com.Entities.RawMaterialSpecs;
import com.Entities.Supplier;
import com.Entities.Warehouse;
import com.dao.OrderDoa;
import com.dao.OrderIDNotFound;

public class OrderService {
	
	OrderDoa d=new OrderDoa();
	public RawMaterialOrder displayOrders(int userid,int oid) throws OrderIDNotFound
 {
	
	 return d.dispalyOrders(userid,oid);
	 
 }
	public void updateOrder(int uid,int orderid,int value ) throws OrderIDNotFound{
		
			d.updateOrder(uid,orderid, value);
		
		
	}
	
	
	public Set<RawMaterialOrder> display(int userid)
	{
		return d.display(userid);
	}
	public boolean validate(int uid,String uname)
	{
		return d.validate(uid, uname);
	}
	public Map<Integer,RawMaterialSpecs> rawMaterialSpecs()
	  {
		  return d.rawMaterialSpecs();
	  }
	  public Map<Integer,Supplier> supplier()
	  {
		  return d.supplier();
	  }
	  public Map<Integer, Warehouse> watehouseDetails()
	  {
		  return d.watehouseDetails();
	  }
	  public RawMaterialSpecs rawMaterialForPrice(int rid)
	  {
		  return d.rawMaterialForPrice(rid);
	  }
	public void createOrder(RawMaterialOrder e) {
		// TODO Auto-generated method stub
		d.CreateOrder(e);
	}
	
}
