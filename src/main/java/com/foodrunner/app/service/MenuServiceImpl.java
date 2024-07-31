package com.foodrunner.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodrunner.app.Repository.MenuRepository;
import com.foodrunner.app.entities.Menu;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	MenuRepository menuRepo;

	@Override
	public Menu saveMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menuRepo.save(menu);
	}

	@Override
	public List<Menu> getAllMenus() {
		// TODO Auto-generated method stub
		
		List<Menu> menus=menuRepo.findAll();
		return menus;
	}

	@Override
	public Menu getMenuById(Long id) {
		// TODO Auto-generated method stub
		return menuRepo.getById(id);
	}

	@Override
	public Menu updateMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menuRepo.save(menu);
	}

	@Override
	public void deleteMenu(Long id) {
		// TODO Auto-generated method stub
		menuRepo.deleteById(id);
		
	}

}
