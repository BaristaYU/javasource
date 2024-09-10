package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        EmpConsoleUtil util = new EmpConsoleUtil();
        EmpService service = new EmpService(new EmpDAO());

        while (run) {

            System.out.println("===================================");
            System.out.println("1. 사원 정보 입력");
            System.out.println("2. 특정 사원 조회");
            System.out.println("3. 전체 사원 조회");
            System.out.println("4. 사원 정보 수정");
            System.out.println("5. 사원 정보 삭제");
            System.out.println("6. 프로 그램 종료");
            System.out.println("===================================");
            System.out.println("");
            System.out.print("메뉴 번호 입력 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // = empDto = new EmpDTO / empDTO = util.insertEmp(sc)
                    EmpDTO empDTO = util.insertEmp(sc);
                    boolean result = service.addEmp(empDTO);
                    System.out.println(result ? "입력성공" : "입력실패");
                    break;
                case 2:
                    // getEmpNo() 호출
                    int empno = util.getEmpNo(sc);
                    // service의 getRow() 호출
                    empDTO = service.getrow(empno);
                    // printEmp() 호출
                    util.printEmp(empDTO);
                    break;
                case 3:
                    List<EmpDTO> list = service.getRows();
                    util.printListEmp(list);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해 주세요");
                    break;
            }
        }
    }
}
