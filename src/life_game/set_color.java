package life_game;

/**
 * @Author: Shawn
 * @Date: 2018/09/13 13:11
 */
import java.awt.Color;

import javax.swing.JPanel;

public class set_color {
    static boolean [][] state_one;
    static JPanel[][] jPanel;
    //初始化类
    public set_color(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    //设置颜色
    public static void paint()
    {

        //循环判断状态设置颜色
        for(int i=0;i<state_one.length;i++)
        {
            for(int j=0;j<state_one[i].length;j++)
            {
                if (state_one[i][j]) {
                    jPanel[i][j].setBackground(Color.black);
                }
                else{
                    jPanel[i][j].setBackground(Color.white);
                }
            }
        }
    }
}