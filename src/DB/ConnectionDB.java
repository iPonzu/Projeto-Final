import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDB {
    public static void main(String[] args) {
        try{
            Connection conex = DAO.createConnection();
            // Usuario usuario = new Usuario("jose.souza", "José De Souza", "773");

            /* INSERT Usuário */
            /*PreparedStatement stmt = conex.prepareStatement(
                "INSERT INTO usuario (user_name, name, password) VALUES (?, ?, ?);"
            );
            stmt.setString(1, usuario.getUserName());
            stmt.setString(2, usuario.getName());
            stmt.setString(3, usuario.getPassword());
            stmt.execute();*/

            /* SELECT ALL USERS */
            imprimirUsuarios(conex);

            /* DELETE id = 2 */
            PreparedStatement stmt = conex.prepareStatement(
                "DELETE FROM usuario WHERE id = ?;"
            );
            stmt.setInt(1, 2);
            stmt.execute();
            imprimirUsuarios(conex);

            /* UPDATE id = 1 */
            stmt = conex.prepareStatement(
                "UPDATE usuario SET user_name = ?, name = ?, password = ? WHERE id = ?;"
            );
            stmt.setString(1, "tia.bolos");
            stmt.setString(2, "Tia dos Bolos");
            stmt.setString(3, "123457");
            stmt.setInt(4, 1);
            stmt.execute();
            imprimirUsuarios(conex);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void imprimirUsuarios(Connection conex) throws Exception {
        ResultSet rs = conex.createStatement().executeQuery(
            "SELECT * FROM usuario;"
        );
        while(rs.next()){
            Usuario usuario2 = new Usuario(
                rs.getInt("id"), 
                rs.getString("user_name"),
                rs.getString("name"),
                rs.getString("password")
            );
            System.out.println(usuario2);
            System.out.println("===================================");
        }
    }
}

}