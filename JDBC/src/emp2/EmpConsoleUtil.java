package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpConsoleUtil {
    public EmpDTO insertEmp(Scanner sc) {
        System.out.println("====================데이터 입력======================");
        System.out.print("사번: ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름: ");
        String ename = sc.nextLine();
        System.out.println("직무: ");
        String job = sc.nextLine();
        System.out.println("매니저번호: ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.println("입사일: ");
        String hiredate = sc.nextLine();
        System.out.println("급여: ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.println("수당: ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.println("부서번호: ");
        int deptno = Integer.parseInt(sc.nextLine());

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public int getEmpNo(Scanner sc) {
        System.out.print("조회할 사번 입력 >> ");
        return Integer.parseInt(sc.nextLine());
    }

    public void printEmp(EmpDTO dto) {
        System.out.println(dto.getEname() + " 사원");
        System.out.println("======================");
        System.out.println("사번: " + dto.getEmpno());
        System.out.println("직무: " + dto.getJob());
        System.out.println("입사일: " + dto.getHiredate());
        System.out.println("급여: " + dto.getSal());
        System.out.println("부서번호: " + dto.getDeptno());
        System.out.println("매니저번호: " + dto.getMgr());
        System.out.println("커미션: " + dto.getComm());
        System.out.println();
    }

    public void printListEmp(List<EmpDTO> list) {
        System.out.println("======================================================================");
        System.out.println("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno");
        System.out.println("======================================================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(
                    list.get(i).getEmpno() + "\t\t" +
                            list.get(i).getEname() + "\t\t" +
                            list.get(i).getJob() + "\t\t" +
                            list.get(i).getMgr() + "\t\t" +
                            list.get(i).getHiredate() + "\t\t" +
                            list.get(i).getSal() + "\t\t" +
                            list.get(i).getComm() + "\t\t" +
                            list.get(i).getDeptno() + "\t\t");
        }

    }
}
