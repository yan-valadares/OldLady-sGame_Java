package jogadavelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen extends JFrame implements ActionListener{
    JButton[] button = new JButton[9];    
    Board board = new Board();
    boolean[] click = new boolean[9];
    
    
    public Screen(){
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(400, 150, 700, 500);
        int counter = 0;
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
               button[counter] = new JButton();
               add(button[counter]);
               button[counter].setBounds((100 * i) + 50, (100 * j) + 75, 95, 95);
               button[counter].setFont(new Font("SansSerif", Font.BOLD, 40));
               counter++;
            }
        }
        
        for (int i = 0; i < 9; i++){
            click[i] = false;
        }
        
        button[0].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[0] == false ){
                    click[0] = true;
                    board.change(button[0]);
                    board.win(click, button);                    
                }   
            }
        });
        button[1].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false ){
                    click[1] = true;
                    board.change(button[1]);
                    board.win(click, button);
                }   
            }
        });
        button[2].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false ){
                    click[2] = true;
                    board.change(button[2]);
                    board.win(click, button);
                }   
            }
        });
        button[3].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false ){
                    click[3] = true;
                    board.change(button[3]);
                    board.win(click, button);
                }   
            }
        });
        button[4].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false ){
                    click[4] = true;
                    board.change(button[4]);
                    board.win(click, button);
                }   
            }
        });
        button[5].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false ){
                    click[5] = true;
                    board.change(button[5]);
                    board.win(click, button);
                }   
            }
        });
        button[6].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false ){
                    click[6] = true;
                    board.change(button[6]);
                    board.win(click, button);
                }   
            }
        });
        button[7].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false ){
                    click[7] = true;
                    board.change(button[7]);
                    board.win(click, button);
                }   
            }
        });
        button[8].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false ){
                    click[8] = true;
                    board.change(button[8]);
                    board.win(click, button);
                }   
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
