package jogadavelha;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Board {
    Cleaner cleaner = new Cleaner();
    boolean xo = false;
    
    public void change(JButton button) {
        if (xo) {
            button.setText("O");
            xo = false;
        } else{
            button.setText("X");
            xo = true;
        }
        
    }
    
    public void win(boolean click[], JButton button[]){
        int cont = 0;
        for (int i = 0; i < 9; i++){
            if(click[i] == true){
                cont++;
            }
        }
        if ((button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X")
                || (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X")
                || (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X")
                || (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X")
                || (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X")
                || (button[6].getText() == "X" && button[4].getText() == "X" && button[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "X ganhou!");            
            cleaner.clear(click, button);               
            } else if ((button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O")
                || (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O")
                || (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O")
                || (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O")
                || (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O")
                || (button[6].getText() == "O" && button[4].getText() == "O" && button[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "O ganhou!");
            cleaner.clear(click, button);
        } else if(cont == 9){
            JOptionPane.showMessageDialog(null, "Empate!");
            cleaner.clear(click, button);
        }
    }
   
}
