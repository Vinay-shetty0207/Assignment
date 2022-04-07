package com.cg.smms.repository;

import com.cg.smms.entities.Item;
import com.cg.smms.entities.OrderDetails;
import com.cg.smms.entities.ShopOwner;

public interface IShopOwnerRepository {

	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwner(long id);
	public ShopOwner deleteShopOwner(long id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
}
