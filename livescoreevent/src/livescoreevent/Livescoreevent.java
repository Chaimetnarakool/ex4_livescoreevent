/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livescoreevent;

import javax.swing.JOptionPane;

/**
 *
 * @author Nai
 */
public class Livescoreevent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSource();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        scoreSource.addListener(subscriber1);
        scoreSource.addListener(subscriber2);

        while (true) {
            String input = JOptionPane.showInputDialog("Enter Score (or press Enter to exit): ");
            if (input.isEmpty()) {
                break;
            }
            scoreSource.setScoreLine(input);
        }
    }
    
}
