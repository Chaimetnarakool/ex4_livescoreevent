/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreevent;

/**
 *
 * @author Nai
 */
public class Subscriber implements ScoreListener{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void scoreChange(ScoreEvent event) {
        String score = event.getScore();
        System.out.println("live result: " + score + " <- " + name);
    }
}
