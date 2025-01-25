package Social;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Main extends javax.swing.JFrame {

    private Animator animatorLogin;
    private Animator animatorBody;
    private boolean signIn = false  ;
    private boolean signInVR = false  ;
    private boolean signInV = false  ;
    private boolean signInD = false;
    private boolean regPane = false;
    
    CardLayout cardLayout ;
    public Main() {
        initComponents();
        getContentPane().setBackground(new Color(245, 245, 245));
        TimingTarget targetLogin = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    background1.setAnimate(fraction);
                } 
                else {
                    background1.setAnimate(1f - fraction);
                    if (signInD) {
                    background1.setAnimate(fraction);
                    } 
                    else 
                    {
                    background1.setAnimate(1f - fraction);
                    if (signInVR) {
                    background1.setAnimate(fraction);
                    } 
                    else 
                    {
                    background1.setAnimate(1f - fraction);
                    if (signInV) {
                    background1.setAnimate(fraction);
                    } 
                    else 
                    {
                    background1.setAnimate(1f - fraction);
                    if (regPane) {
                    background1.setAnimate(fraction);
                    } 
                    else 
                    {
                    background1.setAnimate(1f - fraction);
                    }
                    }
                    }
                    }
                }
                
            }

            @Override
            public void end() {
                if (signIn) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    adminDash.setAlpha(0);
                    adminDash.setVisible(true);
                    animatorBody.start();
                }
               else if (signInD) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    donorDash.setAlpha(0);
                    donorDash.setVisible(true);
                    animatorBody.start();
                }
               else if (signInVR) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    vrDash.setAlpha(0);
                    vrDash.setVisible(true);
                    animatorBody.start();
                }
               else if (signInV) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    volDash.setAlpha(0);
                    volDash.setVisible(true);
                    animatorBody.start();
                }
               else if (regPane) {
                    panelLogin.setVisible(false);
                    background1.setShowPaint(true);
                    registerPane.setAlpha(0);
                    registerPane.setVisible(true);
                    animatorBody.start();
                }
               else {
                    enableLogin(true);
                    txtUser.grabFocus();
                }
            }
        };
        TimingTarget targetBody = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (signIn) {
                    adminDash.setAlpha(fraction);
                } 
                
                else {
                    adminDash.setAlpha(1f - fraction);
                    if (signInD) {
                    donorDash.setAlpha(fraction);
                                 }
                    else {
                    donorDash.setAlpha(1f - fraction);
                    if (signInVR) {
                    vrDash.setAlpha(fraction);
                                 }
                    else {
                    vrDash.setAlpha(1f - fraction);
                    if (signInV) {
                    volDash.setAlpha(fraction);
                                 }
                    else {
                    volDash.setAlpha(1f - fraction);
                    if (regPane) {
                    registerPane.setAlpha(fraction);
                                 }
                    else {
                    registerPane.setAlpha(1f - fraction);
                          }
                          }
                          }
                          } 
                
                }
                
            }

            @Override
            public void end() {
                if (signIn == false && signInD == false && signInVR == false && signInV == false && regPane == false) {
                    background1.setShowPaint(false);
                    background1.setAnimate(1);
                    panelLogin.setVisible(true);
                    animatorLogin.start();
                    donorDash.setVisible(false);
                    adminDash.setVisible(false);
                    vrDash.setVisible(false);
                    volDash.setVisible(false);
                    registerPane.setVisible(false);
                    
                    
                }
               
            }
        };
        animatorLogin = new Animator(1500, targetLogin);
        animatorBody = new Animator(500, targetBody);
        animatorLogin.setResolution(0);
        animatorBody.setResolution(0);
        
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background1 = new com.raven.swing.Background();
        panelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdSignIn = new com.raven.swing.Button();
        txtUser = new com.raven.swing.TextField();
        txtPass = new com.raven.swing.PasswordField();
        cmdReg = new com.raven.swing.Button();
        cmdReset = new com.raven.swing.Button();
        donorDash = new com.raven.swing.PanelTransparent();
        jSplitPane1 = new javax.swing.JSplitPane();
        donorTab = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        donorCard = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        donMon = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton44 = new javax.swing.JButton();
        donItem = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        viewDon = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel65 = new javax.swing.JLabel();
        jButton41 = new javax.swing.JButton();
        viewMyDon = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton45 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        adminDash = new com.raven.swing.PanelTransparent();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        adminCard = new javax.swing.JPanel();
        Login1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        viewVol = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        viewReq = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        requested_table = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        next_button = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton42 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton43 = new javax.swing.JButton();
        compTasks = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        button_back = new javax.swing.JButton();
        next_button2 = new javax.swing.JButton();
        viewAllDon = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton46 = new javax.swing.JButton();
        vrDash = new com.raven.swing.PanelTransparent();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        vrCard = new javax.swing.JPanel();
        Login2 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewNoti = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        reqHelp = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        jButton26 = new javax.swing.JButton();
        r8 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        healthC = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        volDash = new com.raven.swing.PanelTransparent();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel8 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        volCard = new javax.swing.JPanel();
        Login3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        perfTask = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pending_table = new javax.swing.JTable();
        next_button1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        task_id_ = new javax.swing.JLabel();
        date_completed = new javax.swing.JLabel();
        time_spend = new javax.swing.JLabel();
        feedback = new javax.swing.JLabel();
        completed_by = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        compTask = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel67 = new javax.swing.JLabel();
        next_button3 = new javax.swing.JButton();
        registerPane = new com.raven.swing.PanelTransparent();
        jSplitPane5 = new javax.swing.JSplitPane();
        registerTab = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        registerCard = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        regDon = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        phno = new javax.swing.JTextField();
        cpsw = new javax.swing.JPasswordField();
        psw = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        regVR = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        cpin = new javax.swing.JPasswordField();
        pin = new javax.swing.JPasswordField();
        addd = new javax.swing.JTextField();
        fams = new javax.swing.JComboBox<>();
        married = new javax.swing.JRadioButton();
        unmarried = new javax.swing.JRadioButton();
        age = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        phn = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        regV = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        hr = new javax.swing.JComboBox<>();
        phon = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        dateb = new com.toedter.calendar.JDateChooser();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        pass = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fullname = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        panelReset = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        tf_username = new com.raven.swing.TextField();
        pf_password = new com.raven.swing.PasswordField();
        pf_confirm_password = new com.raven.swing.PasswordField();
        cmdSignIn1 = new com.raven.swing.Button();
        cmdReset1 = new com.raven.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background1.setLayout(new java.awt.CardLayout());

        panelLogin.setOpaque(false);

        jPanel1.setOpaque(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N

        cmdSignIn.setBackground(new java.awt.Color(157, 153, 255));
        cmdSignIn.setForeground(new java.awt.Color(255, 255, 255));
        cmdSignIn.setText("Sign In");
        cmdSignIn.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSignInActionPerformed(evt);
            }
        });

        txtUser.setBackground(new java.awt.Color(245, 245, 245));
        txtUser.setLabelText("User Name");
        txtUser.setLineColor(new java.awt.Color(131, 126, 253));
        txtUser.setSelectionColor(new java.awt.Color(157, 153, 255));

        txtPass.setBackground(new java.awt.Color(245, 245, 245));
        txtPass.setLabelText("Password");
        txtPass.setLineColor(new java.awt.Color(131, 126, 253));
        txtPass.setSelectionColor(new java.awt.Color(157, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(cmdSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cmdReg.setBackground(new java.awt.Color(157, 153, 255));
        cmdReg.setForeground(new java.awt.Color(255, 255, 255));
        cmdReg.setText("Register");
        cmdReg.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegActionPerformed(evt);
            }
        });

        cmdReset.setBackground(new java.awt.Color(157, 153, 255));
        cmdReset.setForeground(new java.awt.Color(255, 255, 255));
        cmdReset.setText("Reset");
        cmdReset.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(432, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(529, 529, 529)
                .addComponent(cmdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdReset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdReg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        background1.add(panelLogin, "card2");

        jSplitPane1.setDividerLocation(200);

        donorTab.setBackground(new java.awt.Color(153, 102, 255));

        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton27.setText("Donate Items");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("View Donations");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("Donate Money");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton31.setText("View My Donations");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout donorTabLayout = new javax.swing.GroupLayout(donorTab);
        donorTab.setLayout(donorTabLayout);
        donorTabLayout.setHorizontalGroup(
            donorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        donorTabLayout.setVerticalGroup(
            donorTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donorTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(donorTab);

        donorCard.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(153, 153, 255));
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel4.setText("^.^");
        jLabel4.setOpaque(true);
        Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel3.setText("someone's smile .");
        jLabel3.setOpaque(true);
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel2.setText("Your small donation is the reason behind");
        jLabel2.setOpaque(true);
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/donate-sign-charity-campaign (1).jpg"))); // NOI18N
        Login.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 810));

        donorCard.add(Login, "card1");

        donMon.setBackground(new java.awt.Color(204, 255, 204));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel59.setText("Donate Now");

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setText("Enter your amount:");

        jRadioButton1.setText("$500");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Payment method:");

        jLabel70.setText("Username");

        jLabel5.setText("Full name");

        jLabel7.setText("Contact");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Bkash", "Nagad" }));

        jRadioButton2.setText("$1000");

        jRadioButton3.setText("$2000");

        jRadioButton4.setText("$3000");

        jRadioButton5.setText("$5000");

        jLabel6.setText("Other amount:");

        jLabel71.setBackground(new java.awt.Color(0, 0, 0));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setText("Type your message here:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton44.setBackground(new java.awt.Color(0, 0, 204));
        jButton44.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("Place Donation");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout donMonLayout = new javax.swing.GroupLayout(donMon);
        donMon.setLayout(donMonLayout);
        donMonLayout.setHorizontalGroup(
            donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donMonLayout.createSequentialGroup()
                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donMonLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(donMonLayout.createSequentialGroup()
                                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, donMonLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, donMonLayout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(donMonLayout.createSequentialGroup()
                                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71)))
                            .addGroup(donMonLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(donMonLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        donMonLayout.setVerticalGroup(
            donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donMonLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donMonLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(donMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(donMonLayout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        donorCard.add(donMon, "card3");

        donItem.setBackground(new java.awt.Color(255, 153, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("Donate Now");

        jLabel10.setText("         Username:");

        jLabel11.setText("         Full name:");

        jLabel12.setText("       Contact:");

        jLabel72.setText("          Item name:");

        jLabel73.setText("        Recipient:");

        jLabel74.setText("   Drop off/Pickup location");

        jLabel75.setText("Enter your message");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane11.setViewportView(jTextArea3);

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 255));
        jButton30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Make Your Donation");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout donItemLayout = new javax.swing.GroupLayout(donItem);
        donItem.setLayout(donItemLayout);
        donItemLayout.setHorizontalGroup(
            donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donItemLayout.createSequentialGroup()
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(donItemLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(donItemLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(donItemLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(donItemLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donItemLayout.createSequentialGroup()
                                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, donItemLayout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField13)
                                .addComponent(jTextField14)
                                .addComponent(jTextField15)
                                .addComponent(jTextField16)
                                .addComponent(jTextField6)
                                .addComponent(jTextField5)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        donItemLayout.setVerticalGroup(
            donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donItemLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(donItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton30)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        donorCard.add(donItem, "card4");

        viewDon.setBackground(new java.awt.Color(255, 204, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Full name", "Contact", "Donated cash/item", "Payment method/Location", "Message"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel65.setText("Donation List");

        jButton41.setText("Show all");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewDonLayout = new javax.swing.GroupLayout(viewDon);
        viewDon.setLayout(viewDonLayout);
        viewDonLayout.setHorizontalGroup(
            viewDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDonLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDonLayout.createSequentialGroup()
                        .addGap(0, 439, Short.MAX_VALUE)
                        .addComponent(jLabel65)
                        .addGap(284, 284, 284))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        viewDonLayout.setVerticalGroup(
            viewDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton41)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        donorCard.add(viewDon, "card5");

        viewMyDon.setBackground(new java.awt.Color(204, 255, 204));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Donated Money", "Donated Item", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTable6);

        jButton45.setText("Show");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("View My Donations");

        javax.swing.GroupLayout viewMyDonLayout = new javax.swing.GroupLayout(viewMyDon);
        viewMyDon.setLayout(viewMyDonLayout);
        viewMyDonLayout.setHorizontalGroup(
            viewMyDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMyDonLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(viewMyDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewMyDonLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel13))
                    .addGroup(viewMyDonLayout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jButton45))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        viewMyDonLayout.setVerticalGroup(
            viewMyDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMyDonLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton45)
                .addGap(191, 191, 191))
        );

        donorCard.add(viewMyDon, "card6");

        jSplitPane1.setRightComponent(donorCard);

        javax.swing.GroupLayout donorDashLayout = new javax.swing.GroupLayout(donorDash);
        donorDash.setLayout(donorDashLayout);
        donorDashLayout.setHorizontalGroup(
            donorDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        donorDashLayout.setVerticalGroup(
            donorDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        background1.add(donorDash, "card3");

        jSplitPane2.setDividerLocation(200);

        jPanel4.setBackground(new java.awt.Color(153, 102, 255));

        jButton3.setText("Sign Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("View / Approve Requests");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton32.setText("View Volunteers");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton18.setText("Completed Tasks");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton38.setText("View Donations");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(jPanel4);

        adminCard.setLayout(new java.awt.CardLayout());

        Login1.setBackground(new java.awt.Color(153, 153, 255));
        Login1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel21.setText(" Valar Morghulis ! ");
        jLabel21.setOpaque(true);
        Login1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 210, 82));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin (1).jpg"))); // NOI18N
        Login1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1010, 800));

        adminCard.add(Login1, "card1");

        viewVol.setBackground(new java.awt.Color(255, 255, 102));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Username", "Password", "Date of Birth", "Gender", "Contact Number", "Address", "Available Hours", "Available Days"
            }
        ));
        jScrollPane3.setViewportView(tblData);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel22.setText("Volunteer's Information");

        javax.swing.GroupLayout viewVolLayout = new javax.swing.GroupLayout(viewVol);
        viewVol.setLayout(viewVolLayout);
        viewVolLayout.setHorizontalGroup(
            viewVolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewVolLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(viewVolLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 114, Short.MAX_VALUE))
        );
        viewVolLayout.setVerticalGroup(
            viewVolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewVolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );

        adminCard.add(viewVol, "card3");

        viewReq.setBackground(new java.awt.Color(204, 204, 255));

        requested_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Task Description", "Skills Required", "Duration", "Status"
            }
        ));
        jScrollPane5.setViewportView(requested_table);

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setText("View Requested Task");

        next_button.setText("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        jLabel18.setText("Task ID");

        jButton42.setText("Reject");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Approve / Reject");

        jButton43.setText("Approve");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewReqLayout = new javax.swing.GroupLayout(viewReq);
        viewReq.setLayout(viewReqLayout);
        viewReqLayout.setHorizontalGroup(
            viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewReqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(viewReqLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
            .addGroup(viewReqLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewReqLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(next_button)
                        .addGap(15, 15, 15))
                    .addGroup(viewReqLayout.createSequentialGroup()
                        .addGroup(viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(viewReqLayout.createSequentialGroup()
                                    .addComponent(jButton42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton43))
                                .addGroup(viewReqLayout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        viewReqLayout.setVerticalGroup(
            viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewReqLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next_button)
                .addGap(18, 18, 18)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton42)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );

        adminCard.add(viewReq, "card4");

        compTasks.setBackground(new java.awt.Color(255, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Task Name", "Date Completed", "Time Spent", "Supervisor/Coordinator", "Status/Comment", "Feedback", "Impact", "Completed by"
            }
        ));
        jScrollPane7.setViewportView(jTable2);

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel64.setText("  View Completed Task");

        button_back.setText("Back");
        button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backActionPerformed(evt);
            }
        });

        next_button2.setText("Next");
        next_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout compTasksLayout = new javax.swing.GroupLayout(compTasks);
        compTasks.setLayout(compTasksLayout);
        compTasksLayout.setHorizontalGroup(
            compTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compTasksLayout.createSequentialGroup()
                .addGroup(compTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(compTasksLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(button_back)
                        .addGap(643, 643, 643)
                        .addComponent(next_button2))
                    .addGroup(compTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(compTasksLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(compTasksLayout.createSequentialGroup()
                            .addGap(293, 293, 293)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        compTasksLayout.setVerticalGroup(
            compTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compTasksLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(next_button2)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, compTasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_back)
                .addGap(35, 35, 35))
        );

        adminCard.add(compTasks, "card5");

        viewAllDon.setBackground(new java.awt.Color(204, 255, 153));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Full name", "Contact", "Donated cash/item", "Payment method/Location", "Message", "Date"
            }
        ));
        jScrollPane12.setViewportView(jTable7);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setText("Donation List");

        jButton46.setText("Show all");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewAllDonLayout = new javax.swing.GroupLayout(viewAllDon);
        viewAllDon.setLayout(viewAllDonLayout);
        viewAllDonLayout.setHorizontalGroup(
            viewAllDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAllDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewAllDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewAllDonLayout.createSequentialGroup()
                        .addComponent(jScrollPane12)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAllDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(viewAllDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAllDonLayout.createSequentialGroup()
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewAllDonLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(383, 383, 383))))))
        );
        viewAllDonLayout.setVerticalGroup(
            viewAllDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAllDonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton46)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        adminCard.add(viewAllDon, "card6");

        jSplitPane2.setRightComponent(adminCard);

        javax.swing.GroupLayout adminDashLayout = new javax.swing.GroupLayout(adminDash);
        adminDash.setLayout(adminDashLayout);
        adminDashLayout.setHorizontalGroup(
            adminDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        adminDashLayout.setVerticalGroup(
            adminDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        background1.add(adminDash, "card3");

        jSplitPane3.setDividerLocation(200);

        jPanel6.setBackground(new java.awt.Color(153, 102, 255));

        jButton9.setText("Home");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Request Help");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton20.setText("View Notifications");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton22.setText("Health Care");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("Sign Out");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jSplitPane3.setLeftComponent(jPanel6);

        vrCard.setLayout(new java.awt.CardLayout());

        Login2.setBackground(new java.awt.Color(153, 153, 255));
        Login2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel68.setText("Fighting for a better future . ");
        jLabel68.setOpaque(true);
        Login2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/village  (1).jpg"))); // NOI18N
        Login2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 810));

        vrCard.add(Login2, "card3");

        viewNoti.setBackground(new java.awt.Color(255, 255, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Task ID", "Description", "Feedback", "Contact", "Status"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jButton16.setText("Show");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel78.setText("View Notifications");

        javax.swing.GroupLayout viewNotiLayout = new javax.swing.GroupLayout(viewNoti);
        viewNoti.setLayout(viewNotiLayout);
        viewNotiLayout.setHorizontalGroup(
            viewNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNotiLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addGroup(viewNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        viewNotiLayout.setVerticalGroup(
            viewNotiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewNotiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton16)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        vrCard.add(viewNoti, "card3");

        reqHelp.setBackground(new java.awt.Color(153, 255, 204));

        jLabel58.setText("Skills Required");

        jLabel61.setText("Task Description");

        jLabel62.setText("Task ID");

        desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descActionPerformed(evt);
            }
        });

        jLabel63.setText("Duration");

        r4.setText("Agricultural Skills");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        r3.setText("Plumbing,sweeping or cleaning");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        r5.setText("Healthcare Skills");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        r6.setText("Electrical/Mechanical Skills");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        jButton26.setText("Submit");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        r8.setText("Event Planni");
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        r7.setText("Language Proficiency");

        r2.setText("Carpentry");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        r1.setText("IT and Technology");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        jLabel20.setText("YYYY-MM-DD");

        javax.swing.GroupLayout reqHelpLayout = new javax.swing.GroupLayout(reqHelp);
        reqHelp.setLayout(reqHelpLayout);
        reqHelpLayout.setHorizontalGroup(
            reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqHelpLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reqHelpLayout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reqHelpLayout.createSequentialGroup()
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reqHelpLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reqHelpLayout.createSequentialGroup()
                                .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(reqHelpLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(reqHelpLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(reqHelpLayout.createSequentialGroup()
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(reqHelpLayout.createSequentialGroup()
                                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(r3))
                                    .addGroup(reqHelpLayout.createSequentialGroup()
                                        .addComponent(r6)
                                        .addGap(18, 18, 18)
                                        .addComponent(r7))
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        reqHelpLayout.setVerticalGroup(
            reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reqHelpLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(reqHelpLayout.createSequentialGroup()
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r1)
                                .addComponent(r2)
                                .addComponent(r4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r5)
                            .addComponent(r6)
                            .addComponent(r7)
                            .addComponent(r8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reqHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)))
                .addGap(23, 23, 23)
                .addComponent(jButton26)
                .addContainerGap(534, Short.MAX_VALUE))
        );

        vrCard.add(reqHelp, "card4");

        healthC.setBackground(new java.awt.Color(255, 102, 102));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton6.setText("DIETETICS AND NUTRITION");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel66.setText("Telemedicine");

        jButton49.setText("DENTISTRY");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("RESPIRATORY MEDICINE");

        jButton51.setText("PSYCHOLOGICAL COUN.");

        jButton52.setText("ONOLOGY");

        jButton53.setText("PHYSICAL MEDICINE");

        jButton54.setText("ENT & HEAD NECK");

        jButton55.setText("OPHTHALMOLOGY");

        jButton56.setText("PSYCHIATRY & BHV.");

        jButton57.setText("GASTROENTEROLOGY");

        jButton58.setText("DERMATOLOGY");

        jButton59.setText("NEPHROLOGY");

        jButton60.setText("INTERNAL MEDICINE");

        jButton61.setText("PLASTIC SURGERY");

        jButton62.setText("ENDOCRINOLOGY");

        jButton63.setText("GYNAECOLOGY");

        jButton64.setText("NEUROLOGY");

        jButton65.setText("CARDIAC SURGERY");

        jButton66.setText("PEDIATRICS");

        jButton67.setText("ORTHOPAEDICS");

        javax.swing.GroupLayout healthCLayout = new javax.swing.GroupLayout(healthC);
        healthC.setLayout(healthCLayout);
        healthCLayout.setHorizontalGroup(
            healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthCLayout.createSequentialGroup()
                .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(healthCLayout.createSequentialGroup()
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(healthCLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(healthCLayout.createSequentialGroup()
                            .addGap(385, 385, 385)
                            .addComponent(jLabel66)))
                    .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(healthCLayout.createSequentialGroup()
                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(healthCLayout.createSequentialGroup()
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        healthCLayout.setVerticalGroup(
            healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthCLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(healthCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        vrCard.add(healthC, "card6");

        jSplitPane3.setRightComponent(vrCard);

        javax.swing.GroupLayout vrDashLayout = new javax.swing.GroupLayout(vrDash);
        vrDash.setLayout(vrDashLayout);
        vrDashLayout.setHorizontalGroup(
            vrDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );
        vrDashLayout.setVerticalGroup(
            vrDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane3)
        );

        background1.add(vrDash, "card3");

        jSplitPane4.setDividerLocation(200);

        jPanel8.setBackground(new java.awt.Color(153, 102, 255));

        jButton15.setText("Home");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton19.setText("Completed Tasks");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton24.setText("Perform Tasks");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("Sign Out");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jButton25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(608, Short.MAX_VALUE))
        );

        jSplitPane4.setLeftComponent(jPanel8);

        volCard.setLayout(new java.awt.CardLayout());

        Login3.setBackground(new java.awt.Color(153, 153, 255));
        Login3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Volunteer (1).jpg"))); // NOI18N
        Login3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 810));

        volCard.add(Login3, "card2");

        perfTask.setBackground(new java.awt.Color(204, 255, 204));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setText("Pending Task");

        pending_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Description", "Skills Required", "Due Date", "Status"
            }
        ));
        jScrollPane6.setViewportView(pending_table);

        next_button1.setText("Show");
        next_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_button1ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2-4 Hours", "4-10 Hours", "11-20 Hours", "Above 1 day " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        task_id_.setText("Task ID");

        date_completed.setText("Completed Date");

        time_spend.setText("Time Spend");

        feedback.setText("Feedback");

        completed_by.setText("Completed by");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton21.setText("Submit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Completed Task");

        javax.swing.GroupLayout perfTaskLayout = new javax.swing.GroupLayout(perfTask);
        perfTask.setLayout(perfTaskLayout);
        perfTaskLayout.setHorizontalGroup(
            perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfTaskLayout.createSequentialGroup()
                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfTaskLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6))
                    .addGroup(perfTaskLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(perfTaskLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(next_button1)
                .addGap(0, 479, Short.MAX_VALUE))
            .addGroup(perfTaskLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perfTaskLayout.createSequentialGroup()
                        .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(perfTaskLayout.createSequentialGroup()
                                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(time_spend, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(task_id_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField8))
                                .addGap(18, 18, 18)
                                .addComponent(date_completed, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(completed_by, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(perfTaskLayout.createSequentialGroup()
                                .addComponent(feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(jTextField10))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        perfTaskLayout.setVerticalGroup(
            perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfTaskLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(next_button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(task_id_)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date_completed))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time_spend)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(perfTaskLayout.createSequentialGroup()
                        .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feedback)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(perfTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(completed_by)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );

        volCard.add(perfTask, "card3");

        compTask.setBackground(new java.awt.Color(255, 204, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Date Completed", "Time Spent", "Status/Comment", "Feedback", "Completed by"
            }
        ));
        jScrollPane10.setViewportView(jTable5);

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel67.setText("  View Completed Task");

        next_button3.setText("Next");
        next_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout compTaskLayout = new javax.swing.GroupLayout(compTask);
        compTask.setLayout(compTaskLayout);
        compTaskLayout.setHorizontalGroup(
            compTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compTaskLayout.createSequentialGroup()
                .addGroup(compTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(compTaskLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(next_button3))
                    .addGroup(compTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(compTaskLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(compTaskLayout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        compTaskLayout.setVerticalGroup(
            compTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compTaskLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(next_button3)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        volCard.add(compTask, "card4");

        jSplitPane4.setRightComponent(volCard);

        javax.swing.GroupLayout volDashLayout = new javax.swing.GroupLayout(volDash);
        volDash.setLayout(volDashLayout);
        volDashLayout.setHorizontalGroup(
            volDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );
        volDashLayout.setVerticalGroup(
            volDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane4)
        );

        background1.add(volDash, "card3");

        jSplitPane5.setDividerLocation(200);

        registerTab.setBackground(new java.awt.Color(153, 102, 255));

        jButton11.setText("Log In ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Home");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton35.setText("Register as Donor");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("Register as Volunteer");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("Register as Village Resident");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerTabLayout = new javax.swing.GroupLayout(registerTab);
        registerTab.setLayout(registerTabLayout);
        registerTabLayout.setHorizontalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        registerTabLayout.setVerticalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(556, Short.MAX_VALUE))
        );

        jSplitPane5.setLeftComponent(registerTab);

        registerCard.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(153, 153, 255));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel23.setText("Be a part of our team ");
        jLabel23.setOpaque(true);
        home.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel24.setText("JOIN NOW !");
        jLabel24.setOpaque(true);
        home.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel25.setText("^.^");
        jLabel25.setOpaque(true);
        home.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/29307457177_11a32d9e69_c (1).jpg"))); // NOI18N
        home.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 810));

        registerCard.add(home, "card6");

        regDon.setBackground(new java.awt.Color(204, 255, 204));

        jLabel47.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 255));
        jLabel47.setText("Donor Registration");

        jLabel48.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel48.setText("Full name");

        jLabel49.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel49.setText("Email");

        jLabel50.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel50.setText("Username");

        jLabel51.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel51.setText("Password");

        jLabel52.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel52.setText("C Password");

        jLabel53.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel53.setText("Phone number");

        jLabel54.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel54.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Male", "Female", "Rainbow" }));

        phno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnoActionPerformed(evt);
            }
        });
        phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phnoKeyPressed(evt);
            }
        });

        psw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswActionPerformed(evt);
            }
        });
        psw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswKeyPressed(evt);
            }
        });

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name1KeyPressed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(51, 153, 0));
        jButton17.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Register");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regDonLayout = new javax.swing.GroupLayout(regDon);
        regDon.setLayout(regDonLayout);
        regDonLayout.setHorizontalGroup(
            regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regDonLayout.createSequentialGroup()
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(regDonLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regDonLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpsw))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email1))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(uname))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phno))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regDonLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addGap(0, 61, Short.MAX_VALUE))
                                    .addComponent(name1)))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(regDonLayout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(psw)))))
                .addGap(554, 554, 554))
        );
        regDonLayout.setVerticalGroup(
            regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(463, Short.MAX_VALUE))
        );

        registerCard.add(regDon, "card3");

        regVR.setBackground(new java.awt.Color(255, 153, 255));

        jLabel37.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 255));
        jLabel37.setText("Village Resident Registration");

        jLabel38.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel38.setText("Full name");

        jLabel39.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel39.setText("Phone number");

        jLabel40.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel40.setText("Gender");

        jLabel41.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel41.setText("Age");

        jLabel42.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel42.setText("Marital status");

        jLabel43.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel43.setText("Family members");

        jLabel44.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel44.setText("Address");

        jLabel45.setText("Pin");

        jLabel46.setText("C Pin");

        jButton14.setBackground(new java.awt.Color(51, 153, 0));
        jButton14.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Register");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        cpin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpinActionPerformed(evt);
            }
        });
        cpin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpinKeyPressed(evt);
            }
        });

        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinKeyPressed(evt);
            }
        });

        fams.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "1-2", "3-4", "5-8", "9+" }));

        married.setText("Married");

        unmarried.setText("Unmarried");

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnActionPerformed(evt);
            }
        });
        phn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phnKeyPressed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout regVRLayout = new javax.swing.GroupLayout(regVR);
        regVR.setLayout(regVRLayout);
        regVRLayout.setHorizontalGroup(
            regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regVRLayout.createSequentialGroup()
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regVRLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regVRLayout.createSequentialGroup()
                                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43))
                                .addGap(39, 39, 39)
                                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addd, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                                    .addComponent(fams, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(regVRLayout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(age))
                            .addGroup(regVRLayout.createSequentialGroup()
                                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regVRLayout.createSequentialGroup()
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(married)
                                        .addGap(18, 18, 18)
                                        .addComponent(unmarried))
                                    .addGroup(regVRLayout.createSequentialGroup()
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female))
                                    .addGroup(regVRLayout.createSequentialGroup()
                                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(42, 42, 42)
                                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(phn, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(name)))
                                    .addGroup(regVRLayout.createSequentialGroup()
                                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(90, 90, 90)
                                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(regVRLayout.createSequentialGroup()
                        .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regVRLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regVRLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel37)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        regVRLayout.setVerticalGroup(
            regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regVRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(married)
                    .addComponent(unmarried))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(cpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        registerCard.add(regVR, "card4");

        regV.setBackground(new java.awt.Color(0, 204, 204));

        jLabel26.setFont(new java.awt.Font("HP Simplified", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("Volunteer Registration");

        jLabel27.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel27.setText("Full name");

        jLabel28.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel28.setText("Email");

        jLabel29.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel29.setText("Username");

        jLabel30.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel30.setText("Password");

        jLabel31.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel31.setText("Gender");

        jLabel32.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel32.setText("Date of birth");

        jLabel33.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel33.setText("Address");

        jLabel34.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel34.setText("Phone number");

        jLabel35.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel35.setText("Available hours");

        jLabel36.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel36.setText("Available days");

        jCheckBox7.setText("Friday");

        jCheckBox4.setText("Tuesday");

        jCheckBox1.setText("Saturday");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Sunday");

        jCheckBox5.setText("Wednesday");

        jCheckBox6.setText("Thursday");

        jCheckBox3.setText("Monday");

        hr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "<3 hours", "3-6 hours", "6-9 hours", ">9 hours" }));

        phon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonActionPerformed(evt);
            }
        });
        phon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonKeyPressed(evt);
            }
        });

        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jRadioButton6.setText("Female");

        jRadioButton7.setText("Male");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        fullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fullnameKeyPressed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(51, 153, 0));
        jButton13.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Register");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout regVLayout = new javax.swing.GroupLayout(regV);
        regV.setLayout(regVLayout);
        regVLayout.setHorizontalGroup(
            regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regVLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regVLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(fullname))
                    .addGroup(regVLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(email))
                    .addGroup(regVLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(username))
                    .addGroup(regVLayout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(phon))
                    .addGroup(regVLayout.createSequentialGroup()
                        .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add)
                            .addComponent(hr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(regVLayout.createSequentialGroup()
                                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regVLayout.createSequentialGroup()
                                        .addComponent(jRadioButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton6))
                                    .addGroup(regVLayout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox3))
                                    .addGroup(regVLayout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox6))
                                    .addComponent(jCheckBox7))
                                .addGap(0, 413, Short.MAX_VALUE))
                            .addComponent(pass))))
                .addGap(100, 100, 100))
            .addGroup(regVLayout.createSequentialGroup()
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regVLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regVLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel26)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        regVLayout.setVerticalGroup(
            regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phon, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(regVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        registerCard.add(regV, "card5");

        jSplitPane5.setRightComponent(registerCard);

        javax.swing.GroupLayout registerPaneLayout = new javax.swing.GroupLayout(registerPane);
        registerPane.setLayout(registerPaneLayout);
        registerPaneLayout.setHorizontalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5)
        );
        registerPaneLayout.setVerticalGroup(
            registerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane5)
        );

        background1.add(registerPane, "card3");

        panelReset.setOpaque(false);

        jPanel2.setOpaque(false);

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logo.png"))); // NOI18N

        tf_username.setBackground(new java.awt.Color(245, 245, 245));
        tf_username.setLabelText("User Name");
        tf_username.setLineColor(new java.awt.Color(131, 126, 253));
        tf_username.setSelectionColor(new java.awt.Color(157, 153, 255));

        pf_password.setBackground(new java.awt.Color(245, 245, 245));
        pf_password.setLabelText("Password");
        pf_password.setLineColor(new java.awt.Color(131, 126, 253));
        pf_password.setSelectionColor(new java.awt.Color(157, 153, 255));

        pf_confirm_password.setBackground(new java.awt.Color(245, 245, 245));
        pf_confirm_password.setLabelText("Confirm Password");
        pf_confirm_password.setLineColor(new java.awt.Color(131, 126, 253));
        pf_confirm_password.setSelectionColor(new java.awt.Color(157, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(pf_confirm_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel55)
                .addGap(20, 20, 20)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pf_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        cmdSignIn1.setBackground(new java.awt.Color(157, 153, 255));
        cmdSignIn1.setForeground(new java.awt.Color(255, 255, 255));
        cmdSignIn1.setText("Sign In");
        cmdSignIn1.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdSignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSignIn1ActionPerformed(evt);
            }
        });

        cmdReset1.setBackground(new java.awt.Color(157, 153, 255));
        cmdReset1.setForeground(new java.awt.Color(255, 255, 255));
        cmdReset1.setText("Reset");
        cmdReset1.setEffectColor(new java.awt.Color(199, 196, 255));
        cmdReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResetLayout = new javax.swing.GroupLayout(panelReset);
        panelReset.setLayout(panelResetLayout);
        panelResetLayout.setHorizontalGroup(
            panelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetLayout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(cmdReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSignIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(527, 527, 527))
        );
        panelResetLayout.setVerticalGroup(
            panelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResetLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSignIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        background1.add(panelReset, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSignInActionPerformed
       
   // if (!animatorLogin.isRunning()) {
        String user = txtUser.getText().trim();
        String pass = String.valueOf(txtPass.getPassword());
        boolean action = false;

        if (user.equalsIgnoreCase("admin") && pass.equals("admin")) {
            signIn = true;
            cardLayout = (CardLayout)(adminCard.getLayout());
            animatorLogin.start();
            enableLogin(false);
            }
            else {
            try {
            Conn c1 = new Conn();
            String q  = "select * from login where username = '"+user+"' and pass = '"+pass+"'";
            String r  = "select * from loginR where phone = '"+user+"' and pin = '"+pass+"'";
            String v  = "select * from loginV where nam = '"+user+"' and pass = '"+pass+"'";
            ResultSet rs = c1.s.executeQuery(q);
            if (user.equals("")) {
                txtUser.setHelperText("Please input user name");
                txtUser.grabFocus();
                action = false;
            }
            if (pass.equals("")) {
                txtPass.setHelperText("Please input password");
                if (action) {
                    txtPass.grabFocus();
                }
                action = false;
            }
            if (action) {
                animatorLogin.start();
                enableLogin(false);
            }
            try{
            if(rs.next())
            {
               // rs.getInt(2);                
		signInD = true;
                cardLayout = (CardLayout)(donorCard.getLayout());
             //   action = true ;
                animatorLogin.start();
                enableLogin(false);
                
            }
            
            else if(c1.s.executeQuery(r).next())
            {
                signInVR = true;
                cardLayout = (CardLayout)(vrCard.getLayout());
             //   action = true ;
                animatorLogin.start();
                enableLogin(false);
            }
            else if(c1.s.executeQuery(v).next())
            {
                signInV = true;
                cardLayout = (CardLayout)(volCard.getLayout());
             //   action = true ;
                animatorLogin.start();
                enableLogin(false);
            } 
           
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Name or Pass");
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Incorrect Name or Pass");
            }
            if (action) {
            animatorLogin.start();
            enableLogin(false);
        }
        }
            
        catch (SQLException ex) {
            
        }       
        }
            
            
            
            
            
          //  String u = name.getText();
        //String p = new String(pass.getPassword());
         
           
        //}
    }//GEN-LAST:event_cmdSignInActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       signIn = false;
       signInD = false;
       signInV = false;
       signInVR = false;
       regPane = false;
        clearLogin();
        animatorBody.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        signIn = false;
       signInD = false;
       signInV = false;
       signInVR = false;
       regPane = false;
        clearLogin();
        animatorBody.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cardLayout.show(vrCard, "card3");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        cardLayout.show(volCard, "card2");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        cardLayout.show(donorCard, "card3");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        cardLayout.show(donorCard, "card4");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cardLayout.show(adminCard, "card4");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        
        
        try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM volunteer_info";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            Social.ResultSetTableModel model = new Social.ResultSetTableModel(rs);
            tblData.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
        
        cardLayout.show(adminCard, "card3");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cardLayout.show(adminCard, "card1");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cmdRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegActionPerformed
            regPane = true;
            cardLayout = (CardLayout)(registerCard.getLayout());
            animatorLogin.start();
            enableLogin(false);
    }//GEN-LAST:event_cmdRegActionPerformed

    private void cmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResetActionPerformed
        animatorLogin.start();
        enableLogin(false);
        panelLogin.setVisible(false);
        enableReset(true);
        panelReset.setVisible(true);
        clearLogin();
        clearReset();
        tf_username.grabFocus();
    }//GEN-LAST:event_cmdResetActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String fn = fullname.getText();
        String em = email.getText();
        String un = username.getText();
        String pw = new String(pass.getPassword());

        String gender="";
        if (jRadioButton1.isSelected()) {
            gender = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            gender = jRadioButton2.getText();
        }
        String date = ((JTextField)dateb.getDateEditor().getUiComponent()).getText();
        String ad = add.getText();
        String ph = phon.getText();
        int phlen = ph.length();

        String ah = hr.getSelectedItem().toString();
        String av_days = "";
        if (jCheckBox1.isSelected()) av_days += "Saturday ";
        if (jCheckBox2.isSelected()) av_days += "Sunday ";
        if (jCheckBox3.isSelected()) av_days += "Monday ";
        if (jCheckBox4.isSelected()) av_days += "Tuesday ";
        if (jCheckBox5.isSelected()) av_days += "Wednesday ";
        if (jCheckBox6.isSelected()) av_days += "Thursday ";
        if (jCheckBox7.isSelected()) av_days += "Friday ";

        if (fn.isEmpty() || em.isEmpty() || un.isEmpty() || pw.isEmpty() || date.isEmpty()|| gender.isEmpty() ||ad.isEmpty() ||  ph.isEmpty() ||ah.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
        }
        if (phlen<11)
        {
            JOptionPane.showMessageDialog(null, "Phone number not correct");
        }

        else if (hr.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a gender");
        }
        else{
            try{

                Conn c = new Conn();
                String query="insert into volunteer_info values('"+fn+"','"+em+"','"+un+"','"+pw+"','"+date+"','"+gender+"','"+ph+"','"+ad+"','"+ah+"','"+av_days+"')";
                c.s.executeUpdate(query);
                String query2="insert into loginV values('"+un+"','"+pw+"')";
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Registration Successful!");

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void phonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void cpinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpinActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String n = name.getText();
        String ph = phn.getText();
        String gen = "";
        String ms = "";
        String ag = age.getText();
        String fam = fams.getSelectedItem().toString();
        String add = addd.getText();
        String p = new String(pin.getPassword());
        String cp = new String(cpin.getPassword());

        if (n.isEmpty() || ph.isEmpty() || ag.isEmpty() || fam.isEmpty() || add.isEmpty() || p.isEmpty() || cp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
        } else if (!p.equals(cp)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match, Try again.");
        } else if (!(male.isSelected() || female.isSelected())) {
            JOptionPane.showMessageDialog(null, "Please select a gender option!");
        } else if (!(married.isSelected() || unmarried.isSelected())) {
            JOptionPane.showMessageDialog(null, "Please select a marital status option!");
        } else {
            if (male.isSelected()) {
                gen = male.getText();
            } else if (female.isSelected()) {
                gen = female.getText();
            }

            if (married.isSelected()) {
                ms = married.getText();
            } else if (unmarried.isSelected()) {
                ms = unmarried.getText();
            }

            try {
                Conn c1 = new Conn();
                String q1 = "insert into resident values('" + n + "','" + ph + "','" + gen + "','" + ag + "','" + ms + "','" + fam + "','" + add + "','" + p + "')";
                String q2 = "insert into loginR values('" + ph + "','" + p + "')";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Account Created!");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        String n = name.getText();
        String em = email.getText();
        String un = uname.getText();
        String p = new String(psw.getPassword());
        String cp = new String(cpsw.getPassword());
        String ph = phno.getText();
        String g = gender.getSelectedItem().toString();

        if (n.isEmpty() || em.isEmpty() || un.isEmpty() || p.isEmpty() || cp.isEmpty() || ph.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
        }
        else if (!p.equals(cp))
        {
            JOptionPane.showMessageDialog(this, "Passwords do not match, Try again.");
        }
        else if (gender.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a gender");
        }
        else {
            try {
                Conn c1 = new Conn();
                String q1 = "insert into donor values('" + n + "','" + em + "','" + un + "','" + p + "','" + ph + "','" + g + "')";
                String q2 = "insert into login values('" + un + "','" + p + "')";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
               
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void phnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnoActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        cardLayout.show(registerCard, "card4");
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        cardLayout.show(registerCard, "card3");
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        signIn = false;
       signInD = false;
       signInV = false;
       signInVR = false;
       regPane = false;
        clearLogin();
        animatorBody.start();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        cardLayout.show(registerCard, "card5");
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        cardLayout.show(adminCard, "card5");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void cmdSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSignIn1ActionPerformed
       
        animatorBody.start();
        enableReset(false);
        panelReset.setVisible(false);
        signIn = false;
       signInD = false;
       signInV = false;
       signInVR = false;
       regPane = false;
        clearLogin();
        clearReset();
        
    }//GEN-LAST:event_cmdSignIn1ActionPerformed

    private void cmdReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReset1ActionPerformed
        String names = tf_username.getText();
        String pass = new String(pf_password.getPassword());
        String confirm_password = new String(pf_confirm_password.getPassword());
        if (pass.equals(confirm_password)) {
            try {
                Conn c1 = new Conn();
                String selectQuery = "SELECT username FROM login WHERE username = ?";
                PreparedStatement selectStatement = c1.c.prepareStatement(selectQuery);
                selectStatement.setString(1, names);
                ResultSet resultSet = selectStatement.executeQuery();
                
                if (resultSet.next()) {
                    String updateQuery = "UPDATE login SET pass = ? WHERE username = ?";
                    PreparedStatement updateStatement = c1.c.prepareStatement(updateQuery);
                    updateStatement.setString(1, pass);
                    updateStatement.setString(2, names);
                    int rowsUpdated = updateStatement.executeUpdate();

                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Password changed");
                    } else {
                        JOptionPane.showMessageDialog(null, "Password unchanged");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username not found");
                }

                c1.c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Passwords do not match");
        }
    }//GEN-LAST:event_cmdReset1ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM approve";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            ResultSetTableModel model = new ResultSetTableModel(rs);
            jTable1.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void next_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_button1ActionPerformed
        try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM requestedTask";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            Social.ResultSetTableModel model = new Social.ResultSetTableModel(rs);
            pending_table.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_next_button1ActionPerformed

    private void descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String i = id.getText();
        String des = desc.getText();
        //String loca = location.getText();
       // String date = ((JTextField) jDateChooser1.getDateEditor().getUiComponent()).getText();
        String ski = " ";
        String d = jTextField17.getText();
        if (r1.isSelected()) {
            ski = r1.getText();
        }  if (r2.isSelected()) {
            ski = r2.getText();
        }  if (r3.isSelected()) {
            ski = r3.getText();
        }  if (r4.isSelected()) {
            ski = r4.getText();
        }  if (r5.isSelected()) {
            ski = r5.getText();
        }  if (r6.isSelected()) {
            ski = r6.getText();
        }  if (r7.isSelected()) {
            ski = r7.getText();
        }  if (r8.isSelected()) {
            ski = r8.getText();
        }
        
        if (i.isEmpty() || des.isEmpty() || ski.isEmpty() || d.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
        } 

        else{ 

        try {
            Conn c1 = new Conn();
            String q1 = "insert into requestedTask values('" + i + "','" + des + "','" + ski + "','" + d + "','')";
            String query2="insert into approve values('"+i+"','','','')";
             c1.s.executeUpdate(query2);

            c1.s.executeUpdate(q1);

            JOptionPane.showMessageDialog(null, "Information Created!");
            id.setText("");
            desc.setText("");
            jTextField17.setText("");
            
            r1.removeAll();
            r2.removeAll();
            r3.removeAll();
            r4.removeAll();
            r5.removeAll();
            r6.removeAll();
            r7.removeAll();
            r8.removeAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r8ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        cardLayout.show(adminCard, "card6");
    }//GEN-LAST:event_jButton38ActionPerformed

    private void button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_backActionPerformed

    private void next_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_button2ActionPerformed
        try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM completed_task";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            Social.ResultSetTableModel model = new Social.ResultSetTableModel(rs);
            jTable5.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_next_button2ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        try {
            Conn c = new Conn();
            String query1 = "SELECT * FROM donate_money";
            ResultSet rs1 = c.s.executeQuery(query1);

            while (rs1.next()) {
                String[] row = new String[6];
                row[0] = rs1.getString("username");
                row[1] = rs1.getString("fullName");
                row[2] = rs1.getString("contact");
                row[3] = rs1.getString("amount");
                row[4] = rs1.getString("payment");
                row[5] = rs1.getString("message");
                model.addRow(row);
            }

            String query2 = "SELECT * FROM donate_items";
            ResultSet rs2 = c.s.executeQuery(query2);

            while (rs2.next()) {
                String[] row = new String[6];
                row[0] = rs2.getString("username");
                row[1] = rs2.getString("fullName");
                row[2] = rs2.getString("contact");
                row[3] = rs2.getString("itemname");
                row[4] = rs2.getString("location");
                row[5] = rs2.getString("message");
                model.addRow(row);
            }
            //        c.s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        cardLayout.show(donorCard, "card5");
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        cardLayout.show(vrCard, "card3");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        cardLayout.show(vrCard, "card4");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        cardLayout.show(vrCard, "card6");
    }//GEN-LAST:event_jButton22ActionPerformed

    private void next_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_button3ActionPerformed
        try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM completed_task";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            Social.ResultSetTableModel model = new Social.ResultSetTableModel(rs);
            jTable5.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_next_button3ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        cardLayout.show(volCard, "card3");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        cardLayout.show(volCard, "card4");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        signIn = false;
        signInD = false;
        signInV = false;
        signInVR = false;
        regPane = false;
        clearLogin();
        animatorBody.start();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        signIn = false;
       signInD = false;
       signInV = false;
       signInVR = false;
       regPane = false;
        
        animatorBody.start();
        clearLogin();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        cardLayout.show(registerCard, "card6");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(donorCard, "card1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            name.setEditable(true);

        } else {
            name.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Character only!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

    private void phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnActionPerformed

    private void phnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            phn.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            phn.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_phnKeyPressed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            age.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            age.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ageKeyPressed

    private void pinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            pin.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            pin.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyPressed

    private void cpinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpinKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            cpin.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            cpin.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cpinKeyPressed

    private void phnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnoKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            phno.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            phno.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_phnoKeyPressed

    private void name1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            name1.setEditable(true);

        } else {
            name1.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Character only!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_name1KeyPressed

    private void pswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_pswActionPerformed

    private void pswKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_pswKeyPressed

    private void fullnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullnameKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            fullname.setEditable(true);

        } else {
            fullname.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Character only!");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameKeyPressed

    private void phonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonKeyPressed
char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            phon.setEditable(false);
            JOptionPane.showMessageDialog(null, "Please enter Number only!");

        } else {
            phon.setEditable(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_phonKeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        String username=jTextField1.getText();
        String fullName=jTextField2.getText();
        String contact=jTextField4.getText();
        String message=jTextArea1.getText();
        String amount="";
        if(jRadioButton1.isSelected())
        amount=jRadioButton1.getText();
        else if(jRadioButton2.isSelected())
        amount=jRadioButton2.getText();
        else if(jRadioButton3.isSelected())
        amount=jRadioButton3.getText();
        else if(jRadioButton4.isSelected())
        amount=jRadioButton4.getText();
        else if(jRadioButton5.isSelected())
        amount=jRadioButton5.getText();
        else
        amount=jTextField3.getText();
        String payment = (String) jComboBox1.getSelectedItem();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(currentDate);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        buttonGroup1.clearSelection();
        jComboBox1.setSelectedIndex(0);
        jTextArea1.setText("");

        if (username.equals("") || fullName.equals("") || contact.equals("") || amount.equals("") || payment.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing input!");
            return;
        }

        try{
            Conn c=new Conn();

            if(username.equals(txtUser.getText())){
                String q1="insert into donate_money values('"+username+"','"+fullName+"','"+contact+"','"+amount+"','"+payment+"','"+message+"','"+date+"')";
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Donation Successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Username!");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
       String username=jTextField5.getText();
        String fullName=jTextField16.getText();
        String contact=jTextField6.getText();
        String itemName=jTextField15.getText();
        String recipient=jTextField14.getText();
        String location=jTextField13.getText();
        String message=jTextArea3.getText();
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(currentDate);
        
        jTextField16.setText("");
        jTextField15.setText("");
        jTextField14.setText("");
        jTextField13.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextArea3.setText("");
        
        if (username.equals("") || fullName.equals("") || contact.equals("") || itemName.equals("") || location.equals("")) {
        JOptionPane.showMessageDialog(null, "Missing input!");
        return;
        }
        
        try{  
            Conn c=new Conn();
            if(username.equals(txtUser.getText())){
              String q1="insert into donate_items values('"+username+"','"+fullName+"','"+contact+"','"+itemName+"','"+recipient+"','"+location+"','"+message+"','"+date+"')";
              c.s.executeUpdate(q1);
              JOptionPane.showMessageDialog(null, "Doantion Successful!");
            } else {
            JOptionPane.showMessageDialog(null, "Wrong Username!");
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        cardLayout.show(donorCard, "card6");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        model.setRowCount(0);
        try {
            Conn c = new Conn();
            String query1 = "SELECT * FROM donate_money WHERE username = '"+txtUser.getText()+ "'";
            ResultSet rs1 = c.s.executeQuery(query1);
            while (rs1.next()) {
                String[] row = new String[3];
                row[0] = rs1.getString("amount");
                row[2] = rs1.getString("date");
                model.addRow(row);
            }

            String query2 = "SELECT * FROM donate_items WHERE username = '"+txtUser.getText()+ "'";
            ResultSet rs2 = c.s.executeQuery(query2);

            while (rs2.next()) {
                String[] row = new String[3];
                row[1] = rs2.getString("itemName");
                row[2] = rs2.getString("date");
                model.addRow(row);
            }
            //        c.s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
        model.setRowCount(0);
        try {
            Conn c = new Conn();
            String query1 = "SELECT * FROM donate_money";
            ResultSet rs1 = c.s.executeQuery(query1);

            while (rs1.next()) {
                String[] row = new String[7];
                row[0] = rs1.getString("username");
                row[1] = rs1.getString("fullName");
                row[2] = rs1.getString("contact");
                row[3] = rs1.getString("amount");
                row[4] = rs1.getString("payment");
                row[5] = rs1.getString("message");
                row[6] = rs1.getString("date");
                model.addRow(row);
            }

            String query2 = "SELECT * FROM donate_items";
            ResultSet rs2 = c.s.executeQuery(query2);

            while (rs2.next()) {
                String[] row = new String[7];
                row[0] = rs2.getString("username");
                row[1] = rs2.getString("fullName");
                row[2] = rs2.getString("contact");
                row[3] = rs2.getString("itemname");
                row[4] = rs2.getString("location");
                row[5] = rs2.getString("message");
                row[6] = rs2.getString("date");
                model.addRow(row);
            }
            //        c.s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
            try {
            Conn c = new Conn();
            String displayCustomersql = "SELECT * FROM requestedTask";
            java.sql.ResultSet rs = c.s.executeQuery(displayCustomersql);
            Social.ResultSetTableModel model = new Social.ResultSetTableModel(rs);
            requested_table.setModel(model);
            rs.close();

        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String id =jTextField8.getText();
        String dc = ((JTextField) jDateChooser2.getDateEditor().getUiComponent()).getText();
          String ts = jComboBox2.getSelectedItem().toString();
           String fb = jTextField10.getText().toString();
            String cb =jTextField9.getText();
                     
          if (id.isEmpty() || dc.isEmpty() || ts.isEmpty() || fb.isEmpty() || cb.isEmpty() || fb.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the required fields");
        }  else if (jComboBox2.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a Time Spend");
              } 
            else{
            try{
                
        Conn c = new Conn();
           String query="insert into completed_task values('"+id+"','"+dc+"','"+ts+"','"+fb+"','"+cb+"')";
             c.s.executeUpdate(query);
             String q7 = "update approve set Feedback = '"+fb+"' where TaskID = '"+id+"'";
             c.s.executeUpdate(q7);
             String q8 = "update approve set Contact = '"+cb+"' where TaskID = '"+id+"'";
             c.s.executeUpdate(q8);
             
              //  JOptionPane.showMessageDialog(null, "Task completed!");
               
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
          
          try {
            Conn c6 = new Conn();
            String q6 = "update requestedTask set Status = 'Completed' where TaskID = '"+id+"'";
            c6.s.executeUpdate(q6);

            JOptionPane.showMessageDialog(null, "Task completed");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
          
          
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
       String cId = jTextField12.getText();
        try {
            Conn c6 = new Conn();
            String q6 = "update requestedTask set Status = 'Rejected' where TaskID = '"+cId+"'";
            c6.s.executeUpdate(q6);
            String q7 = "update approve set Status = 'Rejected' where TaskID = '"+cId+"'";
            c6.s.executeUpdate(q7);
            JOptionPane.showMessageDialog(null, "Task Rejected!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        
        String cId = jTextField12.getText();
        try {
            Conn c6 = new Conn();
            String q6 = "update requestedTask set Status = 'Approved' where TaskID = '"+cId+"'";
            c6.s.executeUpdate(q6);
            String q7 = "update approve set Status = 'Approved' where TaskID = '"+cId+"'";
            c6.s.executeUpdate(q7);
            JOptionPane.showMessageDialog(null, "Task Approved!");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       JOptionPane.showMessageDialog(null, "MS. CHOWDHURY TASNEEM HASIN \nChief Clinical Dietitian\n"
               + "Plot15,Road 71,Gulshan,Dhaka-1212 , Bangladesh\nTel:+88028836444,+88028836000\nFax:+88028836446\nEmail:info@uhlbd.com");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        JOptionPane.showMessageDialog(null, "PROF. DR. MOSTAQUE H SATTAR\nBDS,DDS,MCPS,FICCDE,FICD\nConsultant\n"
                + "Plot15,Road 71,Gulshan,Dhaka-1212 , Bangladesh\nTel:+88028836444,+88028836000\nFax:+88028836446\nEmail:info@uhlbd.com");
    }//GEN-LAST:event_jButton49ActionPerformed

    private void enableLogin(boolean action) {
        txtUser.setEditable(action);
        txtPass.setEditable(action);
        cmdSignIn.setEnabled(action);
    }

    public void clearLogin() {
        txtUser.setText("");
        txtPass.setText("");
        txtUser.setHelperText("");
        txtPass.setHelperText("");
    }

    private void enableReset(boolean action) {
        tf_username.setEditable(action);
        pf_password.setEditable(action);
        pf_confirm_password.setEditable(action);
        cmdReset1.setEnabled(action);
        cmdSignIn1.setEnabled(action);
    }
    
    public void clearReset() {
        tf_username.setText("");
        pf_password.setText("");
        pf_confirm_password.setText("");
        tf_username.setHelperText("");
        pf_password.setHelperText("");
        pf_confirm_password.setHelperText("");
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Login1;
    private javax.swing.JPanel Login2;
    private javax.swing.JPanel Login3;
    private javax.swing.JTextField add;
    private javax.swing.JTextField addd;
    private javax.swing.JPanel adminCard;
    private com.raven.swing.PanelTransparent adminDash;
    private javax.swing.JTextField age;
    private com.raven.swing.Background background1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_back;
    private com.raven.swing.Button cmdReg;
    private com.raven.swing.Button cmdReset;
    private com.raven.swing.Button cmdReset1;
    private com.raven.swing.Button cmdSignIn;
    private com.raven.swing.Button cmdSignIn1;
    private javax.swing.JPanel compTask;
    private javax.swing.JPanel compTasks;
    private javax.swing.JLabel completed_by;
    private javax.swing.JPasswordField cpin;
    private javax.swing.JPasswordField cpsw;
    private javax.swing.JLabel date_completed;
    private com.toedter.calendar.JDateChooser dateb;
    private javax.swing.JTextField desc;
    private javax.swing.JPanel donItem;
    private javax.swing.JPanel donMon;
    private javax.swing.JPanel donorCard;
    private com.raven.swing.PanelTransparent donorDash;
    private javax.swing.JPanel donorTab;
    private javax.swing.JTextField email;
    private javax.swing.JTextField email1;
    private javax.swing.JComboBox<String> fams;
    private javax.swing.JLabel feedback;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel healthC;
    private javax.swing.JPanel home;
    private javax.swing.JComboBox<String> hr;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JButton next_button;
    private javax.swing.JButton next_button1;
    private javax.swing.JButton next_button2;
    private javax.swing.JButton next_button3;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelReset;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTable pending_table;
    private javax.swing.JPanel perfTask;
    private com.raven.swing.PasswordField pf_confirm_password;
    private com.raven.swing.PasswordField pf_password;
    private javax.swing.JTextField phn;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField phon;
    private javax.swing.JPasswordField pin;
    private javax.swing.JPasswordField psw;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JPanel regDon;
    private javax.swing.JPanel regV;
    private javax.swing.JPanel regVR;
    private javax.swing.JPanel registerCard;
    private com.raven.swing.PanelTransparent registerPane;
    private javax.swing.JPanel registerTab;
    private javax.swing.JPanel reqHelp;
    private javax.swing.JTable requested_table;
    private javax.swing.JLabel task_id_;
    private javax.swing.JTable tblData;
    private com.raven.swing.TextField tf_username;
    private javax.swing.JLabel time_spend;
    private com.raven.swing.PasswordField txtPass;
    private com.raven.swing.TextField txtUser;
    private javax.swing.JTextField uname;
    private javax.swing.JRadioButton unmarried;
    private javax.swing.JTextField username;
    private javax.swing.JPanel viewAllDon;
    private javax.swing.JPanel viewDon;
    private javax.swing.JPanel viewMyDon;
    private javax.swing.JPanel viewNoti;
    private javax.swing.JPanel viewReq;
    private javax.swing.JPanel viewVol;
    private javax.swing.JPanel volCard;
    private com.raven.swing.PanelTransparent volDash;
    private javax.swing.JPanel vrCard;
    private com.raven.swing.PanelTransparent vrDash;
    // End of variables declaration//GEN-END:variables
}
