package revature.data.daos;
import revature.data.app.Cartoon;
import revature.data.utils.ConnectionFactoryUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartoonDAO {

    public List<Cartoon> getCartoon() throws SQLException {

        List<Cartoon> cartoons = new ArrayList<>();
        if (ConnectionFactoryUtility.getInstance() != null) {

            Connection connect = ConnectionFactoryUtility.getConnection();
            String sql = "Select * From cartoons";
            PreparedStatement pstmt = connect.prepareStatement(sql);

            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                Cartoon cartoon = new Cartoon();
                cartoon.setId(result.getInt("id"));
                cartoon.setTitle(result.getString("title"));
                cartoon.setOgCreator(result.getString("original_creator"));
                cartoon.setRating(result.getInt("rating"));
                cartoon.setCategory_id(result.getInt("category_id"));
                cartoons.add(cartoon);


            }

        }

            return cartoons;
    }
}