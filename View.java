import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {
	// View uses Swing framework to display UI to user
	 private JFrame frame;
	 private JLabel firstnameLabel;
	 private JLabel lastnameLabel;
	 private JTextField firstnameTextfield;
	 private JTextField lastnameTextfield;
	 private JButton firstnameSaveButton;
	 private JButton lastnameSaveButton;
	 private JButton hello;
	 private JButton bye;
	 
	 public View(String title) {
	  frame = new JFrame(title);
	  frame.getContentPane().setLayout(new BorderLayout());
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setSize(500, 120);
	  frame.setLocationRelativeTo(null);
	  frame.setVisible(true);
	 
	  // Create UI elements
	  fname_label = new JLabel("Firstname :");
	  lname_label = new JLabel("Lastname :");
	  fnameTextfield = new JTextField();
	  lnameTextfield = new JTextField();
	  fnameSaveButton = new JButton("Save firstname");
	  lnameSaveButton = new JButton("Save lastname");
	  hello_button = new JButton("Hello!");
	  bye_button = new JButton("Bye!");
	 
	  // Add UI element to frame
	  GroupLayout layout = new GroupLayout(frame.getContentPane());
	  layout.setAutoCreateGaps(true);
	  layout.setAutoCreateContainerGaps(true);
	  layout.setHorizontalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameLabel)
	    .addComponent(lastnameLabel))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameTextfield)
	    .addComponent(lastnameTextfield))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(firstnameSaveButton)
	    .addComponent(lastnameSaveButton))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(hello)
	    .addComponent(bye)));
	  layout.setVerticalGroup(layout.createSequentialGroup()
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(firstnameLabel)
	    .addComponent(firstnameTextfield).addComponent(firstnameSaveButton).addComponent(hello))
	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lastnameLabel)
	    .addComponent(lastnameTextfield).addComponent(lastnameSaveButton).addComponent(bye)));
	 
	  layout.linkSize(SwingConstants.HORIZONTAL, firstnameSaveButton, lastnameSaveButton);
	  layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
	  frame.getContentPane().setLayout(layout);
	 }
	 
	 public JFrame getFrame() {
	  return frame;
	 }
	 
	 public void setFrame(JFrame frame) {
	  this.frame = frame;
	 }
	 
	 public JLabel getFnameLabel() {
	  return fname_label;
	 }
	 
	 public void setFnameLabel(JLabel fname_label) {
	  this.fname_label = fname_label;
	 }
	 
	 public JLabel getLnameLabel() {
	  return lname_label;
	 }
	 
	 public void setLnameLabel(JLabel lname_label) {
	  this.lname_label = lname_label;
	 }
	 
	 public JTextField getFnameTextfield() {
	  return fnameTextfield;
	 }
	 
	 public void setFnameTextfield(JTextField fnameTextfield) {
	  this.fnameTextfield = fnameTextfield;
	 }
	 
	 public JTextField getLnameTextfield() {
	  return lnameTextfield;
	 }
	 
	 public void setLnameTextfield(JTextField lnameTextfield) {
	  this.lnameTextfield = lnameTextfield;
	 }
	 
	 public JButton getFnameSaveButton() {
	  return fnameSaveButton;
	 }
	 
	 public void setFnameSaveButton(JButton fnameSaveButton) {
	  this.fnameSaveButton = fnameSaveButton;
	 }
	 
	 public JButton getLnameSaveButton() {
	  return lnameSaveButton;
	 }
	 
	 public void setLnameSaveButton(JButton lnameSaveButton) {
	  this.lnameSaveButton = lnameSaveButton;
	 }
	 
	 public JButton getHello() {
	  return hello_button;
	 }
	 
	 public void setHello(JButton hello) {
	  this.hello_button = hello_button;
	 }
	 
	 public JButton getBye() {
	  return bye_button;
	 }
	 
	 public void setBye(JButton bye) {
	  this.bye_button = bye_button;
	 }
	 
}
