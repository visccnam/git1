
package JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class EmployManagement {
    public List<Employee> getAllEmployee() throws SQLException{
        List<Employee> employees= new ArrayList<>();
        Connection connection=JDBCConnect.getJDBCConnection();
        
        String sql="select * from Employee";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet rs=preparedStatement.executeQuery();
        while(rs.next()){
            Employee e= new Employee();
            e.setEM_id(rs.getInt("EM_id"));
            e.setFirstName(rs.getString("FirstName"));
            e.setLastName(rs.getString("LastName"));
            e.setTimework(String.valueOf(rs.getTime("TimeWorkInMonth")));
            e.setSalaryPerHours(rs.getFloat("SalaryPerHour"));
            e.setEM_manager(rs.getInt("EM_Manager"));
            e.setBRAND_id(rs.getInt("BRAND_id"));
            employees.add(e);
        }
        return employees;
    }
    public void addEmployee(Employee e){
        try {
            Connection connection=JDBCConnect.getJDBCConnection();
            String sql="insert into Employee values(?,?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(2,e.getFirstName());
            preparedStatement.setString(3,e.getLastName());
            preparedStatement.setString(4,e.getTimework());
            preparedStatement.setFloat(5,e.getSalaryPerHours());
            preparedStatement.setInt(6,e.getEM_manager());
            preparedStatement.setInt(7,e.getBRAND_id());
            int rs=preparedStatement.executeUpdate();
                
        } catch (SQLException ex) {
           
        }
        
        
        
    }
    public void updateEmployee(Employee e){
        Connection connection=JDBCConnect.getJDBCConnection();
        String sql="update Employ set FirstName=?,LastName=?,TimeWorkInMonth=?,SalaryPerHour=?,EM_manager=?,BRAND_id=?"
                + " where EM=?";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(2,e.getFirstName());
            preparedStatement.setString(3,e.getLastName());
            preparedStatement.setString(4,e.getTimework());
            preparedStatement.setFloat(5,e.getSalaryPerHours());
            preparedStatement.setInt(6,e.getEM_manager());
            preparedStatement.setInt(7,e.getBRAND_id());
            int rs=preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            
        }
        
    }
    public void deleteEmployee(int EM_id){
        Connection connection= JDBCConnect.getJDBCConnection();
        String sql="detele from Employee where id=?";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1, EM_id);
            int rs=preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
}
