/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flex;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shehzar
 */
public class ViewTranscript extends javax.swing.JFrame {

    /**
     * Creates new form ViewTranscript
     */
    public ViewTranscript() throws HeadlessException {
    }

    public ViewTranscript(String id, String name) {
        initComponents();
        setSize(900, 500);
        setLocationRelativeTo(null);
        
//        Student s = new Student();
//        double gpa = s.calculategpa(c);
//        String s1 = Double.toString(gpa);
//        gpafield.setText(s1);
        
        rollnumfield.setText(id);
        namefield.setText(name);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object data[] = new Object[4];

        dbconnectivity obj = new dbconnectivity();
        List<Course> c = new ArrayList<Course>();
        
      

        obj.getGrades(rollnumfield.getText(), c);

        for (Course obj1 : c) {
            data[0] = obj1.courseID;
            data[1] = obj1.courseName;
            data[2] = obj1.creditHours;
            data[3] = obj1.grade;
            model.addRow(data);
        }
        
          Student s = new Student();
        double gpa = s.calculategpa(c);
        String s1 = Double.toString(gpa);
        gpafield.setText(s1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        viewtranscriptgui = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rollnumfield = new javax.swing.JLabel();
        namefield = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        gpafield = new javax.swing.JLabel();
        sidepane3 = new javax.swing.JPanel();
        logo3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        courseregistration1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        viewattendance1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        viewmarks1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        viewtranscript1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        feedback1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        viewregisteredcourses1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        changepassword1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        logout1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        viewfeechallan = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        dropCourse = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        viewtranscriptgui.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Roll no:");

        rollnumfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rollnumfield.setText("jLabel2");

        namefield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namefield.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Credit", "Grade"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("GPA:");

        gpafield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gpafield.setText("jLabel2");

        javax.swing.GroupLayout viewtranscriptguiLayout = new javax.swing.GroupLayout(viewtranscriptgui);
        viewtranscriptgui.setLayout(viewtranscriptguiLayout);
        viewtranscriptguiLayout.setHorizontalGroup(
            viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtranscriptguiLayout.createSequentialGroup()
                .addGroup(viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewtranscriptguiLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1))
                    .addGroup(viewtranscriptguiLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewtranscriptguiLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewtranscriptguiLayout.createSequentialGroup()
                                .addComponent(rollnumfield)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(gpafield))
                            .addComponent(namefield))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        viewtranscriptguiLayout.setVerticalGroup(
            viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewtranscriptguiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rollnumfield)
                    .addComponent(jLabel4)
                    .addComponent(gpafield))
                .addGap(18, 18, 18)
                .addGroup(viewtranscriptguiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namefield))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        sidepane3.setBackground(new java.awt.Color(102, 102, 102));

        logo3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout logo3Layout = new javax.swing.GroupLayout(logo3);
        logo3.setLayout(logo3Layout);
        logo3Layout.setHorizontalGroup(
            logo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logo3Layout.setVerticalGroup(
            logo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        courseregistration1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseregistration1MouseClicked(evt);
            }
        });

        jLabel17.setText("Course Registration");

        javax.swing.GroupLayout courseregistration1Layout = new javax.swing.GroupLayout(courseregistration1);
        courseregistration1.setLayout(courseregistration1Layout);
        courseregistration1Layout.setHorizontalGroup(
            courseregistration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseregistration1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(38, 38, 38))
        );
        courseregistration1Layout.setVerticalGroup(
            courseregistration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseregistration1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewattendance1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewattendance1MouseClicked(evt);
            }
        });

        jLabel18.setText("View Attendance");

        javax.swing.GroupLayout viewattendance1Layout = new javax.swing.GroupLayout(viewattendance1);
        viewattendance1.setLayout(viewattendance1Layout);
        viewattendance1Layout.setHorizontalGroup(
            viewattendance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewattendance1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        viewattendance1Layout.setVerticalGroup(
            viewattendance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewattendance1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewmarks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewmarks1MouseClicked(evt);
            }
        });

        jLabel19.setText("View Marks");

        javax.swing.GroupLayout viewmarks1Layout = new javax.swing.GroupLayout(viewmarks1);
        viewmarks1.setLayout(viewmarks1Layout);
        viewmarks1Layout.setHorizontalGroup(
            viewmarks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmarks1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(57, 57, 57))
        );
        viewmarks1Layout.setVerticalGroup(
            viewmarks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmarks1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewtranscript1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtranscript1MouseClicked(evt);
            }
        });

        jLabel20.setText("View Transcript");

        javax.swing.GroupLayout viewtranscript1Layout = new javax.swing.GroupLayout(viewtranscript1);
        viewtranscript1.setLayout(viewtranscript1Layout);
        viewtranscript1Layout.setHorizontalGroup(
            viewtranscript1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewtranscript1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(47, 47, 47))
        );
        viewtranscript1Layout.setVerticalGroup(
            viewtranscript1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtranscript1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        feedback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedback1MouseClicked(evt);
            }
        });

        jLabel21.setText("Feedback");

        javax.swing.GroupLayout feedback1Layout = new javax.swing.GroupLayout(feedback1);
        feedback1.setLayout(feedback1Layout);
        feedback1Layout.setHorizontalGroup(
            feedback1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedback1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(64, 64, 64))
        );
        feedback1Layout.setVerticalGroup(
            feedback1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedback1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewregisteredcourses1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewregisteredcourses1MouseClicked(evt);
            }
        });

        jLabel22.setText("Registered Courses");

        javax.swing.GroupLayout viewregisteredcourses1Layout = new javax.swing.GroupLayout(viewregisteredcourses1);
        viewregisteredcourses1.setLayout(viewregisteredcourses1Layout);
        viewregisteredcourses1Layout.setHorizontalGroup(
            viewregisteredcourses1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewregisteredcourses1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(38, 38, 38))
        );
        viewregisteredcourses1Layout.setVerticalGroup(
            viewregisteredcourses1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewregisteredcourses1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        changepassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassword1MouseClicked(evt);
            }
        });

        jLabel23.setText("Change Password");

        javax.swing.GroupLayout changepassword1Layout = new javax.swing.GroupLayout(changepassword1);
        changepassword1.setLayout(changepassword1Layout);
        changepassword1Layout.setHorizontalGroup(
            changepassword1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changepassword1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(43, 43, 43))
        );
        changepassword1Layout.setVerticalGroup(
            changepassword1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepassword1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        jLabel24.setText("Logout");

        javax.swing.GroupLayout logout1Layout = new javax.swing.GroupLayout(logout1);
        logout1.setLayout(logout1Layout);
        logout1Layout.setHorizontalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logout1Layout.setVerticalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewfeechallan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewfeechallanMouseClicked(evt);
            }
        });

        jLabel25.setText("View Fee Challan");

        javax.swing.GroupLayout viewfeechallanLayout = new javax.swing.GroupLayout(viewfeechallan);
        viewfeechallan.setLayout(viewfeechallanLayout);
        viewfeechallanLayout.setHorizontalGroup(
            viewfeechallanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewfeechallanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(43, 43, 43))
        );
        viewfeechallanLayout.setVerticalGroup(
            viewfeechallanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewfeechallanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dropCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropCourseMouseClicked(evt);
            }
        });

        jLabel26.setText("Drop Course");

        javax.swing.GroupLayout dropCourseLayout = new javax.swing.GroupLayout(dropCourse);
        dropCourse.setLayout(dropCourseLayout);
        dropCourseLayout.setHorizontalGroup(
            dropCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropCourseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(53, 53, 53))
        );
        dropCourseLayout.setVerticalGroup(
            dropCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropCourseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepane3Layout = new javax.swing.GroupLayout(sidepane3);
        sidepane3.setLayout(sidepane3Layout);
        sidepane3Layout.setHorizontalGroup(
            sidepane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(courseregistration1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewattendance1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewmarks1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewtranscript1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(feedback1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewregisteredcourses1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(changepassword1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewfeechallan, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dropCourse, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepane3Layout.setVerticalGroup(
            sidepane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepane3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseregistration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewattendance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewmarks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewtranscript1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedback1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewregisteredcourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changepassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewfeechallan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(viewtranscriptgui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(viewtranscriptgui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGUI(StudentGUI.id, StudentGUI.name, StudentGUI.batch).setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void courseregistration1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseregistration1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegistrationGUI().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_courseregistration1MouseClicked

    private void viewattendance1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewattendance1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoToAttendance(StudentGUI.id, "Student").setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewattendance1MouseClicked

    private void viewmarks1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewmarks1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoToMarks(StudentGUI.id, "Student").setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewmarks1MouseClicked

    private void viewtranscript1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtranscript1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTranscript(StudentGUI.id, StudentGUI.name).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewtranscript1MouseClicked

    private void feedback1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedback1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new GoToFeedback(StudentGUI.id).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_feedback1MouseClicked

    private void viewregisteredcourses1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewregisteredcourses1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegisteredCourses(StudentGUI.id, StudentGUI.name, StudentGUI.batch).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewregisteredcourses1MouseClicked

    private void changepassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassword1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword("student", StudentGUI.id).setVisible(true);
            }
        });
    }//GEN-LAST:event_changepassword1MouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void viewfeechallanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewfeechallanMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeChallanGUI().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewfeechallanMouseClicked

    private void dropCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropCourseMouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DropCourseGUI(StudentGUI.id).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_dropCourseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTranscript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTranscript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTranscript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTranscript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTranscript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel changepassword1;
    private javax.swing.JPanel courseregistration1;
    private javax.swing.JPanel dropCourse;
    private javax.swing.JPanel feedback1;
    private javax.swing.JLabel gpafield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel logo3;
    private javax.swing.JPanel logout1;
    private javax.swing.JLabel namefield;
    private javax.swing.JLabel rollnumfield;
    private javax.swing.JPanel sidepane3;
    private javax.swing.JPanel viewattendance1;
    private javax.swing.JPanel viewfeechallan;
    private javax.swing.JPanel viewmarks1;
    private javax.swing.JPanel viewregisteredcourses1;
    private javax.swing.JPanel viewtranscript1;
    private javax.swing.JPanel viewtranscriptgui;
    // End of variables declaration//GEN-END:variables
}
