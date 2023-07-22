package StdPortal;

import java.sql.*;

public class StudentRepository {
    private Connection con;
    private Statement st;
    private PreparedStatement prst;

    private void getConnection(){
        try {
            this.con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_db", "dev_user", "password");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void getStatement(){
        try {
            this.st=con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    private void getPreparedStatement(String sql){
        try {
            this.prst=con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void createTable(){
        getConnection();
        getStatement();
        try {
            st.execute("create table if not exists student_tbl(" +
                    "studentNumber varchar(8), " +
                    "name varchar(50), " +
                    "surName varchar(50), " +
                    "year varchar(4), " +
                    "selectedLesson varchar(150), " +
                    "debt int" +
                    ")");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void save(Student newStudent) {

        getConnection();
        String sql="insert into student_tbl(studentNumber,name,surName,year) values (?,?,?,?)";
        getPreparedStatement(sql);
        try {
            prst.setString(1,newStudent.getStudentNumber());
            prst.setString(2,newStudent.getName());
            prst.setString(3,newStudent.getSurName());
            prst.setString(4,newStudent.getYear());
            prst.executeUpdate();
            System.out.println("Kayıt işlemi başarı ile gerçekleşmiştir...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                st.close();
                con.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
