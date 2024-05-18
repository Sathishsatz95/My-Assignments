package week3assignments;

import java.awt.TextField;

public class Elements extends WebElement{
	public static void main(String[] args) {
		Button ex = new Button();
				ex.click();
				ex.submit();
		
				CheckBoxButton cb = new CheckBoxButton();		
				cb.clickcheckbutton();
				
				RadioButton Rb = new RadioButton();
						Rb.selectRadioButton();
				
						TextField textField = new TextField();
				        textField.setText("Enter the Word");
				        System.out.println("Text: " + textField.getText());
				
	}

}
