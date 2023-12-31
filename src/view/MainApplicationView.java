/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MainApplicationView extends javax.swing.JFrame {

    public static final int MENU_WIDTH = 187;
    public static final int MENU_HEIGHT = 747;
    private QuanLyKyHocView quanLyKyHocPanel;

    public MainApplicationView() {
        initComponents();
        quanLyKyHocPanel = new QuanLyKyHocView();
    }

    private void openMenuBar() {
        Thread openMenuThread = new Thread(() -> {
            for (int i = 0; i < MENU_WIDTH; i++) {
                panelMenu.setSize(i, MENU_HEIGHT);
                panelMain.setSize(1239, 747);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainApplicationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        openMenuThread.start();
    }

    private void closeMenuBar() {
        Thread closeMenuThread = new Thread(() -> {
            for (int i = MENU_WIDTH; i > 0; i--) {
                panelMenu.setSize(i, MENU_HEIGHT);
                panelMain.setSize(1239 + MENU_WIDTH, 747);
                try {
                    Thread.sleep(2);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainApplicationView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        closeMenuThread.start();
    }

    private void onClicked(JPanel panelBackGroud, JPanel panelStatus) {
        panelBackGroud.setBackground(new Color(41, 64, 115));
        panelStatus.setOpaque(true);
    }

    private void unClicked(JPanel panelBackGroud, JPanel panelStatus) {
        panelBackGroud.setBackground(new Color(23, 44, 76));
        panelStatus.setOpaque(false);
    }

    private void showPanel(JPanel panel) {
        panelMain.removeAll();
        panelMain.add(panel);
        panelMain.repaint();
        panelMain.revalidate();
    }

//    rgb(49,61,73)
//    rgb(58,73,87)
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContainer = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        qlsvPanelContainer = new javax.swing.JPanel();
        qlsvLbClick = new javax.swing.JLabel();
        qlsvLbStatus = new javax.swing.JPanel();
        qlkhPanelContainer = new javax.swing.JPanel();
        productLb = new javax.swing.JLabel();
        productStatusLb = new javax.swing.JPanel();
        staffPanelBtn = new javax.swing.JPanel();
        staffLb = new javax.swing.JLabel();
        staffStatusLb = new javax.swing.JPanel();
        orderPanelBtn = new javax.swing.JPanel();
        orderLb = new javax.swing.JLabel();
        orderStatusLb = new javax.swing.JPanel();
        discountPanelBtn = new javax.swing.JPanel();
        discountLb = new javax.swing.JLabel();
        discountStatusLb = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        exitLb = new javax.swing.JLabel();
        exitStatusLb = new javax.swing.JPanel();
        userPanelBtn = new javax.swing.JPanel();
        userLb = new javax.swing.JLabel();
        userStatusLb = new javax.swing.JPanel();
        statisticPanelBtn = new javax.swing.JPanel();
        statisticLb = new javax.swing.JLabel();
        statisticStatusLb = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(58, 73, 87));

        qlsvPanelContainer.setBackground(new java.awt.Color(49, 61, 73));
        qlsvPanelContainer.setPreferredSize(new java.awt.Dimension(163, 36));

        qlsvLbClick.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        qlsvLbClick.setForeground(new java.awt.Color(255, 255, 255));
        qlsvLbClick.setText("QUẢN LÝ SINH VIÊN");
        qlsvLbClick.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        qlsvLbClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qlsvLbClickMouseClicked(evt);
            }
        });

        qlsvLbStatus.setBackground(new java.awt.Color(255, 255, 255));
        qlsvLbStatus.setOpaque(false);
        qlsvLbStatus.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout qlsvLbStatusLayout = new javax.swing.GroupLayout(qlsvLbStatus);
        qlsvLbStatus.setLayout(qlsvLbStatusLayout);
        qlsvLbStatusLayout.setHorizontalGroup(
            qlsvLbStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        qlsvLbStatusLayout.setVerticalGroup(
            qlsvLbStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout qlsvPanelContainerLayout = new javax.swing.GroupLayout(qlsvPanelContainer);
        qlsvPanelContainer.setLayout(qlsvPanelContainerLayout);
        qlsvPanelContainerLayout.setHorizontalGroup(
            qlsvPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qlsvPanelContainerLayout.createSequentialGroup()
                .addComponent(qlsvLbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qlsvLbClick, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        qlsvPanelContainerLayout.setVerticalGroup(
            qlsvPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qlsvLbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(qlsvLbClick, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        qlkhPanelContainer.setBackground(new java.awt.Color(49, 61, 73));
        qlkhPanelContainer.setPreferredSize(new java.awt.Dimension(163, 36));

        productLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        productLb.setForeground(new java.awt.Color(255, 255, 255));
        productLb.setText("QUẢN LÝ KỲ HỌC");
        productLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLbMouseClicked(evt);
            }
        });

        productStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        productStatusLb.setOpaque(false);
        productStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout productStatusLbLayout = new javax.swing.GroupLayout(productStatusLb);
        productStatusLb.setLayout(productStatusLbLayout);
        productStatusLbLayout.setHorizontalGroup(
            productStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        productStatusLbLayout.setVerticalGroup(
            productStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout qlkhPanelContainerLayout = new javax.swing.GroupLayout(qlkhPanelContainer);
        qlkhPanelContainer.setLayout(qlkhPanelContainerLayout);
        qlkhPanelContainerLayout.setHorizontalGroup(
            qlkhPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qlkhPanelContainerLayout.createSequentialGroup()
                .addComponent(productStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        qlkhPanelContainerLayout.setVerticalGroup(
            qlkhPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(productLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        staffPanelBtn.setBackground(new java.awt.Color(49, 61, 73));
        staffPanelBtn.setPreferredSize(new java.awt.Dimension(163, 36));

        staffLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        staffLb.setForeground(new java.awt.Color(255, 255, 255));
        staffLb.setText("QUẢN LÝ LỚP HỌC");
        staffLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffLbMouseClicked(evt);
            }
        });

        staffStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        staffStatusLb.setOpaque(false);
        staffStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout staffStatusLbLayout = new javax.swing.GroupLayout(staffStatusLb);
        staffStatusLb.setLayout(staffStatusLbLayout);
        staffStatusLbLayout.setHorizontalGroup(
            staffStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        staffStatusLbLayout.setVerticalGroup(
            staffStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout staffPanelBtnLayout = new javax.swing.GroupLayout(staffPanelBtn);
        staffPanelBtn.setLayout(staffPanelBtnLayout);
        staffPanelBtnLayout.setHorizontalGroup(
            staffPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staffPanelBtnLayout.createSequentialGroup()
                .addComponent(staffStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        staffPanelBtnLayout.setVerticalGroup(
            staffPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(staffLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        orderPanelBtn.setBackground(new java.awt.Color(49, 61, 73));
        orderPanelBtn.setPreferredSize(new java.awt.Dimension(163, 36));

        orderLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        orderLb.setForeground(new java.awt.Color(255, 255, 255));
        orderLb.setText("QUẢN LÝ ĐIỂM");
        orderLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderLbMouseClicked(evt);
            }
        });

        orderStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        orderStatusLb.setOpaque(false);
        orderStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout orderStatusLbLayout = new javax.swing.GroupLayout(orderStatusLb);
        orderStatusLb.setLayout(orderStatusLbLayout);
        orderStatusLbLayout.setHorizontalGroup(
            orderStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        orderStatusLbLayout.setVerticalGroup(
            orderStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout orderPanelBtnLayout = new javax.swing.GroupLayout(orderPanelBtn);
        orderPanelBtn.setLayout(orderPanelBtnLayout);
        orderPanelBtnLayout.setHorizontalGroup(
            orderPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelBtnLayout.createSequentialGroup()
                .addComponent(orderStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        orderPanelBtnLayout.setVerticalGroup(
            orderPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orderStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(orderLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        discountPanelBtn.setBackground(new java.awt.Color(49, 61, 73));
        discountPanelBtn.setPreferredSize(new java.awt.Dimension(163, 36));

        discountLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        discountLb.setForeground(new java.awt.Color(255, 255, 255));
        discountLb.setText("QUẢN LÝ MÔN HỌC");
        discountLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discountLbMouseClicked(evt);
            }
        });

        discountStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        discountStatusLb.setOpaque(false);
        discountStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout discountStatusLbLayout = new javax.swing.GroupLayout(discountStatusLb);
        discountStatusLb.setLayout(discountStatusLbLayout);
        discountStatusLbLayout.setHorizontalGroup(
            discountStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        discountStatusLbLayout.setVerticalGroup(
            discountStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout discountPanelBtnLayout = new javax.swing.GroupLayout(discountPanelBtn);
        discountPanelBtn.setLayout(discountPanelBtnLayout);
        discountPanelBtnLayout.setHorizontalGroup(
            discountPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, discountPanelBtnLayout.createSequentialGroup()
                .addComponent(discountStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discountLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        discountPanelBtnLayout.setVerticalGroup(
            discountPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(discountStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(discountLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(49, 61, 73));
        jPanel12.setPreferredSize(new java.awt.Dimension(163, 36));

        exitLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        exitLb.setForeground(new java.awt.Color(255, 255, 255));
        exitLb.setText("THOÁT");
        exitLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLbMouseClicked(evt);
            }
        });

        exitStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        exitStatusLb.setOpaque(false);
        exitStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout exitStatusLbLayout = new javax.swing.GroupLayout(exitStatusLb);
        exitStatusLb.setLayout(exitStatusLbLayout);
        exitStatusLbLayout.setHorizontalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        exitStatusLbLayout.setVerticalGroup(
            exitStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(exitStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(exitLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        userPanelBtn.setBackground(new java.awt.Color(49, 61, 73));
        userPanelBtn.setPreferredSize(new java.awt.Dimension(163, 36));

        userLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        userLb.setForeground(new java.awt.Color(255, 255, 255));
        userLb.setText("ĐIỂM DANH");
        userLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLbMouseClicked(evt);
            }
        });

        userStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        userStatusLb.setOpaque(false);
        userStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout userStatusLbLayout = new javax.swing.GroupLayout(userStatusLb);
        userStatusLb.setLayout(userStatusLbLayout);
        userStatusLbLayout.setHorizontalGroup(
            userStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        userStatusLbLayout.setVerticalGroup(
            userStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout userPanelBtnLayout = new javax.swing.GroupLayout(userPanelBtn);
        userPanelBtn.setLayout(userPanelBtnLayout);
        userPanelBtnLayout.setHorizontalGroup(
            userPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userPanelBtnLayout.createSequentialGroup()
                .addComponent(userStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        userPanelBtnLayout.setVerticalGroup(
            userPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(userLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        statisticPanelBtn.setBackground(new java.awt.Color(49, 61, 73));
        statisticPanelBtn.setPreferredSize(new java.awt.Dimension(163, 36));

        statisticLb.setFont(new java.awt.Font("Source Sans Pro Black", 0, 14)); // NOI18N
        statisticLb.setForeground(new java.awt.Color(255, 255, 255));
        statisticLb.setText("THỐNG KÊ");
        statisticLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticLbMouseClicked(evt);
            }
        });

        statisticStatusLb.setBackground(new java.awt.Color(255, 255, 255));
        statisticStatusLb.setOpaque(false);
        statisticStatusLb.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout statisticStatusLbLayout = new javax.swing.GroupLayout(statisticStatusLb);
        statisticStatusLb.setLayout(statisticStatusLbLayout);
        statisticStatusLbLayout.setHorizontalGroup(
            statisticStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        statisticStatusLbLayout.setVerticalGroup(
            statisticStatusLbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout statisticPanelBtnLayout = new javax.swing.GroupLayout(statisticPanelBtn);
        statisticPanelBtn.setLayout(statisticPanelBtnLayout);
        statisticPanelBtnLayout.setHorizontalGroup(
            statisticPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statisticPanelBtnLayout.createSequentialGroup()
                .addComponent(statisticStatusLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statisticLb, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
        );
        statisticPanelBtnLayout.setVerticalGroup(
            statisticPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticStatusLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
            .addComponent(statisticLb, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        labelMenu.setIcon(new javax.swing.ImageIcon("src\\content\\menu.png"));
        labelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(qlsvPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(qlkhPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(staffPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(orderPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(discountPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(userPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(statisticPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(qlsvPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qlkhPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staffPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(discountPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statisticPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qlsvLbClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qlsvLbClickMouseClicked
//        this.onClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(userPanelBtn, userStatusLb);
//        this.unClicked(discountPanelBtn, discountStatusLb);
//        showPanel(panelSell);
    }//GEN-LAST:event_qlsvLbClickMouseClicked

    private void productLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLbMouseClicked
        showPanel(quanLyKyHocPanel);
        System.out.println("ok");
    }//GEN-LAST:event_productLbMouseClicked

    private void staffLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffLbMouseClicked
//        this.onClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(statisticPanelBtn, statisticStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
//        this.unClicked(userPanelBtn, userStatusLb);
//        this.unClicked(discountPanelBtn, discountStatusLb);
//        showPanel(panelStaff);
    }//GEN-LAST:event_staffLbMouseClicked

    private void orderLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderLbMouseClicked
//        this.onClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
//        this.unClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(statisticPanelBtn, statisticStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(userPanelBtn, userStatusLb);
//        this.unClicked(discountPanelBtn, discountStatusLb);
    }//GEN-LAST:event_orderLbMouseClicked

    private void discountLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discountLbMouseClicked
//        this.onClicked(discountPanelBtn, discountStatusLb);
//        this.unClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(statisticPanelBtn, statisticStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(userPanelBtn, userStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
    }//GEN-LAST:event_discountLbMouseClicked

    private void exitLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLbMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLbMouseClicked

    private void userLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLbMouseClicked
//        this.onClicked(userPanelBtn, userStatusLb);
//        this.unClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(statisticPanelBtn, statisticStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(discountPanelBtn, discountStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
//        showPanel(customerPanel);
    }//GEN-LAST:event_userLbMouseClicked

    private void statisticLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticLbMouseClicked
//        this.onClicked(statisticPanelBtn, staffStatusLb);
//        this.unClicked(orderPanelBtn, orderStatusLb);
//        this.unClicked(sellPanelBtn, sellStatusLb);
//        this.unClicked(staffPanelBtn, staffStatusLb);
//        this.unClicked(userPanelBtn, userStatusLb);
//        this.unClicked(discountPanelBtn, discountStatusLb);
//        this.unClicked(productPanelBtn, productStatusLb);
    }//GEN-LAST:event_statisticLbMouseClicked

    private void labelMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMenuMouseClicked
        closeMenuBar();
    }//GEN-LAST:event_labelMenuMouseClicked

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
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApplicationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApplicationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel discountLb;
    private javax.swing.JPanel discountPanelBtn;
    private javax.swing.JPanel discountStatusLb;
    private javax.swing.JLabel exitLb;
    private javax.swing.JPanel exitStatusLb;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel orderLb;
    private javax.swing.JPanel orderPanelBtn;
    private javax.swing.JPanel orderStatusLb;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel productLb;
    private javax.swing.JPanel productStatusLb;
    private javax.swing.JPanel qlkhPanelContainer;
    private javax.swing.JLabel qlsvLbClick;
    private javax.swing.JPanel qlsvLbStatus;
    private javax.swing.JPanel qlsvPanelContainer;
    private javax.swing.JLabel staffLb;
    private javax.swing.JPanel staffPanelBtn;
    private javax.swing.JPanel staffStatusLb;
    private javax.swing.JLabel statisticLb;
    private javax.swing.JPanel statisticPanelBtn;
    private javax.swing.JPanel statisticStatusLb;
    private javax.swing.JLabel userLb;
    private javax.swing.JPanel userPanelBtn;
    private javax.swing.JPanel userStatusLb;
    // End of variables declaration//GEN-END:variables
}
