package forWeb.day03.dao;

import com.sun.istack.internal.NotNull;
import forWeb.day03.dao.enum_classes.UserSqlEnum;
import forWeb.day03.dbmanager.Database;
import forWeb.day03.entities.User;
import forWeb.day03.jdbc.DatabaseConnection;

import java.io.IOException;
import java.sql.*;

public class UserDAO extends Database implements DAO<User, String> {
//    private final Connection connection;

//    public UserDAO(Connection connection) {
//        this.connection = connection;
//    }

    @Override
    public boolean create(@NotNull final User user) {
        boolean result = false;
        try (DatabaseConnection dbs = new DatabaseConnection()) {
            conn = dbs.getConnection();
            pr = conn.prepareStatement(UserSqlEnum.INSERT.QUERY);
            pr.setString(1, user.getLogin());
            pr.setString(2, user.getPassword());
            pr.setInt(3, user.getRole().getId());
            result = pr.executeQuery().next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public User read(String login) {
        User result = new User();
        result.setId(-1);//если не найден пользователь
        try (DatabaseConnection dbs = new DatabaseConnection()) {
            conn = dbs.getConnection();
            pr = conn.prepareStatement(UserSqlEnum.GET.QUERY);
            pr.setString(1, login);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                result.setId(Integer.parseInt(rs.getString("id")));
                result.setLogin(login);
                result.setPassword(rs.getString("password"));
                result.setRole(new User.Role(rs.getInt("id"), rs.getString("role")));
            }

        } catch (Exception e) {
            System.out.println("SMTH wrong in read method");
        }
        return result;
    }

    @Override
    public boolean update(@NotNull User user) {
        boolean result = false;
        try (DatabaseConnection dbs = new DatabaseConnection()) {
            conn = dbs.getConnection();
            pr = conn.prepareStatement(UserSqlEnum.UPDATE.QUERY);
            pr.setString(1, user.getPassword());
            pr.setInt(2, user.getId());
            result = pr.executeQuery().next();
        } catch (Exception sql) {
            System.out.println("SMTH wrong in update method");
        }
        return result;
    }

    @Override
    public boolean delete(User user) {
        boolean result = false;
        try (DatabaseConnection dbs = new DatabaseConnection()) {
            conn = dbs.getConnection();
            pr = conn.prepareStatement(UserSqlEnum.DELETE.QUERY);
            pr.setInt(1, user.getId());
            System.out.println(user.getId());
            pr.setString(2, user.getLogin());
            pr.setString(3, user.getPassword());
            System.out.println(user.getPassword());
            System.out.println(user.getLogin());

            result = pr.executeQuery().next();
            System.out.println("Alinmadi");
        } catch (Exception e) {
            System.out.println("SMTH wrong with delete method");
        }
        return result;
    }

    public static void main(String[] args) throws SQLException {

//        final Connection connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        User u = new User("Vusal", "321", 1, "admin");
        User u1 = new User();
        u1.setId(3);
        u1.setPassword("246");
        u1.setLogin("Vusal");

        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.read("Vusal"));
//        System.out.println(userDAO.update(u1));
//        System.out.println(userDAO.);
        System.out.println(userDAO.delete(u1));
    }


}
