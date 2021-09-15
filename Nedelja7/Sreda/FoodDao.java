package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;

import java.sql.SQLException;
import java.util.List;

public interface FoodDao {
    void insert(FoodModel fm);
    void addToMeal(int mealID, int foodId, double mass);
    void delete(int id);
    void update(FoodModel fm);
    FoodModel getFood(int id);
    List<FoodModel> getAllFood();
}
