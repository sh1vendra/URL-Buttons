# **Project Showcase: URL Button and Drawing Plotter**

**Description**:
This project demonstrates an interactive Java application that combines **UI components** and **plotting functionality**. It includes buttons that open URLs in the default browser and buttons that display graphical plots, such as **cosine** and **sine** curves.

---

### **Features**:
- **URL Buttons**: Custom buttons that open URLs in the default browser when clicked.
- **Drawing Buttons**: Buttons that display graphical plots of mathematical functions.
  - **Cosine Curve**: Plots a cosine wave in a dynamically updating plotter window.
  - **Sine Curve**: Plots a sine wave in a dynamically updating plotter window.
- **Error Handling**: Displays error dialogs if a URL is invalid or if the desktop is not supported on the system.
- **GUI**: Built using Java Swing to demonstrate button interactions, user input, and plotting.

---

### **Technologies Used**:
- **Java**: Core language used for implementing the logic.
- **Swing**: For building the graphical user interface (GUI), including buttons and plotter windows.
- **Timer**: Used to animate the plotting of sine and cosine curves.
- **`JOptionPane`**: For showing error dialogs when issues occur (e.g., invalid URL or unsupported platform).

---

### **How to Use**:
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/your-repo-name.git
    ```

2. Compile and run the project:
    - Navigate to the project directory.
    - Compile the Java files using:
      ```bash
      javac -d bin src/buttoninheritance/ButtonDemo.java
      ```
    - Run the application:
      ```bash
      java -cp bin buttoninheritance.ButtonDemo
      ```

3. The application will launch, and you will see buttons on the UI:
   - **URL Buttons**: Click them to open the corresponding URLs in the default web browser.
   - **Plotting Buttons**: Click on "Cosine Plotter" or "Sine Plotter" to see the respective graph.
   
