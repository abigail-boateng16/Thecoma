package boatengChapman;
import hsa_new.Console;

public class TheComa {

	public static void main(String[] args) {
		Console console = new Console();
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		String answer5;
		String answer6;
		String answer7;
		String answer8;
		String answer99;
		double number1 = Math.random();
		do{
		console.println("Some time ago, you were involved in a terrible car accident on Valentine's Day with your loving wife of 15 years, Veronica. You are just waking up from the resulting coma in a hospital that seems to be abandoned. Would you like to search your room or leave? (search room/leave)");
		answer1 = console.readLine();
		if (answer1.equals("search room")){
			console.println("After searching your room, you stumble upon Veronica's file which states the room she was held in and she had become mentally unstable after waking up from her coma. Do you choose to go to her room or leave the hospital? (go to room/ leave)");
			answer2 = console.readLine();
			if (answer2.equals("go to room")){
				console.println("When you get to Veronica's room, you find a decaying body and also notice that the case on the wall that contained a fire axe has been broken. Do you seach the body or leave? (search/ leave)"); 
				answer3 = console.readLine();
				if (answer3.equals("search")){
					console.println("You hold your breath as you search the corpse and find a key. Do you go to that room or stay put. (go to room/stay)");
					answer4 = console.readLine();
					if (answer4.equals("go to room")){
						console.println("You find the generator room and flip the switch.");
						if(number1 > 0.2){
							console.println("The power in the whole hospital turns on and you head towards the exits where you come face to face with Veronica. Do you ask why she's here, leave or ask what happened? (why are you here/leave/ask what happened)"); //Three options need if else if else
							answer5 = console.readLine();
							if(answer5.equals("why are you here")){
								console.println("I've been coming back every day to see if you had awoken. Do you ask why or just leave? (ask why/leave)");
								answer6 = console.readLine();
								if (answer6.equals("ask why")){
									console.println("I killed everyone here to make sure that I could see you everyday. Do you accept this and try to leave with her or leave by yourself? (accept/leave)");
									answer7 = console.readLine();
									if(answer7.equals("accept")){
										console.println("You leave with her and live with a psychopath for the rest of your life");
									}
								}
								
							}
							else if(answer5.equals("leave")){
								console.println("You leave with Veronica without ever finding out what happened here.");
							}
							else{
								console.println("I killed everyone here to make sure that I could see you every day. Do you try to disarm her or just try to slip by and escape? (disarm/leave");//must continue
							}
						}
						else{
							console.println("You get electrocuted. YOU ARE DEAD!");
						}
					}
					else{
						console.println("You're not sure what to do so you just look at the pictures hanging on the walls. After a while you feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
					}
				}
				else{
					while(answer2.equals("leave")){
						console.println("You go to the doors of the hospital but they are locked so you decide to return to Veronica's room. Do you try to leave again or search the body? (search/leave)");
						answer2 = console.readLine();//same problem as other while loop
					
				}
				
			}
			}
			else{
				while(answer2.equals("leave")){
				console.println("You go to the doors of the hospital but they are locked so you decide to return to your room. Do you try to leave again or go to Veronica's room? (go to room/leave)");
				answer2 = console.readLine();
				}
				if (answer2.equals("go to room")){
					console.println("When you get to Veronica's room, you find a decaying body and also notice that the case on the wall that contained a fire axe has been broken. Do you seach the body or leave? (search/ leave)"); 
					answer3 = console.readLine();//need to figure out how to get back to normal part of program
			}
		}//search room or leave
		

	}

	
console.println("Would you like to play again?");
answer99 = console.readLine();}while (answer99.equals("yes"));}}
