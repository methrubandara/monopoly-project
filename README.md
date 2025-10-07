# 🏠 Monopoly (Java)

A complete Java implementation of **Monopoly**, featuring an object-oriented board system, a playable GUI using Swing and AWT, and customizable rules.
This project models every Monopoly component — properties, taxes, utilities, railroads, and players — through a clear class hierarchy and simple graphics rendering.

---

## 🎯 Features

* **Fully object-oriented design**
  Classes represent individual spaces (`Go`, `GoToJail`, `IncomeTax`, `Utility`, etc.) and player state (`Player`, `Property`, `NormalProperty`).

* **Graphical interface**
  Uses `DrawingPanel` (from *Building Java Programs*) and Swing’s `JFrame` for a 600×600 Monopoly board display.

* **Game logic**

  * Rent calculations for utilities and railroads
  * Taxes and GO bonuses
  * Jail logic (`GoToJail` / `inJail` flag)
  * Player balance, position, and bankruptcy tracking

* **Custom board builder**
  `Monopoly.java` dynamically constructs a 40-space board with exact coordinates for each tile.

---

## 🧩 Class Overview

| Category             | Classes                                                                | Description                                                 |
| -------------------- | ---------------------------------------------------------------------- | ----------------------------------------------------------- |
| **Core Spaces**      | `Space`, `Property`, `NormalProperty`, `Railroad`, `Utility`           | Defines the structure, ownership, and rent of board spaces  |
| **Special Spaces**   | `Go`, `GoToJail`, `IncomeTax`, `LuxuryTax`, `Chance`, `CommunityChest` | Implements Monopoly’s unique effects                        |
| **Game Engine**      | `Monopoly`, `Board`, `Player`                                          | Builds and runs the main game; manages players and graphics |
| **Graphics Utility** | `DrawingPanel`                                                         | Simplified AWT panel for persistent drawing operations      |

---

## 🖥️ Running the Game

### Prerequisites

* Java 8 or later (Java 17+ recommended)
* No external dependencies

### Compile

```bash
javac *.java
```

### Run the GUI Version

```bash
java Board
```

### Run the Logic / Console Version

```bash
java Monopoly
```

---

## 🧠 Project Structure

```
.
├── Action.java
├── Board.java
├── Chance.java
├── CommunityChest.java
├── DrawingPanel.java
├── Go.java
├── GoToJail.java
├── IncomeTax.java
├── LuxuryTax.java
├── MethodTester.java
├── Monopoly.java
├── NormalProperty.java
├── Player.java
├── Property.java
├── Railroad.java
├── Space.java
└── Utility.java
```

---

## 🧱 Future Enhancements

* Add dice animations and turn-based logic
* Implement full card decks for Chance/Community Chest
* Introduce property upgrades (houses/hotels)
* Save/load game state (JSON or file serialization)
* Multiplayer networking or online mode

---

## 🪪 License

MIT License — free to use, modify, and share.
You can add your name to `@author`.

---
