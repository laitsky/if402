package week09.vincent.id.ac.umn;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<Employee> employees = new ArrayList<>();
    private List<EmployeeAddedListener> listeners = new ArrayList<>();

    public void addEmployee(Employee employee) {
        // tambah karyawan ke daftar karyawan
        this.employees.add(employee);
        // beritahu daftar listener
        this.notifyEmployeeAddedListeners(employee);
    }

    public void registerEmployeeAddedListener(EmployeeAddedListener listener) {
        // tambah listener ke daftar listener
        this.listeners.add(listener);
    }

    public void unregisterEmployeeAddedListener(EmployeeAddedListener listener) {
        // menghilangkan listener dari daftar listener
        this.listeners.remove(listener);
    }

    protected void notifyEmployeeAddedListeners(Employee employee) {
        // beritahu setiap listener dalam daftar listener
        this.listeners.forEach(listener -> listener.onEmployeeAdded(employee));
    }
}
