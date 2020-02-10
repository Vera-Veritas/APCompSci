package strings09;

public class Activity14 {
private String name = "felix sept";
private String essay = "hello all";
private int space = name.indexOf(' ');
public Activity14(){
	
}
public String setText(){
	return essay;
}
public String returnLast(){
	String nameCap = name.substring(0, space).toUpperCase();
	return nameCap;
}
public void charactersFirst(){
	int firstNum = name.substring(space,name.length()).length();
	System.out.println("Number of character in first name: " + firstNum);
}
public boolean containsX(){
	return name.contains("X");
}
public void returnWords(){
	int num = name.length();
	System.out.println("Number of words: "+num);
}

}
