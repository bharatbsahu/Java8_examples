package com.cg.java8.DesignPatterns;


interface Hotel {
	public Menus getMenus();
}

interface Menus{
}
class NonVegMenu implements Menus{
	public void NonVegMenu() {
		System.out.println("NonVegMenu");
	}
}
class VegMenu implements Menus{
	public void VegMenu() {
		System.out.println("VegMenu");
	}
}
class Both implements Menus{ 
	public void Both() {
		System.out.println("VegMenu & NonVegMenu");
	}
}

class NonVegRestaurant implements Hotel{

	@Override
	public Menus getMenus() {
		NonVegMenu _NonV = new NonVegMenu();
		return _NonV;
	}

}


class VegRestaurant implements Hotel{

	@Override
	public Menus getMenus() {
		VegMenu _Veg = new VegMenu();
		return _Veg;
	}
	
}

class VegNonBothRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		Both _vegNNon = new Both();
		return _vegNNon;
	}
	
}

interface HotelKeeper {
	  public VegMenu getVegMenu();
	  public NonVegMenu getNonVegMenu();
	  public Both getVegNonMenu();
}

 class HotelKeeperImplementation implements HotelKeeper{

	@Override
	public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
	}

	@Override
	public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
	}

	@Override
	public Both getVegNonMenu() {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
	}
	
}

public class S_FacadeMethod_DesignPattern {

	public static void main(String[] args) {
		System.out.println("Hi From => Facade Method Design Pattern..");
		
		HotelKeeper keeper = new HotelKeeperImplementation();
        
        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both Both = keeper.getVegNonMenu();

	}

}
