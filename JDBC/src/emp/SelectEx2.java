package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // select 구문 시에만 씀 (출력 받는용이므로)

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

            // 4. connection을 통해서 실행하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM emp";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            System.out.println("======================================================================");
            System.out.println("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno");
            System.out.println("======================================================================");

            // 6. 결과값이 담긴 rs에서 하나씩 조회
            if (rs.next()) {
                // number인경우 getInt / varchar면 getString() / Date면 getDate()
                // () 안에 컬럼 번호 아니면 컬럼 명 가능 (번호는 1번부터)
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getInt(4) + "\t");
                System.out.print(rs.getDate(5) + "\t");
                System.out.print(rs.getInt(6) + "\t");
                System.out.print(rs.getInt(7) + "\t");
                System.out.println(rs.getInt(8) + "\t");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
