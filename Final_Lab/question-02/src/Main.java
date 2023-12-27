import javax.swing.*;
public class Main{
    public static void main(String[] args) {
        JFrame bus = new JFrame("BUS Reservation System");

        JLabel name = new JLabel("Bus Name: ");
        JLabel Number = new JLabel("Bus number: ");
        JLabel seats = new JLabel("No.of seats: ");
        JLabel reserve = new JLabel("Book Bus");

        JButton ok = new JButton("Ok");

        JTextField n1 = new JTextField();
        JTextField N1 = new JTextField();
        JTextField s1 = new JTextField();

        name.setBounds(40, 100, 100,20);
        Number.setBounds(40,140,100,20);
        seats.setBounds(40,180,100,20);


        reserve.setBounds(100,50,70,20);

        n1.setBounds(120,100,100,20);
        N1.setBounds(120,140,100,20);
        s1.setBounds(120,180,100,20);

        ok.setBounds(100,230,70,20);


        bus.add(name);
        bus.add(Number);
        bus.add(seats);
        bus.add(n1);
        bus.add(N1);
        bus.add(s1);
        bus.add(ok);
        bus.add(reserve);


        bus.setLayout(null);
        bus.setVisible(true);
        bus.setSize(400,400);
    }
}