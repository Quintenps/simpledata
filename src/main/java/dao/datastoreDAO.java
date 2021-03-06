package dao;

import platform.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by 187z on 6/7/2016.
 */
public class datastoreDAO extends baseDAO {



    ////////////////////
    ///
    /// UPDATE & INSERT
    ///
    /////////////////

    public void updateFirstName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET firstname=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateMiddleName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET middlename=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateLastName(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET lastname=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateGender(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET gender=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateDateOfBirth(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET dateofbirth=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateCountry(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET country=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateCity(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET city=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateTown(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET town=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateFacebook(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET facebook=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateTwitter(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET twitter=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateSkype(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET skype=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateEmailPersonal(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET emailpersonal=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateEmailBusiness(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET emailbusiness=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }
    public void updateWebsite(String df, int sesid) {

        try (Connection con = super.getConnection()) {

            
            

            if (!df.equals("")) {
                PreparedStatement statement = con.prepareStatement("UPDATE Datastore SET website=? WHERE userid=?");
                statement.setString(1, df);
                statement.setInt(2, sesid);
                statement.executeUpdate();
                System.out.println("Cards updated!");
            }


        }catch (SQLException sqle) { sqle.printStackTrace(); }
    }



    ////////////////////
    ///
    /// SELECT
    ///
    /////////////////

    public HashMap<Integer, String> selectAllData(User user) {
        HashMap<Integer, String> datafields = new HashMap();
        int uid = user.getUID();

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Datastore WHERE userid=?");
            statement.setInt(1, uid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

        while(sqlresult.next()) {
            String firstname = sqlresult.getString("firstname");
            String middlename = sqlresult.getString("middlename");
            String lastname = sqlresult.getString("lastname");
            String gender = sqlresult.getString("gender");
            String dateofbirth = sqlresult.getString("dateofbirth");
            String country = sqlresult.getString("country");
            String city = sqlresult.getString("city");
            String town = sqlresult.getString("town");
            String facebook = sqlresult.getString("facebook");
            String twitter = sqlresult.getString("twitter");
            String skype = sqlresult.getString("skype");
            String emailpersonal = sqlresult.getString("emailpersonal");
            String emailbusiness = sqlresult.getString("emailbusiness");
            String website = sqlresult.getString("website");

            datafields.put(1, firstname);
            datafields.put(2, middlename);
            datafields.put(3, lastname);
            datafields.put(4, gender);
            datafields.put(5, dateofbirth);
            datafields.put(6, country);
            datafields.put(7, city);
            datafields.put(8, town);
            datafields.put(9, facebook);
            datafields.put(10, twitter);
            datafields.put(11, skype);
            datafields.put(12, emailpersonal);
            datafields.put(13, emailbusiness);
            datafields.put(14, website);
        }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return datafields;
    }

    public HashMap<Integer, String> selectAllDataByUID(int userid) {
        HashMap<Integer, String> datafields = new HashMap();
        int uid = userid;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT * FROM Datastore WHERE userid=?");
            statement.setInt(1, uid);

            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();

            while(sqlresult.next()) {
                String firstname = sqlresult.getString("firstname");
                String middlename = sqlresult.getString("middlename");
                String lastname = sqlresult.getString("lastname");
                String gender = sqlresult.getString("gender");
                String dateofbirth = sqlresult.getString("dateofbirth");
                String country = sqlresult.getString("country");
                String city = sqlresult.getString("city");
                String town = sqlresult.getString("town");
                String facebook = sqlresult.getString("facebook");
                String twitter = sqlresult.getString("twitter");
                String skype = sqlresult.getString("skype");
                String emailpersonal = sqlresult.getString("emailpersonal");
                String emailbusiness = sqlresult.getString("emailbusiness");
                String website = sqlresult.getString("website");

                datafields.put(1, firstname);
                datafields.put(2, middlename);
                datafields.put(3, lastname);
                datafields.put(4, gender);
                datafields.put(5, dateofbirth);
                datafields.put(6, country);
                datafields.put(7, city);
                datafields.put(8, town);
                datafields.put(9, facebook);
                datafields.put(10, twitter);
                datafields.put(11, skype);
                datafields.put(12, emailpersonal);
                datafields.put(13, emailbusiness);
                datafields.put(14, website);
            }

        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return datafields;
    }

    public int usedDataFields(int userid) {
        int total = 0;

        try (Connection con = super.getConnection()) {

            PreparedStatement statement = con.prepareStatement("SELECT count(firstname) + count(middlename) + count(lastname) + count(gender) + count(dateofbirth) + count(country) + count(city) + count(town) + count(facebook) + count(twitter) + count(skype) + count(emailpersonal) + count(emailbusiness) + count(website) as total  FROM Datastore WHERE userid=?");
            statement.setInt(1, userid);
            System.out.println(statement.toString()); // DEBUG
            ResultSet sqlresult = statement.executeQuery();
            sqlresult.next();
            total = sqlresult.getInt("total");


        }catch (SQLException sqle) { sqle.printStackTrace(); }


        return total;
    }



}