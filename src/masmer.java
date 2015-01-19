import java.util.Scanner;

import javax.swing.SingleSelectionModel;
public class masmer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int numOfNails, box, pack,  block, outbox , outpack, outblock;
		System.out.print("please enter number to num of nails: ");
		numOfNails = sc.nextInt();
		box = numOfNails / 12;
		outbox = numOfNails % 12;
		pack  = box / 120;
		outpack = box % 120;
		block = pack /10;
		outblock = pack %10;
		System.out.println("number of boxes is " + box);
		System.out.println("number of packeges is " + pack);
		System.out.println("number of blocks is " + block);
		System.out.println("number of nails out boxes is " + outbox);
		System.out.println("number of box out pack is " + outpack);
		System.out.println("number of packeges out block is " + outblock);
		
		
	}

}
