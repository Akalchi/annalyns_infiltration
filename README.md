# Annalyn's Infiltration

This is a solution to the Annalyn's Infiltration challenge, where you implement the quest logic for Annalyn's attempt to rescue her friend from kidnappers. 

In this RPG-inspired problem, Annalyn must decide which actions she can take based on the states of the knight, archer, and prisoner. She can also bring her pet dog along, which adds more options to the logic.

## Problem Overview

Annalyn is faced with four key actions:

1. **Fast Attack**: She can perform a fast attack if the knight is asleep.
2. **Spy**: She can spy on the camp if at least one of the characters (knight, archer, prisoner) is awake.
3. **Signal Prisoner**: Annalyn can signal the prisoner if the prisoner is awake and the archer is asleep.
4. **Free Prisoner**: Annalyn can free the prisoner if the knight and archer are both asleep and the prisoner is awake, or if she has her pet dog and the archer is asleep.
