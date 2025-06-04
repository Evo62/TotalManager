# TotalManager

TotalManager is a Java-based football team management system developed as part of a university programming project.  
It simulates the creation and organization of football teams using modern object-oriented programming principles and core Java features.

---

## Features

- Define and manage football players with different attributes
- Position-specific player types: `OutfieldPlayer` and `Goalkeeper`
- Player data includes attributes like age, stamina, sprint speed, and clean sheets
- Custom exceptions to handle duplicate players, underage players, and squad size limits
- Enum implementation for structured player positions
- Modular and maintainable class hierarchy
- Designed and tested in IntelliJ IDEA

---

## Project Structure
src/
└── TotalManager/
├── Main.java // Entry point of the application
├── Player.java // Abstract base class
├── OutfieldPlayer.java // Subclass for field players
├── Goalkeeper.java // Subclass for goalkeepers
├── Position.java // Enum for player positions
├── Team.java // Class representing a team
├── DuplicatePlayerException.java // Thrown when a player is already in the squad
├── PlayerTooYoungException.java // Thrown when a player is underage
└── SquadLimitReachedException.java // Thrown when squad size is exceeded

---

## Sample Output

Goalkeeper{cleanSheets=12, reflexRaiting=87}
OutfieldPlayer{goalScored=10, stamina=88, sprintSpeed=89}

---

## Technologies Used

- Java 17+
- IntelliJ IDEA
- No external libraries or frameworks

---

## How to Run

1. Clone the repository or download the ZIP
2. Open the project in IntelliJ IDEA
3. Navigate to `Main.java` and run the file

---

## License

This project is currently unlicensed. It may be used for educational and learning purposes.
