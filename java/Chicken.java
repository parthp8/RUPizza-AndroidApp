package com.pizza;

import java.text.DecimalFormat;

/**
 * Class that represents a Chicken pizza
 * @author Jeeva Ramasamy, Parth Patel
 */
public class Chicken extends Pizza {
    private static final double STARTING_PRICE = 10.99;
    private static final int EXTRA_SAUCE_PRICE = 1;
    private static final int EXTRA_CHEESE_PRICE = 1;
    private static final String PIZZA_TYPE = "Chicken";

    /**
     * Returns the price of the pizza
     * @return price
     */
    @Override
    public double price() {
        double price = STARTING_PRICE;
        price += size.getPriceIncrease();
        if (extraSauce) {
            price += EXTRA_SAUCE_PRICE;
        }
        if (extraCheese) {
            price += EXTRA_CHEESE_PRICE;
        }
        DecimalFormat money = new DecimalFormat("#0.00");
        price = Double.parseDouble(money.format(price));
        return price;
    }

    /**
     * Returns the type of the pizza
     * @return pizzaType
     */
    @Override
    public String getPizzaType() {
        return PIZZA_TYPE;
    }
}