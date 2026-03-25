import java.util.Scanner;
	import java.util.Random;
public class Chatbot {
	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        String[] replies = {
	            "Hello! How can I help you?",
	            "That's interesting!",
	            "Tell me more...",
	            "I don't understand, but I'm learning!",
	            "Nice to hear that!",
	            "Can you explain again?",
	            "Wow! 😮",
	            "Okay 👍"
	        };

	        System.out.println("🤖 ChatBot Started (type 'exit' to stop)");

	        while (true) {
	            System.out.print("You: ");
	            String userInput = sc.nextLine();

	            if (userInput.equalsIgnoreCase("exit")) {
	                System.out.println("Bot: Goodbye! 👋");
	                if(userInput.equals("who is AIDS hod")) {
	                	System.out.println("prasad reddy");
	                }
	                break;
	            }

	            int index = rand.nextInt(replies.length);
	            String botReply = replies[index];

	            System.out.println("Bot: " + botReply);
	        }

	        sc.close();
	    }
	}
