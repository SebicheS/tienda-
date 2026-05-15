/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ccatalogo;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private JLabel lblTitulo;
    private JLabel lblTotalVentas;
    private JLabel lblNumeroVentas;
    private JPanel panelPrincipal;
    private JPanel panelTarjeta;
    private JButton btnSalir;

    public Dashboard() {
        initComponents();
    }

    private void initComponents() {
        setTitle("MercaEZ - Dashboard Admin");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(240, 240, 240));

        panelPrincipal = new JPanel(null);
        panelPrincipal.setBackground(new Color(240, 240, 240));

        // Barra superior
        JPanel barraNav = new JPanel(null);
        barraNav.setBounds(0, 0, 800, 60);
        barraNav.setBackground(new Color(29, 29, 29));

        JLabel lblMarca = new JLabel("MercaEZ - Admin");
        lblMarca.setForeground(Color.WHITE);
        lblMarca.setFont(new Font("Inter", Font.BOLD, 20));
        lblMarca.setBounds(20, 15, 250, 30);
        barraNav.add(lblMarca);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(700, 15, 80, 30);
        btnSalir.setBackground(new Color(220, 53, 69));
        btnSalir.setForeground(Color.WHITE);
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSalir.addActionListener(e -> {
            this.dispose();
            new login().setVisible(true);
        });
        barraNav.add(btnSalir);

        // Título
        lblTitulo = new JLabel("Panel de Estadísticas");
        lblTitulo.setFont(new Font("Inter", Font.BOLD, 24));
        lblTitulo.setBounds(30, 80, 300, 40);
        lblTitulo.setForeground(new Color(29, 29, 29));

        // Tarjeta total ventas
        panelTarjeta = new JPanel(null);
        panelTarjeta.setBounds(30, 140, 220, 120);
        panelTarjeta.setBackground(new Color(166, 238, 253));
        panelTarjeta.setBorder(BorderFactory.createEmptyBorder());

        JLabel lblIcono = new JLabel("💰");
        lblIcono.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
        lblIcono.setBounds(15, 10, 50, 40);

        JLabel lblEtiqueta = new JLabel("Total Ventas");
        lblEtiqueta.setFont(new Font("Inter", Font.PLAIN, 14));
        lblEtiqueta.setForeground(new Color(29, 29, 29));
        lblEtiqueta.setBounds(15, 55, 150, 20);

        lblTotalVentas = new JLabel("$1.250.000");
        lblTotalVentas.setFont(new Font("Inter", Font.BOLD, 20));
        lblTotalVentas.setForeground(new Color(29, 29, 29));
        lblTotalVentas.setBounds(15, 80, 180, 30);

        panelTarjeta.add(lblIcono);
        panelTarjeta.add(lblEtiqueta);
        panelTarjeta.add(lblTotalVentas);

        // Tarjeta numero de ventas
        JPanel panelTarjeta2 = new JPanel(null);
        panelTarjeta2.setBounds(270, 140, 220, 120);
        panelTarjeta2.setBackground(new Color(166, 238, 253));

        JLabel lblIcono2 = new JLabel("🛒");
        lblIcono2.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
        lblIcono2.setBounds(15, 10, 50, 40);

        JLabel lblEtiqueta2 = new JLabel("Número de Ventas");
        lblEtiqueta2.setFont(new Font("Inter", Font.PLAIN, 14));
        lblEtiqueta2.setForeground(new Color(29, 29, 29));
        lblEtiqueta2.setBounds(15, 55, 180, 20);

        lblNumeroVentas = new JLabel("25 ventas");
        lblNumeroVentas.setFont(new Font("Inter", Font.BOLD, 20));
        lblNumeroVentas.setForeground(new Color(29, 29, 29));
        lblNumeroVentas.setBounds(15, 80, 180, 30);

        panelTarjeta2.add(lblIcono2);
        panelTarjeta2.add(lblEtiqueta2);
        panelTarjeta2.add(lblNumeroVentas);

        panelPrincipal.add(barraNav);
        panelPrincipal.add(lblTitulo);
        panelPrincipal.add(panelTarjeta);
        panelPrincipal.add(panelTarjeta2);

        add(panelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}