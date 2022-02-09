# TDDCardGameStart
## Setup
* See if not done from the last lab [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup)
* Fork [MockingCardGameStart](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/mockingcardgamestart.git) see [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup)
* Make sure you have invited Derek Somerville and your tutor as Developer Members


## Overview
The lab will look at doubling using Mockito mock/spy. Please refer to week five lecture on Doubling and Mocking. This will mock calls to the file system, calls to external libraries and input from the console.

## Already Done
* Mocks have been completed for ConsoleInput, see ConsoleInputTest. 
* You have also been provided with mocking for CardGame.getNumberOfPlayers. 
* Please review these plus the lecture slides for Doubling and Mocking. 
* You have also had a worked example for mocking please see [https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/mockingrockpaperscissor](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/mockingrockpaperscissor)
* This starter project uses "packages", please see Java Programming 2 [https://moodle.gla.ac.uk/pluginfile.php/4810902/mod_folder/content/0/1-packages.pdf?forcedownload=1](https://moodle.gla.ac.uk/pluginfile.php/4810902/mod_folder/content/0/1-packages.pdf?forcedownload=1)

## Game.CardGame Tests
* Aim to mock or spy at the earliest point so mock Scanner rather than ConsoleInput to maximise the code tested.
* Create a test for getComputerPlayersNames, create a mock for LoadConfig, note there is CardGame.setLoadConfig.
  * Moderate - Test name getComputerPlayersNames you can get a list of at least three names. Use different names to the playersNames.cfg
* Create two tests for createComputerPlayers
  * Easy after previous - Test name createComputerPlayers for a list of three names and check the name of the third computer player is correct
  * Easy - Test name createComputerPlayersSize to see three players have been created
* Create a test for createHumanPlayer
  * Easy - Test name createHumanPlayer
* Create a test for initiatePlayers
  * Easy - Test name initiatePlayers
* Create a test for play
  * Moderate - Test name play, think about the play while condition

## Game.BlackJack
* Create a test for "play", so an end to end test 
  * Advanced - Test name is "play", check if the game has finished

## Submit
* Before you commit your final solution, double check it can build and all the test you completed can run.
* Go to the Week 6 section and open the assessment
* In text paste the https .git for the forked project
* Zip the project and submit