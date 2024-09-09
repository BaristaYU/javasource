package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEx1 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        // ResultSet rs = null; Select때만 쓸거임(result니까 당연)

        try {
            // 1. 오라클드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. url, user, password
            // localhost(== 127.0.0.1) 적거나 db 주소 적으면 됨
            // 1521: port번호(오라클 기본 포트번호임)
            // xe: 오라클 서버의 인스턴스 이름
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "TIGER";

            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO emp_temp VALUES(7201, 'TEST_USER1','MANAGER',7788,'2016-01-02',4500,NULL,50)";

            pstmt = con.prepareStatement(sql);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("입력 성공");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
