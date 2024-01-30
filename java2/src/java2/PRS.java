package java2;
import java.util.Scanner;
import java.util.Random;
public class PRS {
       public static void main(String[] args) {	   
		System.out.println("***********************************************");
		System.out.println("*            PAPER ROCK SCISSOR                ");
		System.out.println("***********************************************");
		int a=10;
		int H=0;
		int AI=0;
		int  no=0;
		while(a>0) {
			display();
			System.out.println("enter your choice:");
			Scanner s=new Scanner(System.in);
			String c=s.nextLine();
			Random r=new Random();
			if(no>5) {
				System.out.println("finAL SCORE:");
				System.out.println("Human:"+H+"|AI: "+AI);
				System.exit(0);
			}
			if(c.equals("R")) {
				int cmp=10+r.nextInt(3)+1;
				if(cmp==11) {
					System.out.println("You: Rock");
					System.out.println("AI: Rock");
					System.out.println("Result: Draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==12) {
					System.out.println("You: Rock");
					System.out.println("AI: Paper");
					System.out.println("Result: Lost");	
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==13) {
					System.out.println("You: Rock");
					System.out.println("AI: Scissor");
					System.out.println("Result: Win");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
			}
		
			if(c.equals("P")) {
				int cmp=20+r.nextInt(3)+1;
				if(cmp==21) {
					System.out.println("You: Paper");
					System.out.println("AI: Rock");
					System.out.println("Result: Win");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==22) {
					System.out.println("You: Paper");
					System.out.println("AI: Paper");
					System.out.println("Result: Draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==23) {
					System.out.println("You: Paper");
					System.out.println("AI: Scissor");
					System.out.println("Result: Loss");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
			}
			if(c.equals("S")) {
				int cmp=30+r.nextInt(3)+1;
				if(cmp==31) {
					System.out.println("You: Scissor");
					System.out.println("AI: Rock");
					System.out.println("Result: Loss");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==32) {
					System.out.println("You: Scissor");
					System.out.println("AI: Paper");
					System.out.println("Result: Win");	
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
				else if(cmp==33) {
					System.out.println("You: Scissor");
					System.out.println("AI: Scissor");
					System.out.println("Result: Draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println("Human:"+H+"|AI: "+AI);
				}
			}
		}
	}
       public static void display() {
    	   System.out.println("1. Rock: R");
    	   System.out.println("2. Paper: P");
    	   System.out.println("3. Scissor: S");
    	   System.out.println("----------------------------------------------");   
       }
}
