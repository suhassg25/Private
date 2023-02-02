package Bicycle;

import java.util.Scanner;

public class BicycleController {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		InventryDto z = new InventryDto();
		boolean tr = true;
		while (tr) {

			System.out.println("Enter \n1.Owner \n2.Buyer \n3.exit");
			boolean ret = true;
			switch (s.nextInt()) {
			case 1: {
				System.out.println("Enter \n1.View Inventry \n2.Add Items to Inventry \n3.exit");
				switch (s.nextInt()) {
				case 1: {
					System.out.println("Seats available are : " + z.getSeats());
					System.out.println("Frames available are : " + z.getFrames());
					System.out.println("Break Sets available are : " + z.getBrakeSets());
					System.out.println("Handle bars available are : " + z.getHandlebars());
					System.out.println("Wheels available are : " + z.getWheels());
					System.out.println("Tires available are : " + z.getTires());
					System.out.println("Chain available are : " + z.getChains());
					System.out.println("Crank set available are : " + z.getCrankSet());
					System.out.println("Pedals set available are : " + z.getPaddles());
					System.out.println("Brake Paddles set available are : " + z.getBrakePaddles());
					System.out.println("Brake Cables set available are : " + z.getBrakeCables());
					System.out.println("Levers set available are : " + z.getLevers());
					System.out.println("Brake Shoes set available are : " + z.getBrakeShoes());
				}
					break;
				case 2: {
					System.out.println("Add Seats : ");
					z.setSeats(z.getSeats() + s.nextInt());
					System.out.println("Add Frames : ");
					z.setFrames(s.nextInt() + z.getFrames());
					System.out.println("Add Break Sets : ");
					z.setBrakeSets(s.nextInt()*2 + z.getBrakeSets());
					System.out.println("Add Handle bars : ");
					z.setHandlebars(s.nextInt() + z.getHandlebars());
					System.out.println("Add Wheels   : ");
					z.setWheels(s.nextInt() + z.getWheels());
					System.out.println("Add Tires : ");
					z.setTires(s.nextInt() + z.getTires());
					System.out.println("Add Chain : ");
					z.setChains(s.nextInt() + z.getChains());
					System.out.println("Add Crank set  : ");
					z.setCrankSet(s.nextInt() + z.getCrankSet());
					System.out.println("Add Pedals set : ");
					z.setPaddles(s.nextInt() + z.getPaddles());
					System.out.println("Add Brake Paddles set : ");
					z.setBrakePaddles(s.nextInt() + z.getBrakePaddles());
					System.out.println("Add Brake Cables set : ");
					z.setBrakeCables(s.nextInt() + z.getBrakeCables());
					System.out.println("Add Levers set : ");
					z.setLevers(s.nextInt() + z.getLevers());
					System.out.println("Add Brake Shoes set : ");
					z.setBrakeShoes(s.nextInt() + z.getBrakeShoes());

				}
					break;
				case 3:
					tr = true;

				}

			}
				break;
			case 2: {
				System.out.println("Enter number of Cycles to be prepared");
				int count = s.nextInt();
				int seats = 0, frame = 0, brakesets = 0, handlebars = 0, wheels = 0, tires = 0, chains = 0, crankset = 0, paddle = 0, brakepaddle = 0, brakeCable = 0, lever = 0, brakeShoes = 0;
				while (count != 0) {
					seats++;
					frame++;
					brakesets++;
					handlebars++;
					wheels = wheels + 2;
					tires += 2;
					chains++;
					crankset++;
					paddle += 2;
					brakepaddle++;
					brakeCable++;
					lever++;
					brakeShoes += 2;
					count--;
				}
				if ((seats - z.getSeats()) > 0) {
					System.out.println((seats - z.getSeats()) + " seats to be purchased");
				}
				if ((frame - z.getFrames()) > 0) {
					System.out.println((frame - z.getFrames()) + " frames to be purchased");
				}
				if ((brakesets*2 - z.getBrakeSets()) > 0) {
					System.out.println((brakesets*2 - z.getBrakeSets()) + " brake Sets needed to be purchased");
				}
				if ((handlebars - z.getHandlebars()) > 0) {

					System.out.println((handlebars - z.getHandlebars()) + " handle bars are needed to be purchased");
				}
				if ((wheels - z.getWheels()) > 0) {
					System.out.println((wheels - z.getWheels()) + " wheels are needed to be purchased");
				}
				if ((tires - z.getTires()) > 0) {
					System.out.println((tires - z.getTires()) + " tires are needed to be purchased");
				}
				if ((chains - z.getChains()) > 0) {
					System.out.println((chains - z.getChains()) + " chains are needed to be purchased");
				}
				if ((crankset - z.getCrankSet()) > 0) {
					System.out.println((crankset - z.getCrankSet()) + " crank sets are needed to be purchased");
				}
				if ((paddle - z.getPaddles()) > 0) {
					System.out.println((paddle - z.getPaddles()) + " paddles sets are needed to be purchased");
				}
				if ((brakepaddle - z.getBrakePaddles()) > 0) {
					System.out.println((brakepaddle - z.getBrakePaddles()) + " brake paddles sets are needed to be purchased");
				}
				if ((brakeCable - z.getBrakeCables()) > 0) {
					System.out.println((brakeCable - z.getBrakeCables()) + " brake Cables sets are needed to be purchased");
				}
				if ((lever - z.getLevers()) > 0) {
					System.out.println((lever - z.getLevers()) + " levers sets are needed to be purchased");
				}
				if ((brakeShoes - z.getBrakeShoes()) > 0) {
					System.out.println((brakeShoes - z.getBrakeShoes()) + " brake Shoes sets are needed to be purchased");
				}
				if (seats - z.getSeats() < 0 && frame - z.getFrames() < 0 && brakesets - z.getBrakeSets() < 0
						&& handlebars - z.getHandlebars() < 0 && wheels - z.getWheels() < 0 && tires - z.getTires() < 0
						&& chains - z.getChains() < 0 && crankset - z.getCrankSet() < 0 && paddle - z.getPaddles() < 0
						&& brakepaddle - z.getBrakePaddles() < 0 && brakeCable - z.getBrakeCables() < 0 && lever - z.getLevers() < 0
						&& brakeShoes - z.getBrakeShoes() < 0) {
					System.out.println("Ordered Succefully");
				} else {
					System.out.println("So the purchase has been Canceled");
				}
			}
				break;
			case 3:
				tr = false;
				break;
			default:
				System.out.println("Enter valid input");

			}
		}
	}

}
