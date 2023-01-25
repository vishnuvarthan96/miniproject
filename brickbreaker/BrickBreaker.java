/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.brickbreaker;

import javax.swing.JFrame;

/**
 *
 * @author vishnu v
 */
public class BrickBreaker {

    public static void main(String[] args) {
      JFrame frame=new JFrame();
      GamePlay gameplay=new GamePlay();
      frame.setSize(700,600);
      frame.setTitle("BrickBreaker");
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(gameplay);
      
    }
}
