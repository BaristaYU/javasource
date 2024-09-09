package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectEx4 {
    public static void main(String[] args) {
        // Select Ex ==> try-with-resources 형태로 변경
        // finally 없이 close하기
        // select 구문 시에만 씀 (출력 받는용이므로)

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        Scanner sc = new Scanner(System.in);
        // System.out.print("조회할 empno 입력 : ");
        // int empno = sc.nextInt();
        // System.out.println();
        System.out.print("조회할 job 입력 : ");
        String job = sc.nextLine();

        // EMP NO 동적처리
        // 스트링 합치기(+) 사용해서 해도 됨
        // ?를 사용하면 pstmt.setInt(1) 구문 사용해서 첫번째 물음표에 뭐 넣기, 두번째(2) ..

        String sql = "SELECT * FROM emp WHERE empno=? OR job=?";

        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            // 1. 오라클드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // try()문 안에 넣으면 안됨: ()는 뭐 켰다껐다 하는거만 들어갈수잇음
            // pstmt.setInt(1, empno);
            pstmt.setString(2, job);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("======================================================================");
            System.out.println("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno");
            System.out.println("======================================================================");

            // 6. 결과값이 담긴 rs에서 하나씩 조회
            while (rs.next()) {
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
        }

    }
}
