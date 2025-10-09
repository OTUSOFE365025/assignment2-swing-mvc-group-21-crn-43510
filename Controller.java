import javax.swing.JOptionPane;
import java.util.List;

public class Controller {
	 private Model model;
	 private View view;
	 private CashRegister cash_register;
	 private Display display;

	 public Controller(Model model, View view) {
	  this.model = model;
	  this.view = view;
	  initView();
	 }

	 public Controller(CashRegister cash_register, Display display) {
	  this.cash_register = cash_register;
	  this.display = display;
	 }

	 public void initView() {
	  view.getFnameTextfield().setText(model.getFname());
	  view.getLnameTextfield().setText(model.getLname());
	 }

	 public void initController() {
	  view.getFnameSaveButton().addActionListener(e -> saveFname());
	  view.getLnameSaveButton().addActionListener(e -> saveLname());
	  view.getHello().addActionListener(e -> sayHello());
	  view.getBye().addActionListener(e -> sayBye());
	 }

	 public void handleScan(String upc_code) {
	  if (cash_register != null && display != null) {
	   cash_register.addItemByUPC(upcCode);

	   // Get the most recently added item
	   List<Product> items = cash_register.getScannedItems();
	   if (!items.isEmpty()) {
	    Product lastItem = items.get(items.size() - 1);
	    display.addItem(lastItem.toString());
	   }

	   // Update subtotal
	   display.updateSubtotal(cashRegister.getSubtotal());
	  }
	 }

	 private void saveFname() {
	  model.setFirstname(view.getFirstnameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Firstname saved : " + model.getFirstname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }

	 private void saveLname() {
	  model.setLastname(view.getLastnameTextfield().getText());
	  JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }

	 private void sayHello() {
	  JOptionPane.showMessageDialog(null, "Hello " + model.getFirstname() + " " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
	 }

	 private void sayBye() {
	  System.exit(0);
	 }

}
