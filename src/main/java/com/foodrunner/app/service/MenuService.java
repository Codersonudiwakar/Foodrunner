package com.foodrunner.app.service;

import java.util.List;

import com.foodrunner.app.entities.Menu;

public interface MenuService {
	 public Menu saveMenu(Menu menu);

	    public List<Menu> getAllMenus();

	    public Menu getMenuById(Long id) ;

	    public Menu updateMenu(Menu menu) ;
	    

	    public void deleteMenu(Long id) ;
}
