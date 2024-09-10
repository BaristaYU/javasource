package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEx2 {
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

            System.out.println("====================데이터 입력======================");
            System.out.print("사번: ");
            int empno = Integer.parseInt(sc.nextLine());
            System.out.print("이름: ");
            String ename = sc.nextLine();
            System.out.print("직무: ");
            String job = sc.nextLine();
            System.out.print("매니저번호: ");
            int mgr = Integer.parseInt(sc.nextLine());
            System.out.print("입사일: ");
            String hiredate = sc.nextLine();
            System.out.print("급여: ");
            int sal = Integer.parseInt(sc.nextLine());
            System.out.print("수당: ");
            int comm = Integer.parseInt(sc.nextLine());
            System.out.print("부서번호: ");
            int deptno = Integer.parseInt(sc.nextLine());

            String sql = "INSERT INTO emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES(?,?,?,?,?,?,?,?)";

            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4, mgr);
            pstmt.setString(5, hiredate);
            pstmt.setInt(6, sal);
            pstmt.setInt(7, comm);
            pstmt.setInt(8, deptno);

            // executeUpdate: insert, delete, update
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
