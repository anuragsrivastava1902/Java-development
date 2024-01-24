//REQ: Writing my first java program

package com.excelr.learningjava.dayone;


class MyFirstJavaProgram{
	
	static public void main(String...JavaKillers){
		System.out.println("it's my first java program");
	}
	
}

/*
please ensure you are iin your project src folder 

compilation command: (.class gets generated)
----------------------
javac -d ..\classes com\excelr\learningjava\dayone\MyFirstJavaProgram.java

note:- by mistake if we don't write -d ..\classes then java compiler won't create package/folder in the ..\classes location.

Exceution Command: (take that .class and execute by giving classname)
-----------------------
syntax:- java -classpath ..\classes pacakgename.classname

java -cp ..\classes com.excelr.learningjava.dayone.MyFirstJavaProgram

Analyse Command:
-------------------
javap -cp ..\classes com.excelr.learningjava.dayone.MyFirstJavaProgram





*/