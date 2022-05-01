package sky.pro.java.course2.homework2_11.service;

import org.springframework.stereotype.Service;
import sky.pro.java.course2.homework2_11.data.Basket;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BasketServiceImpl implements BasketService {
    private Basket basket = new Basket();

    @Override
    public List<Integer> add(String item) {
        List<String> basketString = List.of(item.split(","));
        List<Integer> addedItem = basketString.stream().
                map(e -> Integer.parseInt(e)).
                collect(Collectors.toList());
        if (basket == null) {
            basket.setBasket(addedItem);
        }
        basket.addItem(addedItem);
        return addedItem;
    }

    @Override
    public String get() {
        return "Ваша корзина содержит следующие товары: " + basket.getBasket();
    }
}
