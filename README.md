theScore QA Automation Challenge (Mobile)

This file contains the instructions for setting up and running your submission from the command line on a macOS.

You can find the Test Results in the test report link here: file:file:///Users/neelakshitaldar/Documents/Eclipse/Appium/test-output/index.html


Setup Instructions

JDK Download
1. Download the latest version of Java from https://www.oracle.com/ca-en/java/technologies/downloads/ for MacOS. 
2. Download Java 17 for Mac OS  https://download.oracle.com/java/17/latest/jdk-17_macos-x64_bin.dmg ( sha256)
3. Just click on Continue and Next buttons to install Java into your system.

Android Studio (Emulator) download and setup
1. Download Android Emulator from link: https://developer.android.com/studio?gclid=CjwKCAjw_YShBhAiEiwAMomsENolzrKDwjuf85BaJZDYaqh27fOsTe9RrCAevJ-K6YFAm0TrZc4r0hoCaSgQAvD_BwE&gclsrc=aw.ds
2. Click on Download Android Studio button
3. Click on .dmg file download 
4. Move the Android Studio file into Applications folder - You will be presented with a GUI for this.
5. Click on Android studio app to open the application
6. Click OK to Do not import settings —> 
7. For Install Type - Click on Standard and then click Next 
8. Copy the SDK Folder Path and paste it somewhere
9. Click on Finish 
10. Click on Finish again after Android Studio download is complete
11. Open the app and click on Create New Project 
12. Click on Basic Activity then click on Finish
13. Click on Tools after the plugin installation is complete
14. Click on Device manager then click on Create Device
15. Select any device - I downloaded Pixel 2 with Play Store icon available 
16. Download any Android device on Emulator - I downloaded Pixel 2
17. Provide the device name under AVD name - My phone name Is Prabhjot Pixel
18. Click on Finish
19. Download theScore app from Google Play Store on Emulator 

Appium server installation
1. Open terminal
2. Type command to install Appium 2.0.0-beta.57 Beta version globally - sudo npm install -g Appium@next
3. Hit enter and provide your Mac password
4. To start appium server type command- appium

Uiautomator2 driver installation
1. Open terminal and type command - appium driver install  uiautomator2

Appium Inspector installation
1. To download use the link: https://github.com/appium/appium-inspector
2. Scroll down to Installation section and click on ‘Release’ link
3. For Mac download -  Appium-Inspector-mac-2023.3.1.dmg  

Node Software download for Appium Server
1. Download Node software (v18.15.0) from https://nodejs.org/en/download
2. Download the macOS Installer(.pkg) file (64 bit)
3. Double click on the downloaded file. 
4. Keep clicking on Continue and Install to complete the install

Set System variable path for Java, Android SDK and Node 
1. Open terminal and type command from home directory using the command - vi ~/.bash_profile
2. Click ‘I’ to insert the following path 
3. Copy the following path and paste it in the file
 * export JAVA_HOME=$(/usr/libexec/java_home)
 * export ANDROID_HOME=/Users/neelakshitaldar/Library/Android/sdk
 * export PATH=$PATH:/usr/local/git/bin:/usr/local/bin:
 * export PATH=$PATH:$ANDROID_HOME/platform-tools
 * export PATH=$PATH:$ANDROID_HOME/tools
 * export PATH=$PATH:ANDROID_HOME/tools/bin
 * export PATH=$PATH:ANDROID_HOME/emulator
3. Exit by pressing ‘ESC’ and entering ‘:wq!’
4. Confirm all the paths by giving the command: echo $PATH 

Install TestNG Plugin
1. Click on ‘Help’ and click on ‘Eclipse Marketplace’
2. Search for testing —> install ‘TestNG for eclipse’ and restart Eclipse

Download Appium and TestNG dependencies 
1. On your browser navigate to link - https://mvnrepository.com/
2. Type ‘appium’ in Search bar and select ‘Java Client’
3. Select the latest version available
4. Copy the entire dependency and paste it somewhere
5. Again type ‘testng’ in Search bar and select TestNG (version 7.7.1)
6. Copy the dependency and paste it somewhere

Build Maven dependencies and create Maven Project in Eclipse
1. Open Eclipse —> Click on File —> New —> Project —> Maven —> Next
2. Select ‘maven-archetype-quickstart’ then click on Next.
3. Provide any Group id: (Any name which will be your Main package name), Artifact id: Appium, Package: PrabhjotSinghMaini (whichever name you would like to provide) and click on Finish.
4. Click on ‘pom.xml’
5. Under <dependencies> section remove JUnit dependency and paste the ‘appium’ and ‘TestNG’ dependencies which you have copied from Maven repository above. Save ‘pom.xml’ file
6. Delete classes App.java and AppTest.java which came in the Maven project by default
7. Click on Project in Eclipse then click on Build Automatically to build Jar files for the project
8. Maven Dependencies folder with Jar files will be created

To run the test 
1. Open terminal and enter ‘appium’ command from home directory to start Appium server.
2. Open Android studio and click on the ‘Play’ logo of your device (PrabhjotPixel) to start the Emulator.
3. Right click anywhere on AppiumScore class —> click on Run As —> TestNG Test
4. Results should have Failures 0 and Passed 1 status.

Submitting on Github Repository
1. Proceed to Github.com and create a new repository by clicking on Repositories —> New
2. Select Public —> Create Repository (theScoreAppium) --> Select ReadMe file 
3. Make sure you are in Appium directory then Open Terminal and type command - git config --global user.name "<github username>" and hit enter
4. Type command - git config --global user.email "<github emailaddress>"
5. To initialize your file as Git repository type command - git init 
6. Add files to staging by typinmg command - git add *
7. To check status of files which have been added type command - git status 
8. If not added than add files .DS_Store, .classpath, .project and .settings/ by using command - git add <filename>  
8. Commit code by typing - git commit -m "theScore automation challenge commit"
9. To connect to remote server - git remote add origin https://github.com/Prabhjotnest/theScoreAppium.git
10. To push the code - git push origin master
11. Provide credentials
