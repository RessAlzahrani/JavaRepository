/**
 * 
 */
package PizzaChoice;
import javax.swing.JOptionPane;
/**
 * @author RA316282
 *
 */
public class pizzaChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//user is selecting that they have made a choice
		String msg;
		String choiceYes;
	    String  size;
		String pizzaKind;
		double smallCost = 10.99;
		double mediumCost = 12.99;
		double largeCost = 15.99;
		
		
		 choiceYes = JOptionPane.showInputDialog(null,"Would you like a pizza?");
		
		//if you want pizza or not
		if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
		{
			JOptionPane.showInputDialog("You said " + choiceYes + " to have a pizza.");
			size = JOptionPane.showInputDialog(null,"Please choose a size: small, medium, or large?");
	        if ("small".equals(size) || "medium".equals(size) || "large".equals(size))
	        {
	        	JOptionPane.showInputDialog("You said " + size + " to pizza size.");
	        	pizzaKind = JOptionPane.showInputDialog(null,"What kind of pizza do you want? Pepperoni, Sausage, and/or Cheese?");
	        	if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind))
	        	{
	        		JOptionPane.showInputDialog("You said" + pizzaKind + "to have a pizza.");
	        		size = JOptionPane.showInputDialog(null,"Your order consists of" + size + " pizza, with the toppings of " + pizzaKind + "\n Do you want anything else?");
	                if ("small".equals(size))
	                {
	                	JOptionPane.showMessageDialog(null, "The cost of your pizza is $" + smallCost);
	                }
	                if  ("medium".equals(size))
	                {
	                	JOptionPane.showMessageDialog(null, "The cost of your pizza is $" + mediumCost);
	                }
	                if  ("large".equals(size))
	                {
	                	JOptionPane.showMessageDialog(null, "The cost of your pizza is $" + largeCost);
	                }
	        	}
	        }
			
		}

	}
	{
		//JOptionPane.showMessageDialog(null, size);
	}
}