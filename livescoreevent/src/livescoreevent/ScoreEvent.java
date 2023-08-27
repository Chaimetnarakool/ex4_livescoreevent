/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreevent;

import java.util.EventObject;

/**
 *
 * @author Nai
 */
public class ScoreEvent extends EventObject {
    private String score;

    public ScoreEvent(Object source, String score) {
        super(source);
        this.score = score;
    }

    public String getScore() {
        return score;
    }
}
