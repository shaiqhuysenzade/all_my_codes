package forWeb.day03.dao;

import forWeb.day03.dao.enum_classes.PhoneSqlEnum;
import forWeb.day03.dbmanager.Database;
import forWeb.day03.entities.PhoneModel;
import forWeb.day03.jdbc.DatabaseConnection;

public class PhoneModelDAO extends Database implements DAO<PhoneModel, String> {
    @Override
    public boolean create(PhoneModel model) {
        boolean result = false;
        try (DatabaseConnection dbc = new DatabaseConnection()) {
            conn = dbc.getConnection();
            pr = conn.prepareStatement(PhoneSqlEnum.INSERT.QUERY);
            pr.setString(1, model.getName());
            result = pr.executeQuery().next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public PhoneModel read(String name) {
        PhoneModel pm = new PhoneModel();
        pm.setName(name);
        try (DatabaseConnection dbc = new DatabaseConnection()) {
            conn = dbc.getConnection();
            pr = conn.prepareStatement(PhoneSqlEnum.READ.QUERY);
            pr.setString(1, name);
            rs = pr.executeQuery();
            if (rs.next()) {
                pm.setId(rs.getInt("id"));
            } else {
                pm.setName("with this name : " + pm.getName() + " there is not such phone model");
                pm.setId(-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pm;
    }

    @Override
    public boolean update(PhoneModel model) {
        boolean result = false;
        try (DatabaseConnection dbc = new DatabaseConnection()) {
            conn = dbc.getConnection();
            pr = conn.prepareStatement(PhoneSqlEnum.UPDATE.QUERY);
            pr.setString(1, model.getName());
            pr.setInt(2, model.getId());
            result = pr.executeQuery().next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean delete(PhoneModel model) {
        boolean result = false;
        try (DatabaseConnection dbc = new DatabaseConnection()) {
            conn = dbc.getConnection();
            pr = conn.prepareStatement(PhoneSqlEnum.DELETE.QUERY);
            pr.setInt(1, model.getId());
            result = pr.executeQuery().next();
        } catch (Exception s) {
            System.out.println();
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneModel pm = new PhoneModel();
        pm.setId(5);
        pm.setName("huaweiu");
        PhoneModelDAO pdao = new PhoneModelDAO();
        System.out.println(pdao.read("samsung"));
    }
}
