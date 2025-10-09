import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Display {
    private JFrame frame;
    private JList<String> itemList;
    private DefaultListModel<String> listModel;
    private JLabel subtotalLabel;

    public Display() {
        frame = new JFrame("Cash Register Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(450, 50);
        frame.setLayout(new BorderLayout());

        // Create the list model and JList for scanned items
        listModel = new DefaultListModel<>();
        itemList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(itemList);

        // Create subtotal label
        subtotal_label = new JLabel("Subtotal: $0.00");
        subtotal_label.setFont(new Font("Arial", Font.BOLD, 16));
        JPanel bpanel = new JPanel();
        bpanel.add(subtotal_label);

        // Add components to frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void addItem(String itemDescription) {
        listModel.addElement(itemDescription);
    }

    public void updateSubtotal(double subtotal) {
        subtotalLabel.setText("Subtotal: $" + String.format("%.2f", subtotal));
    }

    public void clearDisplay() {
        listModel.clear();
        subtotalLabel.setText("Subtotal: $0.00");
    }

    public JFrame getFrame() {
        return frame;
    }
}
