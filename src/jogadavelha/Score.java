package jogadavelha;

import javax.swing.JLabel;


public class Score {
    int xPontuation = 0;
    int oPontuation = 0;

    public int getxPontuation() {
        return xPontuation;
    }

    public void setxPontuation(int xPontuation) {
        this.xPontuation = xPontuation;
    }

    public int getoPontuation() {
        return oPontuation;
    }

    public void setoPontuation(int yPontuation) {
        this.oPontuation = yPontuation;
    }
    
    public void updateScore(JLabel xPontuationPanel, JLabel oPontuationPanel){
        xPontuationPanel.setText("O jogador X tem " + this.xPontuation + " pontos");
        oPontuationPanel.setText("O jogador O tem " + this.oPontuation + " pontos");
    }
}
