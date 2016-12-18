import javax.swing.*;
import java.awt.*;

public class PesoPlaneta extends JFrame
{
    private JLabel lb_peso;
    private JLabel lb_planeta;
    private JTextField tf_peso;
    private JLabel lb_res;
    private JTextField tf_mostraRes;
    private JRadioButton rb_merc;
    private JRadioButton rb_ven;
    private JRadioButton rb_mar;
    private JRadioButton rb_jup;
    private JRadioButton rb_sat;
    private JRadioButton rb_ura;
    private JLabel lb_mercurio;
    private JLabel lb_venus;
    private JLabel lb_marte;
    private JLabel lb_jupiter;
    private JLabel lb_saturno;
    private JLabel lb_urano;
    //private da gif
    
    public PesoPlaneta(){
        super("Calcule seu peso! - Abel Pinheiro e Matheus Gomes");
        lb_peso = new JLabel("Peso:");
        lb_planeta = new JLabel("Planeta: ");
        tf_peso = new JTextField("",2);
        lb_res = new JLabel("Resultado:                                 ");
        tf_mostraRes = new JTextField("", 8);
        rb_merc = new JRadioButton();
        rb_ven = new JRadioButton();
        rb_mar = new JRadioButton();
        rb_jup = new JRadioButton();
        rb_sat = new JRadioButton();
        rb_ura = new JRadioButton();
        lb_mercurio = new JLabel("Mercúrio");
        lb_venus = new JLabel("Vênus");
        lb_marte = new JLabel("Marte");
        lb_jupiter = new JLabel("Júpiter");
        lb_saturno = new JLabel("Saturno");
        lb_urano = new JLabel("Urano");
        this.setLayout(new BorderLayout());
        Panel pn_Peso = new Panel();
        pn_Peso.setLayout(new GridLayout(1,2));
        pn_Peso.add(lb_peso);
        pn_Peso.add(tf_peso);
        Panel norte = new Panel();
        norte.setLayout(new GridLayout(1,2));
        norte.add(pn_Peso);
        norte.add(new Panel());
        this.add("North", norte);
        Panel oeste = new Panel();
        oeste.setLayout(new BoxLayout(oeste, BoxLayout.Y_AXIS));
        oeste.add(lb_planeta);
        Panel mercurio = new Panel();
        Panel venus = new Panel();
        Panel marte = new Panel();
        Panel  jupiter = new Panel();
        Panel saturno = new Panel();
        Panel urano  = new Panel();
        mercurio.setLayout(new GridLayout(1,2));
        venus.setLayout(new GridLayout(1,2));
        jupiter.setLayout(new GridLayout(1,2));
        saturno.setLayout(new GridLayout(1,2));
        marte.setLayout(new GridLayout(1,2));
        urano.setLayout(new GridLayout(1,2));
        mercurio.add(rb_merc);
        mercurio.add(lb_mercurio);
        venus.add(rb_ven);
        venus.add(lb_venus);
        marte.add(rb_mar);
        marte.add(lb_marte);
        urano.add(rb_ura);
        urano.add(lb_urano);
        saturno.add(rb_sat);
        saturno.add(lb_saturno);
        jupiter.add(rb_jup);
        jupiter.add(lb_jupiter);
        oeste.add(mercurio);
        oeste.add(saturno);
        oeste.add(venus);
        oeste.add(jupiter);
        oeste.add(urano);
        oeste.add(marte);
        this.add("West", oeste);
        Panel leste = new Panel();
        leste.setLayout(new BoxLayout(leste, BoxLayout.Y_AXIS));
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(lb_res);
        leste.add(tf_mostraRes);
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(new Panel());
        leste.add(new Panel());
        this.add("East", leste);
        this.setSize(400,300);
        this.setVisible(true);
    }
    
    public static void main(String[] args){
        PesoPlaneta programa = new PesoPlaneta();
    }
}
