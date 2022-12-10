package jogadavelha;

import javax.swing.JButton;

public class Cleaner {
    
    public void clear(boolean click[], JButton button[]){
        for (int i = 0; i < 9; i++){
            button[i].setText("");
            click[i] = false;
        }
    }
}
