package ch8;
import javax.swing.JOptionPane;
public class ThreeParallelArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String states[] = { "Alabama" ,"Alaska", "Arizona","Arkansas" , "California" , 
				"Ccolorado" , "Connecticut","Delaware" , "Florida" , " Georgia" , "Hawaii" , 
				"Idaho" ,"Tllinois", "Indiana" , "Iowa" , "Kansas","Kentucky" ,"Louisiana" , 
				"Maine" , "Maryland" , "Massachusetts" , "ichigan" , "innesota","Nississippi" , 
				"Hissouri", "Montana" , "Nebraska" , "Nevada" , "New Hampshire" ,"New Jersey",
				"New Nexico", "New York" , "North Carolina" , "North Dakota", "Ohio" , "0klahoma" , 
				"Oregon","Pennsylvania" , "Rhode Island" , "South Carolina" , "South Dakota" , 
				"Tennessee", "Texas","Utah" , "Vermont" , "Virginia", "Washington" , "West Virginia" ,
				"Wisconsin" , "Wlyoming"};

		String statesAbbrev[]= {"AL","AK","AZ","AR","CA","CO" ,"CT", "DE" , "FL","GA","HI" , "ID","IL","TN","IA","KS",
				"KY", "LA","NE","NID","NA","I","NN","NS","NO" ,"T","NE", "NV", "NH","NJ", "NNI","NY" ,"NC", "ND","OH",
				"OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};

		String capitals[] = { "Montgomery" ," Juneau" ,"Phoenix" , "Little Rock" , "Sacramento" ,"Denver","Hartford",
				"Dover", "Tallahassee" , "Atlanta" , "Honolulu" , "Boise" , "Springfield" , "Indianapolis",
				"Des Noines" , "Topeka" , "Frankfort" , "Baton Rouge" ,"Augusta" ,"Annapolis" , "Boston" , "Lansing",
				"St. Paul" , "Jackson" ,".Jefferson city" , "Helena" , "Lincoln" , " carson city" , "Concord", "Trenton","Santa Fe" , "Albany" , " Raleigh" , "Bismarck" , "Columbus" , "OKlahoma City" , "Salem" , "Harrisburg"，"Providence" ," Columbia" , "Pierre" , "Nashville" , "Austin" , "salt Lake city" , "Nontpelier"，
				"Richmond" , "olympia" , "Charleston" , "Madison" , "Cheyenne"};
		while(true){
			String state = JOptionPane.showInputDialog( null,"Enter a state name");
			int index = 1;
			
			for(int i=0;i<50;i++) {if(states[i].equals(state)) {index=i;break;}}
			if(index!=-1){
				String abbrev = statesAbbrev[index];
				String capital = capitals[index];
				JOptionPane.showMessageDialog(null,"The abbreviation for" +state+ "is" +abbrev+ " and the capital is " +capital+"\n");
				String zip = JOptionPane .showInputDialog(null,"Enter the zip code for " +capital);
				Array.set(capitals,index,capital+"-"+zip);}

			else{System.out.print( "That's not a valid state.Try again\n");}
			
			String exit=JOptionPane .showInputDialog(null,"Wlould you like to exit? (y or n)");if(exit.equals("y")){break;}



		
		

	}

	}}
