# shellScripting
Repo to push some functional code to run on Linux bash and Java 

##How to install all the Java dependencies to run the JDK Environment on Ubuntu Linux: 

First update your Machine and repos
1. sudo apt update

Add the Official Java 8 Repo for ubuntu 

2. sudo add-apt-repository ppa:webupd8team/java

Install the JDK Environment 

3. sudo apt install openjdk-8-jdk

Validate the instalation 

4. java -version && javac -version 


**If you dont have any of this resources installed, you can't be able to run any of this programs**

More information about [Here](https://www.digitalocean.com/community/tutorials/como-instalar-java-con-apt-en-ubuntu-18-04-es)


##How to Run the programs file .java

1. Go to your home directory 
	cd ~/
2. Clone this repo using: 
	$ git clone https://github.com/marcellofdz/shellScripting.git
3. Enter to the cloned directory 
	cd shellScripting/
4. Run the following commands to compile and run the program: 
	javac filename.java - **This command is to compile the java file [filename].java**
	java Filename - **This is to run the ejecutable program**
5. Process done, you should have the program running. 



