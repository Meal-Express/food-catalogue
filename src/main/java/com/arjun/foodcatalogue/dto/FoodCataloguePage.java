package com.arjun.foodcatalogue.dto;

import com.arjun.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodCataloguePage {

    private List<FoodItem> foodItemsList;
    private Restaurant restaurant;


    // Getter and Setter for foodItemsList
    public List<FoodItem> getFoodItemsList() {
        return foodItemsList;
    }

    public void setFoodItemsList(List<FoodItem> foodItemsList) {
        this.foodItemsList = foodItemsList;
    }

    // Getter and Setter for restaurant
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}