package emp2;

import java.util.List;

public class EmpService {
    // EmpDAO 호출
    private EmpDAO empDAO;

    public EmpService(EmpDAO empDAO) {
        this.empDAO = empDAO;
    }

    public boolean addEmp(EmpDTO dto) {
        return empDAO.insert(dto);
    }

    public EmpDTO getrow(int empno) {
        return empDAO.getEmp(empno);
    }

    public List<EmpDTO> getRows() {
        return empDAO.getList();
    }
}
