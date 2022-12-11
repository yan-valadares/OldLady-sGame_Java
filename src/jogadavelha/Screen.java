package jogadavelha;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Screen extends JFrame implements ActionListener{
    JButton[] button = new JButton[9];    
    Board board = new Board();
    boolean[] click = new boolean[9];
    Cleaner cleaner = new Cleaner();
    Score scoreGame = new Score();
    JLabel score = new JLabel("Placar");
    JLabel xPontuationPanel = new JLabel("O jogador X tem 0 pontos");
    JLabel oPontuationPanel = new JLabel("O jogador O tem 0 pontos");
    JButton newGame = new JButton("Novo Jogo");
    JButton scoreCleaner = new JButton("Zerar Placar");
    
    
    
    public Screen(){
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(400, 150, 700, 500);
        add(score);
        add(xPontuationPanel);
        add(oPontuationPanel);
        add(newGame);
        add(scoreCleaner);
        score.setBounds(455, 65, 100, 30);
        score.setFont(new Font("SansSerif", Font.BOLD, 20));
        xPontuationPanel.setBounds(400, 105, 200, 30);
        xPontuationPanel.setFont(new Font("SansSerif", Font.BOLD, 14));
        oPontuationPanel.setBounds(400, 135, 200, 30);
        oPontuationPanel.setFont(new Font("SansSerif", Font.BOLD, 14));
        newGame.setBounds(425, 200, 125, 30);
        scoreCleaner.setBounds(425, 250, 125, 30);
        
        newGame.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    cleaner.clear(click, button);
                }          
        });
        scoreCleaner.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    scoreGame.setxPontuation(0);
                    scoreGame.setoPontuation(0);
                    scoreGame.updateScore(xPontuationPanel, oPontuationPanel);
                }          
        });
        
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
                    board.win(click, button, xPontuationPanel, oPontuationPanel);                    
                }   
            }
        });
        button[1].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false ){
                    click[1] = true;
                    board.change(button[1]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[2].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false ){
                    click[2] = true;
                    board.change(button[2]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[3].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false ){
                    click[3] = true;
                    board.change(button[3]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[4].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false ){
                    click[4] = true;
                    board.change(button[4]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[5].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false ){
                    click[5] = true;
                    board.change(button[5]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[6].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false ){
                    click[6] = true;
                    board.change(button[6]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[7].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false ){
                    click[7] = true;
                    board.change(button[7]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
        button[8].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false ){
                    click[8] = true;
                    board.change(button[8]);
                    board.win(click, button, xPontuationPanel, oPontuationPanel);
                }   
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
