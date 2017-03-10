package boatengChapman;
import hsa_new.Console;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.imageio.ImageIO;

/*
 * @author Abigail Boateng and Roger Chapman
 * Adventure game The Coma
 * February 27 2017 
 */

public class TheComa {
	static Console console = new Console();
	//check if user enters appropriate response
	public static String checkAnswer(String ans1, String ans2){
		String input = console.readLine();
		//compares two values
		while (!input.equals(ans1)&& !input.equals(ans2)){
			console.println("Try again");
			input = console.readLine();
		}
		return input;
	}
	//check if user enters appropriate response
	public static String checkAnswer(String ans1, String ans2, String ans3){
		String input = console.readLine();
		//compares three values
		while (!input.equals(ans1)&& !input.equals(ans2) && !input.equals(ans3)){
			console.println("Try again");
			input = console.readLine();
		}
		return input;
	}


	public static void main(String[] args) {

		console.setTextColor(Color.white);
		console.setTextBackgroundColor(Color.black);
		console.clear();
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
		BufferedImage[] pictures = new BufferedImage [17];
		Clip[] sounds = new Clip[5];
		do{//playing again
			double number1 = Math.random();//generates a number for the chances of getting electrocuted or turning on the power in the generator room
			double number2 = Math.random();//chances of convincing your wife of letting you leave without getting her upset
			double number3 = Math.random();//chances of talking to the police v.s the line being busy
			try {
				pictures[0] = ImageIO.read(new File("resource/yourRoom.jpg"));
				pictures[1] = ImageIO.read(new File("resource/veronicaFile.jpg"));
				pictures[2] = ImageIO.read(new File("resource/deadBody.jpg"));
				pictures[3] = ImageIO.read(new File("resource/key1.jpg"));
				pictures[4] = ImageIO.read(new File("resource/generatorRoom.jpg"));
				pictures[5] = ImageIO.read(new File("resource/veronica.jpg"));
				pictures[6] = ImageIO.read(new File("resource/escaping.jpg"));
				pictures[7] = ImageIO.read(new File("resource/lockedDoors.jpg"));
				pictures[8] = ImageIO.read(new File("resource/couple.jpg"));
				pictures[9] = ImageIO.read(new File("resource/deathScreen.jpg"));
				pictures[10] = ImageIO.read(new File("resource/electrocution.jpg"));
				pictures[11] = ImageIO.read(new File("resource/veronicaHidden.jpg"));
				pictures[12] = ImageIO.read(new File("resource/hallway.jpg"));
				pictures[13] = ImageIO.read(new File("resource/phone.jpg"));
				pictures[14] = ImageIO.read(new File("resource/police.jpg"));
				pictures[15] = ImageIO.read(new File("resource/bloodyAxe.jpg"));
				pictures[16] = ImageIO.read(new File("resource/fallingCeiling.jpg"));

			} catch (IOException e) {
				System.err.println("There was an error loading the image.");
				e.printStackTrace();
			}
			try{
				sounds[0] = AudioSystem.getClip();
				sounds[0].open(AudioSystem.getAudioInputStream(new File("resource/policeSiren.wav")));
				sounds[1] = AudioSystem.getClip();
				sounds[1].open(AudioSystem.getAudioInputStream(new File("resource/electrocutionSound.wav")));
				sounds[2] = AudioSystem.getClip();
				sounds[2].open(AudioSystem.getAudioInputStream(new File("resource/neutralEnding.wav")));
				sounds[3] = AudioSystem.getClip();
				sounds[3].open(AudioSystem.getAudioInputStream(new File("resource/victoryMusic.wav")));
				sounds[4] = AudioSystem.getClip();
				sounds[4].open(AudioSystem.getAudioInputStream(new File("resource/deathMusic.wav")));
			}
			catch (Exception e) {
				e.printStackTrace();
			}

			console.drawImage (pictures[0], 100, 100, 500, 400, null);
			console.println("Some time ago, you were involved in a terrible car accident on Valentine's Day \nwith your loving wife of 15 years, Veronica. You are just waking up from the \nresulting coma in a hospital that seems to be abandoned. Would you like to \nsearch your room or leave? (search room/leave)");
			searchRoomLeaveRm = checkAnswer("search room", "leave");
			if (searchRoomLeaveRm.equals("search room")){//You choose to search your room
				console.clear();
				console.drawImage (pictures[1], 100, 100, 500, 400, null);
				console.println("After searching your room, you stumble upon Veronica's file which states the \nroom she was held in and she had become mentally unstable after waking up from \nher coma. Do you choose to go to her room or leave the hospital? (go to room/ \nleave)");
				veronicaRoomLeaveHospital = checkAnswer("go to room", "leave");


				while(veronicaRoomLeaveHospital.equals("leave")){//As long as you try to leave the hospital instead of going to Veronica's room, this loops
					console.clear();
					console.drawImage (pictures[7], 100, 100, 500, 400, null);
					console.println("You go to the doors of the hospital but they are locked so you decide to return to your room. Do you try to leave again or go to Veronica's room? (go to room/ \nleave)");
					veronicaRoomLeaveHospital = checkAnswer("go to room","leave");
				}

				if (veronicaRoomLeaveHospital.equals("go to room")){//Going to Veronica's room
					console.clear();
					console.drawImage (pictures[2], 100, 100, 500, 400, null);
					console.println("When you get to Veronica's room, you find a decaying body and also notice that \nthe case on the wall that contained a fire axe has been broken. Do you search \nthe body or leave? (search/ leave)"); 
					searchBodyLeaveHospital = checkAnswer("search","leave");
					while(searchBodyLeaveHospital.equals("leave")){//loops the player back to Veronica's room until they choose to go to search the body so they must search the room in order to move on.
						console.clear();
						console.drawImage (pictures[7], 100, 100, 500, 400, null);
						console.println("You go to the doors of the hospital but they are locked so you decide to return to Veronica's room. Do you try to leave again or search the body? (search/leave)");
						searchBodyLeaveHospital = checkAnswer("search","leave");
					}

					if (searchBodyLeaveHospital.equals("search")){//You search the body in Veronica's room
						console.clear();
						console.drawImage (pictures[3], 100, 100, 500, 400, null);
						console.println("You hold your breath as you search the corpse and find a key. Do you go to that room or stay put. (go to room/stay)");
						generatorRoomNothing = checkAnswer("go to room","stay");
						if (generatorRoomNothing.equals("go to room")){//Go to generator room
							console.clear();
							console.drawImage (pictures[4], 100, 100, 500, 400, null);
							console.println("You find the generator room and flip the switch.");
							if(number1 > 0.2){//80% chance to turn the power in the hospital on
								console.clear();
								console.println("The power in the whole hospital turns on and you head towards the exits where \nyou come face to face with Veronica. Do you ask why she's here, leave or ask \nwhat happened? (why are you here/leave/ask what happened)"); //Three options need if else if else
								console.drawImage (pictures[5], 100, 100, 500, 400, null);
								whyHereLeaveHospitalAskWhat = checkAnswer("ask what happened","leave", "why are you here");
								if(whyHereLeaveHospitalAskWhat.equals("why are you here")){//Ask why Veronica is here
									console.clear();
									console.drawImage (pictures[5], 100, 100, 500, 400, null);
									console.println("I've been coming back every day to see if you had awoken. Do you ask why or just leave? (ask why/leave)");
									askWhyLeaveWith = checkAnswer("ask why","leave");
									if (askWhyLeaveWith.equals("ask why")){//Ask why she's been coming back to see you
										console.clear();
										console.drawImage (pictures[5], 100, 100, 500, 400, null);
										console.println("She tells you she killed everyone here to make sure that she could see you everyday. Do you accept this and try to leave with her or leave by yourself? (accept/leave)");
										acceptLeaveWithout = checkAnswer("accept","leave");
										while (number2 >=0.5 && acceptLeaveWithout.equals("leave")){//50% chance that Veronica denies your request to leave by yourself each time that you ask
											console.clear();
											console.drawImage (pictures[5], 100, 100, 500, 400, null);
											console.println("She denies your request and refuses to let you go. Do you accept this and try to leave with her or leave by yourself? (accept/ leave)");
											acceptLeaveWithout = checkAnswer("accept","leave");
											number2 = Math.random();
										}
										if(acceptLeaveWithout.equals("accept")){//You decide to leave with Veronica
											console.clear();
											console.drawImage (pictures[8], 100, 100, 500, 400, null);
											console.println("You leave with her and live with a psychopath for the rest of your life");
											sounds[2].loop(Clip.LOOP_CONTINUOUSLY);


										}
										else{//Veronica gets mad at your request and kills you, the other half of the 50% chance
											console.clear();
											console.drawImage (pictures[9], 100, 100, 500, 400, null);
											console.println("You try and convince her to let you leave by yourself.");
											console.println("She becomes angered by your attempt and swings her axe at you. YOU ARE DEAD");
											sounds[4].loop(Clip.LOOP_CONTINUOUSLY);
										}
									}

								}
								else if(whyHereLeaveHospitalAskWhat.equals("leave")){//You leave with Veronica
									console.clear();
									console.drawImage (pictures[8], 100, 100, 500, 400, null);
									console.println("You leave with Veronica without ever finding out what happened here.");
									sounds[2].loop(Clip.LOOP_CONTINUOUSLY);
								}
								else{//You ask what happened in the hospital
									console.clear();
									console.drawImage (pictures[5], 100, 100, 500, 400, null);
									console.println("She tells you she killed everyone here to make sure that she could see you every day. You notice that she is holding an axe. Do you try to disarm her or just \ntry to slip by and escape? (disarm/leave)");//must continue
									disarmEscape = checkAnswer("disarm","leave");
									if (disarmEscape.equals("disarm")){//You try to disarm her
										console.clear();
										console.drawImage (pictures[6], 100, 100, 500, 400, null);
										console.println("You reach for the axe and successfully disarm her and escape. Although you get \nout without a scratch, you live the rest of your life alone. THE END");
										sounds[3].loop(Clip.LOOP_CONTINUOUSLY);
									}
									else{//You try to escape
										console.clear();
										console.drawImage (pictures[9], 100, 100, 500, 400, null);
										console.println("While trying to slip by, Veronica swings the axe at you and hits you in the back. YOU ARE DEAD");
										sounds[4].loop(Clip.LOOP_CONTINUOUSLY);
									}

								}
							}
							else{//You lose the 80% chance of not getting electrocuted by turning on the generator
								console.clear();
								console.drawImage (pictures[10], 100, 100, 500, 400, null);
								console.println("You get electrocuted. YOU ARE DEAD!");
								sounds[1].loop(Clip.LOOP_CONTINUOUSLY);
							}
						}
						else{//You choose to do nothing instead of going to the generator room
							console.clear();
							console.drawImage (pictures[11], 100, 100, 500, 400, null);
							console.println("You're not sure what to do so you just look at the pictures hanging on the walls. After a while you feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
							sounds[4].loop(Clip.LOOP_CONTINUOUSLY);
						}

					}

				}
			}//search room or leave
			else{//You decide to leave your room instead of searching it
				console.clear();

				console.println("You leave your room and enter a hallway. Do you go left or right? (left/ right)");
				console.drawImage (pictures[12], 100, 100, 500, 400, null);
				leftRight = checkAnswer("left","right");
				if (leftRight.equals("left")){//You go left in the hallway
					console.clear();
					console.drawImage (pictures[16], 100, 100, 500, 400, null);
					console.println("The ceiling falls in and you die. YOU ARE DEAD");
					sounds[4].loop(Clip.LOOP_CONTINUOUSLY);//loops until user decides whether to play again or end the program

				}
				else{//You go right in the hallway
					console.clear();
					console.drawImage (pictures[13], 100, 100, 500, 400, null);
					console.println("You find a telephone. Do you try and call the police or call your house and try to reach your wife? (police/ home)");
					policeHome = checkAnswer("police","home");
					while (number3 <= 0.4 && policeHome.equals("police")){//As long as you try to call the police and you win the 40% chance of the line being busy
						console.clear();
						console.drawImage (pictures[13], 100, 100, 500, 400, null);
						console.println("The line seems to be busy. Do you call home or try and call the police again? \n(home/ police)");
						policeHome = checkAnswer("home","police");
						number3 = Math.random();
					}
					if (policeHome.equals("home")){//If you call home instead of the police
						console.clear();
						console.drawImage (pictures[11], 100, 100, 500, 400, null);
						console.println("The phone rings and you wait for your wife to answer. After a while no one picks up and you feel a dark presence approaching but as you turn around you see an \naxe about to swing down on you. YOU ARE DEAD!");
						sounds[4].loop(Clip.LOOP_CONTINUOUSLY);
					}
					else{//You call the police
						console.clear();
						console.drawImage (pictures[13], 100, 100, 500, 400, null);
						console.println("You call the police.");
						if (number3  > 0.4){//You win the 60% chance to talk to the police
							console.clear();
							console.drawImage (pictures[13], 100, 100, 500, 400, null);
							console.println("You talk to the police and they tell you that they're on the way. Do you wait \nnear the phone or decide to walk around? (wait/ walk)");
							waitWalk = checkAnswer("wait","walk");
							if (waitWalk.equals("walk")){//You walk around after calling the police
								console.clear();
								console.drawImage (pictures[15], 100, 100, 500, 400, null);
								console.println("You find an axe in a pool of blood. Do you pick it up or leave it? (pick up/ \nleave it)");
								pickUpStand = checkAnswer("pick up","leave it");
								if (pickUpStand.equals("pick up")){//You pick up the axe that you find
									console.clear();
									console.drawImage (pictures[14], 100, 100, 500, 400, null);
									console.println("You pick up the axe and stand there admiring it until you see a figure \napproaching you. It is Veronica and she tells you that she killed everyone in \nthe hospital. You're horrified as she walks closer to you with a switch blade, \nso you swing the axe and kill her. Not long after, the police arrive and see \nwhat you've done and arrest you. THE END.");

								}
								else{//You decide to walk around but do not pick up the axe
									console.clear();
									console.drawImage (pictures[14], 100, 100, 500, 400, null);
									console.println("The police arrive after a few minutes and take you home. THE END");
									sounds[0].loop(Clip.LOOP_CONTINUOUSLY);
								}

							}
							else{//You wait after calling the police instead of walking around
								console.clear();
								console.println("You wait around then feel a dark presence approaching but as you turn around you see an axe about to swing down on you. YOU ARE DEAD!");
								console.drawImage (pictures[16], 100, 100, 500, 400, null);
								sounds[4].loop(Clip.LOOP_CONTINUOUSLY);
							}
						}
					}
				}
			}


			console.println("Would you like to play again? (yes/no)");
			playAgain = checkAnswer("yes","no");
			console.clear();
			//stops all sounds
			sounds[0].stop();
			sounds[1].stop();
			sounds[2].stop();
			sounds[3].stop();
			sounds[4].stop();
			}while (playAgain.equals("yes"));
		}
	}
