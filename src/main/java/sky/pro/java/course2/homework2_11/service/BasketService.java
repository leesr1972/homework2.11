package sky.pro.java.course2.homework2_11.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import sky.pro.java.course2.homework2_11.data.Basket;

import java.util.List;

public interface BasketService {
    List<Integer> add(String item);
    String get();
}
