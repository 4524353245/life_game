package life_game;

/**
 * @Author: Shawn
 * @Date: 2018/09/13 13:10
 */
import java.awt.Color;

import javax.swing.JPanel;

public class judge_state {
    static boolean [][] state_one;
    JPanel[][] jPanel;
    //初始化类
    public judge_state(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }

    //判断中心生命的状态并更新
    public void judge() {
        int life = 0;
        for (int i = 1; i < state_one.length - 1; i++) {
            for (int j = 1; j < state_one[i].length - 1; j++) {
                //循环判断中心生命周围的各个点的状态
                int nCount = 0;
                if (jPanel[i - 1][j - 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i - 1][j].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i - 1][j + 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i][j - 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i][j + 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i + 1][j - 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i + 1][j].getBackground() == Color.black) {
                    nCount++;
                }
                if (jPanel[i + 1][j + 1].getBackground() == Color.black) {
                    nCount++;
                }
                if (nCount==3) {
                    state_one[i][j] = true;
                }
                else if (nCount == 2) {
                    state_one[i][j] = state_one[i][j];
                }
                else
                    state_one[i][j] = false;
            }
        }
    }
}
