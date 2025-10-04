[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/57HVEcop)

Example of an MVC design based on Swing. Answer questions 1 & 2 in this README file.

Question 1:
The swing framework is a built-in Java class that supports different types of GUI components. The purpose of using swing frameworking with MVC is to use its ready-made components such as buttons, text fields, panels, etc.... This can be used in the "View" in the MVC pattern look better and can interact with the "Model" and "controller"(by listening to events such as when a button is clicked). Since Swing is completely based on JAVA, the components will appear the same, no matter the operating system used.
![assignment2 part 1 Diagram](https://github.com/user-attachments/assets/751a71f0-bfa6-44b6-a537-037d17eec1c6)


Question 2 :
This code clearly uses the MVC pattern by using the "Controller", "View", and "Model" classes. The model class has the logic of the system, it has methods that store data(f/l names), and it has getters and setters. The view class in this case uses Swing elements such as buttons, text fields, and frames for the users to interact and have methods notify the controller to update the UI. Finally, the controller creates the initial view with the data store in the model class and uses the methods in the model to update the view based on user interactions. There are no direct interactions between the model and the view; all interactions are done through the controller class. The main difference between this code and the ones taught in class is that it relies entirely on the controller for synchronizing the model and view, while in conventional MVC, the view class will observe the changes and update accordingly.


