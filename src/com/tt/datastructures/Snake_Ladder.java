package com.tt.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Snake_Ladder {
	
	static class Users{
		int position;
		String Name;
		
		public Users(String userName){
			position = 0;
			Name = userName;
		}
		
	}
	
	static class PositionComparator implements Comparator<Users>{

		@Override
		public int compare(Users o1, Users o2) {
			// TODO Auto-generated method stub
			Users u1 = (Users)o1;			
			Users u2 = (Users)o2;
			if(u1.position>u2.position)
				return 1;
			else if(u1.position == u2.position)
				return 0;
			else
				return -1;
		}
	}
	
	static class SnakeLadder{
		int startPosition;
		int endPosition;
		boolean isSnake;

	public SnakeLadder(int startPosition, int endPosition, boolean snake) {
			super();
			this.startPosition = startPosition;
			this.endPosition = endPosition;
			if(snake)
				isSnake=true;
			else
				isSnake=false;
		}
	}
	
	public static int rollTheDice(){
		return (int) Math.ceil(Math.random() * 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int maxCount = 0;
		System.out.println("Input number of users");
		int userCount = sc.nextInt();sc.nextLine();
		List<Users> users = new ArrayList<>();
		for(int i=1; i<=userCount; i++){
			System.out.print("Enter name of User"+i);
			String userName = sc.nextLine();
			Users u = new Users(userName);
			users.add(u);
		}
		sc.close();
		//Enter Snakes and Ladders2
		
		Map<Integer, Integer> snlMap = new HashMap<>();
		snlMap.put(2, 38);
		snlMap.put(4, 14);
		snlMap.put(17, 7);
		snlMap.put(9, 31);
		snlMap.put(21, 42);
		snlMap.put(28, 84);
		snlMap.put(51, 67);
		snlMap.put(54, 34);
		snlMap.put(62, 19);
		snlMap.put(64, 60);
		snlMap.put(72, 91);
		snlMap.put(80, 99);
		snlMap.put(93, 73);
		snlMap.put(95, 66);
		snlMap.put(98, 79);
		
		//Round-robin dice rolling between each user till someone reaches 100
		System.out.println("Starting the Snakes and Ladder Game");
		int gameCounter =0;
		while(maxCount <= 100){
			for(int i=0; i<userCount; i++)
			{	
				int diceRoll=0, tempPos=0;
				String currUserName = users.get(i).Name;
				do{
					System.out.println(currUserName+": Rolling the dice");
					diceRoll = rollTheDice();
					System.out.println(currUserName+" Dice gave: "+diceRoll);
					tempPos = users.get(i).position+diceRoll;
					if(snlMap.containsKey(tempPos)){
						if(snlMap.get(tempPos)>tempPos)
		 					System.out.println(currUserName+": Got Ladder");
						else
							System.out.println(currUserName+": Got Snake");
						tempPos = snlMap.get(tempPos);
					}
					if(tempPos > 100){
						System.out.println(currUserName+" Wasted Roll as counter more than 100");
						continue;
					}
					else if(tempPos==100){
						System.out.println(currUserName+" Won!!");
						System.exit(0);
					}
					else{
						users.get(i).position = tempPos;
						System.out.println(currUserName+" New Position: "+tempPos);
					}
				}while(diceRoll==6);
			}
			maxCount = (Collections.max(users, new PositionComparator())).position;
			gameCounter++;
			System.out.println("/***************************************/");
			System.out.println("Post Round: "+gameCounter);
			System.out.println("Max Counter: "+maxCount);
			System.out.println("/***************************************/");
		}
	}

}
