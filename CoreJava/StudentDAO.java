import java.sql.*;

public class StudentDAO {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "root";

        try {
            Connection con =
                    DriverManager.getConnection(
                            url, user, password);

            String insertQuery =
                    "INSERT INTO students VALUES (?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(insertQuery);

            ps.setInt(1, 101);
            ps.setString(2, "Bhavani");

            ps.executeUpdate();

            String updateQuery =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps2 =
                    con.prepareStatement(updateQuery);

            ps2.setString(1, "Bhavana");
            ps2.setInt(2, 101);

            ps2.executeUpdate();

            System.out.println("Insert and Update Successful");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}