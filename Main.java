/*
Lab 4
Me: Tanner Daria. Partner: Alex Hils.
Date: 11/9
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

class Main {
 public static void main(String args[]) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
        new GuessingGame();
     }
   });
 }
} 