/* This is a stub for the House class */
import java.util.ArrayList;

/**
 * House is a subclass of Building that represents a student house.
 * It tracks residents and whether it has a dining room.
 */
public class House extends Building implements HouseRequirements {

    private ArrayList<Student> residents;
    private boolean hasDiningRoom;

    /**
     * Creates a House with the given details.
     * @param name Name of the house
     * @param address Address of the house
     * @param nFloors Number of floors
     * @param hasDiningRoom true if the house has a dining room
     */
    public House(String name, String address, int nFloors, boolean hasDiningRoom) {
        super(name, address, nFloors);
        this.hasDiningRoom = hasDiningRoom;
        this.residents = new ArrayList<Student>();
        System.out.println("You have built a house: 🏠");
    }

    /**
     * Returns true if the house has a dining room.
     */
    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }

    /**
     * Returns the number of residents currently in the house.
     */
    public int nResidents() {
        return this.residents.size();
    }

    /**
     * Adds a student to the house.
     * @param s the Student to move in
     */
    public void moveIn(Student s) {
        this.residents.add(s);
    }

    /**
     * Removes a student from the house.
     * @param s the Student to move out
     * @return the Student who moved out
     */
    public Student moveOut(Student s) {
        if (this.residents.remove(s)) {
            return s;
        }
        return null; // if student was not found
    }

    /**
     * Checks if a student lives in the house.
     * @param s the Student to check
     * @return true if the student is a resident
     */
    public boolean isResident(Student s) {
        return this.residents.contains(s);
    }

    /**
     * Main method to test creating a House.
     */
    public static void main(String[] args) {
        House tester = new House("King House", "10 Elm Street", 3, true);
        System.out.println(tester);
    }
}