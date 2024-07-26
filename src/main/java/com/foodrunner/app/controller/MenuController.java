package com.foodrunner.app.controller;
import java.util.*;
import org.springframework.web.bind.annotation.*;

import com.foodrunner.app.entities.Menu;
import com.foodrunner.app.service.MenuService;

import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping
    public Menu createMenu(@RequestBody Menu menu) {
        return menuService.saveMenu(menu);
    }

    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PutMapping("/{id}")
    public Menu updateMenu(@RequestBody Menu menu, @PathVariable Long id) {
     //   menu.setId(id);
        return menuService.updateMenu(menu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Long id) {
        menuService.deleteMenu(id);
    }
}

