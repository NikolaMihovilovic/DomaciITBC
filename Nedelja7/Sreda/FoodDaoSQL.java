package rs.itbootcamp.dao;

import rs.itbootcamp.database.DataBaseConnection;
import rs.itbootcamp.model.FoodModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodDaoSQL implements FoodDao {
    private static final Connection conn = DataBaseConnection.getConnection();

    @Override
    public void insert(FoodModel fm) {

        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO food " +
            "VALUES (?,?,?,?,?,?)");
            st.setInt(1,fm.getFoodId());
            st.setString(2,fm.getFoodName());
            st.setDouble(3,fm.getFoodKcal());
            st.setDouble(4,fm.getFoodProteins());
            st.setDouble(5,fm.getFoodCarbohydrates());
            st.setDouble(6,fm.getFoodFat());
            st.executeUpdate();
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addToMeal(int mealID, int foodId, double mass) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO mealfood VALUES(?, ?, ?)");
            st.setInt(1, mealID);
            st.setInt(2, foodId);
            st.setDouble(3, mass);
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM food WHERE food_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(FoodModel fm) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE food " +
                    "SET food_id = ?, " +
                    "food_name = ?, " +
                    "food_kcal = ?, " +
                    "food_proteins = ?, " +
                    "food_carbs = ?, " +
                    "food_fat = ?, " +
                    "WHERE food_id = ?");
            st.setInt(1,fm.getFoodId());
            st.setString(2,fm.getFoodName());
            st.setDouble(3,fm.getFoodKcal());
            st.setDouble(4,fm.getFoodProteins());
            st.setDouble(5,fm.getFoodCarbohydrates());
            st.setDouble(6,fm.getFoodFat());
            st.setInt(7,fm.getFoodId());
            st.executeUpdate();
            st.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public FoodModel getFood(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food WHERE food_id = " + id);
            rs.next();
            FoodModel fm = new FoodModel(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getDouble(4),
                    rs.getDouble(5),
                    rs.getDouble(6));
            return fm;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodModel> getAllFood() {
        List<FoodModel> foodList = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food");
            while (rs.next()){
                FoodModel fm = new FoodModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6));
                foodList.add(fm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodList;
    }
}

