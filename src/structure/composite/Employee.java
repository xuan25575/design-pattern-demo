package structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huang_2
 * @Date 2019/12/19 10:51 下午
 * @Description 组合模式
 * 将 对 象 组 合 成 树 形 结 构 以 表 示 “ 部 分 -整 体 ” 的 层 次 结 构 。
 * C o m p o s i t e 使 得 用 户 对 单 个 对 象 和组合对象的使用具有一致性。
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates; // 下属

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
    }

}

