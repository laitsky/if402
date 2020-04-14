package week09.vincent.id.ac.umn;

public class CountingEmployeeAddedListener implements EmployeeAddedListener {
    private static int employeesAddedCount = 0;

    @Override
    public void onEmployeeAdded(Employee employee) {
        // inkremen jumlah karyawan
        employeesAddedCount++;

        // print jumlah karyawan
        System.out.println("Total karyawan: " + employeesAddedCount);
    }
}
