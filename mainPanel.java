package coffeShop;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class mainPanel implements ActionListener, MouseListener {

    JFrame frame;
    JPanel panel1, panel2, coldPanel, hotPanel, SizePanel, DetailsPanel, YourOrderpanel, CoffeeMenu, WarningPanel;
    JLabel OrderDetailsText,  TotalPaymentText, AddPaymentText, ChangeText, CoffeeName, YourCoffee, YourSize, YourQuantity;
    JButton hotCoffee, coldCoffee, AddOrderButton, DeleteOrderButton, OrderNow;

    //SIZE BUTTON
    JButton smallSizeCoffee = new JButton("SMALL"),
            mediumSizeCoffee = new JButton("MEDIUM"),
            largeSizeCoffee = new JButton("LARGE");
    JTextField smallSizeField, mediumSizeField, largeSizeField;

    //BUTTON FOR HOT COFFEE
    JButton HotCoffee1 = new JButton("Hot Coffee 1"),
            HotCoffee2 = new JButton("Hot Coffee 2"),
            HotCoffee3 = new JButton("Hot Coffee 3"),
            HotCoffee4 = new JButton("Hot Coffee 4"),
            HotCoffee5 = new JButton("Hot Coffee 5"),
            HotCoffee6 = new JButton("Hot Coffee 6");


    //BUTTON FOR COLD COFFEE
    JButton ColdCoffee1 = new JButton(),
            ColdCoffee2 = new JButton(),
            ColdCoffee3 = new JButton(),
            ColdCoffee4 = new JButton(),
            ColdCoffee5 = new JButton();


    //JTextField QuantityTextFields;
    JTextArea TotalPaymenttextArea,  AddPaymentTextArea, ChangeTextArea, QuantityTextArea,YourSizeTextArea, YourOrderTextArea;
    JTable detailsTable;
    DefaultTableModel detailsTableModel;
    int clickCount;
    //JPanel p1,p2,p3,p4,p5,p6;
    JLabel c1,c2,c3,c4,c5,c6;
    JLabel i1,i2,i3,i4,i5;
    mainPanel() {
        frame = new JFrame("Coffee Corner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);

        LineBorder border = new LineBorder(Color.YELLOW, 3);

        Border emptyBorder = BorderFactory.createEmptyBorder(2,2,2,2);
       // Border BlinkingBorder = BorderFactory.createCompoundBorder(border, emptyBorder);

        CoffeeMenu = new JPanel();
        CoffeeMenu.setBounds(305,0,875,405);
       // p1 = new JPanel();
        //p1.setBounds(30,20,100,100);
        //p1.setLayout(null);

        //logoPanel = new JPanel();
        //logoPanel.setBounds(100,50,100,100);

        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/coffeShop/logo.jpg"));
        Image bg1 = logoIcon.getImage().getScaledInstance(180,180,Image.SCALE_DEFAULT);
        ImageIcon dashboardicon = new ImageIcon(bg1);
        JLabel logoLabel = new JLabel(dashboardicon);
        logoLabel.setBounds(60, 20, 180,100);

        ImageIcon correto = new ImageIcon(getClass().getResource("/coffeShop/correto.jpg"));
        c1 = new JLabel(correto);
        c1.setBounds(75,150,100,100);
        c1.setBorder(border);
        c1.show(false);

        ImageIcon doppio = new ImageIcon(getClass().getResource("/coffeShop/doppio.jpg"));
         c2 = new JLabel(doppio);
        c2.setBounds(200,150, 100,100);
        c2.setBorder(border);
        c2.show(false);

        ImageIcon espresso = new ImageIcon(getClass().getResource("/coffeShop/espresso.jpg"));
         c3 = new JLabel(espresso);
        c3.setBounds(325,150,100,100);
        c3.setBorder(border);
        c3.show(false);

        ImageIcon flatwhite = new ImageIcon(getClass().getResource("/coffeShop/flatWhite.jpg"));
         c4 = new JLabel(flatwhite);
        c4.setBounds(450,150,100,100);
        c4.setBorder(border);
        c4.show(false);

        ImageIcon macchiato = new ImageIcon(getClass().getResource("/coffeShop/macchiato.jpg"));
         c5 = new JLabel(macchiato);
        c5.setBounds(575,150,100,100);
        c5.setBorder(border);
        c5.show(false);

        ImageIcon lungo = new ImageIcon(getClass().getResource("/coffeShop/lungo.jpg"));
         c6 = new JLabel(lungo);
        c6.setBounds(700,150,100,100);
        c6.setBorder(border);
        c6.show(false);

        //ICED COFFEE PIC
        ImageIcon icedcoffee = new ImageIcon(getClass().getResource("/coffeShop/icedcoffee.jpg"));
        i1 = new JLabel(icedcoffee);
        i1.setBounds(75,150,100,100);
        i1.setBorder(border);
        i1.show(false);

        ImageIcon icedfrappuccionot = new ImageIcon(getClass().getResource("/coffeShop/icedfrappuccinot.jpg"));
        i2 = new JLabel(icedfrappuccionot);
        i2.setBounds(200,150, 100,100);
        i2.setBorder(border);
        i2.show(false);

        ImageIcon icedlatte = new ImageIcon(getClass().getResource("/coffeShop/Icedlatte.jpg"));
        i3 = new JLabel(icedlatte);
        i3.setBounds(325,150,100,100);
        i3.setBorder(border);
        i3.show(false);

        ImageIcon icedmazagrancoffee = new ImageIcon(getClass().getResource("/coffeShop/icedmazagrancoffee.jpg"));
        i4 = new JLabel(icedmazagrancoffee);
        i4.setBounds(450,150,100,100);
        i4.setBorder(border);
        i4.show(false);

        ImageIcon icednitrobrew = new ImageIcon(getClass().getResource("/coffeShop/icednitrobrew.jpg"));
        i5 = new JLabel(icednitrobrew);
        i5.setBounds(575,150,100,100);
        i5.setBorder(border);
        i5.show(false);

        // Load the background image
        ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/coffeShop/Cbackground.jpg"));
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 5, CoffeeMenu.getWidth(), CoffeeMenu.getHeight());

        /*ImageIcon close = new ImageIcon(getClass().getResource("/close.png"));
        JLabel closeLabel = new JLabel(close);
        closeLabel.setBounds(250, 10, 20, 20);

        ImageIcon sizeclose = new ImageIcon(getClass().getResource("/close.png"));
        JLabel sizeLabel = new JLabel(sizeclose);
        sizeLabel.setBounds(250, 35, 20, 20);*/


        CoffeeMenu.add(c1); //PiC ADD
        CoffeeMenu.add(c2);
        CoffeeMenu.add(c3);
        CoffeeMenu.add(c4);
        CoffeeMenu.add(c5);
        CoffeeMenu.add(c6);
        CoffeeMenu.add(i1);
        CoffeeMenu.add(i2);
        CoffeeMenu.add(i3);
        CoffeeMenu.add(i4);
        CoffeeMenu.add(i5);

        CoffeeMenu.add(backgroundLabel);
        CoffeeMenu.setLayout(null);

        //HOT PANEL
        hotPanel = new JPanel();
        hotPanel.setBackground(new Color(217, 179, 129));
        hotPanel.setBounds(20,300,260,250);
        hotPanel.setBorder(new LineBorder(Color.BLACK, 2));
        hotPanel.show(false);
        hotPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));

        //HOT BUTTON
        hotCoffee = new JButton("HOT");
        hotCoffee.addActionListener(this);
        hotCoffee.setBounds(50,250,70,30);

        hotPanel.add(HotCoffee1); //HOT PANEL ADD
        HotCoffee1.addActionListener(this::HotCoffeeactionPerformed);
        hotPanel.add(HotCoffee2);
        HotCoffee2.addActionListener(this::HotCoffeeactionPerformed);
        hotPanel.add(HotCoffee3);
        HotCoffee3.addActionListener(this::HotCoffeeactionPerformed);
        hotPanel.add(HotCoffee4);
        HotCoffee4.addActionListener(this::HotCoffeeactionPerformed);
        hotPanel.add(HotCoffee5);
        HotCoffee5.addActionListener(this::HotCoffeeactionPerformed);
        hotPanel.add(HotCoffee6);
        HotCoffee6.addActionListener(this::HotCoffeeactionPerformed);
        this.HotCoffee1.setText("correto");
        this.HotCoffee2.setText("doppio");
        this.HotCoffee3.setText("espresso");
        this.HotCoffee4.setText("flatWhite");
        this.HotCoffee5.setText("macchiato");
        this.HotCoffee6.setText("lungo");

        //COLD PANEL
        coldPanel = new JPanel();
        coldPanel.setBackground(new Color(217, 179, 129));
        coldPanel.setBounds(20,300,260,250);
        coldPanel.setBorder(new LineBorder(Color.BLACK, 2));
        coldPanel.show(false);
        coldPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));

        //COLD BUTTON
        coldCoffee = new JButton("COLD");
        coldCoffee.addActionListener(this);
        coldCoffee.setBounds(180,250,70,30);

        coldPanel.add(ColdCoffee1); //COLD PANEL ADD
        ColdCoffee1.addActionListener(this::ColdCoffeeactionPerformed);
        coldPanel.add(ColdCoffee2);
        ColdCoffee2.addActionListener(this::ColdCoffeeactionPerformed);
        coldPanel.add(ColdCoffee3);
        ColdCoffee3.addActionListener(this::ColdCoffeeactionPerformed);
        coldPanel.add(ColdCoffee4);
        ColdCoffee4.addActionListener(this::ColdCoffeeactionPerformed);
        coldPanel.add(ColdCoffee5);
        ColdCoffee5.addActionListener(this::ColdCoffeeactionPerformed);
        this.ColdCoffee1.setText("Ice Coffee");
        this.ColdCoffee2.setText("Ice Frappuccino");
        this.ColdCoffee3.setText("Iced Latte");
        this.ColdCoffee4.setText("Ice Mazagran");
        this.ColdCoffee5.setText("Ice Nitro brew");


        /*WarningPanel = new JPanel();
        WarningPanel.setBounds(20,565,260,80);
        WarningPanel.setBackground(new Color(169, 169, 169));*/

        //LABEL
        OrderDetailsText = new JLabel("ORDER DETAILS");
        OrderDetailsText.setFont(new Font("Calibri", Font.BOLD, 25)); // Set the font size
        OrderDetailsText.setBounds(510,-30,200,100);

        AddOrderButton = new JButton("ADD \nORDER");
        AddOrderButton.addActionListener(this::setAddOrderButtonactionPerformeds);
        AddOrderButton.setBounds(540,130,108,30);

        OrderNow = new JButton("ORDER NOW");
        OrderNow.addActionListener(this::setOrderNow);
        OrderNow.setBounds(540,210,108,30);

        DeleteOrderButton = new JButton("DELETE \nORDER");
        DeleteOrderButton.addActionListener(this::setDeleteOrderButtonActionPerformeds);
        DeleteOrderButton.setBounds(535,170,120,30);

        //TEXT AREA
        smallSizeField = new JTextField();
        smallSizeField.setFont(new Font("Calibri", Font.BOLD, 15));
        smallSizeField.setSize(50,20);

        CoffeeName = new JLabel();
        CoffeeName.setPreferredSize(new Dimension(100,15));
        CoffeeName.setLayout(new FlowLayout(FlowLayout.CENTER));

        //SIZE PANEL
        SizePanel = new JPanel();
        SizePanel.setBounds(160,25,280,220);
        SizePanel.setBackground(new Color(169, 169, 169));

        smallSizeCoffee = new JButton();
        this.smallSizeCoffee.setText("Small");
        smallSizeCoffee.addActionListener(this::setSmallSizeCoffeeactionPerformed);
        smallSizeCoffee.setBounds(10,10,70,30);

        mediumSizeCoffee = new JButton();
        this.mediumSizeCoffee.setText("Medium");
        mediumSizeCoffee.addActionListener(this:: setMediumSizeCoffeeactionPerformed);
        mediumSizeCoffee.setBounds(100,10,80,30);

        largeSizeCoffee = new JButton();
        this.largeSizeCoffee.setText("Large");
        largeSizeCoffee.addActionListener(this::setLargeSizeCoffeeactionPerformed);
        largeSizeCoffee.setBounds(200,10,70,30);

        smallSizeField = new JTextField();
        smallSizeField.setBounds(10,45,70,20);

        mediumSizeField = new JTextField();
        mediumSizeField.setBounds(100,45,80,20);

        largeSizeField = new JTextField();
        largeSizeField.setBounds(200,45,70,20);

        TotalPaymentText = new JLabel("Total Payment");
        TotalPaymentText.setFont(new Font("Calibri", Font.BOLD, 30));
        TotalPaymentText.setBounds(50,90,250,35);

        TotalPaymenttextArea = new JTextArea();
        TotalPaymenttextArea.setBounds(100,120,80,25);
        TotalPaymenttextArea.setFont(new Font("Calibri", Font.BOLD, 30));
        TotalPaymenttextArea.setEditable(false);

        AddPaymentTextArea = new JTextArea();
        AddPaymentTextArea.setBounds(10,150,70,25);
        AddPaymentTextArea.setFont(new Font("Calibri", Font.BOLD, 25));

        AddPaymentText = new JLabel("PAY");
        AddPaymentText.setBounds(25,190,70,25);
        AddPaymentText.setFont(new Font("Calibri", Font.BOLD, 20));

        ChangeTextArea = new JTextArea();
        ChangeTextArea.setBounds(200,150,70,25);
        ChangeTextArea.setFont(new Font("Calibri", Font.BOLD, 25));
        ChangeTextArea.setEditable(false);

        ChangeText = new JLabel("CHANGE");
        ChangeText.setBounds(200,190,80,25);
        ChangeText.setFont(new Font("Calibri", Font.BOLD, 20));

        SizePanel.add(smallSizeCoffee); //SIZE PANEL ADD
        SizePanel.add(mediumSizeCoffee);
        SizePanel.add(largeSizeCoffee);
        SizePanel.add(smallSizeField);
        SizePanel.add(mediumSizeField);
        SizePanel.add(largeSizeField);
        SizePanel.add(TotalPaymentText);
        SizePanel.add(this.TotalPaymenttextArea);
        SizePanel.add(this.AddPaymentTextArea);
        SizePanel.add(AddPaymentText);
        SizePanel.add(this.ChangeTextArea);
        SizePanel.add(ChangeText);
        SizePanel.setLayout(null);

        //Order Details Text Area
        detailsTableModel = new DefaultTableModel();
        detailsTableModel.addColumn("Coffee");
        detailsTableModel.addColumn("Size");
        detailsTableModel.addColumn("Quantity");

        // Initialize the table with the model
        detailsTable = new JTable(detailsTableModel);
        JScrollPane scrollPane = new JScrollPane(detailsTable);

        // Details Panel
        DetailsPanel = new JPanel();
        DetailsPanel.setBounds(745, 25, 280, 220);
        //DetailsPanel.setBorder(new LineBorder(Color.BLACK, 2));
        DetailsPanel.setBackground(new Color(169, 169, 169));
        DetailsPanel.setLayout(new BorderLayout());
        DetailsPanel.add(scrollPane, BorderLayout.CENTER);

        //Review Order
        YourOrderpanel = new JPanel();
        YourOrderpanel.setBounds(453,35,280,90);
        YourOrderpanel.setBackground(new Color(169, 169, 169));
        YourOrderpanel.setBorder(new LineBorder(Color.BLACK,2));

        YourCoffee = new JLabel("Coffee:");
        YourCoffee.setBounds(10, 10, 80, 25);
        YourCoffee.setFont(new Font("Calibri", Font.BOLD, 20));


        YourSize = new JLabel("Size:");
        YourSize.setBounds(10, 35, 80, 20);
        YourSize.setFont(new Font("Calibri", Font.BOLD, 20));

        YourQuantity = new JLabel("Quantity:");
        YourQuantity.setBounds(10, 60, 80, 20);
        YourQuantity.setFont(new Font("Calibri", Font.BOLD, 20));

        YourOrderTextArea = new JTextArea();
        YourOrderTextArea.setFont(new Font("Calibri", Font.BOLD, 20));
        YourOrderTextArea.setEditable(false);
        YourOrderTextArea.setBounds(120,10,150,20);

        YourSizeTextArea = new JTextArea();
        YourSizeTextArea.setFont(new Font("Calibri", Font.BOLD, 20));
        YourSizeTextArea.setEditable(false);
        YourSizeTextArea.setBounds(120,35,150,20);

        QuantityTextArea = new JTextArea();
        QuantityTextArea.setFont(new Font("Calibri", Font.BOLD, 20));
        QuantityTextArea.setBounds(120,60,50,20);

        YourOrderpanel.add(YourCoffee);
        YourOrderpanel.add(YourSize);
        YourOrderpanel.add(YourQuantity);
        YourOrderpanel.add(QuantityTextArea);
        YourOrderpanel.add(YourSizeTextArea);
        YourOrderpanel.add(YourOrderTextArea);
        YourOrderpanel.setLayout(null);

        //Panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(238, 206, 175));
        panel1.setSize(300,1000);
        panel1.setLayout(null);

        //Panel 1 ADD
        frame.add(panel1, BorderLayout. WEST);
        panel1.add(hotCoffee);
        panel1.add(coldCoffee);
        panel1.add(coldPanel);
        panel1.add(hotPanel);
        //panel1.add(logoPanel);
        panel1.add(logoLabel);
      //  panel1.add(WarningPanel);

        //Panel 2
        panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setBounds(150,410,1200,250);
        panel2.setLayout(null);

        //Panel 2 ADD
        frame.add(panel2, BorderLayout.PAGE_END);
        panel2.add(OrderDetailsText);
        panel2.add(SizePanel);
        panel2.add(DetailsPanel,BorderLayout.NORTH);
        panel2.add(YourOrderpanel);
        panel2.add(AddOrderButton);
        panel2.add(DeleteOrderButton);
        panel2.add(OrderNow);

        frame.add(CoffeeMenu);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    Color originalColdCoffee8Color = ColdCoffee5.getBackground();
    Border originalBorder = ColdCoffee5.getBorder();

    Color originalSizeColor = HotCoffee1.getBackground();

    private void originalBorderColor() {
        i4.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        i5.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        i3.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        i2.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        i1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c2.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c3.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c4.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c5.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
        c6.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
    }
    private void originalBackgroundHotCold(){
        hotCoffee.setBackground(originalColdCoffee8Color);
        coldCoffee.setBackground(originalColdCoffee8Color);
        hotCoffee.setBorder(originalBorder);
        coldCoffee.setBorder(originalBorder);
    }
    private void SizeOriginalColor() {
        smallSizeCoffee.setBackground(originalSizeColor);
        mediumSizeCoffee.setBackground(originalSizeColor);
        largeSizeCoffee.setBackground(originalSizeColor);
        smallSizeCoffee.setBorder(originalBorder);
        mediumSizeCoffee.setBorder(originalBorder);
        largeSizeCoffee.setBorder(originalBorder);
    }
    private void resetButtonBackgrounds() {
        ColdCoffee1.setBackground(originalColdCoffee8Color);  // Reset ColdCoffee1 button background
        ColdCoffee2.setBackground(originalColdCoffee8Color);
        ColdCoffee3.setBackground(originalColdCoffee8Color);
        ColdCoffee4.setBackground(originalColdCoffee8Color);
        ColdCoffee5.setBackground(originalColdCoffee8Color);

        HotCoffee1.setBackground(originalColdCoffee8Color);
        HotCoffee2.setBackground(originalColdCoffee8Color);
        HotCoffee3.setBackground(originalColdCoffee8Color);
        HotCoffee4.setBackground(originalColdCoffee8Color);
        HotCoffee5.setBackground(originalColdCoffee8Color);
        HotCoffee6.setBackground(originalColdCoffee8Color);
        // Add similar lines for other buttons if needed
    }
    public void HotCoffeeactionPerformed(ActionEvent e) {
        if (e.getSource() == HotCoffee1) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("10");
            this.mediumSizeField.setText("20");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("correto");
            HotCoffee1.setBackground(Color.ORANGE);
            c1.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == HotCoffee2) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("20");
            this.mediumSizeField.setText("30");
            this.largeSizeField.setText("50");
            this.YourOrderTextArea.setText("doppio");
            HotCoffee2.setBackground(Color.ORANGE);
            c2.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == HotCoffee3) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("90");
            this.mediumSizeField.setText("200");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("espresso");
            HotCoffee3.setBackground(Color.ORANGE);
            c3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == HotCoffee4) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("50");
            this.mediumSizeField.setText("00");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("flatWhite");
            HotCoffee4.setBackground(Color.ORANGE);
            c4.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == HotCoffee5) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("20");
            this.mediumSizeField.setText("30");
            this.largeSizeField.setText("300");
            this.YourOrderTextArea.setText("macchiato");
            HotCoffee5.setBackground(Color.ORANGE);
            c5.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == HotCoffee6) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("10");
            this.mediumSizeField.setText("00");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("lungo");
            HotCoffee6.setBackground(Color.ORANGE);
            c6.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }
    }


   /* public void blinkerBorder() {
        Timer timer = new Timer(500, new ActionListener() {

            boolean blinking = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                LineBorder border = new LineBorder(Color.RED, 3);

                Border emptyBorder = BorderFactory.createEmptyBorder(2,2,2,2);
                Border BlinkingBorder = BorderFactory.createCompoundBorder(border, emptyBorder);

                blinking = !blinking;
                if (blinking) {
                    c1.setBorder(BlinkingBorder);
                } else {
                    c1.setBorder(null);
                }
            }
        });

        if(!timer.isRunning()) {
            timer.start();
        }else {
            timer.stop();
            origBorder();

        }
    }*/

    public void ColdCoffeeactionPerformed(ActionEvent e) {

        if (e.getSource() == ColdCoffee1) {
            resetButtonBackgrounds();
            originalBorderColor();
            this.smallSizeField.setText("10");
            this.mediumSizeField.setText("20");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("Ice Coffee");
            ColdCoffee1.setBackground(Color.ORANGE);
            i1.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == ColdCoffee2) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("20");
            this.mediumSizeField.setText("30");
            this.largeSizeField.setText("50");
            this.YourOrderTextArea.setText("Ice Frappuccino");
            ColdCoffee2.setBackground(Color.ORANGE);
            i2.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        }

        if (e.getSource() == ColdCoffee3) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("90");
            this.mediumSizeField.setText("200");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("Iced Latte");
            ColdCoffee3.setBackground(Color.ORANGE);
            i3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == ColdCoffee4) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("50");
            this.mediumSizeField.setText("00");
            this.largeSizeField.setText("30");
            this.YourOrderTextArea.setText("Ice Mazagran");
            ColdCoffee4.setBackground(Color.ORANGE);
            i4.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

        if (e.getSource() == ColdCoffee5) {
            originalBorderColor();
            resetButtonBackgrounds();
            this.smallSizeField.setText("20");
            this.mediumSizeField.setText("30");
            this.largeSizeField.setText("300");
            this.YourOrderTextArea.setText("Ice Nitro brew");
            ColdCoffee5.setBackground(Color.ORANGE);
            i5.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

        }

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hotCoffee) {
            originalBackgroundHotCold();
            hotPanel.show(true);
            coldPanel.show(false);
            hotCoffee.setBorder(new LineBorder(Color.BLACK,2));
            hotCoffee.setBackground(new Color(255, 200, 214, 255));

            c1.setVisible(true);
            c2.setVisible(true);
            c3.setVisible(true);
            c4.setVisible(true);
            c5.setVisible(true);
            c6.setVisible(true);
            i1.setVisible(false);
            i2.setVisible(false);
            i3.setVisible(false);
            i4.setVisible(false);
            i5.setVisible(false);
        }
        if (e.getSource() == coldCoffee){
            originalBackgroundHotCold();
            coldPanel.show(true);
            hotPanel.show(false);
            coldCoffee.setBorder(new LineBorder(Color.BLACK,2));
            coldCoffee.setBackground(new Color(255, 200, 214, 255));

            i1.setVisible(true);
            i2.setVisible(true);
            i3.setVisible(true);
            i4.setVisible(true);
            i5.setVisible(true);
            c1.setVisible(false);
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            c5.setVisible(false);
            c6.setVisible(false);
        }

    }

    public void WarningMessage(){
        String Size = YourSizeTextArea.getText();
        String qnty = QuantityTextArea.getText();
        String coffee = YourOrderTextArea.getText();

        if(Size.isEmpty() || qnty.isEmpty() || coffee.isEmpty()) {
            JOptionPane.showMessageDialog(null,"PLEASE FILL THE ORDER COMPLETELY");
        }

    }

    public void OrderAddtoTable(){ //ADD ORDER BUTTON
        String coffeeName = YourOrderTextArea.getText();
        String coffeeSize = YourSizeTextArea.getText();
        int TotalPayment, small, medium, large, qty;
        String Text = YourSizeTextArea.getText();
        int quantity = Integer.parseInt(QuantityTextArea.getText());

        if(Text.equals("Small")) {

            small = Integer.parseInt(smallSizeField.getText());
            qty = Integer.parseInt(QuantityTextArea.getText());
            TotalPayment = small * qty;
            String TotalPayments = String.valueOf(TotalPayment);
            this.TotalPaymenttextArea.setText(TotalPayments);

        }

        if(Text.equals("Medium")) {
            medium = Integer.parseInt(mediumSizeField.getText());
            qty = Integer.parseInt(QuantityTextArea.getText());
            TotalPayment = medium * qty;
            String TotalPayments = String.valueOf(TotalPayment);
            this.TotalPaymenttextArea.setText(TotalPayments);
        }

        if( Text.equals("Large")) {
            large = Integer.parseInt(largeSizeField.getText());
            qty = Integer.parseInt(QuantityTextArea.getText());
            TotalPayment = large * qty;
            String TotalPayments = String.valueOf(TotalPayment);
            this.TotalPaymenttextArea.setText(TotalPayments);
        }

        detailsTableModel.addRow(new Object[]{coffeeName, coffeeSize, quantity});
        YourOrderTextArea.setText("");
        YourSizeTextArea.setText("");
        QuantityTextArea.setText("");

    }

    public void setAddOrderButtonactionPerformeds(ActionEvent e) {
        resetButtonBackgrounds();
        SizeOriginalColor();
        originalBorderColor();
        WarningMessage();
        OrderAddtoTable();

        //AddOrderButton.setBackground(new Color(255, 200, 214, 255));
    }

    public void setOrderNow(ActionEvent e) {

        int Pay, TotalPay, TotalPayment;
        String Money = AddPaymentTextArea.getText();

        if(Money.isEmpty() || detailsTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "ERROR!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        TotalPayment = Integer.parseInt(TotalPaymenttextArea.getText());
        Pay = Integer.parseInt(AddPaymentTextArea.getText());
        TotalPay = Pay - TotalPayment;
        String TotalPays = String.valueOf(TotalPay);
        this.ChangeTextArea.setText(TotalPays);
        AddPaymentTextArea.setText("");

    }

    private void setDeleteOrderButtonActionPerformeds(ActionEvent event) {  //DELETE ROW
        int selectedRow = detailsTable.getSelectedRow();

        if (selectedRow != -1) {
            detailsTableModel.removeRow(detailsTable.convertRowIndexToModel(selectedRow));
        }else if(detailsTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null,"PLEASE ADD ORDER FIRST");
        }else{
            JOptionPane.showMessageDialog(null,"PLEASE SELECT ROW");

        }
    }

    //SMALL SIZE BUTTON PRICE
    public void setSmallSizeCoffeeactionPerformed(ActionEvent r) {
        //clickCount++;

        int smallSizeC, TotalPays, Changes, Addpays, Quants;
        if(r.getSource() == smallSizeCoffee ){
            SizeOriginalColor();
            YourSizeTextArea.setText("Small");
            smallSizeCoffee.setBorder(new LineBorder(Color.BLACK,2));
            smallSizeCoffee.setBackground(new Color(255, 200, 214, 255));

        }

    }

    public void setMediumSizeCoffeeactionPerformed(ActionEvent e) {
        //clickCount++;
        int mediumSizeC, TotalPaym, Changem, Addpaym, Quantm;
        if (e.getSource() == mediumSizeCoffee) {
            SizeOriginalColor();
            YourSizeTextArea.setText("Medium");
            mediumSizeCoffee.setBackground(new Color(255, 200, 214, 255));
            mediumSizeCoffee.setBorder(new LineBorder(Color.BLACK,2));

        }

    }

    public void setLargeSizeCoffeeactionPerformed(ActionEvent e) {
        //clickCount++;
        SizeOriginalColor();
        if (e.getSource() == largeSizeCoffee ) {
            YourSizeTextArea.setText("Large");
            largeSizeCoffee.setBackground(new Color(255, 200, 214, 255));
            largeSizeCoffee.setBorder(new LineBorder(Color.BLACK,2));

        }

    }




    @Override
    public void mouseClicked(MouseEvent e) {
        ButtonGroup click = new ButtonGroup();
        click.add(this.ColdCoffee1);
        click.add(smallSizeCoffee);
        if (e.getSource() == ColdCoffee1) {

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args){
        mainPanel mainPanel = new mainPanel();
    }
}