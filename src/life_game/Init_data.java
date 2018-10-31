package life_game;

/**
 * @Author: Shawn
 * @Date: 2018/09/13 13:07
 */
import java.util.Random;

public class Init_data{
    static boolean[][] state;
    static int rand;
    public Init_data(boolean[][] state_one)
    {
        state = state_one;
    }

    public void init_one()
    {
        for(int i=1;i<state.length;i++){

            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }

        //    模式一图形JQ
        //     J
        state[10][3] = true;
        state[10][4] = true;
        state[10][5] = true;
        state[10][6] = true;
        state[10][7] = true;
        state[10][8] = true;


        state[11][5] = true;
        state[12][5] = true;
        state[13][5] = true;
        state[14][5] = true;
        state[15][5] = true;
        state[16][5] = true;
        state[17][5] = true;
        state[18][5] = true;
        state[19][5] = true;
        state[20][5] = true;
        state[21][5] = true;
        state[22][5] = true;
        state[23][5] = true;

        state[10][6] = true;
        state[11][6] = true;
        state[12][6] = true;
        state[13][6] = true;
        state[14][6] = true;
        state[15][6] = true;
        state[16][6] = true;
        state[17][6] = true;
        state[18][6] = true;
        state[19][6] = true;
        state[20][6] = true;
        state[21][6] = true;
        state[22][6] = true;

        state[21][3] = true;
        state[22][3] = true;
        state[22][4] = true;
        state[23][4] = true;

        //Q
        state[11][12] = true;
        state[12][12] = true;
        state[13][12] = true;
        state[14][12] = true;
        state[15][12] = true;
        state[16][12] = true;
        state[17][12] = true;
        state[18][12] = true;
        state[19][12] = true;
        state[20][12] = true;
        state[21][12] = true;

        state[10][13] = true;
        state[22][13] = true;

        state[10][14] = true;
        state[22][14] = true;

        state[10][15] = true;
        state[22][15] = true;

        state[10][16] = true;
        state[22][16] = true;

        state[10][17] = true;
        state[19][17] = true;
        state[22][17] = true;
        state[10][18] = true;
        state[20][18] = true;
        state[22][18] = true;

        state[11][19] = true;
        state[12][19] = true;
        state[13][19] = true;
        state[14][19] = true;
        state[15][19] = true;
        state[16][19] = true;
        state[17][19] = true;
        state[18][19] = true;
        state[19][19] = true;
        state[20][19] = true;
        state[21][19] = true;


        state[23][21] = true;
        state[22][20] = true;


    }

    public void init_two()
    {
        for(int i=1;i<state.length;i++)
        {
            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }
        //    心形
        state[9][15] = true;
        state[10][15] = true;
        state[11][15] = true;
        state[12][15] = true;
        state[13][15] = true;
        state[14][15] = true;
        state[15][15] = true;
        state[16][15] = true;
        state[17][15] = true;
        state[18][15] = true;

        state[8][14] = true;
        state[9][14] = true;
        state[10][14] = true;
        state[11][14] = true;
        state[12][14] = true;
        state[13][14] = true;
        state[14][14] = true;
        state[15][14] = true;
        state[16][14] = true;
        state[17][14] = true;

        state[8][16] = true;
        state[9][16] = true;
        state[10][16] = true;
        state[11][16] = true;
        state[12][16] = true;
        state[13][16] = true;
        state[14][16] = true;
        state[15][16] = true;
        state[16][16] = true;
        state[17][16] = true;

        state[7][13] = true;
        state[8][13] = true;
        state[9][13] = true;
        state[10][13] = true;
        state[11][13] = true;
        state[12][13] = true;
        state[13][13] = true;
        state[14][13] = true;
        state[15][13] = true;
        state[16][13] = true;

        state[7][17] = true;
        state[8][17] = true;
        state[9][17] = true;
        state[10][17] = true;
        state[11][17] = true;
        state[12][17] = true;
        state[13][17] = true;
        state[14][17] = true;
        state[15][17] = true;
        state[16][17] = true;

        state[7][12] = true;
        state[8][12] = true;
        state[9][12] = true;
        state[10][12] = true;
        state[11][12] = true;
        state[12][12] = true;
        state[13][12] = true;
        state[14][12] = true;
        state[15][12] = true;

        state[7][18] = true;
        state[8][18] = true;
        state[9][18] = true;
        state[10][18] = true;
        state[11][18] = true;
        state[12][18] = true;
        state[13][18] = true;
        state[14][18] = true;
        state[15][18] = true;

        state[8][11] = true;
        state[9][11] = true;
        state[10][11] = true;
        state[11][11] = true;
        state[12][11] = true;
        state[13][11] = true;
        state[14][11] = true;

        state[8][19] = true;
        state[9][19] = true;
        state[10][19] = true;
        state[11][19] = true;
        state[12][19] = true;
        state[13][19] = true;
        state[14][19] = true;

        state[9][10] = true;
        state[10][10] = true;
        state[11][10] = true;
        state[12][10] = true;
        state[13][10] = true;

        state[9][20] = true;
        state[10][20] = true;
        state[11][20] = true;
        state[12][20] = true;
        state[13][20] = true;


        state[10][9] = true;
        state[11][9] = true;
        state[12][9] = true;

        state[10][21] = true;
        state[11][21] = true;
        state[12][21] = true;


    }

    public void init_three()
    {
        for(int i=1;i<state.length;i++)
        {
            for(int j=1;j<state[i].length-1;j++)
            {
                rand = (int) (Math.random()*100);
                if (rand<50) {
                    state[i][j] = false;
                }
                else
                    state[i][j] = true;
            }
        }
    }

}
