package com.webshop.demo.controllers;

import com.webshop.demo.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class main {
    private List<ShopItem> itemList = new ArrayList<>();
    boolean averageStockCalled = false;

    public main() {
        itemList.add(new ShopItem("asd Nike", "asdef", 10.0, "euro", 5));
        itemList.add(new ShopItem("hfb", "Nike", 15.0, "euro", 10));
        itemList.add(new ShopItem("kabd", "drqfeo", 20.0, "euro", 0));
        itemList.add(new ShopItem("iue", "kbwernqnf", 12.0, "euro", 6));
        itemList.add(new ShopItem("ouehwrn", "pr0huigbqf", 13.0, "euro", 9));
    }

    @GetMapping("")
    public String show(@RequestParam(required = false, defaultValue = "World!") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("itemList", itemList);
        return "index";
    }

    @GetMapping("/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("itemList", findItemOutOfStock());
        return "index";
    }

    @GetMapping("/cheapest-first")
    public String cheapestFirst(Model model) {
        model.addAttribute("itemList", organisePriceAscending());
        return "index";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute("itemList", containsNike());
        return "index";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        averageStockCalled = true;
        model.addAttribute("averageStock", averageStock());
        model.addAttribute("itemList", itemList);
        model.addAttribute("averageStockCalled", averageStockCalled);
        return "index";
    }

    @GetMapping("/most-expensive-first")
    public String mostExpensiveFirst(Model model) {
        model.addAttribute("itemList", organisePriceDescending());
        return "index";
    }

    @PostMapping("/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("itemList", searchFuntion(search));
        return "index";
    }

    private List<ShopItem> findItemOutOfStock() {
        return itemList
                .stream()
                .filter(i -> i.getQuantityOfStock() > 0)
                .collect(Collectors.toList());
    }

    private List<ShopItem> organisePriceAscending() {
        return itemList
                .stream()
                .sorted(Comparator.comparingDouble(ShopItem::getPrice))
                .collect(Collectors.toList());
    }

    private List<ShopItem> containsNike() {
        return itemList
                .stream()
                .filter(s -> s.getName().contains("Nike") || s.getDescription().contains("Nike"))
                .collect(Collectors.toList());
    }

    private Double averageStock() {
        Double averageStock = itemList
                .stream()
                .mapToDouble(ShopItem::getPrice)
                .average()
                .getAsDouble();
        return averageStock;
    }

    private List<ShopItem> organisePriceDescending() {
        return itemList
                .stream()
                .sorted((ShopItem item1, ShopItem item2) -> item2.getPrice().compareTo(item1.getPrice()))
                .collect(Collectors.toList());
    }

    private List<ShopItem> searchFuntion(String search) {
        return itemList
                .stream()
                .filter(s -> s.getName().contains(search) || s.getDescription().contains(search))
                .collect(Collectors.toList());

    }

}