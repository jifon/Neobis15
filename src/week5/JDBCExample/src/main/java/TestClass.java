import java.io.IOException;
import java.sql.*;

public class TestClass {

    public static void main(String[] args) throws SQLException {

        getConnection();
        add();
        selectInfo();
        update();
        delete();

    }
    //Test
    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/coffeeShop", "root", "root");
        System.out.println("Connection is successful to the database!");
        return connection;
    }

    //Insert method
    public static void add() {
        try {
            Connection connection = getConnection();
            String add = "INSERT INTO `coffee_shop` (`coffee_shop_id`, `coffee_shop_name`, `address`, `phone_number`) VALUES ('1', 'AvenueGrand', 'str. Papinof 35/45', '0555435676');";
            PreparedStatement addInfo = connection.prepareStatement(add);
            addInfo.executeUpdate();
            addInfo.close();
            connection.close();
            System.out.println("Added");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void selectInfo() throws SQLException {
        Connection connection = getConnection();
        String query = "Select coffee_shop_id,coffee_shop_name,address,phone_number From coffee_shop";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int coffee_shop_id = rs.getInt("coffee_shop_id");
                String coffee_shop_name = rs.getString("coffee_shop_name");
                String address = rs.getString("address");
                String phone_number = rs.getString("phone_number");
                System.out.println( coffee_shop_id + ", " + coffee_shop_name +
                        ", " + address + ", " + phone_number);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update() {
        try {
            Connection connection = getConnection();
            String update = "UPDATE coffee_shop SET address = 'str. Papinnof 45/45 ' WHERE coffee_shop_id = 1 ;";
            PreparedStatement updInfo = connection.prepareStatement(update);
            updInfo.execute();
            updInfo.close();
            connection.close();
            System.out.println("Updated");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete() {
        try {
            Connection connection = getConnection();
            String delete = "DELETE FROM coffee_shop WHERE coffee_shop_id = 1;";
            PreparedStatement deletePS = connection.prepareStatement(delete);
            deletePS.execute();
            deletePS.close();
            connection.close();
            System.out.println("Deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
