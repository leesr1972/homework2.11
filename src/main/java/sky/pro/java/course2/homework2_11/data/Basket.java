package sky.pro.java.course2.homework2_11.data;

import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Scope(scopeName = "session")
public class Basket {
    private List<Integer> basket = new ArrayList<>();

    public List<Integer> getBasket() {
        return basket;
    }

    public void setBasket(List<Integer> basket) {
        this.basket = basket;
    }

    public void addItem(List<Integer> addedItem) {
        basket.addAll(addedItem);
    }
}
