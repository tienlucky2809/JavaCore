package Core2;

import com.sun.source.tree.WhileLoopTree;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person  = new Person();
        person.setId(1);
        person.setName("Lucky");

        File file = new File("test.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = (Person) objectInputStream.readObject();
        System.out.println(person1.getId() + " " + person1.getName());

    }
}
