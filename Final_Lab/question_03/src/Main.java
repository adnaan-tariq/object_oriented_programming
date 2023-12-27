import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class firstPage {
    JFrame frame;
    void sendDisplayInformation(String name, String no, String seats) {
        page2 p2 = new page2(name,no,seats);
        frame.dispose();
    }
    public firstPage () {

        int bus[] = {1,2,3,4,5,6,7,8,9,10};

        JFrame frame = new JFrame("Bus Reservation System");
        JPanel panel = new JPanel();
        JTextField bus_name = new JTextField();
        JTextField bus_number = new JTextField();
        JTextField no_seats = new JTextField();

        JLabel label1 = new JLabel("Bus Name");
        JLabel label2 = new JLabel("Bus No");
        JLabel label3 = new JLabel("No of Seats");

        JButton submit = new JButton("Submit");

        panel.add(label1);
        panel.add(bus_name);
        panel.add(label2);
        panel.add(bus_number);
        panel.add(label3);
        panel.add(no_seats);
        panel.add(submit);
        frame.add(panel);

        frame.setSize(500,600);
        frame.setVisible(true);
        panel.setLayout(new GridLayout(9,0));

        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int no = Integer.parseInt(bus_number.getText());
                Boolean busFound = false;
                for(int i = 0; i< 10; i++) {
                    if(bus[i] == no) {
                        busFound = true;
                        sendDisplayInformation(bus_name.getText(), bus_number.getText(), no_seats.getText());

                    }
                }
                if(busFound == false) {
                    JOptionPane.showMessageDialog(frame,"Bus not found!");

                }
            }
        });
    }
}
class page2 {
    JFrame frame;
    JPanel panel;
    public page2 (String name, String number, String seats) {
        frame = new JFrame("Bus Reservation System");
        panel = new JPanel();

        JLabel label1 = new JLabel("Bus Name: " + name);
        JLabel label2 = new JLabel("Bus No: " + number);
        JLabel label3 = new JLabel("No of Seats: " + seats);

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        frame.add(panel);

        frame.setSize(500,600);
        frame.setVisible(true);
        panel.setLayout(new GridLayout(9,0));
    }
}
public class Main{
    public static void main(String[] args) {
        firstPage page = new firstPage();
    }
}