package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("oaipuhrpnwrhgra3upppppppppppa4");
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("How do you spell it?");
		// 3. If the user spelled the word correctly, speak "correct"
			if(answer.equals("oaipuhrpnwrhgra3upppppppppppa4"))
			{
				speak("correct");
			}
			else
			{
			speak("wrong");
			}
		// 4. Otherwise say "wrong"
			speak("KRGJPAOYAQRTHNO");
			String answer2 = JOptionPane.showInputDialog("How do you spell it?");
				if(answer2.equals("KRGJPAOYAQRTHNO"))
				{
					speak("correct");
				}
				else
				{
				speak("wrong");
				}
				speak("HAHAHEIR");
				String answer3 = JOptionPane.showInputDialog("How do you spell it?");
					if(answer3.equals("HAHAHEIR"))
					{
						speak("correct");
					}
					else
					{
					speak("wrong");
					}
					speak("HOMWSHDFIEWH");
					String answer4 = JOptionPane.showInputDialog("How do you spell it?");
						if(answer4.equals("HOMWSHDFIEWH"))
						{
							speak("correct");
						}
						else
						{
						speak("wrong");
						}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


