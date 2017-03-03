package boatengChapman;
import hsa_new.Console;

public class TheComa {

	public static void main(String[] args) {
		Console console = new Console();
		String answer1;//searching the hospital room or  leaving
		String answer2;//going to Veronica's room or trying to leave the hospital
		String answer3;//searching the body in Veronica's room or leave the hospital
		String answer4;//going to the generator room or doing nothing
		String answer5;//asking why she's here, trying to leave the hospital or asking what happened
		String answer6;//ask her why she's been coming back to see you or leaving with her
		String answer7;//accepting that she killed everyone or trying to leave without her
		String answer8;//trying to disarm her or trying to escape
		String answer99;//playing again or not
		String answer9;//going left or right in the hallway
		String answer10;//calling the police or calling home
		String answer11;//waiting for the police or walking around
		String answer12;//picking up the axe or just standing near it
		double number1 = Math.random();//Always giving the greater possibility
		double number2 = Math.random();
		double number3 = Math.random();
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
									else{
										console.println("You try and convince her to let you leave by yourself.");
										if (number2 <= 0.5){
											console.println("She becomes angered by your attempt and swings her axe at you. YOU ARE DEAD");
										}
										else{
											while (number2 >=0.5){
												console.println("She denies your request and refuses to let you go. Do you accept this and try to leave with her or leave by yourself? (accept/ leave)");
												answer7 = console.readLine();//if the put accept we need to go back to the if statement, if the put leave, go back to else
											}
										}
									}
								}
								
							}
							else if(answer5.equals("leave")){
								console.println("You leave with Veronica without ever finding out what happened here.");
							}
							else{
								console.println("I killed everyone here to make sure that I could see you every day. You notice that she is holding an axe. Do you try to disarm her or just try to slip by and escape? (disarm/leave");//must continue
								answer8 = console.readLine();
								 if (answer8.equals("disarm")){
									 console.println("You reach for the axe and successfully disarm her and escape. Although you get out without a scratch, you live the rest of your life alone. THE END");
								 }
								 else{
									 console.println("While trying to slip by, Veronica swings the axe at you and hits you in the back. YOU ARE DEAD");
								 }
								 
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
		else{
			console.println("You leave your room and enter a hallway. Do you go left or right? (left/ right)");
			answer9 = console.readLine();
			if (answer9.equals("left")){
				console.println("The ceiling falls in and you die. YOU ARE DEAD");
				
			}
			else{
				console.println("You find a telephone. Do you try and call the police or call your house and try to reach your wife? (police/ home)");
				answer10 = console.readLine();
				if (answer10.equals("home")){
					console.println("The phone rings and you wait for your wife to answer. After a while no one picks up and you feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
				}
				else{
					console.println("You call the police.");
					if (number3 >=0.6){
						console.println("You talk to the police and they tell you that they're on the way. Do you wait near the phone or decide to walk around? (wait/ walk)");
						answer11 = console.readLine();
						if (answer11.equals("walk")){
							console.println("You find an axe in a pool of blood. Do you pick it up or leave it? (pick up/ leave it)");
							answer12 = console.readLine();
							if (answer12.equals("pick up")){
								console.println("You pick up the axe and stand there admiring it until you see a figure approaching you. It is Veronica and she tells you that she killed everyone in the hospital. You're horrified as she walks closer to you with a switch blade, so you swing the axe and kill her. Not long after, the police arrive and see what you've done and arrest you. THE END.");
								
							}
							else{
								console.println("The police arrive after a few minutes and take you home. THE END");
							}
								
						}
						else{
							console.println("You wait around then feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
						}
					}
					else{
						console.println("The line seems to be busy. Do you call home or try and call the police again? (home/ police)");
						answer12 = console.readLine();
					}
				}
			}
		}
		

	
console.println("Would you like to play again?");
answer99 = console.readLine();}while (answer99.equals("yes"));}}
