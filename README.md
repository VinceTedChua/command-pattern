# Command Pattern Definition

Command Pattern is the proccess of decoupling (separating the relationship entities to another). Command Pattern has multiple functionalities that enables you to command, invoke (call the command), and execute the desired command.

# Smart Home Automation Problem

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

1. You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
2. Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
3. New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
4. Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.

   
Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.


# UML Diagram
Within this diagram encapsulates the visualization area of my Command-Pattern Sequence. Starting From Client and all the way to it's end.




# Exeuction Phase of the Smart Automatation System
In this phase encapsulates the testing phase, in which the program is ensured to run as itended to be. The Smart Automative system ensures the choices are accomplished and meeting it's -ends.

<img width="633" alt="OUTPUT_1_CHUA_COMM_PATTERN" src="https://github.com/VinceTedChua/command-pattern/assets/142372312/20a0e65c-a6d0-47ea-be2c-957bc01e1712">

<img width="429" alt="OUTPUT_2_CHUA_COMM_PATTERN" src="https://github.com/VinceTedChua/command-pattern/assets/142372312/98c495a2-c62c-4fa0-a76b-3cc3d2b43dc8">


