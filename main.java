import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.event.*; 
import java.awt.*; 
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.OverlayLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.event.*;
public class main{
 
   public static void main(String[] args)
   {
   
      JFrame frame = new JFrame();
      frame.setPreferredSize(new Dimension(1450, 813));
      JPanel panel1 = new JPanel();
      panel1.setPreferredSize(new Dimension(1050, 694));
      JPanel panel2 = new JPanel();
      panel2.setPreferredSize(new Dimension(300, 300));
      JSlider slider = new JSlider(0, 89, 0);
      JLabel day = new JLabel("Feburary 1 2020");
      /*
      ImageIcon icon = new ImageIcon("USMap.jpg");
      try{
         resize("USMap.jpg", "resizedMap.jpg", 1050, 694);//orignally (1500, 991), scale factor .7
      }
      catch (IOException ex) {
         System.out.println("Error resizing the image.");
      }
      */
      ImageIcon resizedIcon = new ImageIcon("resizedMap.jpg");
      JLabel label = new JLabel(resizedIcon);
      frame.setLayout(new FlowLayout());
      label.setLayout(new GridBagLayout());
      panel2.setLayout(new BorderLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      
   JPanel northEast = new JPanel();
   northEast.setPreferredSize(new Dimension(1050, 694));
   ImageIcon NEicon = new ImageIcon("resizedNorthEastern.png");//original size(224, 227), new size(672, 681), scale factor 3
   JLabel NElabel = new JLabel(NEicon);
   northEast.add(NElabel);
   NElabel.setLayout(new GridBagLayout());
   GridBagConstraints NEgbc = new GridBagConstraints();
   
   JButton BACK = new JButton("BACK");
      BACK.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 0;
      BACK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            panel1.setVisible(true);
            northEast.setVisible(false);
            }
        });
      NElabel.add(BACK, NEgbc);
   
   
   JLabel null1 = new JLabel("");
      null1.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 1;
      NElabel.add(null1, NEgbc);
      
      JLabel null2 = new JLabel("");
      null2.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 2;
      NElabel.add(null2, NEgbc);
      
      JLabel null3= new JLabel("");
      null3.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 3;
      NElabel.add(null3, NEgbc);
      
      JLabel null4= new JLabel("");
      null4.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 4;
      NElabel.add(null4, NEgbc);
      
      JLabel null5= new JLabel("");
      null5.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 5;
      NElabel.add(null5, NEgbc);
      
      JLabel null6= new JLabel("");
      null6.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 6;
      NElabel.add(null6, NEgbc);
      
      JLabel null7= new JLabel("");
      null7.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 7;
      NElabel.add(null7, NEgbc);
      
      JLabel null8= new JLabel("");
      null8.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 8;
      NElabel.add(null8, NEgbc);
      
      JLabel null9= new JLabel("");
      null9.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 9;
      NElabel.add(null9, NEgbc);
   
      JLabel null10= new JLabel("");
      null10.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 10;
      NElabel.add(null10, NEgbc);
      
      JLabel null11= new JLabel("");
      null11.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 11;
      NElabel.add(null11, NEgbc);
     
     JLabel null12= new JLabel("");
      null12.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 0;
      NEgbc.gridy = 12;
      NElabel.add(null12, NEgbc);
      
      
      JLabel null13= new JLabel("");
      null13.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 1;
      NEgbc.gridy = 0;
      NElabel.add(null13, NEgbc);
      
      
      JLabel null14= new JLabel("");
      null14.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 2;
      NEgbc.gridy = 0;
      NElabel.add(null14, NEgbc);
      
      JLabel null15= new JLabel("");
      null15.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 3;
      NEgbc.gridy = 0;
      NElabel.add(null15, NEgbc);
      
      JLabel null16= new JLabel("");
      null16.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 4;
      NEgbc.gridy = 0;
      NElabel.add(null16, NEgbc);
      
      JLabel null17= new JLabel("");
      null17.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 5;
      NEgbc.gridy = 0;
      NElabel.add(null17, NEgbc);
      
      
      JLabel null18= new JLabel("");
      null18.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 6;
      NEgbc.gridy = 0;
      NElabel.add(null18, NEgbc);
      
      JLabel null19= new JLabel("");
      null19.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 7;
      NEgbc.gridy = 0;
      NElabel.add(null19, NEgbc);
      
      JLabel null20= new JLabel("");
      null20.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 8;
      NEgbc.gridy = 0;
      NElabel.add(null20, NEgbc);
      
      
      JButton PA = new JButton("PA");
      PA.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 1;
      NEgbc.gridy = 9;
      NElabel.add(PA, NEgbc);
      
      
      NEgbc.anchor = GridBagConstraints.LINE_START;
      JButton MD = new JButton("MD");
      MD.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 2;
      NEgbc.gridy = 11;
      NElabel.add(MD, NEgbc);
      
      NEgbc.anchor = GridBagConstraints.LINE_START;
      JButton DE = new JButton("DE");
      DE.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 3;
      NEgbc.gridy = 11;
      NElabel.add(DE, NEgbc);
     
     
      
      JButton NY = new JButton("NY");
      NY.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 3;
      NEgbc.gridy = 6;
      NElabel.add(NY, NEgbc);
      
      

      JButton ME = new JButton("ME");
      ME.setPreferredSize(new Dimension(50, 50));
      NEgbc.gridx = 8;
      NEgbc.gridy = 2;
      NElabel.add(ME, NEgbc);
     
     NEgbc.anchor = GridBagConstraints.FIRST_LINE_END;
     JButton VT = new JButton("VT");
      VT.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 5;
      NEgbc.gridy = 4;
      NElabel.add(VT, NEgbc);
     
     
     JButton NH = new JButton("NH");
      NH.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 6;
      NEgbc.gridy = 5;
      NElabel.add(NH, NEgbc);
      
      NEgbc.anchor = GridBagConstraints.LAST_LINE_END;
      JButton MA = new JButton("MA");
      MA.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 6;
      NEgbc.gridy = 6;
      NElabel.add(MA, NEgbc);
      
      NEgbc.anchor = GridBagConstraints.LAST_LINE_START;
      JButton CT = new JButton("CT");
      CT.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 6;
      NEgbc.gridy = 7;
      NElabel.add(CT, NEgbc);
      
     
      JButton RI = new JButton("RI");
      RI.setPreferredSize(new Dimension(30, 30));
      NEgbc.gridx = 7;
      NEgbc.gridy = 7;
      NElabel.add(RI, NEgbc);
     
     
     
     
     
     
     
     
     
     
      
      
     
      JLabel state1 = new JLabel("");
      state1.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 0;
      label.add(state1, gbc);
      
      
      JLabel state2 = new JLabel("");
      state2.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 1;
      label.add(state2, gbc);
      
      
      JLabel state3 = new JLabel("");
      state3.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 2;
      label.add(state3, gbc);
      
      JLabel state4 = new JLabel("");
      state4.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 3;
      label.add(state4, gbc);
   
   
      JLabel state5 = new JLabel("");
      state5.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 4;
      label.add(state5, gbc);
   
   
      JLabel state6 = new JLabel("");
      state6.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 5;
      label.add(state6, gbc);
   
   
      JLabel state7 = new JLabel("");
      state7.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 6;
      label.add(state7, gbc);
   
   
      JLabel state8 = new JLabel("");
      state8.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 7;
      label.add(state8, gbc);
      
      JLabel state9 = new JLabel("");
      state9.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 8;
      label.add(state9, gbc);
   
   
      JLabel state10 = new JLabel("");
      state10.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 9;
      label.add(state10, gbc);
   
   
      JLabel state11 = new JLabel("");
      state11.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 10;
      label.add(state11, gbc);
   
   
      JLabel state12 = new JLabel("");
      state12.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 11;
      label.add(state12, gbc);
   
   
      JLabel state13 = new JLabel("");
      state13.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 0;
      gbc.gridy = 12;
      label.add(state13, gbc);
      
      
      
      
      
      
      
      JLabel state14 = new JLabel("");
      state14.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 1;
      gbc.gridy = 0;
      label.add(state14, gbc);
      
      JLabel state15 = new JLabel("");
      state15.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 2;
      gbc.gridy = 0;
      label.add(state15, gbc);
   
   
      JLabel state16 = new JLabel("");
      state16.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 3;
      gbc.gridy = 0;
      label.add(state16, gbc);
      
      
      JLabel state17 = new JLabel("");
      state17.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 4;
      gbc.gridy = 0;
      label.add(state17, gbc);
      
      JLabel state18 = new JLabel("");
      state18.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 5;
      gbc.gridy = 0;
      label.add(state18, gbc);
      
      JLabel state19 = new JLabel("");
      state19.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 6;
      gbc.gridy = 0;
      label.add(state19, gbc);
      
      JLabel state20 = new JLabel("");
      state20.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 7;
      gbc.gridy = 0;
      label.add(state20, gbc);
      
      JLabel state21 = new JLabel("");
      state21.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 8;
      gbc.gridy = 0;
      label.add(state21, gbc);
      
      JLabel state22 = new JLabel("");
      state22.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 9;
      gbc.gridy = 0;
      label.add(state22, gbc);
      
      JLabel state23 = new JLabel("");
      state23.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 10;
      gbc.gridy = 0;
      label.add(state23, gbc);
      
      JLabel state24 = new JLabel("");
      state24.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 11;
      gbc.gridy = 0;
      label.add(state24, gbc);
      
      JLabel state25 = new JLabel("");
      state25.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 12;
      gbc.gridy = 0;
      label.add(state25, gbc);
      
      JLabel state26 = new JLabel("");
      state26.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 13;
      gbc.gridy = 0;
      label.add(state26, gbc);
      
      JLabel state27 = new JLabel("");
      state27.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 14;
      gbc.gridy = 0;
      label.add(state27, gbc);
      
      JLabel state28 = new JLabel("");
      state28.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 15;
      gbc.gridy = 0;
      label.add(state28, gbc);
      
      JLabel state29 = new JLabel("");
      state29.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 16;
      gbc.gridy = 0;
      label.add(state29, gbc);
   
      JLabel state30 = new JLabel("");
      state30.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 17;
      gbc.gridy = 0;
      label.add(state30, gbc);
      
      JLabel state31 = new JLabel("");
      state31.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 18;
      gbc.gridy = 0;
      label.add(state31, gbc);
      
      
      JLabel state32 = new JLabel("");
      state32.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 19;
      gbc.gridy = 0;
      label.add(state32, gbc);
   
   
   
      JButton ND = new JButton("ND");
      ND.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 8;
      gbc.gridy = 1;
      label.add(ND, gbc);
      
      gbc.insets = new Insets(40,0,0,0); 
   
      JButton SD = new JButton("SD");
      SD.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 8;
      gbc.gridy = 2;
      label.add(SD, gbc);
      
      gbc.insets = new Insets(0,0,0,0);
      gbc.anchor = GridBagConstraints.LINE_END;
   
      JButton NE = new JButton("NE");
      NE.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 8;
      gbc.gridy = 4;
      label.add(NE, gbc);
   
      gbc.anchor = GridBagConstraints.LINE_START;
      gbc.insets = new Insets(30,0,0,0);
      
      JButton KS = new JButton("KS");
      KS.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 9;
      gbc.gridy = 5;
      label.add(KS, gbc);
      
   
      gbc.insets = new Insets(0,0,0,0);
      gbc.anchor = GridBagConstraints.LINE_END;
       
      JButton OK = new JButton("OK");
      OK.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 9;
      gbc.gridy = 7;
      label.add(OK, gbc);
      
      JButton TX = new JButton("TX");
      TX.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 9;
      gbc.gridy = 9;
      label.add(TX, gbc);
      
      JButton MT = new JButton("MT");
      MT.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 5;
      gbc.gridy = 1;
      label.add(MT, gbc);
      
      gbc.anchor = GridBagConstraints.LINE_START;
      JButton WY = new JButton("WY");
      WY.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 6;
      gbc.gridy = 3;
      label.add(WY, gbc);
      
      gbc.anchor = GridBagConstraints.LINE_END;
      JButton CO = new JButton("CO");
      CO.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 6;
      gbc.gridy = 5;
      label.add(CO, gbc);
      
      
      gbc.anchor = GridBagConstraints.LINE_START;
      JButton NM = new JButton("NM");
      NM.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 6;
      gbc.gridy = 7;
      label.add(NM, gbc);
   
   
      gbc.anchor = GridBagConstraints.LINE_END;
      JButton MN = new JButton("MN");
      MN.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 10;
      gbc.gridy = 2;
      label.add(MN, gbc);
      
      
      gbc.anchor = GridBagConstraints.FIRST_LINE_START;
      JButton IA = new JButton("IA");
      IA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 11;
      gbc.gridy = 4;
      label.add(IA, gbc);
      
      
      gbc.anchor = GridBagConstraints.LAST_LINE_END;
      JButton MO = new JButton("MO");
      MO.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 11;
      gbc.gridy = 5;
      label.add(MO, gbc);
   
   
      JButton AR = new JButton("AR");
      AR.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 11;
      gbc.gridy = 7;
      label.add(AR, gbc);
      
      //insets?
      gbc.anchor = GridBagConstraints.FIRST_LINE_END;
      JButton LA = new JButton("LA");
      LA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 11;
      gbc.gridy = 9;
      label.add(LA, gbc);
      
      
      
      JButton AK = new JButton("AK");
      AK.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 2;
      gbc.gridy = 10;
      label.add(AK, gbc);
      
      
      
      JButton HI = new JButton("HI");
      HI.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 6;
      gbc.gridy = 11;
      label.add(HI, gbc);
      


      gbc.anchor = GridBagConstraints.LAST_LINE_END;
      JButton ID = new JButton("ID");
      ID.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 3;
      gbc.gridy = 2;
      label.add(ID, gbc);
      
      
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      JButton NV = new JButton("NV");
      NV.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 2;
      gbc.gridy = 4;
      label.add(NV, gbc);
   
      gbc.anchor = GridBagConstraints.LAST_LINE_END;
      JButton CA = new JButton("CA");
      CA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 0;
      gbc.gridy = 4;
      label.add(CA, gbc);
      
     gbc.anchor = GridBagConstraints.LINE_END;
      JButton OR = new JButton("OR");
      OR.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 1;
      gbc.gridy = 2;
      label.add(OR, gbc);
      
      
      gbc.anchor = GridBagConstraints.PAGE_END;
      JButton WA = new JButton("WA");
      WA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 2;
      gbc.gridy = 0;
      label.add(WA, gbc);
   
   
      gbc.anchor = GridBagConstraints.FIRST_LINE_START;
      JButton UT = new JButton("UT");
      UT.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 4;
      gbc.gridy = 5;
      label.add(UT, gbc);
      
      gbc.anchor = GridBagConstraints.FIRST_LINE_END;
      JButton AZ = new JButton("AZ");
      AZ.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 3;
      gbc.gridy = 7;
      label.add(AZ, gbc);
      
      
      gbc.anchor = GridBagConstraints.PAGE_END;
      JButton WI = new JButton("WI");
      WI.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 12;
      gbc.gridy = 2;
      label.add(WI, gbc);
   
   
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      JButton IL = new JButton("IL");
      IL.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 13;
      gbc.gridy = 4;
      label.add(IL, gbc);
   
   
      gbc.insets = new Insets(0,40,0,0);
      gbc.anchor = GridBagConstraints.LAST_LINE_END;
      JButton IN = new JButton("IN");
      IN.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 13;
      gbc.gridy = 4;
      label.add(IN, gbc);
   
   
      gbc.anchor = GridBagConstraints.LINE_START;
      gbc.insets = new Insets(0,0,0,0);
      JButton OH = new JButton("OH");
      OH.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 15;
      gbc.gridy = 4;
      label.add(OH, gbc);
      
      
      
      JButton MI = new JButton("MI");
      MI.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 14;
      gbc.gridy = 3;
      label.add(MI, gbc);
      
      
      
   gbc.anchor = GridBagConstraints.LINE_START;
      JButton MS = new JButton("MS");
      MS.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 13;
      gbc.gridy = 8;
      label.add(MS, gbc);
      
      gbc.insets = new Insets(0,50,0,0);
      gbc.anchor = GridBagConstraints.LINE_END;
      JButton AL = new JButton("AL");
      AL.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 13;
      gbc.gridy = 8;
      label.add(AL, gbc);
      
      
      gbc.insets = new Insets(0,0,0,0);
      gbc.anchor = GridBagConstraints.PAGE_END;
      JButton GA = new JButton("GA");
      GA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 15;
      gbc.gridy = 8;
      label.add(GA, gbc);
      
   
      
      JButton FL = new JButton("FL");
      FL.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 16;
      gbc.gridy = 10;
      label.add(FL, gbc);
      
      
      JButton SC = new JButton("SC");
      SC.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 16;
      gbc.gridy = 7;
      label.add(SC, gbc);
      
      
      gbc.anchor = GridBagConstraints.LINE_END;
      JButton NC = new JButton("NC");
      NC.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 16;
      gbc.gridy = 6;
      label.add(NC, gbc);
      
      
      JButton VA = new JButton("VA");
      VA.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 16;
      gbc.gridy = 5;
      label.add(VA, gbc);


      JButton WV = new JButton("WV");
      WV.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 15;
      gbc.gridy = 5;
      label.add(WV, gbc);

      
      gbc.anchor = GridBagConstraints.LAST_LINE_START;
      JButton KC = new JButton("KC");
      KC.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 14;
      gbc.gridy = 5;
      label.add(KC, gbc);
      
      
      
      JButton TN = new JButton("TN");
      TN.setPreferredSize(new Dimension(30, 30));
      gbc.gridx = 14;
      gbc.gridy = 6;
      label.add(TN, gbc);
      
      
      
      JButton ZOOM = new JButton("ZOOM");
      ZOOM.setPreferredSize(new Dimension(50, 50));
      gbc.gridx = 17;
      gbc.gridy = 3;
      ZOOM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            panel1.setVisible(false);
            northEast.setVisible(true);
            }
        });
      label.add(ZOOM, gbc);

      
   
   
      
      panel1.add(label);
      panel2.add(slider, BorderLayout.SOUTH);
      panel2.add(day, BorderLayout.NORTH);
      frame.add(northEast);
      northEast.setVisible(false);
      frame.add(panel1);
      frame.add(panel2);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
      slider.addChangeListener(
         new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
               if((((JSlider)e.getSource()).getValue() >= 0) && (((JSlider)e.getSource()).getValue() <= 28))
                  day.setText("Feburary " + (((JSlider)e.getSource()).getValue() + 1) + " 2020");
               if((((JSlider)e.getSource()).getValue() >= 29) && (((JSlider)e.getSource()).getValue() <= 59))
                  day.setText("March " + (((JSlider)e.getSource()).getValue() - 28) + " 2020");
               if((((JSlider)e.getSource()).getValue() >= 60) && (((JSlider)e.getSource()).getValue() <= 89))
                  day.setText("April " + (((JSlider)e.getSource()).getValue() - 59) + " 2020");
            }
         });
     
   }
   
   /*
   public static void resize(String inputImagePath,
            String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
            
      File inputFile = new File(inputImagePath);
      BufferedImage inputImage = ImageIO.read(inputFile);
   
      BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());
   
      Graphics2D g2d = outputImage.createGraphics();
      g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
      g2d.dispose();
   
      String formatName = outputImagePath.substring(outputImagePath
                .lastIndexOf(".") + 1);
   
      ImageIO.write(outputImage, formatName, new File(outputImagePath));
   }
   */
   
}
