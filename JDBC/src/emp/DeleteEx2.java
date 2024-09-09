package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        // ResultSet rs = null; Select때만 쓸거임(result니까 당연)
        Scanner sc = new Scanner(System.in);

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

            System.out.println("삭제할 사번 입력 >> ");
            int empno = sc.nextInt();

            String sql = "DELETE FROM emp_temp WHERE empno=?";

            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empno);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("삭제 성공");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
