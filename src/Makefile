# A simple Makefile
Extrema: Extrema.class
	echo Main-class: Extrema > Manifest
	jar cvfm Extrema Manifest Extrema.class
	rm Manifest
	chmod +x Extrema

Extrema.class: Extrema.java
	javac -Xlint Extrema.java

clean:
	rm -f Extrema Extrema.class

submit: README Makefile Extrema.java
	submit cmps012b-pt.s15 lab1 README Makefile Extrema.java