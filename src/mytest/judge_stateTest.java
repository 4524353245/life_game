package mytest;

import life_game.judge_state;
import life_game.set_color;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * @Author: Shawn
 * @Date: 2018/09/16 11:01
 */
public class judge_stateTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void judge() {
        boolean [][] state_one=new boolean[30][30];
        JPanel[][] jPanel=  new JPanel[30][30];
        for(int i=0;i<30;i++){
            for(int j=0;j<30;j++){
                jPanel[i][j]=new JPanel();
                jPanel[i][j].setBackground(Color.white);
            }
        }
        state_one[0][0]=true;
        state_one[0][1]=true;
        state_one[1][0]=true;
        state_one[1][1]=true;
        set_color set_colorTest=new set_color(state_one,jPanel);
        set_colorTest.paint();
        judge_state judgeTest= new judge_state(state_one,jPanel);
        judgeTest.judge();
        assertEquals(true,state_one[1][1]);
        assertEquals(true,state_one[0][1]);
        assertEquals(true,state_one[0][0]);
        assertEquals(true,state_one[1][0]);
    }
}