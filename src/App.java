import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception{
        
        Expression obj = new Expression();

        obj.setValue(JOptionPane.showInputDialog
        (null, "Calculadora | + | - | x | ÷ |"));

        System.out.println(obj.formatValue(obj.getValue()));
        

    }
}
