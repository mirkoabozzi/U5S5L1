package mirkoabozzi.U5S5L1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Menu {
    private List<Pizza> pizzaList;
    private List<Topping> toppingList;
    private List<Drink> drinkList;

    public Menu(List<Pizza> pizzaList, List<Topping> toppingList, List<Drink> drinkList) {
        this.pizzaList = pizzaList;
        this.toppingList = toppingList;
        this.drinkList = drinkList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", toppingList=" + toppingList +
                ", drinkList=" + drinkList +
                '}';
    }
}
