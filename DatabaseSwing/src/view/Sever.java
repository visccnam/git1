/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import JDBCConnection.HistoryManagement;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

import javax.swing.table.DefaultTableModel;
import model.Account;
import model.Food;
import model.History;
import model.OrderRecord;
import service.AccountService;
import service.FoodSerVice;
import service.HistoryService;
import service.OderService;

/**
 *
 * @author Admin
 */
public class Sever extends javax.swing.JFrame {

    /**
     * Creates new form Sever
     */
    String filename="C:/Users/Admin/Desktop/find-my-pc-windows-10-icon.jpg";
    ImageIcon icon;
    ImageIcon backgr;
    AccountService accountService;
    FoodSerVice foodSerVice;
    OderService oderService;
    HistoryService historyService;
    
    DefaultTableModel defaultTableModel;
     
    
    public Sever() {
        accountService=new AccountService();
        foodSerVice=new FoodSerVice();
        oderService=new OderService();
        historyService=new HistoryService();
        initComponents();
        this.setTitle("G5 Gamming");
        
        Image background = Toolkit.getDefaultToolkit().createImage("backgr.jpg");
        //comPanel.drawImage(background, 0, 0, null);
        icon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        
        testButton.setIcon(icon);
        testButton1.setIcon(icon);
        testButton2.setIcon(icon);
        testButton3.setIcon(icon);
        testButton4.setIcon(icon);
        testButton5.setIcon(icon);
        testButton6.setIcon(icon);
        testButton7.setIcon(icon);
        testButton8.setIcon(icon);
        testButton9.setIcon(icon);
        testButton10.setIcon(icon);
        testButton11.setIcon(icon);
        testButton12.setIcon(icon);
        testButton13.setIcon(icon);
        testButton14.setIcon(icon);
        testButton15.setIcon(icon);
        testButton16.setIcon(icon);
        testButton17.setIcon(icon);
        testButton18.setIcon(icon);
        testButton19.setIcon(icon);
        testButton20.setIcon(icon);
        testButton21.setIcon(icon);
        testButton22.setIcon(icon);
        testButton23.setIcon(icon);
          defaultTableModel=new DefaultTableModel(){
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        getListAccount(); //getAccountList
        getListFood();
        getListHistory();
        
        
        
       
        
       
    }
    public void getListAccount(){
         defaultTableModel=new DefaultTableModel(){
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        AccountTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("username");
        defaultTableModel.addColumn("password");
        defaultTableModel.addColumn("Money");
        List<Account> accounts=accountService.getAllAccount();
        accounts.forEach(( s) -> {
            defaultTableModel.addRow(new Object[]{s.getUserName(),s.getPassword(),s.getMoney()});
        });
    }
    public void getListFood(){
          defaultTableModel=new DefaultTableModel(){
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
         foodTable.setModel(defaultTableModel);
         defaultTableModel.addColumn("Food_id");
         defaultTableModel.addColumn("Name");
         defaultTableModel.addColumn("Price");
         defaultTableModel.addColumn("Kind");
         
         List<Food> foods=foodSerVice.getAllFood();
          foods.forEach(( f) -> {
            defaultTableModel.addRow(new Object[]{f.getFood_id(),f.getName(),f.getPrice(),f.getKind()});
            //defaultTableModel.addRow(new Object[]{f.getName(),f.getPrice(),f.getKind(),f.getFood_id()});
        });
    }
    public void getListHistory(){
        defaultTableModel=new DefaultTableModel(){
             @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        historyTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("STT");
         defaultTableModel.addColumn("Lenh");
         defaultTableModel.addColumn("Price");
         List<History> historys = historyService.getallHistory();
          historys.forEach(( f) -> {
            defaultTableModel.addRow(new Object[]{f.getStt(),f.getLenh(),f.getMoney(),});
            //defaultTableModel.addRow(new Object[]{f.getName(),f.getPrice(),f.getKind(),f.getFood_id()});
        });
        
        
    }
   
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listCom = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        addDialog = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        adduserField = new javax.swing.JTextField();
        addpassField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        napMoneyDialog = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernapmoneyField = new javax.swing.JTextField();
        moneyField = new javax.swing.JTextField();
        naptienButon = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        comPanel = new javax.swing.JPanel();
        listButton = new javax.swing.JButton();
        classicPanel = new javax.swing.JPanel();
        testButton2 = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        testButton1 = new javax.swing.JButton();
        testButton3 = new javax.swing.JButton();
        testButton4 = new javax.swing.JButton();
        testButton5 = new javax.swing.JButton();
        testButton6 = new javax.swing.JButton();
        testButton7 = new javax.swing.JButton();
        testButton8 = new javax.swing.JButton();
        testButton9 = new javax.swing.JButton();
        testButton10 = new javax.swing.JButton();
        testButton11 = new javax.swing.JButton();
        vipPanel = new javax.swing.JPanel();
        testButton12 = new javax.swing.JButton();
        testButton13 = new javax.swing.JButton();
        testButton14 = new javax.swing.JButton();
        testButton15 = new javax.swing.JButton();
        testButton16 = new javax.swing.JButton();
        testButton17 = new javax.swing.JButton();
        testButton18 = new javax.swing.JButton();
        testButton19 = new javax.swing.JButton();
        testButton20 = new javax.swing.JButton();
        testButton21 = new javax.swing.JButton();
        testButton22 = new javax.swing.JButton();
        testButton23 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        historyPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tonggiaodichField = new javax.swing.JTextField();
        servicePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        OrderButton = new javax.swing.JButton();

        listCom.setSize(new java.awt.Dimension(634, 490));

        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tình trạng", "User", "Bắt đầu", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout listComLayout = new javax.swing.GroupLayout(listCom.getContentPane());
        listCom.getContentPane().setLayout(listComLayout);
        listComLayout.setHorizontalGroup(
            listComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(listComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listComLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        listComLayout.setVerticalGroup(
            listComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
            .addGroup(listComLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listComLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        addDialog.setSize(new java.awt.Dimension(283, 201));

        jLabel5.setText("UserName");

        jLabel6.setText("Password");

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adduserField)
                            .addComponent(addpassField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                    .addGroup(addDialogLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(adduserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(addpassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        napMoneyDialog.setSize(new java.awt.Dimension(253, 165));

        jLabel7.setText("UserName");

        jLabel8.setText("Số tiền ");

        naptienButon.setText("Nạp");
        naptienButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naptienButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout napMoneyDialogLayout = new javax.swing.GroupLayout(napMoneyDialog.getContentPane());
        napMoneyDialog.getContentPane().setLayout(napMoneyDialogLayout);
        napMoneyDialogLayout.setHorizontalGroup(
            napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(napMoneyDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(naptienButon)
                    .addComponent(usernapmoneyField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(moneyField))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        napMoneyDialogLayout.setVerticalGroup(
            napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(napMoneyDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usernapmoneyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(napMoneyDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(moneyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(naptienButon)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(634, 407));

        comPanel.setPreferredSize(new java.awt.Dimension(634, 407));

        listButton.setText("Show List");
        listButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listButtonActionPerformed(evt);
            }
        });

        classicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        classicPanel.setName("Classic Class"); // NOI18N

        testButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton2ActionPerformed(evt);
            }
        });

        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        testButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton1ActionPerformed(evt);
            }
        });

        testButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton3ActionPerformed(evt);
            }
        });

        testButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton4ActionPerformed(evt);
            }
        });

        testButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton5ActionPerformed(evt);
            }
        });

        testButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton6ActionPerformed(evt);
            }
        });

        testButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton7ActionPerformed(evt);
            }
        });

        testButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton8ActionPerformed(evt);
            }
        });

        testButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton9ActionPerformed(evt);
            }
        });

        testButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton10ActionPerformed(evt);
            }
        });

        testButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classicPanelLayout = new javax.swing.GroupLayout(classicPanel);
        classicPanel.setLayout(classicPanelLayout);
        classicPanelLayout.setHorizontalGroup(
            classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, classicPanelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(classicPanelLayout.createSequentialGroup()
                        .addComponent(testButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(classicPanelLayout.createSequentialGroup()
                        .addComponent(testButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(classicPanelLayout.createSequentialGroup()
                        .addComponent(testButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(classicPanelLayout.createSequentialGroup()
                        .addComponent(testButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        classicPanelLayout.setVerticalGroup(
            classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(classicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vipPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        testButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton12ActionPerformed(evt);
            }
        });

        testButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton13ActionPerformed(evt);
            }
        });

        testButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton14ActionPerformed(evt);
            }
        });

        testButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton15ActionPerformed(evt);
            }
        });

        testButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton16ActionPerformed(evt);
            }
        });

        testButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton17ActionPerformed(evt);
            }
        });

        testButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton18ActionPerformed(evt);
            }
        });

        testButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton19ActionPerformed(evt);
            }
        });

        testButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton20ActionPerformed(evt);
            }
        });

        testButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton21ActionPerformed(evt);
            }
        });

        testButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton22ActionPerformed(evt);
            }
        });

        testButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout vipPanelLayout = new javax.swing.GroupLayout(vipPanel);
        vipPanel.setLayout(vipPanelLayout);
        vipPanelLayout.setHorizontalGroup(
            vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(vipPanelLayout.createSequentialGroup()
                        .addComponent(testButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(testButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vipPanelLayout.createSequentialGroup()
                        .addComponent(testButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        vipPanelLayout.setVerticalGroup(
            vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Vip Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Classic Class");

        javax.swing.GroupLayout comPanelLayout = new javax.swing.GroupLayout(comPanel);
        comPanel.setLayout(comPanelLayout);
        comPanelLayout.setHorizontalGroup(
            comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPanelLayout.createSequentialGroup()
                .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comPanelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(comPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(comPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(listButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        comPanelLayout.setVerticalGroup(
            comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comPanelLayout.createSequentialGroup()
                .addGroup(comPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listButton)
                    .addGroup(comPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(classicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Máy Trạm", comPanel);

        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Money"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AccountTable);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm tài khoản");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addButton.setText("Thêm tài khoản");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jButton4.setText("Nạp Tiền");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton)
                .addGap(44, 44, 44)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton)
                .addGap(41, 41, 41))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(addButton)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Tài Khoản", accountPanel);

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(historyTable);

        jLabel9.setText("Tổng giao dịch");

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historyPanelLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tonggiaodichField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tonggiaodichField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Lịch sử giao dịch", historyPanel);

        servicePanel.setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Bảng giá");

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(foodTable);

        OrderButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        OrderButton.setForeground(new java.awt.Color(255, 0, 0));
        OrderButton.setText("Order");
        OrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(OrderButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderButton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dịch vụ", servicePanel);

        getContentPane().add(jTabbedPane1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        addDialog.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_testButtonActionPerformed

    private void listButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listButtonActionPerformed
        // TODO add your handling code here:
        listCom.setVisible(true);
    }//GEN-LAST:event_listButtonActionPerformed

    private void testButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton1ActionPerformed

    private void testButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton2ActionPerformed

    private void testButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton3ActionPerformed

    private void testButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton4ActionPerformed

    private void testButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton5ActionPerformed

    private void testButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton6ActionPerformed

    private void testButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton7ActionPerformed

    private void testButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton8ActionPerformed

    private void testButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton9ActionPerformed

    private void testButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton10ActionPerformed

    private void testButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton11ActionPerformed

    private void testButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton12ActionPerformed

    private void testButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton13ActionPerformed

    private void testButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton14ActionPerformed

    private void testButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton15ActionPerformed

    private void testButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton16ActionPerformed

    private void testButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton17ActionPerformed

    private void testButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton18ActionPerformed

    private void testButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton19ActionPerformed

    private void testButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton20ActionPerformed

    private void testButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton21ActionPerformed

    private void testButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton22ActionPerformed

    private void testButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testButton23ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String username=adduserField.getText();
        String pass=addpassField.getText();
        String money="";
        Account a=new Account(username, pass, money);
        accountService.addAccount(a);
       
        getListAccount();
        addDialog.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       napMoneyDialog.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void naptienButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naptienButonActionPerformed
        // TODO add your handling code here:
        String userName=usernapmoneyField.getText();
        Account a=accountService.getAccount(userName);
        int m = Integer.parseInt(moneyField.getText());
        if(a.getMoney().equals("")|| a.getMoney()==null){
            a.setMoney("0");
        }
        
        int s=Integer.parseInt(a.getMoney());
        int sum=m+s;
        //System.out.println(sum);
        a.setMoney(String.valueOf(sum));
        System.out.println(a.getMoney());
        accountService.updateAccount(a);
        String lenh="nap";
        History h=new History(1,lenh,moneyField.getText());
        historyService.addHistory(h);
        getListAccount();
        getListHistory();
        tonggiaodichField.setText(String.valueOf(historyService.getTong()));
        napMoneyDialog.setVisible(false);
    }//GEN-LAST:event_naptienButonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        Account a=accountService.getAccount(searchField.getText());
        defaultTableModel =new DefaultTableModel();
        AccountTable.setModel(defaultTableModel);
        defaultTableModel.addColumn("username");
        defaultTableModel.addColumn("password");
        defaultTableModel.addColumn("Money");
        defaultTableModel.addRow(new Object[]{a.getUserName(),a.getPassword(),a.getMoney()});
    }//GEN-LAST:event_searchButtonActionPerformed

    private void OrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderButtonActionPerformed
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel=foodTable.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Food food;
        int[] rows=foodTable.getSelectedRows();
       
        String name=String.valueOf(foodTable.getValueAt(rows[0], 1));
        String Price=String.valueOf(foodTable.getValueAt(rows[0], 2));
        String Kind=String.valueOf(foodTable.getValueAt(rows[0], 3));
        String food_id=String.valueOf(foodTable.getValueAt(rows[0], 0));
     
        OrderRecord orderRecord;
        
        orderRecord=new OrderRecord(1,food_id,1,name,"","2019/11/13",Price);
        String lenh="order";
        History h=new History(1,lenh,Price);
        historyService.addHistory(h);
        
        getListHistory();
        tonggiaodichField.setText(String.valueOf(historyService.getTong()));
        
    }//GEN-LAST:event_OrderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sever().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccountTable;
    private javax.swing.JButton OrderButton;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JDialog addDialog;
    private javax.swing.JTextField addpassField;
    private javax.swing.JTextField adduserField;
    private javax.swing.JPanel classicPanel;
    private javax.swing.JPanel comPanel;
    private javax.swing.JTable foodTable;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton listButton;
    private javax.swing.JDialog listCom;
    private javax.swing.JTextField moneyField;
    private javax.swing.JDialog napMoneyDialog;
    private javax.swing.JButton naptienButon;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JButton testButton;
    private javax.swing.JButton testButton1;
    private javax.swing.JButton testButton10;
    private javax.swing.JButton testButton11;
    private javax.swing.JButton testButton12;
    private javax.swing.JButton testButton13;
    private javax.swing.JButton testButton14;
    private javax.swing.JButton testButton15;
    private javax.swing.JButton testButton16;
    private javax.swing.JButton testButton17;
    private javax.swing.JButton testButton18;
    private javax.swing.JButton testButton19;
    private javax.swing.JButton testButton2;
    private javax.swing.JButton testButton20;
    private javax.swing.JButton testButton21;
    private javax.swing.JButton testButton22;
    private javax.swing.JButton testButton23;
    private javax.swing.JButton testButton3;
    private javax.swing.JButton testButton4;
    private javax.swing.JButton testButton5;
    private javax.swing.JButton testButton6;
    private javax.swing.JButton testButton7;
    private javax.swing.JButton testButton8;
    private javax.swing.JButton testButton9;
    private javax.swing.JTextField tonggiaodichField;
    private javax.swing.JTextField usernapmoneyField;
    private javax.swing.JPanel vipPanel;
    // End of variables declaration//GEN-END:variables
}
