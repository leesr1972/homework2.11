package sky.pro.java.course2.homework2_11.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.java.course2.homework2_11.service.BasketService;

@RestController
@Scope(scopeName = "session")
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String addItem(@RequestParam String item) {
        return "Вы положили в корзину следующие товары: " + basketService.add(item);
    }

    @GetMapping("/get")
    public String getItem() {
        return basketService.get();
    }
}
