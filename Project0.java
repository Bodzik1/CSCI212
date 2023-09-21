/*
Name: Bogdan Mieldzicz
CunyId: 24321198
Lab Section: LAB 121A, Professor Zahava Lowy and days tue/thu 9:00 am to 9:50 am
*/

/*
This program is intended to do the following:
    1. Ask the user to type in a sentence in a JOptionPane.showInputDialog().
    2. The program will go through each letter in the string and count how many upperCase E's
    and lowerCase e's. The way we do that is putting the users string in a for-loop, using charAt
    method in the class String.
    3. Using a JOptionPane.showMessageDialog(), tell the user how many upper and lower
    case e's were in the string.
    4. Repeat this process until the user types the word "Stop". We have to use equalsIgnoreCase 
    to make "Stop" written the sameway removing the case-sensitivity.
*/

import javax.swing.*;

public class Project0{
	// create string method named ReadSentence.
	public static String ReadSentence(){
		String sentence;
			// set sentence equal to JOptionPane to store user input, request in a dialog box user input.
			sentence = JOptionPane.showInputDialog(null, "Enter a sentence:");
			// return user input if user enters a valid sentence and not "STOP". 
			return sentence;
	}
	
	public static void main(String[] args){
		
        // intialized values to keep track of how many E's and e's there are.
		int upperCase = 0, lowerCase = 0;

        // empty string waiting for users input.
		String userinput;

		// utilize a while loop to check for user input error
		while(true){
			// set string data type equal to method created (if something is returned from the method it will now.
			// be stored in userinput).
			userinput = ReadSentence();

			// create if statement and use .equalsIgnoreCase to avoid errors when user types "STOP".
			if (userinput.equalsIgnoreCase("STOP")){
				// if user enters "STOP" the dialog box will output finish.
				JOptionPane.showMessageDialog(null, "Finish");
				System.exit(0);
			}

			// create a for loop using .length() in order to read each element of the user input.
			for(int i = 0; i < userinput.length(); i++){
				// if statment using .charAt(int) in order to check if an element of the user equals to char'E'.
				if(userinput.charAt(i) == 'E'){
					//if an upper case E is found, add 1 to upperCase to keep count until for loop ends.
					upperCase++;
				}
				if(userinput.charAt(i) == 'e'){
					// if an lower case e is found, add 1 to the lowerCase to keep count until for loop ends.
                    lowerCase++;
				}
			}
			// output in a dialog box the result of the numbes of E's and e's that user typed in sentence.
			JOptionPane.showMessageDialog(null, "Number of upper case E's: " + upperCase +"\n"
                                                              + "Number of lower case case e's: "+ lowerCase);
		}
	}
}