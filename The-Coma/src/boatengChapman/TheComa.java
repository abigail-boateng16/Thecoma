package boatengChapman;
import hsa_new.Console;

public class TheComa {

	public static void main(String[] args) {
		Console console = new Console();
		String searchRoomLeaveRm;//searching the hospital room or  leaving
		String veronicaRoomLeaveHospital;//going to Veronica's room or trying to leave the hospital
		String searchBodyLeaveHospital;//searching the body in Veronica's room or leave the hospital
		String generatorRoomNothing;//going to the generator room or doing nothing
		String whyHereLeaveHospitalAskWhat;//asking why she's here, trying to leave the hospital or asking what happened
		String askWhyLeaveWith;//ask her why she's been coming back to see you or leave with her
		String acceptLeaveWithout;//accepting that she killed everyone or trying to leave without her
		String disarmEscape;//trying to disarm her or trying to escape
		String playAgain;//playing again or not
		String leftRight;//going left or right in the hallway
		String policeHome;//calling the police or calling home
		String waitWalk;//waiting for the police or walking around
		String pickUpStand;//picking up the axe or just standing near it
		do{//playing again
			double number1 = Math.random();//generates a number for the chances of getting electrocuted or turning on the power in the generator room
			double number2 = Math.random();//chances of convincing your wife of letting you leave without getting her upset
			double number3 = Math.random();//chances of talking to the police v.s the line being busy
			console.println("Some time ago, you were involved in a terrible car accident on Valentine's Day with your loving wife of 15 years, Veronica. You are just waking up from the resulting coma in a hospital that seems to be abandoned. Would you like to search your room or leave? (search room/leave)");
			searchRoomLeaveRm = console.readLine();
			if (searchRoomLeaveRm.equals("search room")){//You choose to search your room
				console.println("After searching your room, you stumble upon Veronica's file which states the room she was held in and she had become mentally unstable after waking up from her coma. Do you choose to go to her room or leave the hospital? (go to room/ leave)");
				veronicaRoomLeaveHospital = console.readLine();


				while(veronicaRoomLeaveHospital.equals("leave")){//As long as you try to leave the hospital instead of going to Veronica's room, this loops
					console.println("You go to the doors of the hospital but they are locked so you decide to return to your room. Do you try to leave again or go to Veronica's room? (go to room/leave)");
					veronicaRoomLeaveHospital = console.readLine();
				}

				if (veronicaRoomLeaveHospital.equals("go to room")){//Going to Veronica's room

					console.println("When you get to Veronica's room, you find a decaying body and also notice that the case on the wall that contained a fire axe has been broken. Do you seach the body or leave? (search/ leave)"); 
					searchBodyLeaveHospital = console.readLine();
					while(searchBodyLeaveHospital.equals("leave")){//loops the player back to Veronica's room until they choose to go to search the body so they must search the room in order to move on.
						console.println("You go to the doors of the hospital but they are locked so you decide to return to Veronica's room. Do you try to leave again or search the body? (search/leave)");
						searchBodyLeaveHospital = console.readLine();
					}
				
					if (searchBodyLeaveHospital.equals("search")){//You search the body in Veronica's room
						
						console.println("You hold your breath as you search the corpse and find a key. Do you go to that room or stay put. (go to room/stay)");
						generatorRoomNothing = console.readLine();
						if (generatorRoomNothing.equals("go to room")){//Go to generator room
							console.println("You find the generator room and flip the switch.");
							if(number1 > 0.2){//80% chance to turn the power in the hospital on
								console.println("The power in the whole hospital turns on and you head towards the exits where you come face to face with Veronica. Do you ask why she's here, leave or ask what happened? (why are you here/leave/ask what happened)"); //Three options need if else if else
								whyHereLeaveHospitalAskWhat = console.readLine();
								if(whyHereLeaveHospitalAskWhat.equals("why are you here")){//Ask why Veronica is here
									console.println("I've been coming back every day to see if you had awoken. Do you ask why or just leave? (ask why/leave)");
									askWhyLeaveWith = console.readLine();
									if (askWhyLeaveWith.equals("ask why")){//Ask why she's been coming back to see you
										console.println("I killed everyone here to make sure that I could see you everyday. Do you accept this and try to leave with her or leave by yourself? (accept/leave)");
										acceptLeaveWithout = console.readLine();
										while (number2 >=0.5 && acceptLeaveWithout.equals("leave")){//50% chance that Veronica denies your request to leave by yourself each time that you ask
											console.println("She denies your request and refuses to let you go. Do you accept this and try to leave with her or leave by yourself? (accept/ leave)");
											acceptLeaveWithout = console.readLine();
											number2 = Math.random();
										}
										if(acceptLeaveWithout.equals("accept")){//You decide to leave with Veronica
											console.println("You leave with her and live with a psychopath for the rest of your life");
											
										}
										else{//Veronica gets mad at your request and kills you, the other half of the 50% chance
											console.println("You try and convince her to let you leave by yourself.");
											console.println("She becomes angered by your attempt and swings her axe at you. YOU ARE DEAD");
										}
									}

								}
								else if(whyHereLeaveHospitalAskWhat.equals("leave")){//You leave with Veronica
									console.println("You leave with Veronica without ever finding out what happened here.");
								}
								else{//You ask what happened in the hospital
									console.println("I killed everyone here to make sure that I could see you every day. You notice that she is holding an axe. Do you try to disarm her or just try to slip by and escape? (disarm/leave)");//must continue
									disarmEscape = console.readLine();
									if (disarmEscape.equals("disarm")){//You try to disarm her
										console.println("You reach for the axe and successfully disarm her and escape. Although you get out without a scratch, you live the rest of your life alone. THE END");
									}
									else{//You try to escape
										console.println("While trying to slip by, Veronica swings the axe at you and hits you in the back. YOU ARE DEAD");
									}

								}
							}
							else{//You lose the 80% chance of not getting electrocuted by turning on the generator
								console.println("You get electrocuted. YOU ARE DEAD!");
							}
						}
						else{//You choose to do nothing instead of going to the generator room
							console.println("You're not sure what to do so you just look at the pictures hanging on the walls. After a while you feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
						}
					
					}
					
				}//go to room or leave
			}//search room or leave
			else{
				console.println("You leave your room and enter a hallway. Do you go left or right? (left/ right)");
				leftRight = console.readLine();
				if (leftRight.equals("left")){
					console.println("The ceiling falls in and you die. YOU ARE DEAD");

				}
				else{
					console.println("You find a telephone. Do you try and call the police or call your house and try to reach your wife? (police/ home)");
					policeHome = console.readLine();
					while (number3 <= 0.4 && policeHome.equals("police")){
						console.println("The line seems to be busy. Do you call home or try and call the police again? (home/ police)");
						policeHome = console.readLine();
						number3 = Math.random();
					}
					if (policeHome.equals("home")){
						console.println("The phone rings and you wait for your wife to answer. After a while no one picks up and you feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
					}
					else{
						console.println("You call the police.");
						if (number3  > 0.4){
							console.println("You talk to the police and they tell you that they're on the way. Do you wait near the phone or decide to walk around? (wait/ walk)");
							waitWalk = console.readLine();
							if (waitWalk.equals("walk")){
								console.println("You find an axe in a pool of blood. Do you pick it up or leave it? (pick up/ leave it)");
								pickUpStand = console.readLine();
								if (pickUpStand.equals("pick up")){
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
					}
				}
			}


			console.println("Would you like to play again? (yes/no)");
			playAgain = console.readLine();}while (playAgain.equals("yes"));}}
