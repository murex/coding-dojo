import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbFloors = in.nextInt(); // number of floors
        int width = in.nextInt(); // width of the area
        int nbRounds = in.nextInt(); // maximum number of rounds
        int exitFloor = in.nextInt(); // floor on which the exit is found
        int exitPos = in.nextInt(); // position of the exit on its floor
        int nbTotalClones = in.nextInt(); // number of generated clones
        int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
        int nbElevators = in.nextInt(); // number of elevators
        HashMap<Integer,Integer> elevators = new HashMap<Integer,Integer>();
        for (int i = 0; i < nbElevators; i++) {
            int elevatorFloor = in.nextInt(); // floor on which this elevator is found
            int elevatorPos = in.nextInt(); // position of the elevator on its floor
            elevators.put(elevatorFloor,elevatorPos);
        }

        // game loop
        while (true) {
            int cloneFloor = in.nextInt(); // floor of the leading clone
            int clonePos = in.nextInt(); // position of the leading clone on its floor
            String direction = in.next(); // direction of the leading clone: LEFT or RIGHT

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
        if(elevators.size()==0){
        if(direction.equals("RIGHT"))
            System.out.println("BLOCK");
        else
            System.out.println("WAIT");
        }else{
           Integer positionToGo = elevators.get(cloneFloor);
           if(positionToGo==null)positionToGo = exitPos;
           
            if(clonePos < positionToGo){
                if(direction.equals("LEFT"))
                    System.out.println("BLOCK");
                else
                    System.out.println("WAIT");
            }
            else if(clonePos > positionToGo){
                if(direction.equals("LEFT"))
                    System.out.println("WAIT");
                else
                    System.out.println("BLOCK");
                }
                else System.out.println("WAIT");
        }
        
        
    }
}
}