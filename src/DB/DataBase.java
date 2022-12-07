package DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBase {
    public static void main(String[] args) {
        try{
            Connection connect = DAO.connect();
            // Usuario usuario = new Usuario("jose.souza", "José De Souza", "773");

            /* INSERT Usuário */
            /*PreparedStatement stmt = connect.prepareStatement(
                "INSERT INTO usuario (user_name, name, password) VALUES (?, ?, ?);"
            );
            stmt.setString(1, usuario.getUserName());
            stmt.setString(2, usuario.getName());
            stmt.setString(3, usuario.getPassword());
            stmt.execute();*/

            /* SELECT ALL USERS */
            imprimirUsuarios(connect);

            /* DELETE id = 2 */
            PreparedStatement stmt = connect.prepareStatement(
                "DELETE FROM usuario WHERE id = ?;"
            );
            stmt.setInt(1, 2);
            stmt.execute();
            imprimirUsuarios(connect);

            /* UPDATE id = 1 */
            stmt = connect.prepareStatement(
                "UPDATE usuario SET user_name = ?, name = ?, password = ? WHERE id = ?;"
            );
            stmt.setString(1, "tio.doces");
            stmt.setString(2, "Tio dos Doces");
            stmt.setString(3, "123457");
            stmt.setInt(4, 1);
            stmt.execute();
            imprimirUsuarios(connect);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public static void imprimirUsuarios(Connection connect) throws Exception {
        ResultSet rs = connect.createStatement().executeQuery(
            "SELECT * FROM usuario;"
        );
        while(rs.next()){
            User usuario2 = new Usuario(
                rs.getInt("id"), 
                rs.getString("user_name"),
                rs.getString("name"),
                rs.getString("password")
            );
            System.out.println(usuario2);
            System.out.println("__________________________________");
        }
    }
}