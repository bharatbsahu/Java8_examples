package com.cg.java8;

public class SerializationDeserialization {

	public static void main(String[] args) {

		System.out.println("Hi From -> Serialization Deserialization");

		// Serialization

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
			oos.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"))) {
			MyClass object = (MyClass) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
