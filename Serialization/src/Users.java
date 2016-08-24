import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;

public class Users implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 6313764292464081505L;
	//when you make change to object, you need to regenerate the serialID
	//in those cases generate a new id using the IDE
private String username;
private String password;
public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	Users user = new Users();
	user.setUsername("mharper");
	user.setPassword("abc123");
	
	File file = new File("C:\\Users\\Michael\\Desktop\\testFile.txt");
	OutputStream fileOutputStream = new FileOutputStream(file);
	ObjectOutput outputStream = new ObjectOutputStream(fileOutputStream);
	outputStream.writeObject(user);
	outputStream.writeChars("a");
	System.out.println("I've stored the User object into the file: " + file.getName());
	outputStream.close();
	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
	try {
		System.out.println("" + (Users) ois.readObject());
		System.out.println("" + ois.readChar());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ois.close();
	}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Users [username=" + username + ", password=" + password + "]";
}

}
