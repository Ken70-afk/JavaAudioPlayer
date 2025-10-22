# Java CLI Audio Player

A simple **command-line audio player** built in Java using the `javax.sound.sampled` API.  
It allows you to play, stop, restart, and quit playback for `.wav` audio files directly from the terminal.

---

##  Features
- Play `.wav` audio files from your local directory  
- Stop / restart playback  
- Loop-ready architecture (easy to expand later)  
- Simple text-based menu with commands:  
  - `P` → Play  
  - `S` → Stop  
  - `R` → Restart  
  - `Q` → Quit  

---

##  Technologies Used
- **Java 17+**
- **javax.sound.sampled** (`Clip`, `AudioInputStream`)
- **Scanner** for user input

---
