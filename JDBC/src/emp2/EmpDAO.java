package emp2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    // CRUD 작업을 위한 메소드 작성
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static 블럭: 클래스 로드되면 인스턴스 생성 여부와 상관없이 실행
    static {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String password = "TIGER";

        // con = DriverManager.getConnection(url, user, password);
        // return con;

        return DriverManager.getConnection(url, user, password);
    }

    public void close(Connection con, PreparedStatement pstmt) {
        try {
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 오버로딩
    public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            pstmt.close();
            con.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean insert(EmpDTO dto) {
        boolean flag = false;

        try {
            con = getConnection();

            String sql = "INSERT INTO emp_temp(empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES(?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, dto.getEmpno());
            pstmt.setString(2, dto.getEname());
            pstmt.setString(3, dto.getJob());
            pstmt.setInt(4, dto.getMgr());
            pstmt.setString(5, dto.getHiredate());
            pstmt.setInt(6, dto.getSal());
            pstmt.setInt(7, dto.getComm());
            pstmt.setInt(8, dto.getDeptno());

            int result = pstmt.executeUpdate();

            if (result > 0)
                flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt);
        }
        return flag;
    }

    public EmpDTO getEmp(int empno) {
        EmpDTO dto = null;

        try {
            con = getConnection();

            String sql = "SELECT * FROM emp_temp WHERE empno=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, empno);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt(1));
                dto.setEname(rs.getString(2));
                dto.setJob(rs.getString(3));
                dto.setMgr(rs.getInt(4));
                dto.setHiredate(rs.getString(5));
                dto.setSal(rs.getInt(6));
                dto.setComm(rs.getInt(7));
                dto.setDeptno(rs.getInt(8));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return dto;
    }

    public List<EmpDTO> getList() {
        List<EmpDTO> list = new ArrayList<>();
        EmpDTO dto = null;
        try {
            con = getConnection();

            String sql = "SELECT * FROM emp_temp";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                dto = new EmpDTO();
                dto.setEmpno(rs.getInt(1));
                dto.setEname(rs.getString(2));
                dto.setJob(rs.getString(3));
                dto.setMgr(rs.getInt(4));
                dto.setHiredate(rs.getString(5));
                dto.setSal(rs.getInt(6));
                dto.setComm(rs.getInt(7));
                dto.setDeptno(rs.getInt(8));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }

        return list;
    }

    public boolean empUpdate() {
        boolean flag = false;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return flag;
    }
}
